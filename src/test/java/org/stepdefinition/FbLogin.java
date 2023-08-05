package org.stepdefinition;

import org.base.BaseClass;
import org.pojo.FbLoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FbLogin extends BaseClass{
	
		
	FbLoginPojo f;
	@Given("To launch the chrome browser and maximize the window")
	public void to_launch_the_chrome_browser_and_maximize_the_window() {
	    launchBrowser();
	    windowsMaximize();
	}

	@When("To launch the url of facebook application")
	public void to_launch_the_url_of_facebook_application() {
	    launchUrl("https://en-gb.facebook.com/");
	}

	@When("To enter the valid email in email field")
	public void to_enter_the_valid_email_in_email_field() {
	    f = new FbLoginPojo();
	    passText("tarjun1901@gmail.com", f.getEmail());
	}

	@When("To enter the invalid password in password field")
	public void to_enter_the_invalid_password_in_password_field() {
		f = new FbLoginPojo();
		passText(" ", f.getPassword());
	}

	@When("To click the login button")
	public void to_click_the_login_button() {
		 f = new FbLoginPojo();
		 clickBtn(f.getLoginBtn());
	}

	@When("To check whether navigate to homepage or not")
	public void to_check_whether_navigate_to_homepage_or_not() {
	    System.out.println("Check your credentials");
	}

	@Then("To quit the chrome browser")
	public void to_quit_the_chrome_browser() {
	    closeEntireBrowser();
	}
 

}
