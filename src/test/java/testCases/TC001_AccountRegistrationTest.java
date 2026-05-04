package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.AccountRegistrationPage;
import pageObjects.HomePage;

public class TC001_AccountRegistrationTest extends BaseClass {

	@Test
	public void verify_account_registration() {
		try {
			logger.info("here test case is starting---------------------------");
			HomePage hp = new HomePage(driver);
			hp.clickMyAccount();
			hp.clickRegister();
			
			logger.info("Cliked on  Account registartion---------------------------");
			AccountRegistrationPage regpage = new AccountRegistrationPage(driver);
			
			logger.info("Providing customer details ----------------");
			regpage.SetFanme("Shubham");
			regpage.Setlname("Fagun");
			regpage.SetEmail(randomString() + "@gmail.com");
			regpage.SetPhone("646382926393");
			regpage.SetPassword("V#5623&lop");
			regpage.SetConfPassword("V#5623&lop");
			regpage.clickPolicy();
			logger.info("cliked continue button____");
			regpage.clickCtnBtn();
			String textmesg = regpage.getConfirmationMesg();
			Assert.assertEquals(textmesg, "Your Account Has Been Created!");

		} catch (Exception e) {

			logger.error("Test failed-----");
			logger.debug("debug logs-----");

		}
		logger.info("here test case is completed ---------------------------");
	}
}