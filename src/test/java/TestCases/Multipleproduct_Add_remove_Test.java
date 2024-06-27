package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.Multipleproduct_Add_remove;

public class Multipleproduct_Add_remove_Test extends DriverClass{
	@Test
	public void Multipleproduct_Method() throws IOException {
		Multipleproduct_Add_remove MPAR = new Multipleproduct_Add_remove(driver);
		MPAR.UserName();
		MPAR.Password();
		MPAR.Login();
		MPAR.Thirdproduct();
		MPAR.Firstproduct();
		MPAR.CartSymbol();
		MPAR.remove();
	}

}
