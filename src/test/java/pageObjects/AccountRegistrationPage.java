package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccountRegistrationPage extends BasePage {

	// constructor
	public AccountRegistrationPage(WebDriver driver) {
		super(driver);

	}

// locators 
	@FindBy(xpath = "//*[@id='input-firstname']")
	WebElement txt_Fname;

	@FindBy(xpath = "//*[@id='input-lastname']")
	WebElement txt_lname;

	@FindBy(xpath = "//*[@id='input-email']")
	WebElement txt_email;

	@FindBy(xpath = "//*[@id='input-telephone']")
	WebElement Phone;

	@FindBy(xpath = "//*[@id='input-password']")
	WebElement txt_password;

	@FindBy(xpath = "//*[@id='input-confirm']")
	WebElement txt_cnfpassword;

	@FindBy(xpath = "//*[@name='agree']")
	WebElement ChdkPolicy;

	@FindBy(xpath = "//*[@value='Continue']")
	WebElement CtnBTN;

	@FindBy(xpath = "//h1[contains(text(),'Has Been Created')]")
	WebElement MesgConfirmation;

	// Actions methods

	public void SetFanme(String fname) {
		txt_Fname.sendKeys(fname);
	}

	public void Setlname(String lname) {
		txt_lname.sendKeys(lname);
	}

	public void SetEmail(String email) {
		txt_email.sendKeys(email);

	}

	public void SetPhone(String phone) {
		Phone.sendKeys(phone);

	}

	public void SetPassword(String pwd) {
		txt_password.sendKeys(pwd);
	}

	public void SetConfPassword(String Cnfpwd) {
		txt_cnfpassword.sendKeys(Cnfpwd);
	}

	public void clickPolicy() {
		ChdkPolicy.click();

	}

	public void clickCtnBtn() {
		CtnBTN.click();

	}

	public String getConfirmationMesg() {

		try {
			return (MesgConfirmation.getText());
		} catch (Exception e) {
			return (e.getMessage());
		}

	}
}
