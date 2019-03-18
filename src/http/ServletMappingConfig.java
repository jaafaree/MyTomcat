package http;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @author jaafaree
 * @create 3/18/2019 9:58 AM
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<ServletMapping>();

    static {
        servletMappingList.add(new ServletMapping("testServlet", "/test", "servlets.TestServlet"));
    }
}
