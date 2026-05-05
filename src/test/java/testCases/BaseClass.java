package testCases;

import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public class BaseClass {

	public WebDriver driver;
	public Logger logger;

	
	@BeforeClass
	@Parameters({"os", "browser"}) // Dono parameters ke actual naam yahan aayenge
	public void setup(@Optional("windows") String os, @Optional("chrome") String br) {
	    
	    logger = LogManager.getLogger(this.getClass());
	    
	    // Aapka baaki ka code...
		logger = LogManager.getLogger(this.getClass());
		
		switch(br.toLowerCase()) {
		case "chrome" : driver=new ChromeDriver();break;
		case "firefox" : driver=new FirefoxDriver();break;		
		case "edge" : driver=new EdgeDriver();break;
		default :System.out.println("invailed browser name ---"); return;
		}
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().window().maximize();

	}

	@AfterClass
	public void tearDown() {

		driver.quit();
	}

	public String randomString() {
		String generatedstring = RandomStringUtils.randomAlphabetic(5);
		return generatedstring;

	}

}
