package com.rudranil;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
public class ParameterizedLoggingExample {
    private static final Logger logger = LoggerFactory.getLogger(ParameterizedLoggingExample.class);
    public static void main(String[] args) {
        String username = "Alice";
        int age = 25;
        double balance = 1500.75;

        // Parameterized logging
        logger.info("User {} has logged in.", username);

        logger.info("User {} is {} years old.", username, age);

        logger.info("User {} has an account balance of ₹{}.", username, balance);
    }
}
