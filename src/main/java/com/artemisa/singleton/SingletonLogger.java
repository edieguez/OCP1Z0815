package com.artemisa.singleton;

import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.Logger;

@Log4j2
public class SingletonLogger {

    private static Logger logger;

    private SingletonLogger() {
        // Do nothing. For internal use only
    }

    public static Logger getInstance() {
        if (logger == null) {
            logger = log;
        }

        return logger;
    }
}
