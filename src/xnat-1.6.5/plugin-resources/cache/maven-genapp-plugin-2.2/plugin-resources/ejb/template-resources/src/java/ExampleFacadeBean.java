package @PACKAGE@;

import java.math.BigInteger;
import javax.ejb.CreateException;
import javax.ejb.EJBException;
import javax.ejb.FinderException;
import javax.ejb.SessionBean;
import javax.naming.NamingException;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * This is a example of a stateless session bean facade to the entity bean.
 *
 * @ejb.bean
 *     name="ExampleFacade"
 * @ejb.transaction
 *     type="Required"
 *
 * @ejb.ejb-ref
 *     ejb-name="Example"
 *     view-type="local"
 *
 * @author <a href="trajano@yahoo.com">Archimedes Trajano</a>
 * @version $Id: ExampleFacadeBean.java,v 1.1 2004/02/20 14:17:44 evenisse Exp $
 */
public abstract class ExampleFacadeBean implements SessionBean {
    /**
     * Log object
     */
    private Log log = LogFactory.getLog(this.getClass());

    /**
     * The required EJB Creation method
     * @ejb.create-method
     *
     * @throws CreateException
     *                    thrown when there is a problem creating the object
     */
    public void ejbCreate()
        throws CreateException {
    }

    /**
     * This gets the name of the specified entity.
     *
     * @ejb.interface-method
     * @param id
     *                   Primary key of the entity
     * @return value of the "name" field
     * @throws EJBException
     *                    thrown if there is a problem when getting the entity 
     *                    value.  There will be a root exception in the 
     *                    exception.
     */
    public final String getName(final Integer id)
        throws EJBException {
        try {
            ExampleLocal entity = 
              ExampleUtil.getLocalHome().findByPrimaryKey(id);
            return entity.getName();
        } catch (FinderException e) {
            throw new EJBException(e);
        } catch (NamingException e) {
            throw new EJBException(e);
        }
    }

    /**
     * This sets the name of the specified entity.  Creates a new one if
     * needed.
     *
     * @ejb.interface-method
     * @param id
     *                   Primary key of the entity
     * @param name
     *                   Value of the name field
     * @throws EJBException
     *                    thrown if there is a problem when getting the entity 
     *                    value.  There will be a root exception in the 
     *                    exception.
     */
    public final void setName(final Integer id, final String name)
        throws EJBException {
        try {
            try {
                ExampleLocal entity = ExampleUtil.getLocalHome().findByPrimaryKey(id);
                entity.setName(name);
            } catch (FinderException e) {
                ExampleLocal entity = ExampleUtil.getLocalHome().create(id, name);
            }
        } catch (CreateException e) {
            throw new EJBException(e);
        } catch (NamingException e) {
            throw new EJBException(e);
        }
    }

    /**
     * This gets the primary key id based on the value of the name field.
     * Creates a new one if needed.
     *
     * @ejb.interface-method
     * @param name
     *                   Value of the name field
     * @return the primary key
     * @throws EJBException
     *                    thrown if there is a problem when getting the entity 
     *                    value.  There will be a root exception in the 
     *                    exception.
     */
    public Integer getId(final String name)
        throws EJBException {
        try {
            ExampleLocalHome home = ExampleUtil.getLocalHome();
            ExampleLocal entity = null;

            try {
                entity = home.findByPrimaryKey((Integer) (home
                                                                                      .findByName(name)
                                                                                      .getPrimaryKey()));
            } catch (FinderException e) {
                log.debug("Creating a new key set named " + name);

                final int hexadecimalRadix = 16;

                entity = home.create(new Integer(
                            new BigInteger(ExampleFacadeUtil.generateGUID(this),
                                hexadecimalRadix).intValue()), name);
            }

            return entity.getId();
        } catch (CreateException e) {
            throw new EJBException(e);
        } catch (NamingException e) {
            throw new EJBException(e);
        }
    }
}
