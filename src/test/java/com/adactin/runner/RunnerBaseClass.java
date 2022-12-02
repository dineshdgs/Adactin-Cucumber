package com.adactin.runner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Baseclass.Baseclass_Demo;

public class RunnerBaseClass extends Baseclass_Demo{
	public static WebDriver driver;
     
	public static void main(String[] args) {
		driver=browserLaunch("chrome");
		//WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
   // clickonelement(login);	
    // closeOnMethod();
     //quitMethod();
    // navigateTO("facebook.com");
    driver=getMethod("https://www.amazon.in/");
    // actionMethod("//input[@type='Submit']");
     
     
		
	}
	
	 
		
	}
	


