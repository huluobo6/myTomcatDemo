package huluobo;

import java.util.ArrayList;
import java.util.List;

/**
 * my name is huluobo
 */
public class ServletMappingConfig {

    public static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("firstBlood","/firstBlood","huluobo.FirstServlet"));
        servletMappingList.add(new ServletMapping("errorServlet","/error","huluobo.ErrorServlet"));
    }
}
