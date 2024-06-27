package Webpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class User_order_product extends BaseClass {
	WebDriver driver;
	 public  User_order_product(WebDriver driver) {
		 this.driver = driver;
	 }
	 By UserName = By.xpath("//input[@autocapitalize='none'][1]");
	 By Password = By.name("password");
	 By Login = By.xpath("//input[@value='Login']");
	 By Filter_icon = By.xpath("//select[@class='product_sort_container']");
	 By product_1 = By.name("add-to-cart-sauce-labs-bolt-t-shirt");
	 By product_2 = By.name("add-to-cart-sauce-labs-fleece-jacket");
	By lowhigh_text = By.xpath("//span [@class='select_container']/select/option[3]");
	 By Cart_icon =  By.xpath("//a[@class='shopping_cart_link']");
	 By Check_Out = By.id("checkout");
	// By CheckOut = By.xpath("//div[@class='cart_footer']/button[2]");
	 By first_name = By.id("first-name");
	 By last_name = By.id("last-name");
	 By Postal_code = By.id("postal-code");
	 By continue_button = By.xpath("//div[@class='checkout_buttons']/input");
	 By Finish_button = By.xpath("//div[@class='cart_footer']/button[2]");
	  By validate_text = By.xpath("//div[@class='checkout_complete_container']/h2");
		By back_home = By.id("back-to-products");	 
	 public void UserName() {
		 WebElement ele = driver.findElement(UserName);
		 SendkeysMethod(ele, "standard_user");

	 }
	 public void Password() {
	 	WebElement ele = driver.findElement(Password);
	 	SendkeysMethod(ele, "secret_sauce");
	 }
	 public void Login() {
	 	WebElement ele = driver.findElement(Login);
	 	ClickMethods(ele);
	 	log.debug("login sucessfull ");
	 }
	 
	 public void Filter_icon() throws IOException {
		 Select dropdown = new Select(driver.findElement(Filter_icon));  
		 dropdown.selectByVisibleText("Price (low to high)");  
		 takecreenshots("Image_high-low_sort");
		 log.debug("selected filter as Price (low to high) ");
		 }
	 public void validate_cartsize(){
		 String text = "Price (low to high)";
			WebElement Carttext = driver.findElement(lowhigh_text);
			System.out.println(Carttext.getText());
			String cart_mssg = Carttext.getText();
			Assert.assertEquals(text, cart_mssg);
			System.out.println("The text message is displayed and its correct");
			 
	 }

	 public void product_1() {
		 	WebElement ele = driver.findElement(product_1);
		 	ClickMethods(ele);
		 	log.debug("1product has been added to cart "); 
	 }
	 public void product_2() {
		 	WebElement ele = driver.findElement(product_2);
		 	ClickMethods(ele);
		 	log.debug("product2 has been added to cart ");
	 }
	 public void Cart_icon() {
		 	WebElement ele = driver.findElement(Cart_icon);
		 	ClickMethods(ele);
		 	try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				JavascriptExecutor js = (JavascriptExecutor) driver;
				 js.executeScript("window.scrollBy(0,1000)");
			}
		 	log.debug("cart has been clicked ");
	 }
	 
	 
		
	 public void Check_Out()  {
		
		 	WebElement ele = driver.findElement(Check_Out);
		 	ClickMethods(ele);
		 	log.debug("Clicked on checkout button ");
	 }
	 public void first_name() {
		 WebElement ele = driver.findElement(first_name);
		 SendkeysMethod(ele, "Divya-chilakabhathini");
	 }
	 public void last_name() {
		 WebElement ele = driver.findElement(last_name);
		 SendkeysMethod(ele, "Sri");
	 }
	 public void Postal_code() {
		 WebElement ele = driver.findElement(Postal_code);
		 SendkeysMethod(ele, "57683");
		 log.debug("filled details ");
	 }
	 public void continue_button() {
		 	WebElement ele = driver.findElement(continue_button);
		 	ClickMethods(ele);
		 	log.debug("continue button has been clicked ");
}
	 public void Finish_button() {
		 	WebElement ele = driver.findElement(Finish_button);
		 	ClickMethods(ele);
		 	log.debug("finished button has been clicked  ");
}
	 
	 public void validate_text() {
			String act = "Thank you for your order!";
			WebElement mssg_text = driver.findElement(validate_text);
			System.out.println(mssg_text.getText());
			String Text_mssg = mssg_text.getText();
			Assert.assertEquals(act, Text_mssg);
			System.out.println("The text message is displayed and its correct");
		}
	 public void back_home() {
		 	WebElement ele = driver.findElement(back_home);
		 	ClickMethods(ele);
		 	log.debug("clicked on back to home button ");
}
}


