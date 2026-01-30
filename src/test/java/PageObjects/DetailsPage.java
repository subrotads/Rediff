package PageObjects;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DetailsPage {
	
	WebDriver driver;
	WebDriverWait wait;
	
	
	public DetailsPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		PageFactory.initElements(driver, this);
	}
	

	
	
	@FindBy(xpath = "//a[@title='Create Rediffmail Account']")
	WebElement createAcc;
	
	@FindBy(xpath = "//input[@placeholder='Enter your full name']")
	WebElement fulNam;
	
	@FindBy(xpath = "//input[@placeholder='Enter Rediffmail ID']")
	WebElement redifId;
	
	@FindBy(xpath = "//input[@value='Check availability']")
	WebElement checkBtn;
	
	@FindBy(className = "msgSucc")
	WebElement checkMsg;
	
	@FindBy(xpath = "//input[@placeholder = 'Enter password']")
	WebElement passwrd;
	
	@FindBy(xpath = "//input[@placeholder='Retype password']")
	WebElement repswd;
	
	@FindBy(className = "day")
	WebElement day;
	
	@FindBy(xpath = "//select[@class='middle month']")
	WebElement month;
	
	@FindBy(className = "year")
	WebElement year;
	
	@FindBy(xpath = "//input[@value='f']")
	WebElement radioButton;
	
	@FindBy(xpath = "//select[@id='country']")
	WebElement country;
	
	@FindBy(xpath = "//select[@onchange='showothcity();fieldTrack(this);']")
	WebElement city;
	
	@FindBy(xpath = "//input[@placeholder='Enter recovery email']")
	WebElement reemail;
	
	@FindBy(id = "mobno")
	WebElement mobile;
	
	@FindBy(xpath = "//input[@value='Create my account']")
	WebElement create;
	
	@FindBy(linkText="terms and conditions")
	WebElement terms;
	
	@FindBy(xpath = "//input[@value='OK']")
	WebElement accept;
	
	public void CreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(createAcc)).click();
	}
	
	
	public void FullName(String name) {
		fulNam.sendKeys(name);
	}
	
	public void RediffId(String id) {
		redifId.sendKeys(id);
	}
	
	public void CheckButton() {
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn)).click();
	}
	
	public void CheckMessage() {
		wait.until(ExpectedConditions.visibilityOf(checkMsg)).getText();
	
		
		String acctualData = checkMsg.getText();
		String expectedData = "Yippie! The ID you've chosen is available.";
		
		if (acctualData.equals(expectedData)) {
			System.out.println("ID Available");
		} else {
			System.out.println("ID is not Available");
		}
	}
	
	public void Password(String pwd) {
		passwrd.sendKeys(pwd);
	}
	
	public void RetypePassword(String rpwd) {
		repswd.sendKeys(rpwd);
	}
	
	public void Day(String date) {
		
		Select dropDown = new Select(day);
		dropDown.selectByVisibleText(date);
	}
	
	public void Month(String months) {
		Select dropDown = new Select(month);
		dropDown.selectByVisibleText(months);
	}
	
	public void Year(String years) {
		Select DropDown = new Select(year);
		DropDown.selectByVisibleText(years);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
		
		
	}
	
	public void RadioButton() {
		wait.until(ExpectedConditions.elementToBeClickable(radioButton)).click();
	}
	
	public void Country(String countr) {
		Select dropDown = new Select(country);
		dropDown.selectByVisibleText(countr);
	}
	
	public void City(String citi) {
		Select dropDown = new Select(city);
		dropDown.selectByVisibleText(citi);
	}
	
	public void Recovery(String recovem) {
		reemail.sendKeys(recovem);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)","");
	}
	
	public void Mobil(String phone) {
		mobile.sendKeys(phone);
	}
	
	public void MyAcc() {
		create.click();
	}
	
	public void TermsAnd() {
		terms.click();
		switchToNewTab();
	}
	
	public void switchToNewTab() {
        Set<String> windows = driver.getWindowHandles();
        for (String window : windows) {
            driver.switchTo().window(window);
        }
	}
	
	public void AcceptBtn() {
		accept.click();
	}
	
	
	
}
