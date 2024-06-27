package utilites;
import java.io.File;

import org.openqa.selenium.devtools.v117.emulation.model.DisplayFeature;

import com.relevantcodes.extentreports.DisplayOrder;
import com.relevantcodes.extentreports.ExtentReports;
public class Extendedmanager {
public static ExtentReports extent;
	 
		public static ExtentReports getInstance() {
	 
			if (extent == null) {
	 
				extent = new ExtentReports(
						System.getProperty("user.dir") + "\\test-output\\extent.html\\", true,DisplayOrder.OLDEST_FIRST);
				extent.loadConfig(new File(
						System.getProperty("user.dir") + "\\src\\test\\resources\\extentconfig\\config.xml"));
	 
				
			}
			return extent;
		}
}
