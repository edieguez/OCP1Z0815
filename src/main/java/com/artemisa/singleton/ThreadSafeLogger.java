package com.artemisa.singleton;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

public class ThreadSafeLogger {

    private ThreadSafeLogger() {
        // Do nothing. For internal use only
    }

    @Log4j2
    private static class LoggerHolder {
        public static final Logger logger = log;
    }

    public static Logger getInstance() {
        return LoggerHolder.logger;
    }
}
