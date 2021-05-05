package no.logging.slf4j.logging;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Slf4jLoggerTest {

    @Autowired
    Slf4jLogger logger;

    @Test
    public void verifyLoggerName(){
        logger.setLogger(Slf4jLoggerTest.class);
        Assert.assertTrue(logger.getName() == Slf4jLoggerTest.class.getName());
        logger.info(logger.getName());
    }

    @Test
    public void trace(){
        logger.setLogger(Slf4jLoggerTest.class);
        logger.trace("Dette {} en {} test", "er", "en");
    }


    @Test
    public void info(){
        logger.setLogger(Slf4jLoggerTest.class);
        logger.info("Dette {} en {} test", "er", "en");
    }

    @Test
    public void debug(){
        logger.setLogger(Slf4jLoggerTest.class);
        logger.debug("Dette {} en {} test", "er", "en");
    }

    @Test
    public void warn(){
        logger.setLogger(Slf4jLoggerTest.class);
        logger.warn("Dette {} en {} test", "er", "en");
    }

    @Test
    public void error(){
        logger.setLogger(Slf4jLoggerTest.class);
        logger.error("Dette {} en {} test", "er", "en");
    }



}