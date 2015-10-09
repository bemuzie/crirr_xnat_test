package @PACKAGE@;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.DynaActionForm;


/**
 * This is a simple struts action that simply redirects the input back to itself.  It
 * also sets a bean value to the current date.
 * 
 * @struts.action
 * 	name="TestForm"
 * 	 path="/TestInput"
 * @struts.action-forward 
 * 	name="success" 
 * 	path="/WEB-INF/jsp/input.jsp"
 * 
 * @author <a href="mailto:trajano@yahoo.com">Archimedes Trajano</a>
 * @version $Id: InputAction.java,v 1.2 2004/05/01 13:09:36 evenisse Exp $ 
 */
public class InputAction extends Action {
    /**
     * Performs the simple action
     * 
     * @param mapping
     *                   the action mappings where you find the return value of the
     *                   forward
     * @param actionForm
     *                   the action form used, in this example it will be an instance
     *                   of the DynaActionForm class
     * @param request
     *                   the HTTP servlet request
     * @param response
     *                   the HTTP servlet response
     */
    public ActionForward execute(ActionMapping mapping, ActionForm actionForm,
            HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        if (actionForm != null) {
            DynaActionForm form = (DynaActionForm) actionForm;
            form.set("theDate", new Date());
        }
        return (mapping.findForward("success"));
    }
}
