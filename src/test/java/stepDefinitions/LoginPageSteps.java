package stepDefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {


	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	private static String title;

	@Given("use is on login page")
	public void use_is_on_login_page() throws InterruptedException {
		Thread.sleep(4000);
		
		
		DriverFactory.getDriver().get("https://ui.cogmento.com/");
	}

	@When("user gets the title of the page")
	public void user_gets_the_title_of_the_page() {
		 title = loginPage.getLoginPageTitle();
		System.out.println("login page title is : "+title);
	}

	@Then("page title should be {string}")
	public void page_title_should_be(String expectedTitle) {
		
		Assert.assertTrue(title.contains(expectedTitle));
	}

	@Then("forgot password link should be displayed")
	public boolean forgot_password_link_should_be_displayed() {
		return loginPage.isForgotPasswordExists();
		
	}

	@When("user enters username {string}")
	public void user_enters_username(String UserName) {
		loginPage.enterUserName(UserName);
	}

	@When("user enters password {string}")
	public void user_enters_password(String Password) {
		loginPage.enterPassword(Password);
	}
	
	@When("user clicks on the Login Button")
	public void user_clicks_on_the_login_button() {
		loginPage.clickLoginButton();
	}
	

}
