package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ParameterizedLoggingExample {

    // Create a Logger object for this class
    private static final Logger logger =
            LoggerFactory.getLogger(ParameterizedLoggingExample.class);

    public static void main(String[] args) {

        String studentName = "Kaaviya";
        int age = 20;
        double marks = 91.5;

        // Parameterized logging with one parameter
        logger.info("Student Name: {}", studentName);

        // Parameterized logging with two parameters
        logger.info("Student Name: {}, Age: {}", studentName, age);

        // Parameterized logging with three parameters
        logger.info("Student Name: {}, Age: {}, Marks: {}",
                studentName, age, marks);

        // Warning message
        logger.warn("Student {} has low attendance.", studentName);

        // Error message
        logger.error("Student {} failed to submit the assignment.",
                studentName);
    }
}