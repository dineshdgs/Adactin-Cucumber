package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_Class;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Adactin_stepdinition {
	
	public static WebDriver driver =Runner_Class.driver;
	
	
	@Given("^user Is able To Launch the Url$")
	public void user_Is_able_To_Launch_the_Url() throws Throwable {
		driver.get("https://adactinhotelapp.com/");
		
	}

	@When("^user Is Able to Give the Username$")
	public void user_Is_Able_to_Give_the_Username() throws Throwable {
		WebElement user = driver.findElement(By.xpath("//input[@id='username']"));
		user.sendKeys("greenstech005");
		
	}

	@When("^user is Able to Give the Passward$")
	public void user_is_Able_to_Give_the_Passward() throws Throwable {
		WebElement pass = driver.findElement(By.xpath("//input[@name='password']"));
		pass.sendKeys("0LY172");
		
	}

	@Then("^user is Able to Click the Login Page$")
	public void user_is_Able_to_Click_the_Login_Page() throws Throwable {
		WebElement login = driver.findElement(By.xpath("//input[@type='Submit']"));
		login.click();
	}
	@Given("^user Select the Location$")
	public void user_Select_the_Location() throws Throwable {
		WebElement loc = driver.findElement(By.xpath("//select[@name='location']"));
	       Select lo =new Select(loc);
	       lo.selectByVisibleText("Melbourne");
	}

	@Given("^user Select the Hotel$")
	public void user_Select_the_Hotel() throws Throwable {
		
		 WebElement hot = driver.findElement(By.xpath("//select[@name='hotels']"));
	       Select ho =new Select(hot);
	       ho.selectByVisibleText("Hotel Creek");
	}

	@Given("^user Select the RoomType$")
	public void user_Select_the_RoomType() throws Throwable {
		 WebElement typ = driver.findElement(By.xpath("//select[@name='room_type']"));
	       Select ty =new Select(typ);
	       ty.selectByVisibleText("Double");
	}

	@Given("^user Select the No of Rooms$")
	public void user_Select_the_No_of_Rooms() throws Throwable {
		
		WebElement no = driver.findElement(By.xpath("//select[@name='room_nos']"));
	       Select nof =new Select(no);
	       nof.selectByVisibleText("3 - Three");
	}

	@Given("^user Select the Check in Date$")
	public void user_Select_the_Check_in_Date() throws Throwable {
		WebElement indate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
	       indate.clear();
	       indate.sendKeys("30/11/2022");
	}

	@Given("^user Select the Check Out Date$")
	public void user_Select_the_Check_Out_Date() throws Throwable {
		 WebElement outdate = driver.findElement(By.xpath("//input[@name='datepick_out']"));
	       outdate.clear();
	       outdate.sendKeys("1/12/2022");
	}

	@Given("^user Select the Adults Per Room$")
	public void user_Select_the_Adults_Per_Room() throws Throwable {
		WebElement adult = driver.findElement(By.xpath("//select[@name='adult_room']"));
	       Select adu =new Select(adult);
	       adu.selectByVisibleText("2 - Two");
	}

	@Given("^user Select the Childrens Per Room$")
	public void user_Select_the_Childrens_Per_Room() throws Throwable {
		WebElement child = driver.findElement(By.xpath("//select[@name='child_room']"));
	       Select chi =new Select(child);
	       chi.selectByVisibleText("1 - One");
	}

	@Then("^user Able to Click the Search Button$")
	public void user_Able_to_Click_the_Search_Button() throws Throwable {
		 WebElement search = driver.findElement(By.xpath("//input[@type='submit']"));
	       search.click();
	}

	@Given("^user Select the Type of Hotel$")
	public void user_Select_the_Type_of_Hotel() throws Throwable {
		WebElement radio = driver.findElement(By.xpath("//input[@name='radiobutton_0']"));
	       radio.click();
	}

	@Then("^user Able to Click the Continue Button$")
	public void user_Able_to_Click_the_Continue_Button() throws Throwable {
		 WebElement cont = driver.findElement(By.xpath("//input[@name='continue']"));
	       cont.click();
	}

	@Given("^user Type the First Name$")
	public void user_Type_the_First_Name() throws Throwable {
		 WebElement first = driver.findElement(By.xpath("//input[@name='first_name']"));
	       first.sendKeys("dinesh");
	}

	@Given("^user Type the Last Name$")
	public void user_Type_the_Last_Name() throws Throwable {
		  WebElement last = driver.findElement(By.xpath("//input[@name='last_name']"));
	       last.sendKeys("k");
	}

	@Given("^user Fill the Address$")
	public void user_Fill_the_Address() throws Throwable {
		 WebElement address = driver.findElement(By.xpath("//textarea[@name='address']"));
	       address.sendKeys("D no 269 vedal bus stop assamandur post arakonam");
	}

	@Given("^user Enter the Credit Card Number$")
	public void user_Enter_the_Credit_Card_Number() throws Throwable {
		 WebElement credit = driver.findElement(By.xpath("//input[@name='cc_num']"));
	       credit.sendKeys("1234567895698745");
	}

	@Given("^user Select the Credit Card Type$")
	public void user_Select_the_Credit_Card_Type() throws Throwable {
		 WebElement credittype = driver.findElement(By.xpath("//select[@name='cc_type']"));
	       Select ct = new Select(credittype);
	       ct.selectByVisibleText("American Express");
	}

	@Given("^user Select the Expiry Date$")
	public void user_Select_the_Expiry_Date() throws Throwable {
		 WebElement expirymo = driver.findElement(By.xpath("//select[@name='cc_exp_month']"));
	       Select em =new Select(expirymo);
	       em.selectByVisibleText("December");
	}

	@Given("^user Select the Expiry Year$")
	public void user_Select_the_Expiry_Year() throws Throwable {
		 WebElement expiryyear = driver.findElement(By.xpath("//select[@name='cc_exp_year']"));
	       Select ey =new Select(expiryyear);
	       ey.selectByVisibleText("2022");
	}

	@Given("^user Enter the cvv Number$")
	public void user_Enter_the_cvv_Number() throws Throwable {
		 WebElement cvv = driver.findElement(By.xpath("//input[@name='cc_cvv']"));
	       cvv.sendKeys("123");
	}

	@Then("^user Able to Click the Book Now Button$")
	public void user_Able_to_Click_the_Book_Now_Button() throws Throwable {
		WebElement booknow = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
	       booknow.click();
	}

	@Then("^user Click The Logout Button$")
	public void user_Click_The_Logout_Button() throws Throwable {
		Thread.sleep(5000);
		  WebElement logout = driver.findElement(By.xpath("(//input[@class='reg_button'])[3]"));
	       logout.click();
	}



}
