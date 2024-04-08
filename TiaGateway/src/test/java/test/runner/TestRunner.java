package test.runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import program.utility.BaseUtility;

@RunWith(Cucumber.class)

@CucumberOptions(features = "C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\src\\test\\resources",glue ="major.pac",dryRun=false,monochrome = true,tags="@Zephyr", plugin = {
		"html:C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Reports\\HTML_Reports\\proejectTia.html",
		"json:C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Reports\\Json_Reports\\projectTia.json",
		"junit:C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Reports\\Junit_Reports\\projectTia.xml",
		"rerun:C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Rerun\\failed.txt"
		,"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" })
// tags=(String)"@ConnectWithTia_Screen_Validation_With_Valid_Data",
//@To_Validate_Dashboard_Screen
//,tags="@Notification_Menu_Screen"
public class TestRunner{
	@AfterClass
	 
	 public static void jvmreport() {
		
		 BaseUtility.getJvmRepoting("C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Reports\\Json_Reports\\projectTia.json");

	}
	

}


