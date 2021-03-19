package stepdefinitions;

import org.junit.Assert;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.*;

public class LoginPageSteps {
	
	private static String title;
	private LoginPage loginpage = new LoginPage(DriverFactory.getDriver());
	@Given("user is on login page")
	public void user_is_on_login_page() {
		DriverFactory.getDriver().get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	    
	}

	@When("user get the title of the page")
	public void user_get_the_title_of_the_page() {
	   title = loginpage.getLoginPageTitle();
	    System.out.println("Page titile is : " + title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitleName) {
    Assert.assertTrue(title.contains(expectedTitleName));
	}

	@Then("forgot password link should be displayed")
	public void forgot_password_link_should_be_displayed() {
		Assert.assertTrue(loginpage.forgotPasswordLink());
	    
	}

	@When("user enters username {string}")
	public void user_enters_username(String uname) {
	 loginpage.enterUserName(uname);
	}

	@When("user enters password {string}")
	public void user_enters_password(String pwd) {
	    loginpage.enterPassword(pwd);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
	    loginpage.clickonSignin();
	}



}
