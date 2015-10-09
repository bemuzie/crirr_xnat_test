package @PACKAGE@;

import servletunit.struts.CactusStrutsTestCase;

/**
 * This tests the functionality of the StrutsTestCase
 * 
 * @author <a href="trajano@yahoo.com">Archimedes Trajano </a>
 * @version $Id: StrutsTest.java,v 1.1 2004/02/27 06:22:26 evenisse Exp $
 */
public class StrutsTest extends CactusStrutsTestCase {

    /**
     * Required constructor for CactusStrutsTestCase
     * 
     * @param name
     *                   name of the test
     */
    public StrutsTest(String name) {
        super(name);
    }

    public void testInputForm() throws Exception {
        setRequestPathInfo("/TestInput.do");
        addRequestParameter("givenName", "Archie");
        addRequestParameter("familyName", "Trajano");
        actionPerform();
        verifyForward("success");
        verifyNoActionErrors();
    }
}
