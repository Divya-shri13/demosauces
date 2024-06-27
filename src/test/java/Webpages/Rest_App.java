package Webpages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;

public class Rest_App  extends BaseClass{
	WebDriver driver;
	public Rest_App(WebDriver driver) {
	this.driver = driver;
	}
	By UserName = By.xpath("/html/body/div/div/div[2]/div[1]/div/div/form/div[1]/input.");
	By Password = By.xpath("//input[@type='password']");
By Login = By.name("login-button");
By  Filter_Icon = By.xpath("//select[@class='product_sort_container']");
By add1st_item = By.name("add-to-cart-sauce-labs-bike-light");
By add2Nd_item = By.id("add-to-cart-test.allthethings()-t-shirt-(red)");
By add3rd_item = By.xpath("//button[@data-test='add-to-cart-sauce-labs-onesie']");
By Display_no = By.xpath("//a[@class='shopping_cart_link']/span");
By button_menu = By.id("react-burger-menu-btn");
By rest_Button = By.cssSelector("a[id='reset_sidebar_link']");
By No_of_items_In_Cart =  By.xpath("//a[@class='shopping_cart_link']");
By Cross_mark = By.id("react-burger-cross-btn");
By  menu_bar = By.cssSelector("button[id='react-burger-menu-btn']");
By log_out = By.xpath("//nav[@class='bm-item-list']/a[3]");
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
	log.debug("login sucessfull");
}
public void Filter_Icon() throws IOException {
Select dropdown = new Select(driver.findElement(Filter_Icon));  
dropdown.selectByVisibleText("Name (Z to A)");  
takecreenshots("Sort_Image");
log.debug("selected  Name (Z to A) as filter ");
}
public void add1st_item() {
	WebElement ele = driver.findElement(add1st_item);
	ClickMethods(ele);
	log.debug("item1 added to cart  ");
}
public void add2Nd_item() {
	WebElement ele = driver.findElement(add2Nd_item);
	ClickMethods(ele);
	log.debug("item2 added to cart  ");
}
public void add3rd_item() {
	WebElement ele = driver.findElement(add3rd_item);
	ClickMethods(ele);
	log.debug("item3 added to cart  ");
}
public void Display_no() {
	String act = "3";
	WebElement number_text = driver.findElement(Display_no);
	System.out.println(number_text.getText());
	String Text_number = number_text.getText();
	Assert.assertEquals(act, Text_number);
	System.out.println("The number is represented on cart and its as accepted");
	
}

public void Button_menu() {
	WebElement ele = driver.findElement(button_menu);
	ClickMethods(ele);
	log.debug("menu bar is clicked");
}
public void rest_Button() throws IOException {
	WebElement ele = driver.findElement(rest_Button);
	ClickMethods(ele);
	takecreenshots("rest_validation");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	log.debug("rest of app done ");
}
public void No_of_items_In_Cart() throws IOException{
	String  cart = "";
	WebElement Cart_no = driver.findElement(No_of_items_In_Cart);
	
	System.out.println("no.of.items"+Cart_no.getText());
	String Cart_size = Cart_no.getText();
	Assert.assertEquals(cart, Cart_size);
	System.out.println("The Cart is empty");
	takecreenshots("Cart-size_image");
	try {
		Thread.sleep(5000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void cross_mark() {
	WebElement ele = driver.findElement(Cross_mark);
	ClickMethods(ele);
	log.debug("navigating to menubar");
}

public void menu_bar() {
	WebElement menu = driver.findElement(button_menu);
	ClickMethods(menu);
	log.debug("menu bar has been opened");
	
}
public void Log_out_Method() {
	WebElement logou = driver.findElement(log_out);
	ClickMethods(logou);
	log.debug("Clicked on log-out button");
}
}


