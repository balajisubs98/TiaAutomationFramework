package major.pac;

import java.awt.AWTException;
import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.LoginScreenPOM;
import program.utility.BaseUtility;

public class LoginScreenSD extends BaseUtility {
	LoginScreenPOM ls = new LoginScreenPOM();
	SoftAssert sa = new SoftAssert();
    String screenshotpath="C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\LoginScreen\\";
    private Scenario scenario;
    
    

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
	}
	
	
	// Scenario: Validate the LoginScreen
	
	@Given("Launch Tia Application on Google Chrome Browser")
	public void launch_tia_application_on_google_chrome_browser() throws InterruptedException  {
		ls=new LoginScreenPOM();
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
	     toMaximize();
	
	     
	}
	@When("User able to reach Login Screen Succesfully")
	public void user_able_to_reach_login_screen_succesfully() throws IOException {
		ls=new LoginScreenPOM();
		fwaitpage("LoginScreen");
		fwait(ls.getButtonLogin());
	   boolean displayed = ls.getTiaLogo().isDisplayed();
	   takeScreenshot(screenshotpath, "Loginscreen");
	   sa.assertEquals(true, displayed);
	   
	}
	@Then("To Check Whether Tia Logo available on Login Screen")
	public void to_check_whether_tia_logo_available_on_login_screen() {
		ls=new LoginScreenPOM();
		
		   boolean displayed = ls.getTiaLogo().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
		    
	}
	@Then("To Check Whether UserName Label available on Login Screen")
	public void to_check_whether_user_name_label_available_on_login_screen() {
		ls=new LoginScreenPOM();
		   boolean displayed = ls.getUsrnameLabel().isDisplayed();		   
		   Assert.assertEquals(true, displayed);
	}
	@Then("To Check Whether UserName TextBox with infoLabel available on Login Screen")
	public void to_check_whether_user_name_text_box_with_info_label_available_on_login_screen() {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getUsrnmeTextbox().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
	}
	@Then("To Check Whether Password Label available on Login Screen")
	public void to_check_whether_password_label_available_on_login_screen() {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getPassLabel().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
	}
	@Then("To Check Whether Password TextBox with infoLabel available on Login Screen")
	public void to_check_whether_password_text_box_with_info_label_available_on_login_screen() {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getPassTextBox().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
	}
	@Then("To Check Whether LoginButton with infoLabel available on Login Screen")
	public void to_check_whether_login_button_with_info_label_available_on_login_screen() {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getButtonLogin().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
	}
	@Then("To Check Whether over the Password TestBox Eye icon is Available on Login Screen")
	public void to_check_whether_over_the_password_test_box_eye_icon_is_available_on_login_screen() {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getEyeicon().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
	}

	@Then("To Check Whether ConnectWithTia Link available on Login Screen")
	public void to_check_whether_connect_with_tia_link_available_on_login_screen() {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getCntWtTia().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
	}
	@Then("To Check Whether Tangentia Link available on Login Screen")
	public void to_check_whether_tangentia_link_available_on_login_screen() throws IOException {
		ls=new LoginScreenPOM();
		boolean displayed = ls.getTanLink().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
		   sa.assertAll();
	}
	
	//Scenario: Validate the functionality of the Login with Valid Credential.
	
	@Given("Launch Tia Application on Google Chrome Browser.")
	public void launch_Tia_application_on_google_chrome_browser() throws InterruptedException {
		ls= new LoginScreenPOM();
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		
        
	     
	}

	@When("validate User able to reach Login Screen Succesfully.")
	public void validate_user_able_to_reach_login_screen_succesfully() {
		ls=new LoginScreenPOM();
		fwait(ls.getButtonLogin());
		boolean displayed = ls.getTiaLogo().isDisplayed();
		   sa.assertEquals(true, displayed);

	}

	@Then("validate User able to pass username on Username TextBox as {string}")
	public void validate_user_able_to_pass_username_on_username_text_box_as(String username) {
	ls=new LoginScreenPOM();
		ls.getUsrnmeTextbox().sendKeys(username);
	}

	@Then("validate User able to pass password on password TextBox as {string} {string}.")
	public void validate_user_able_to_pass_password_on_password_text_box_as(String password,String client) throws IOException, InterruptedException {
		ls=new LoginScreenPOM();
		ls.getPassTextBox().sendKeys(password);
		takeScreenshot(screenshotpath, "Before_Loginwith_validcredentials"+client);
		Thread.sleep(1000);
	}

	@Then("validate User able to click LoginButton.")
	public void validate_user_able_to_click_login_button() {
		ls=new LoginScreenPOM();
		ls.getButtonLogin().click();
	}

	@Then("validate User able to reach Dashborad screen.{string}")
	public void validate_user_able_to_reach_dashborad_screen(String client) throws InterruptedException, IOException{
		ls=new LoginScreenPOM();    
	fwait(ls.getDashboard());
		boolean displayed = ls.getDashboard().isDisplayed();
	   sa.assertEquals(true, displayed);
	   takeScreenshot(screenshotpath, "After_Loginwith_validcredentials"+client);
	   Thread.sleep(1000);
	   sa.assertAll();
	   

	}
	
	// Scenario: Validate the functionality of the Login with InValid Credential.
	
	@Given("Launch Tia Application on Chrome Browser.")
	public void launch_tia_application_on_chrome_browser() throws InterruptedException {
		ls= new LoginScreenPOM();
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
	    
	}
	@When("validate User should reach Login Screen Succesfully.")
	public void validate_user_should_reach_login_screen_succesfully() {
					ls=new LoginScreenPOM();
					fwait(ls.getCntWtTia());
		   boolean displayed = ls.getTiaLogo().isDisplayed();
		   
		   sa.assertEquals(true, displayed);
		
	}

	@Given("User pass the InValid Username on Username Textbox as {string}")
	public void user_pass_the_in_valid_username_on_username_textbox_as(String username) {
		ls=new LoginScreenPOM();
		ls.getUsrnmeTextbox().sendKeys(username);
	}
	@Given("User pass the InValid password on password Textbox as {string}")
	public void user_pass_the_in_valid_password_on_password_textbox_as(String string) throws IOException, InterruptedException {
	    ls = new LoginScreenPOM();
	    ls.getPassTextBox().sendKeys(string);
	    takeScreenshot(screenshotpath, "Before_Loginwith_Invalidcredentials");
	    Thread.sleep(1000);
	}
	@When("User Clik the LoginButton unable to reach Dashboard and get Invalid Credential Entered message popup.")
	public void user_clik_the_login_button_unable_to_reach_dashboard_and_get_invalid_credential_entered_message_popup() throws InterruptedException, IOException {
		ls = new LoginScreenPOM();
		ls.getButtonLogin().click();
		boolean displayed = ls.getTiaLogo().isDisplayed();
		   sa.assertEquals(true, displayed);
		   takeScreenshot(screenshotpath, "After_Loginwith_Invalidcredentials");
		   Thread.sleep(3000);
		
	}
	@Given("User to pass the Valid Username on Username Textbox as {string}")
	public void user_to_pass_the_valid_username_on_username_textbox_as(String string) {
		ls=new LoginScreenPOM();
		ls.getUsrnmeTextbox().clear();
		ls.getUsrnmeTextbox().sendKeys(string);
	}
	@Given("User to pass the InValid password on password Textbox as {string}")
	public void user_to_pass_the_in_valid_password_on_password_textbox_as(String string) {
		ls = new LoginScreenPOM();
		ls.getPassTextBox().clear();
	    ls.getPassTextBox().sendKeys(string);
	}
	@When("User to Clik the LoginButton unable to reach Dashboard and get Invalid Credential Entered message popup.")
	public void user_to_clik_the_login_button_unable_to_reach_dashboard_and_get_invalid_credential_entered_message_popup() throws InterruptedException, IOException {
		ls = new LoginScreenPOM();
		ls.getButtonLogin().click();
		boolean displayed = ls.getTiaLogo().isDisplayed();
		   sa.assertEquals(true, displayed);
		   takeScreenshot(screenshotpath,"valid_Username_InValid_Password");
		   Thread.sleep(3000);
	}
	@Given("User to pass the InValid Username on Username Textbox as {string}")
	public void user_to_pass_the_in_valid_username_on_username_textbox_as(String string) {
		ls=new LoginScreenPOM();
		ls.getUsrnmeTextbox().clear();
		ls.getUsrnmeTextbox().sendKeys(string);
	}
	@Given("User to pass the Valid password on password Textbox as {string}")
	public void user_to_pass_the_valid_password_on_password_textbox_as(String string) {
		ls = new LoginScreenPOM();
		ls.getPassTextBox().clear();
	    ls.getPassTextBox().sendKeys(string);
	}
	@When("User able Clik the LoginButton unable to reach Dashboard and get Invalid Credential Entered message popup.")
	public void user_able_clik_the_login_button_unable_to_reach_dashboard_and_get_invalid_credential_entered_message_popup() throws InterruptedException, IOException {
		ls = new LoginScreenPOM();
		ls.getButtonLogin().click();
		boolean displayed = ls.getTiaLogo().isDisplayed();
		   sa.assertEquals(true, displayed);
		   takeScreenshot(screenshotpath,"Invalid_Username_Valid_Password");
		   Thread.sleep(3000);
		   
		  
	}
	

	
	@Given("User left Blank Username on Username Textbox as {string}")
	public void user_left_blank_username_on_username_textbox_as(String string) throws AWTException {
		ls=new LoginScreenPOM();
		textBoxClear(ls.getUsrnmeTextbox());
		
	}
	@Given("User left Blank password on password Textbox as {string}")
	public void user_left_blank_password_on_password_textbox_as(String string) throws AWTException {
		ls = new LoginScreenPOM();
		textBoxClear(ls.getPassTextBox());
	    
	}
	@When("User Clik the LoginButton unable to reach Dashboard and get This Field is Required message under the both Textbox.")
	public void user_clik_the_login_button_unable_to_reach_dashboard_and_get_this_field_is_required_message_under_the_both_textbox() throws InterruptedException, IOException {
		ls = new LoginScreenPOM();
		ls.getButtonLogin().click();
		boolean displayed = ls.getTiaLogo().isDisplayed();
		   sa.assertEquals(true, displayed);
		   boolean displayed2 = ls.getEmsg().isDisplayed();
		   sa.assertEquals(true, displayed2);
		   takeScreenshot(screenshotpath,"Blank_Username_Blank_Password"); 
		   Thread.sleep(3000);
	}

	@Given("User left the Blank Username on Username Textbox as {string}")
	public void user_left_the_blank_username_on_username_textbox_as(String string) throws AWTException {
		ls=new LoginScreenPOM();
		textBoxClear(ls.getUsrnmeTextbox());
		
	}
	@Given("User should to enter valid password on password Textbox as {string}")
	public void user_should_to_enter_valid_password_on_password_textbox_as(String string) throws AWTException {
		ls = new LoginScreenPOM();
		textBoxClear(ls.getPassTextBox());
	    ls.getPassTextBox().sendKeys(string);
	}
	@When("User Clik the LoginButton unable to reach Dashboard and get This Field is Required message under the username Textbox.")
	public void user_clik_the_login_button_unable_to_reach_dashboard_and_get_this_field_is_required_message_under_the_username_textbox() throws  InterruptedException, IOException {
		ls = new LoginScreenPOM();
		ls.getButtonLogin().click();
		boolean displayed = ls.getTiaLogo().isDisplayed();
		  sa.assertEquals(true, displayed);
		   Thread.sleep(3000);
		   driver.findElement(By.xpath("//i[1]")).click();
		   try {
			   WebElement emsg = driver.findElement(By.xpath("//span[contains(text(),'This field is required.')]"));
			   boolean displayed2 = emsg.isDisplayed();
			   sa.assertEquals(true, displayed2);
			
		} catch (Exception e) {
			sa.assertTrue(false, "This filed is required message is not shown");
		}
		   
	}
			   
	@Given("User to valid Username on Username Textbox as {string}")
	public void user_to_valid_username_on_username_textbox_as(String string) throws AWTException {
		ls=new LoginScreenPOM();
		textBoxClear(ls.getUsrnmeTextbox());
		ls.getUsrnmeTextbox().sendKeys(string);
		ls.getPassTextBox().clear();
	}
	@Given("User to pass the blank password on password Textbox as")
	public void user_to_pass_the_blank_password_on_password_textbox_as() throws AWTException {
		ls=new LoginScreenPOM();
		textBoxClear(ls.getPassTextBox());
	    
	}
	
	@When("Users Clik LoginButton unable to reach Dashboard and get This Field is Required message under the username Textbox.")
	public void users_clik_login_button_unable_to_reach_dashboard_and_get_this_field_is_required_message_under_the_username_textbox() throws AWTException, IOException, InterruptedException {
		ls = new LoginScreenPOM();
		textBoxClear(ls.getPassTextBox());
		ls.getButtonLogin().click();
		boolean displayed = ls.getTiaLogo().isDisplayed();
		   sa.assertEquals(true, displayed);
		   boolean displayed2 = ls.getEmsg().isDisplayed();
		   sa.assertEquals(true, displayed2);
		   takeScreenshot(screenshotpath,"Valid_UserName_Blank_Password");
		   Thread.sleep(3000);
	}
	//To Validate Functionality of Connect with Tia Link
	
		@Given("User able to click Connect with Tia link")
		public void user_able_to_click_connect_with_tia_link() throws InterruptedException {
		   
		   
		    ls=new LoginScreenPOM();
		    ls.getCntWtTia().click();
		    Thread.sleep(3000);
		}
		@When("User navigates to Connect with Tia screen.")
		public void user_navigates_to_connect_with_tia_screen() throws InterruptedException, IOException {
			ls=new LoginScreenPOM();
			boolean displayed = ls.getXlogo().isDisplayed();
			takeScreenshot(screenshotpath,"connectwithTia");
			sa.assertEquals(true, displayed);
			
			ls.getXlogo().click();
		
			Thread.sleep(3000);
			sa.assertAll();
		}

	//To Validate Functionality of Tantengia.com Link
	
	@Given("User able to click Tangentia link")
	public void user_able_to_click_tangentia_link() throws InterruptedException {
		ls=new LoginScreenPOM();
		ls.getTanLink().click();
		    Thread.sleep(7000);
	}
	@Given("User navigates to Tangentia Webpage")
	public void user_navigates_to_tangentia_webpage() throws InterruptedException, IOException {
		String title = driver.getTitle();
		takeScreenshot(screenshotpath,"Tangentia_Link");
		sa.assertEquals(title, "Digital Transformation Services | Autonomous Digital Enterprise | Top AI Company");
		sa.assertAll();
	

	}
	
	// LogOut#1 Scenario
	
	@Given("User open Tia Application on Chrome Browser.")
	public void user_open_tia_application_on_chrome_browser() throws InterruptedException {
		ls= new LoginScreenPOM();
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
	    
	}
	@When("User Login on Tia Application. {string} {string}.")
	public void user_login_on_tia_application(String Username, String Password) {
		ls= new LoginScreenPOM();
		fwait(ls.getButtonLogin());
	    ls.getUsrnmeTextbox().sendKeys(Username);
	    ls.getPassTextBox().sendKeys(Password);
	    ls.getButtonLogin().click();
	}
	@Then("User cliks signout button under profile on Tia Application.{string}")
	public void user_cliks_logout_button_under_profile_on_tia_application(String Client) throws InterruptedException, IOException {
	   
	   ls= new LoginScreenPOM();
	   fwait(ls.getDashboard());
	   ls.getProfile().click();
	   fwait(ls.getSignout());
	   takeScreenshot(screenshotpath,"profile"+Client);
	   Thread.sleep(1000);
	   String text = ls.getSignout().getText();
	   sa.assertEquals(text, "Sign-Out");
	   scenario.log("Expected: Log-Out Found: "+text);
	   ls.getSignout().click();
	   
	   
	}
	@Then("If User clicks Yes, should be LogOut and reach Login Screen.Else User clicks Cancel, stays on Dashborad. as {string} {string}")
	public void if_user_clicks_yes_should_be_log_out_and_reach_login_screen_else_user_clicks_cancel_stays_on_dashborad_as(String string,String Client) throws InterruptedException, IOException {
	   Thread.sleep(2000);
	   
	   if (string.contentEquals("Yes")) {
		ls= new LoginScreenPOM();
		takeScreenshot(screenshotpath,"logout");
		Thread.sleep(1000);
		ls.getSignoutyes().click();
		fwait(ls.getPassLabel());
		boolean displayed = ls.getPassLabel().isDisplayed();
		sa.assertEquals(displayed, true);
		takeScreenshot(screenshotpath,"If_clicks_yes_on_log-out"+Client);
		Thread.sleep(1000);
		sa.assertAll();
		
		
	} else {
		ls= new LoginScreenPOM();
		ls.getSignoutCancel().click();
		fwait(ls.getDashboard());
		boolean displayed = ls.getDashboard().isDisplayed();
		sa.assertEquals(displayed, true);
		takeScreenshot(screenshotpath,"If_cancel_yes_on_log-out"+Client);
		Thread.sleep(1000);
		sa.assertAll();
		
		

	}
	// LogOut#2 Scenario	
	  
	}
	 @Given("User open Tia Application on the Chrome Browser.")
	   public void user_open_tia_application_on_the_chrome_browser() {
		 ls= new LoginScreenPOM();
			launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
			toMaximize();
	   }
	 @When("User should Login on Tia Application {string} {string}.")
	 public void user_should_login_on_tia_application(String Username, String Password) {
		   ls= new LoginScreenPOM();
			fwait(ls.getButtonLogin());
		    ls.getUsrnmeTextbox().sendKeys(Username);
		    ls.getPassTextBox().sendKeys(Password);
		    ls.getButtonLogin().click();
	   }
	   @Then("User cliks Logout button under the Menu on Tia Application.{string}")
	   public void user_cliks_logout_button_under_the_menu_on_tia_application(String Client) throws IOException, InterruptedException {
		   ls= new LoginScreenPOM();
		   fwait(ls.getDashboard());
		   ls.getMenuBtn().click();
		   fwait(ls.getLogout());
		   takeScreenshot(screenshotpath,"profile");
		   Thread.sleep(1000);
		   String text = ls.getLogout().getText();
		   sa.assertEquals(text, "Logout");
		   scenario.log("Expected: Log-Out Found: "+text);
		   ls.getLogout().click();
	   }
	   @Then("If User clicks the Yes, should be LogOut and reach Login Screen.Else User clicks Cancel, stays on Dashborad. as {string} {string}")
	   public void if_user_clicks_the_yes_should_be_log_out_and_reach_login_screen_else_user_clicks_cancel_stays_on_dashborad_as(String string,String string2) throws IOException, InterruptedException {
		   Thread.sleep(2000);
		   
		   if (string.contentEquals("Yes")) {
			ls= new LoginScreenPOM();
			takeScreenshot(screenshotpath,"logout"+clientName);
			ls.getSignoutyes().click();
			fwait(ls.getPassLabel());;
			boolean displayed = ls.getPassLabel().isDisplayed();
			sa.assertEquals(displayed, true);
			takeScreenshot(screenshotpath,"If_clicks_yes_on_log-out"+clientName);
			Thread.sleep(1000);
			sa.assertAll();
			
			
		} else {
			ls= new LoginScreenPOM();
			ls.getSignoutCancel().click();
			fwait(ls.getDashboard());
			boolean displayed = ls.getDashboard().isDisplayed();
			sa.assertEquals(displayed, true);
			takeScreenshot(screenshotpath,"If_cancel_yes_on_log-out"+clientName);
			Thread.sleep(1000);
			sa.assertAll();
	   }
	
	   }
	   }
	

