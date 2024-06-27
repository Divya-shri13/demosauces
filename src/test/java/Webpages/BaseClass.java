package Webpages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
//import java.time.Duration;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import TestCases.DriverClass;

public class BaseClass extends DriverClass {

/*this is a generic method use for click*/
	public void ClickMethods(WebElement ele) {
		ele.click();
	}
	/*this is a generic method use for sending texting */
	public void SendkeysMethod(WebElement ele, String text ) {
		ele.sendKeys(text);
}
	public void waits(WebDriver driver,Duration time,By loc) {
		 
		WebDriverWait wait = new WebDriverWait(driver,time);

		wait.until(ExpectedConditions.visibilityOfElementLocated(loc));
		

	}
	/*this is a generic method use for Taking screenshots*/
	public static void takecreenshots(String fileName) throws IOException {
		//create a file with takescreenshot interface and get the screenshot as File
	File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//we use copyfile method to store the file in the given path
	FileUtils.copyFile(file, new File("C:\\Users\\CHISRI\\eclipse-workspace\\DemoSauces\\Screenshot\\" +fileName+".jpg"));
	
	}
}

