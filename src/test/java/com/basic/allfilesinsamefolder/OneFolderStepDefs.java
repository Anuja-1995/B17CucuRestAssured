package com.basic.allfilesinsamefolder;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class OneFolderStepDefs {
	WebDriver driver;
	
	@Given("the user is on facebook login page")
	public void the_user_is_on_facebook_login_page(){
		System.out.println("in setup");
		System.setProperty("webdriver.gecko.driver","H:\\seleiumsoftwares\\geckodriver-v0.18.0-win64\\geckodriver.exe");		
	    driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		
	}
	


@When("^he enters \"([^\"]*)\" as user name$")
public void he_enters_as_user_name(String username){
	driver.findElement(By.xpath("//div/input[@name='firstname']")).sendKeys("username");
}


@When("^he enters \"([^\"]*)\" as password$")
public void he_enters_as_password(String arg1) {
	driver.findElement(By.xpath(""))
   
}

@Then("^check username is present in textbox$")
public void check_username_is_present_in_textbox()  {
    
}

@Then("^i am check facebook login page$")
public void i_am_check_facebook_login_page()  {
 
}


}
