package com.dimas.simple;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Copyright 2009-2014. NxSystems Inc.
 * PROPRIETARY/CONFIDENTIAL.
 * <p/>
 * Created: 14.03.14 22:33
 *
 * @author Dmitry Borovoy
 */
public class Hello extends HttpServlet implements Servlet {

    public Hello() {
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String pageTitle = "My Page Title";
        request.setAttribute("title", pageTitle);
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
