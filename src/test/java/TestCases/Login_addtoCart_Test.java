package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.Login_addtoCart;

public class Login_addtoCart_Test extends DriverClass {
@Test

public void Login_Method() throws IOException {
	Login_addtoCart LAC = new Login_addtoCart(driver);
	LAC.UserName();
	LAC.Password();
	LAC.Login();
	LAC.AddtoCart();
	LAC.CartIcon();
}
	

}
