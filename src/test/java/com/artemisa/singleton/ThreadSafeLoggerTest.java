package com.artemisa.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class ThreadSafeLoggerTest {

    @Test
    public void getThreadSafeLogger() {
        assertEquals(ThreadSafeLogger.getInstance(), ThreadSafeLogger.getInstance());
    }

    @Test
    public void getSingletonLogger() {
        assertEquals(SingletonLogger.getInstance(), SingletonLogger.getInstance());
    }
}