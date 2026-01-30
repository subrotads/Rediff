package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.DetailsPage;
import io.cucumber.java.en.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class StepDef {
	
	WebDriver driver;
	DetailsPage detailpg;
	
	
	@Given("User launches Chrome Browser")
	public void user_launches_chrome_browser() {
	    WebDriverManager.chromedriver().setup();
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    detailpg = new DetailsPage(driver);
	    
	}

	@When("User opens URL {string}")
	public void user_opens_url(String url) {
	    driver.get(url);
	}

	@When("User click on the link create account")
	public void user_click_on_the_link_create_account() {
	    detailpg.CreateAccount();
	}

	@When("User fill Full name as {string}")
	public void user_fill_full_name_as(String names) {
	    detailpg.FullName(names);
	}

	@When("user fill Choose a Rediffmail ID as {string}")
	public void user_fill_choose_a_rediffmail_id_as(String ids) {
	    detailpg.RediffId(ids);
	}

	@When("user click on Check availablity button")
	public void user_click_on_check_availablity_button() {
	    detailpg.CheckButton();
	}

	@Then("user check if ID is available or not")
	public void user_check_if_id_is_available_or_not() {
	    detailpg.CheckMessage();
	}

	@Then("user fill chose password as {string}")
	public void user_fill_chose_password_as(String pwds) {
	    detailpg.Password(pwds);
	}

	@Then("user reenter password as {string}")
	public void user_reenter_password_as(String rpwds) {
	    detailpg.RetypePassword(rpwds);
	}
	
	@Then("user select day as {string}")
	public void user_select_day_as(String day) {
	    detailpg.Day(day);
	}

	@Then("user select month as {string}")
	public void user_select_month_as(String months) {
	    detailpg.Month(months);
	}

	@Then("user select year as {string}")
	public void user_select_year_as(String years) {
	    detailpg.Year(years);
	}
	
	@Then("User select gender")
	public void user_select_gender() {
	   detailpg.RadioButton();
	}

	@Then("User select country as {string}")
	public void user_select_country_as(String Contry) {
	    detailpg.Country(Contry);
	}

	@Then("User select city as {string}")
	public void user_select_city_as(String Cities) {
	    detailpg.City(Cities);
	}
	
	@Then("User enter Recovery Email ID as {string}")
	public void user_enter_recovery_email_id_as(String recoveryEmail) {
		detailpg.Recovery(recoveryEmail);
	    
	}

	@Then("User enter mobile no as {string}")
	public void user_enter_mobile_no_as(String MobileNo) {
	    detailpg.Mobil(MobileNo);
	}
	
	@Then("user click on the create my account")
	public void user_click_on_the_create_my_account() {
	    detailpg.MyAcc();
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	    driver.close();
	    driver.quit();
	}


}
