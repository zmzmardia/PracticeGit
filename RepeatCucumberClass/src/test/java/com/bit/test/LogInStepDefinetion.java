package com.bit.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given.Givens;

public class LogInStepDefinetion {
	public WebDriver dr;
	
	@Given("open browser")
	public void open_browser() throws Throwable {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Mounia2016\\Downloads\\chromedriver_win32\\chromedriver.exe");
		dr = new ChromeDriver();
		 
	}

	@Given("navigate to url")
	public void navigate_to_url() throws Throwable {
	   dr.get("https://www.facebook.com/"); 
	}

	@When("user type userid on user text box")
	public void user_type_userid_on_user_text_box() throws Throwable {
	    dr.findElement(By.id("email")).sendKeys("dfghrtyghj#4gmail.com");
	}

	@When("user type password on password text box")
	public void user_type_password_on_password_text_box() throws Throwable {
		 dr.findElement(By.id("pass")).sendKeys("ytre345A");
	}

	@When("user click on login button")
	public void user_click_on_login_button() throws Throwable {
	    dr.findElement(By.name("login")).click();
	}

	@Then("user should login to the profile page")
	public void user_should_login_to_the_profile_page() throws Throwable {
	    // verify the url of profile page or some any other that verify the profile page
	}
	
	@Then("user should not login to the profile page")
	public void user_should_not_login_to_the_profile_page() throws Throwable {
	   String text = dr.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]")).getText();
	     System.out.println(text);
	}
	
	@Then("close browser")
	public void close_browser() {
	    dr.quit();
	}


}
