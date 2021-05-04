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
    public void test(){
        logger.setLogger(Slf4jLoggerTest.class);
        Assert.assertTrue(logger.getName() == Slf4jLoggerTest.class.getName());
        logger.info(logger.getName());
    }

}