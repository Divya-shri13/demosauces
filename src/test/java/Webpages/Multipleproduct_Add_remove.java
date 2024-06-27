package Webpages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import junit.framework.Assert;

public class Multipleproduct_Add_remove extends BaseClass {
	WebDriver driver;

	public Multipleproduct_Add_remove(WebDriver driver) {
		this.driver = driver;
	}

	
	By UserName = By.id("user-name");
	By Password = By.id("password");
	By Login = By.xpath("//input[@class='submit-button btn_action']");
	By thirdproduct = By.xpath("//button[@data-test = 'add-to-cart-sauce-labs-bolt-t-shirt']");
	By Title_3rdPr = By.xpath("//a[@id='item_1_title_link']/div");
	By firstproduct = By.xpath("//button[@class='btn btn_primary btn_small btn_inventory '][position()=1]");
	By Title1stPr = By.xpath("//a[@id='item_4_title_link']/div");
	By cartSymbol = By.xpath("//a[@class='shopping_cart_link']");
	By remove = By.name("remove-sauce-labs-backpack");

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
		log.debug("login has been sucessfull");
	}

	public void Thirdproduct() {
		WebElement ele = driver.findElement(thirdproduct);
		ClickMethods(ele);
		log.debug("3rd item added to cart ");
	}

	public void Firstproduct() {
		WebElement ele = driver.findElement(firstproduct);
		ClickMethods(ele);
		log.debug("1st item added to acrt ");
	}

	public void CartSymbol() throws IOException {
		WebElement ele = driver.findElement(cartSymbol);
		ClickMethods(ele);
		log.debug("clicked on cart ");
		String expectedProductTitle1 = "Sauce Labs Bolt T-Shirt";
		WebElement Title1 = driver.findElement(Title_3rdPr);
		System.out.println(Title1.getText());
		String Title_pr1 = Title1.getText();
		Assert.assertEquals(expectedProductTitle1, Title_pr1);
		System.out.println("the 3rd product is presenet");
		String expectedTitle2 = "Sauce Labs Backpack";
		WebElement Title2 = driver.findElement(Title1stPr);
		System.out.println(Title2.getText());
		String Title_pr2 = Title2.getText();
		Assert.assertEquals(expectedTitle2, Title_pr2);
		takecreenshots("Image of mult add remove");
	}

	public void remove() throws IOException {
		WebElement ele = driver.findElement(remove);
	ClickMethods(ele);
//		String acttext = "Sauce Labs Bolt T-Shirt";
//		WebElement product1 = driver.findElement(Title1stPr); 
//		System.out.println(product1.getText());
//		String product_text = product1.getText();
//		Assert.assertEquals(acttext, product_text);
//		System.out.println("The product removed is not in cart");
		takecreenshots("product_text_image");
		System.out.println("The 2nd product has been removed");
		log.debug("removed a product from cart");
		}

}
