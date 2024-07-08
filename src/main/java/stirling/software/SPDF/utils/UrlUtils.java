package stirling.software.SPDF.utils;

import jakarta.servlet.http.HttpServletRequest;

public class UrlUtils {

    private UrlUtils() {}

    public static String getOrigin(HttpServletRequest request) {
        String scheme = request.getScheme(); // http or https
        String serverName = request.getServerName(); // localhost
        int serverPort = request.getServerPort(); // 8080
        String contextPath = request.getContextPath(); // /myapp

        return scheme + "://" + serverName + ":" + serverPort + contextPath;
    }

    public static String getCurrentPath(HttpServletRequest request) {
        String path = request.getRequestURI();

        // 如果是根路径，则直接返回'/'
        if (path.equals("/")) {
            return "/";
        }

        // 去掉末尾的斜杠
        if (path.endsWith("/")) {
            path = path.substring(0, path.length() - 1);
        }

        return path;
    }
}
