package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.Continueshopping_Validate;

public class Continueshopping_Validate_Test extends DriverClass {

	@Test
	public void Continueshopping_Method() throws IOException {
		Continueshopping_Validate CSVA = new Continueshopping_Validate(driver);
		CSVA.UserName();
		CSVA.Password();
		CSVA.Login();
		CSVA.product();
		CSVA.CartCheck();
		CSVA.Continue_shopping();
		
	}
}
