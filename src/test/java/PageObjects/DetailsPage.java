package PageObjects;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
		checkMsg.getText();
		
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
	
	
}
