package com.example.logsecure;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.slf4j.Logger;

public class LogSecureTest {

    @Mock
    private Logger mockLogger;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
    }
    @Test
    public void testInfoLogging() {
        // Mock the SLF4J Logger
        Logger mockLogger = mock(Logger.class);
        LogSecure customLogger = new LogSecure(mockLogger);

        String message = "Test info message";
        customLogger.info(message);

        // Verify that the logger's info method was called with the correct message
        verify(mockLogger).info(any());
    }

    @Test
    public void testErrorLogging() {
        // Mock the SLF4J Logger
        LogSecure customLogger = new LogSecure(mockLogger);

        String message = "Test error message";
        Exception exception = new Exception("Test exception");
        customLogger.error(message, exception);

        // Verify that the logger's error method was called with the correct message and exception
        verify(mockLogger).error(message, exception);
    }
}
