package TestCases;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;


import utilites.Extendedmanager;



public class DriverClass {
	public static WebDriver driver;
	public static Logger log =Logger.getLogger("devpinoyLogger");
	public static ExtentReports report = Extendedmanager.getInstance();
	public static ExtentTest test;

	@BeforeSuite
	public void browserSetup() {
//		EdgeOptions options = new EdgeOptions();
//		options.addArguments("--remote-allow--origins=*");
		//WebDriverManager.edgedriver().setup();
		
		System.setProperty("webdriver.edge.driver",
				"C:\\Users\\CHISRI\\eclipse-workspace\\DemoSauces\\msedgedriver.exe");
		driver = new EdgeDriver();
		String actUrl = "https://www.saucedemo.com/";
		//opening the website 
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		// driver.manage().deleteAllCookies();
		//to get the ur             
		String expUrl = driver.getCurrentUrl();
		Assert.assertEquals(expUrl, actUrl);
		System.out.println("Validation Successful");
		log.debug("Browser opened sucessfully");
	}

@AfterSuite
	public void CloseBrowser() {
	if (driver != null) {
			driver.quit();
			log.debug("Browser closed");
		}

	}

}
