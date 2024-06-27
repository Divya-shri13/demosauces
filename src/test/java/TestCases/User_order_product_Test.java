package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.User_order_product;

public class User_order_product_Test extends DriverClass {
@Test

public void User_order_Method() throws IOException {
	User_order_product USP = new User_order_product(driver);
	USP.UserName();
	USP.Password();
	USP.Login();
	USP.Filter_icon();
	USP.validate_cartsize();
	USP.product_1();
	USP.product_2();
	
	USP.Cart_icon();
	USP.Check_Out();
	USP.first_name();
	USP.last_name();
	USP.Postal_code();
	USP.continue_button();
	USP.Finish_button();
	USP.validate_text();
	USP.back_home();
	
}
}
