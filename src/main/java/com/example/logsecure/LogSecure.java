package com.example.logsecure;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogSecure {

    private Logger logger;

    public LogSecure(Logger logger) {
        this.logger = logger;
    }

    public void info(String message) {
        logger.info(message);
    }

    public void error(String message, Throwable throwable) {
        logger.error(message, throwable);
    }

    public void debug(String message, Throwable throwable) {
        logger.error(message, throwable);
    }
}
