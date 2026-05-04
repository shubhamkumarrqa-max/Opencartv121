package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	// constructor
	public HomePage(WebDriver driver) {

		super(driver);
	}
	// locators

	@FindBy(xpath = "//*[@title='My Account']")
	WebElement myacc;

	@FindBy(linkText = "Register")
	WebElement reg;

	// Actions methods

	public void clickMyAccount() {
		myacc.click();

	}

	public void clickRegister() {
		reg.click();

	}

}
