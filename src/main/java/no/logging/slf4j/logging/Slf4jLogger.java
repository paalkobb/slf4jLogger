package no.logging.slf4j.logging;

import org.springframework.stereotype.Component;

@Component
public class Slf4jLogger extends BaseLogger{

    public Slf4jLogger(){
    }

    public void trace(String s, Object... objects) {
        if (isInitialized()){
            logger.trace(s, objects);
        }

    }

    public void debug(String s, Object... objects) {
        if (isInitialized()){
            logger.debug(s, objects);
        }
    }


    public void info(String s, Object... objects) {
        if (isInitialized()){
            logger.info(s, objects);
        }
    }


    public void warn(String s, Object... objects) {
        if (isInitialized()){
            logger.warn(s, objects);
        }
    }

    public void error(String s, Object... objects) {
        if (isInitialized()){
            logger.error(s, objects);
        }
    }


}
