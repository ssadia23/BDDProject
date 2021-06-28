package steps;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.LoginPage;
import util.BrowserFactory;



public class LoginStepDef {

	WebDriver driver;
	LoginPage loginPage;
	
	@Before
	public void beforeRun() {
		driver= BrowserFactory.startBrowser();
		loginPage= PageFactory.initElements(driver, LoginPage.class);
	}

	@Given ("^User is on the techfios login page$")
	public void user_is_on_the_TechFios_login_page() {
		driver.get("https://techfios.com/billing/?ng=admin/");

	}
	
	@When("^User enters username as \"([^\"]*)\"$")
	public void user_enters_username_as(String username) throws Throwable {
		loginPage.enterUserName(username);
	}

	@When("^User enters password as \"([^\"]*)\"$")
	public void user_enters_password_as(String password) throws Throwable {
	    loginPage.enterPassword(password);
	}

	@When("^User clicks on signin button$")
	public void user_clicks_on_signin_button() throws Throwable {
	   loginPage.clickOnSignInButton();
	}

	@Then("^User should be land on Dashboard page$")
	public void user_should_be_land_on_Dashboard_page() throws Throwable {
	    String expectedTitled = "Dashboard- iBilling";
	    String actualTitle = loginPage.getPageTitle();
	    Assert.assertEquals(expectedTitled, actualTitle);
	    loginPage.takeScreenshotAtEndOfTest(driver);
	}
	
	@When ("^User enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void User_enters(String username, String password) {
	 loginPage.enterCredentials(username, password);	
	}
	
	@After
	public void afterRun() {
		driver.close();
		driver.quit();
		
	}

}
