package com.example.logsecure.config;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;

import java.security.KeyPairGenerator;

public class CustomMessageProcessingLayout extends PatternLayout {
    @Override
    public String doLayout(ILoggingEvent event) {
        // Modify or process the log message here
        String originalMessage = super.doLayout(event);
        return originalMessage;
    }

    private String modifyMessage(String message) {
        // Implement your custom message processing logic here
        // For example, you can add a prefix or perform any other manipulation

        return message;
    }
}
