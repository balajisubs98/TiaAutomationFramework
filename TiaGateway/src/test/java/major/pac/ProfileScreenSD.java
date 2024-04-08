package major.pac;

import java.io.IOException;

import org.testng.asserts.SoftAssert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.ProfileScreenPOM;
import program.utility.BaseUtility;

public class ProfileScreenSD extends BaseUtility {
	ProfileScreenPOM ps = new ProfileScreenPOM();
	SoftAssert sa = new SoftAssert();
	String screenshotpath="C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\ProfileScreen\\";
	
	
	@Given("User sholud launch and Login to Tia application via Google Chrome Browser")
	public void user_sholud_launch_and_login_to_tia_application_via_google_chrome_browser() throws InterruptedException {
	    launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
	    toMaximize();
	    
	    ps=new ProfileScreenPOM();
	    fwait(ps.getButtonLogin());
	    ps.getUsrnmeTextbox().sendKeys("prem.verma@indicaindustries.in");
	    ps.getPassTextBox().sendKeys("zxd^d%U45%Si");
	    ps.getButtonLogin().click();
	    fwait(ps.getDashboard());
	    boolean displayed = ps.getDashboard().isDisplayed();
	    sa.assertEquals(displayed, true);
	}
	@Given("User to click account and it shows drop down with profile option.")
	public void user_to_click_account_and_it_shows_drop_down_with_profile_option() throws IOException {
		ps=new ProfileScreenPOM();
		ps.getAccount().click();
		takeScreenshot(screenshotpath,"dropdown_Profile_Scrn");
		ps.getProfile().click();
	  
	}
	@When("User click on profile, Will Profile Screen popup window will appear.")
	public void user_click_on_profile_will_profile_screen_popup_window_will_appear() throws IOException {
		ps=new ProfileScreenPOM();
		takeScreenshot(screenshotpath,"Profile_Scrn");
		Boolean text = ps.getCloseXbutton().isDisplayed();
		
		sa.assertEquals(text, true);
	}
	@When("To Check Whether Profile screen Title label is User Profile.")
	public void to_check_whether_profile_screen_title_label_is_user_profile() {
		ps=new ProfileScreenPOM();
		String text = ps.getUserProfile().getText();
		sa.assertEquals(text, "User Profile");
	}
	@Then("To Check Whether Profile screen shows user details under About label.")
	public void to_check_whether_profile_screen_shows_user_details_under_about_label() {
		ps=new ProfileScreenPOM();
		Boolean text = ps.getAbout().isDisplayed();
		sa.assertEquals(text, true);
	}
	@Then("To Check Whether Profile screen shows settings details under Setting label.")
	public void to_check_whether_profile_screen_shows_settings_details_under_setting_label() {
		ps=new ProfileScreenPOM();
		Boolean text = ps.getSetting().isDisplayed();
		sa.assertEquals(text, true);
	}
	@Then("To Check Whether Copyright and Tangentia link is available on Login Screen.")
	public void to_check_whether_copyright_and_tangentia_link_is_available_on_login_screen() {
		ps=new ProfileScreenPOM();
		Boolean text = ps.getCopyrightTangentiaLbl().isDisplayed();
		sa.assertEquals(text, true);
		Boolean text1 = ps.getTangentiaLink().isDisplayed();
		sa.assertEquals(text1, true);
	}
	@Then("To Check Whether user able to click Tangentia link and it navigate to Tangentia WebPage.")
	public void to_check_whether_user_able_to_click_tangentia_link_and_it_navigate_to_tangentia_web_page() throws InterruptedException, IOException {
		ps=new ProfileScreenPOM();
		ps.getTangentiaLink().click();
		    Thread.sleep(7000);
		    takeScreenshot(screenshotpath,"TanWebsite_via_Profile_Scrn");
		    String title = driver.getTitle();
			sa.assertEquals(title, "Tangentia | Future is Autonomous");
	}
	@Then("To Check Whether user able to click Xclose button and After click profile popscreen will disappear.")
	public void to_check_whether_user_able_to_click_xclose_button_and_after_click_profile_popscreen_will_disappear() throws InterruptedException, IOException {
		ps=new ProfileScreenPOM();
		driver.navigate().back();
		Thread.sleep(5000);
		ps.getAccount().click();
		ps.getProfile().click();
		Thread.sleep(2000);
		ps.getCloseXbutton().click();
	    sa.assertAll();
		
	    
	}


}
