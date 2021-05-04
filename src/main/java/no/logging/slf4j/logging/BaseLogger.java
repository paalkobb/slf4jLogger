package no.logging.slf4j.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseLogger {
    protected String name;
    protected Logger logger;
    private boolean initialized;

    public BaseLogger(){
        // Will be true when you set the logger
        initialized = false;

    }

    protected void setLogger(String name){
        logger = LoggerFactory.getLogger(name);
        this.name = name;
        initialize();
    }

    protected void setLogger(Class c){
        logger = LoggerFactory.getLogger(c);
        this.name = c.getName();
        initialize();
    }

    protected Logger getLogger(){
        return logger;
    }

    protected String getName(){
        return name;
    }

    protected void initialize(){
        // initialize the class
        this.initialized = true;
    }

    protected boolean isInitialized(){
        // Check if the class is initialized
        return initialized;
    }



}
