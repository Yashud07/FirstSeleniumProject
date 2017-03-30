package Verify;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class title {
	  
	    
	   @Test
	    public void tt() {
	  	  
	  	  WebDriver driver = new FirefoxDriver();
	  	  String baseUrl = "http://newtours.demoaut.com";
	  	  
	  	  driver.get(baseUrl);
	  	  driver.findElement(By.linkText("REGISTER")).click();
	  	  
	  	  String Expected = "Register: Mercury Tours";
	  	  String actual=driver.getTitle();
	  	  Assert.assertEquals(actual, Expected);
	  	  	  
	  	  
	  	  	    }
	  

	  
  }

