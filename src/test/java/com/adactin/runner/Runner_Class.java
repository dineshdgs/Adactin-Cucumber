package com.adactin.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.github.bonigarcia.wdm.WebDriverManager;
@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\maniv\\eclipse-workspace\\AdactinCucumber\\src\\test\\java\\com\\adactin\\feature\\Adactin.feature",
glue = "com.adactin.stepdefinition", monochrome = true,dryRun = false,strict = true,plugin = {"html:DineshReports/htmlReport","pretty",
		"json:DineshReports/JsonReport.json",
		"com.cucumber.listener.ExtentCucumberFormatter:DineshReports/ExtentReport.html"}
)

public class Runner_Class {
	public static WebDriver driver;
	
	@BeforeClass
	public static void setUp() {
         // System.setProperty("webdriver.chrome.driver", "C:\\Users\\maniv\\eclipse-workspace\\Selenium_Training\\driver\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
          driver=new ChromeDriver();
          driver.manage().window().maximize();
	}
	@AfterClass
	public static void tearDown() {
		driver.close();

	}
	
	 
	

}
