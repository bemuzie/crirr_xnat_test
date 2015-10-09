package @PACKAGE@;

import org.apache.cactus.ServletTestCase;

import com.meterware.httpunit.WebConversation;
import com.meterware.httpunit.WebForm;

/**
 * This tests the site using HttpUnit
 * 
 * @author <a href="trajano@yahoo.com">Archimedes Trajano </a>
 * @version $Id: HttpUnitTest.java,v 1.1 2004/02/27 06:22:26 evenisse Exp $
 */
public class HttpUnitTest extends ServletTestCase {
    /**
     * This is a helper method to create the URL string for the initial web
     * conversation request
     * 
     * @param relativeUrl
     *                   the relative URL including the leading"/"
     * @return the context url with the relative URL appended to it
     */
    private String requestUrl(String relativeUrl) {
        StringBuffer url = request.getRequestURL();
        url.delete(url.lastIndexOf("/"), url.length());
        url.append(relativeUrl);
        return url.toString();
    }

    /**
     * This tests if the sample struts form works properly
     * 
     * @throws Exception
     *                    thrown when there is a problem with the test
     */
    public void testStrutsPages() throws Exception {
        WebConversation wc = new WebConversation();
        wc.getResponse(requestUrl("/TestInput.do"));
        {
            WebForm form = wc.getCurrentPage().getForms()[0];
            form.setParameter("givenName", "Archie");
            form.setParameter("familyName", "Trajano");
            form.submit();
        }
        {
            WebForm form = wc.getCurrentPage().getForms()[0];
            assertEquals("Archie", form.getParameterValue("givenName"));
            assertEquals("Trajano", form.getParameterValue("familyName"));
        }
    }
};