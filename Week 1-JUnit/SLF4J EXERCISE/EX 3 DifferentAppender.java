package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DifferentAppender {

    private static final Logger logger =
            LoggerFactory.getLogger(DifferentAppender.class);

    public static void main(String[] args) {

        logger.debug("This is a DEBUG message.");

        logger.info("Application started successfully.");

        logger.warn("This is a WARNING message.");

        logger.error("An ERROR has occurred.");

    }
}