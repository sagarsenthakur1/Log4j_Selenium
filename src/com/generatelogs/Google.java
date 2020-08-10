package com.generatelogs;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
 
 
public class Google {
    public static void main(String[] args) {
      
    // Here we need to create logger instance so we need to pass Class name for 
     //which  we want to create log file in my case Google is classname
        Logger logger=Logger.getLogger(Google.class.getName());
 
        System.setProperty("webdriver.edge.driver","C:\\BrowserDriver\\msedgedriver.exe");
   	 
        // Open browser
        WebDriver driver = new EdgeDriver();
        logger.info("MicrosoftEdge Opened");
        
        
     // Set implicit wait
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        logger.info("Implicit wait given");
      
        
        driver.manage().window().maximize();
        logger.info("Browser Maximized");
      
        
 
        // Load application
        driver.get("http://www.google.com");
        logger.info("App launched");
        
        logger.debug("Sample debug message");  
        logger.info("Sample info message");  
        logger.error("Sample error message");  
        logger.fatal("Sample fatal message");  
       
        // type Selenium
        driver.findElement(By.name("q")).sendKeys("Selenium");
        logger.info("keyword type");  
 
     
        
       
        
    }
}
        
        
        
        
        
       