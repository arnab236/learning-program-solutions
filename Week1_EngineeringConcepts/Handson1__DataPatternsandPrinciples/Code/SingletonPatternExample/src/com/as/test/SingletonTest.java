package com.as.test;

import com.as.models.*;

public class SingletonTest {
	
	    public static void main(String[] args) {
	        // logger instances
	        Logger logger1 = Logger.getInstance();
	        Logger logger2 = Logger.getInstance();

	        // Check if both references point to the same object
	        System.out.println("Is logger1 and logger2 are same ? " + (logger1 == logger2));

	        // Testing
	        logger1.log("This is the First log message");
	        logger2.log("This is the Second log message");
	        
	        System.out.println("Both logger instances are the same. Singleton confirmed...");
	    }
}
