package Webpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Login_addtoCart  extends BaseClass{
	WebDriver driver;
	
	public Login_addtoCart(WebDriver driver) {
		this.driver = driver;
		
	}
	By UserName = By.xpath("//input[@type='text']");
	By Password = By.id("password");
	By  Login = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/input");  // another if it dosen't work 
	By AddtoCart = By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
	By CartIcon = By.xpath("//*[@id=\"shopping_cart_container\"]/a"); // another if it dosen't work 
	By ItemName = By. xpath("//div[@class='inventory_item_name']");
	public  void UserName() {
		WebElement ele = driver.findElement(UserName);
		SendkeysMethod(ele,"standard_user");
		log.debug("enterted username");
		
	}
	public void Password() {
		WebElement ele = driver.findElement(Password);
		SendkeysMethod(ele,"secret_sauce");
		log.debug("enterted password");
	}
	public void Login() {
		WebElement ele = driver.findElement(Login);
		ClickMethods(ele);
		log.debug("log in sucessfull");
	}
	public void  AddtoCart() {
		WebElement ele = driver.findElement(AddtoCart);
		ClickMethods(ele);
		log.debug("item added to cart");
	}
	public void CartIcon() throws IOException {
		WebElement ele = driver.findElement(CartIcon);
		ClickMethods(ele);
		String expectedProductTitle = "Test.allTheThings() T-Shirt (Red)";
		WebElement text = driver.findElement(ItemName);
		System.out.println(text.getText());
		 String text1 = text.getText();
		Assert.assertEquals(expectedProductTitle,text1 );
		System.out.println("The Title of the product is same in both the pages");
		takecreenshots("Image1");
		log.debug("Cart page is opened and item is present");
	}
	
}
