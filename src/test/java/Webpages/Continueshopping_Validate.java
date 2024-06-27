package Webpages;

import java.io.IOException;
import java.security.PublicKey;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Continueshopping_Validate extends BaseClass{
	WebDriver driver;
	public Continueshopping_Validate(WebDriver driver) {
		this.driver = driver;
	}
	By UserName = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input");
	By Password = By.id("password");
	By  Login = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input");
	By 	Product = By.id("add-to-cart-sauce-labs-bolt-t-shirt");
	By CartCheck = By.xpath("//a[@Class='shopping_cart_link']");
	By ItemPrice =  By.xpath("//div[@class ='inventory_item_price']");
 By Continue_shopping = By.id("continue-shopping");
 
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
	log.debug("login sucessful");
}
public void product() {
	WebElement ele =driver.findElement(Product);
	ClickMethods(ele);
	log.debug("added a product to cart");
}
public void CartCheck() throws IOException {
	WebElement ele = driver.findElement(CartCheck);
	ClickMethods(ele);
	String expectedProductPrice = "$15.99";
	System.out.println("The price of the product  before is $15.99 ");
WebElement text2 = driver.findElement(ItemPrice);
System.out.println(text2.getText());
String prizetext = text2.getText();
Assert.assertEquals(expectedProductPrice, prizetext);
System.out.println("The price of the product after is $15.99");
System.out.println("The price of the product is same");
takecreenshots("price_of_product");
}

public void Continue_shopping() throws IOException {
	WebElement ele = driver.findElement(Continue_shopping);
	ClickMethods(ele);
	String ActlUrl = "https://www.saucedemo.com/inventory.html";
	String expUrl = driver.getCurrentUrl();
	Assert.assertEquals(ActlUrl, expUrl);
	System.out.println("Validation Successful");
	takecreenshots("Validation_url_image");
}
}