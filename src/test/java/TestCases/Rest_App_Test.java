package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;

import Webpages.Rest_App;

public class Rest_App_Test extends DriverClass {
@Test
public void Rest_Method() throws IOException {
	Rest_App REA = new Rest_App(driver);
	REA.UserName();
	REA.Password();
	REA.Login();
	REA.Filter_Icon();
	REA.add1st_item();
	REA.add2Nd_item();
	REA.add3rd_item();
	REA.Display_no();
	
	REA.Button_menu();
	
	REA.rest_Button();
	REA.cross_mark();
	REA.No_of_items_In_Cart();
	
	REA.menu_bar();
	REA.Log_out_Method();
}

}
