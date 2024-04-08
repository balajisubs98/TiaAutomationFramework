package major.pac;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import program.utility.BaseUtility;

public class Hooks extends BaseUtility {
	
	 
	
	@AfterStep
	
	public void takeScreenshot(Scenario sc) {
		
		if (sc.isFailed()) {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshotAs, "img/png", "Screenshot Attached");
			
		} else {
			
			TakesScreenshot ts = (TakesScreenshot)driver;
			byte[] screenshotAs = ts.getScreenshotAs(OutputType.BYTES);
			sc.attach(screenshotAs, "img/png", "Screenshot Attached");

		}
		
	}
	

	@After
	
	public void closeBrow() {
	driver.close();
	}
	
}
