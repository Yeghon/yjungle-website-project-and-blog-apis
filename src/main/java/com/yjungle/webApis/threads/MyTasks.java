package com.yjungle.webApis.threads;

/*
 * Created on 11/4/20
 * Author YeghonHaron
 */

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

public class MyTasks {
    private static final Logger logger = LoggerFactory.getLogger(MyTasks.class);

    @Scheduled (fixedDelay = 5000)
    public void sayHello() {
        System.out.println("Hello World");
        logger.debug("Hello world");
    }
}
