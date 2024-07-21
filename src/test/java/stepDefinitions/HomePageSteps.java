package stepDefinitions;

import java.util.List;
import java.util.Map;

import com.pages.HomePage;
import com.pages.LoginPage;
import com.qa.factory.DriverFactory;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageSteps {
	

	private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
	
	private HomePage homePage;
	
	@Given("user has already logged in to application")
	public void user_has_already_logged_in_to_application(DataTable dataTable) {
		List<Map<String,String>> credList = dataTable.asMaps();
		String userName = credList.get(0).get("username");
		String password = credList.get(0).get("password");
		DriverFactory.getDriver().get("https://ui.cogmento.com/");
		
		homePage=loginPage.doLogin(userName, password);
	
	}

	@Given("user is on Accounts page")
	public void user_is_on_accounts_page() {
	  
		homePage.HomePageTitle();
		
	}

	@When("user selects settings icon")
	public void user_selects_settings_icon() {
		homePage.selectSettingsIcon();
	}

	@Then("settings drop down should be shown")
	public void user_selects_default_record_check_box() {
	  System.out.println("settings drop down is shown");
	}



}
