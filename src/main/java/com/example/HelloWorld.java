package com.example;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by ZhangChaohui on 09/02/2017.
 */
public class HelloWorld extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
            throws ServletException, IOException {
        /*PrintWriter out = response.getWriter();
        out.println("WebAppServlet Executed");
        out.flush();
        out.close();*/
        response.setContentType("text/html");
        response.getWriter().print("<h1><font color=green>Simple Servlet ran successfully</font></h1>" + "Powered by zhang");
    }
}
