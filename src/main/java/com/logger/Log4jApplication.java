package com.logger;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4jApplication {
	//Step 1 We Created Logger Object
	private static Logger logger = Logger.getLogger(Log4jApplication.class);
	
	public static void main(String[] args) throws IOException {
		SpringApplication.run(Log4jApplication.class, args);
		
		
		// Step 2 We created object for layout
		//Layout layout = new SimpleLayout();
		 //Layout layout = new HTMLLayout();
		//Layout layout = new XMLLayout();
		
		Layout layout = new PatternLayout("%p %d %C %M %n");
		
		//Step 3 We created Appender Object
		//Appender appender = new ConsoleAppender(layout);
		Appender appender = new FileAppender(layout,"C:\\rahul\\rahul.log");
		
		logger.addAppender(appender);
		
		
		
		logger.trace("this is the trace logging ");
		logger.debug("This is the debug logging");
		logger.info("This is the INFO logging");
		logger.warn("This is the Warning Logging");
		logger.error("This is the Error Logging");
		logger.fatal("This is the FATAL Logging");
		
		
		
		
		
		
		
		
		
		
		
		
			}

}
