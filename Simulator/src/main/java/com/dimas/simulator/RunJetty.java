package com.dimas.simulator;

import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Copyright 2009-2014. NxSystems Inc.
 * PROPRIETARY/CONFIDENTIAL.
 * <p/>
 * Created: 13.03.14 16:25
 *
 * @author Dmitry Borovoy
 */
public class RunJetty {
    public static void main(String[] args) {
        // initializing log4j
        DOMConfigurator.configureAndWatch("log4j.xml", 60000);

        // creating and initializing main context
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(
                "classpath:/simulator-embedded-jetty.xml"
        );
        context.registerShutdownHook();
    }
}
