package com.dimas.simpleSpring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class HelloAppServlet extends HttpServlet implements Servlet {

    private final Logger l = LoggerFactory.getLogger(HelloAppServlet.class);

    HelloService helloService;

    public HelloAppServlet() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        helloService = context.getBean(HelloService.class);
        l.info("init: {}", helloService.sayHello());
//        System.out.println(helloService.sayHello());
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
//        String pageTitle = "My Page Title";
//        request.setAttribute("title", pageTitle);
        request.setAttribute("title", helloService.sayHello());
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}
