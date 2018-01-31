package com.waps.utils;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

public class ResponseUtils {
    public static void write(HttpServletResponse response, Object object) throws Exception {
        response.setHeader("Content-type", "text/html;charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.println(object);
        out.flush();
        out.close();
    }
}
