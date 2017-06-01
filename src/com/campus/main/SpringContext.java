package com.campus.main;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringContext{
	public static ApplicationContext CTX = null;
	public static Log log = LogFactory.getLog(SpringContext.class);
	 public static boolean initSpring()
	    {
	        try
	        {
	            if(CTX == null)
	                CTX = new FileSystemXmlApplicationContext("resource\\applicationContext.xml");
	        }
	        catch(Exception e)
	        {
	            log.error((new StringBuilder("Init Spring ApplicationContext ERROR:")).append(e.getMessage()).toString());
	            e.printStackTrace();
	            return false;
	        }
	        return true;
	    }
	
}