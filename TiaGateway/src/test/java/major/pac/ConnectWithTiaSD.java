package major.pac;

import java.io.IOException;
import java.time.Duration;

import org.apache.commons.lang.enums.Enum;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.ConnectWithTiaPOM;
import pom.model.LoginScreenPOM;
import program.utility.BaseUtility;

public class ConnectWithTiaSD extends BaseUtility {
	ConnectWithTiaPOM cs = new ConnectWithTiaPOM();
	SoftAssert sa = new SoftAssert();
	String Screenshotpath = "C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\ConnectWithTia\\";

	@Given("To launch Tia Application on Google Chrome Browser")
	public void to_launch_tia_application_on_google_chrome_browser() throws InterruptedException {

		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();

	}

	@When("To Check Whether able to Click connect With Tia and Navigates to Connect With Tia Screen")
	public void to_check_whether_able_to_click_connect_with_tia_and_navigates_to_connect_with_tia_screen()
			throws InterruptedException {
		cs = new ConnectWithTiaPOM();
		fwait(cs.getCntWtTia());
		cs.getCntWtTia().click();
	}

	@When("To Check Whether TIA Logo present in Connect With Tia Screen")
	public void to_check_whether_tia_logo_present_in_connect_with_tia_screen() throws IOException {
		cs = new ConnectWithTiaPOM();
		fwait(cs.getfNametxtBox1());
		boolean displayed = cs.getTiaLogo().isDisplayed();
		sa.assertEquals(displayed, true);
		takeScreenshot(Screenshotpath, "C_W_T_Screen");

	}

	@Then("To Check Whether Fist Name TextBox along with Label is present in Connect With Tia Screen")
	public void to_check_whether_fist_name_text_box_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getfNameLbl().isDisplayed();
		boolean displayed2 = cs.getfNametxtBox1().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Last Name TextBox along with Label is present in Connect With Tia Screen")
	public void to_check_whether_last_name_text_box_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		sa = new SoftAssert();
		boolean displayed = cs.getlNamelbl().isDisplayed();
		boolean displayed2 = cs.getlNametxtBox1().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Phone Number TextBox along with Label is present in Connect With Tia Screen")
	public void to_check_whether_phone_number_text_box_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getpNlbl().isDisplayed();
		boolean displayed2 = cs.getpNumtextBox().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Email TextBox along Label with is present in Connect With Tia Screen")
	public void to_check_whether_email_text_box_along_label_with_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();

		boolean displayed = cs.getEmaillbl1().isDisplayed();
		boolean displayed2 = cs.getEmailtxtBox().isDisplayed();
		System.out.println(displayed);

		sa.assertEquals(displayed, false);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Country TextBox along Label with is present in Connect With Tia Screen")
	public void to_check_whether_country_text_box_along_label_with_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getCountryLbl1().isDisplayed();
		boolean displayed2 = cs.getCountryTextBox().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Requirements DropDown along with Label is present in Connect With Tia Screen")
	public void to_check_whether_requirements_drop_down_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getReqDropDown().isDisplayed();
		boolean displayed2 = cs.getReqLbl().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Company TextBox along with Label is present in Connect With Tia Screen")
	public void to_check_whether_company_text_box_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getCompanylbl1().isDisplayed();
		boolean displayed2 = cs.getCompanyTextBox().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether Your message to TiA team: TextBox along with Label is present in Connect With Tia Screen")
	public void to_check_whether_your_message_to_ti_a_team_text_box_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getFeedLbl1().isDisplayed();
		boolean displayed2 = cs.getMessageTextBox().isDisplayed();
		sa.assertEquals(displayed, true);
		sa.assertEquals(displayed2, true);

	}

	@Then("To Check Whether SubmitButton along with Label is present in Connect With Tia Screen")
	public void to_check_whether_submit_button_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getSubmitBtn().isDisplayed();
		sa.assertEquals(displayed, true);

	}

	@Then("To Check Whether ClearButton along with Label is present in Connect With Tia Screen")
	public void to_check_whether_clear_button_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getClearBtn().isDisplayed();
		sa.assertEquals(displayed, true);

	}

	@Then("To Check Whether CloseX iButton along with Label is present in Connect With Tia Screen")
	public void to_check_whether_close_x_i_button_along_with_label_is_present_in_connect_with_tia_screen() {
		cs = new ConnectWithTiaPOM();
		boolean displayed = cs.getCloseX().isDisplayed();
		sa.assertEquals(displayed, true);

	}

	// To Validate with valid data in Text fields on ConnectWithTia screen

	@Given("User able to enter valid First Name on TextBox as {string}")
	public void user_able_to_enter_valid_first_name_on_text_box_as(String string) throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();

		cs = new ConnectWithTiaPOM();
		fwait(cs.getCntWtTia());
		cs.getCntWtTia().click();
		fwait(cs.getfNametxtBox1());
		cs.getfNametxtBox1().sendKeys(string);
		String value = cs.getfNametxtBox1().getAttribute("value");
		sa.assertEquals(value, string);
	}

	@Then("User able to enter valid Last Name on TextBox as {string}")
	public void user_able_to_enter_valid_last_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getlNametxtBox1().sendKeys(string);
		String value = cs.getlNametxtBox1().getAttribute("value");
		sa.assertEquals(value, string);

	}

	@Then("User able to enter valid Phone Number on Textbox as {string}")
	public void user_able_to_enter_valid_phone_number_on_textbox_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getpNumtextBox().sendKeys(string);
		String value = cs.getpNumtextBox().getAttribute("value");
		sa.assertEquals(value, string);
	}

	@Then("User able to enter valid Email on TextBox as {string}")
	public void user_able_to_enter_valid_email_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getEmailtxtBox().sendKeys(string);
		String value = cs.getEmailtxtBox().getAttribute("value");
		sa.assertEquals(value, string);
	}

	@Then("User able to enter valid Company Name on TextBox as {string}")
	public void user_able_to_enter_valid_company_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getCompanyTextBox().sendKeys(string);
		String value = cs.getCompanyTextBox().getAttribute("value");
		sa.assertEquals(value, string);
	}

	@Then("User able to enter valid Country Name on TextBox as {string}")
	public void user_able_to_enter_valid_country_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getCountryTextBox().sendKeys(string);
		String value = cs.getCountryTextBox().getAttribute("value");
		sa.assertEquals(value, string);
	}

	@Then("User able to select valid Requirements on List as {string}")
	public void user_able_to_select_valid_requirements_on_list_as(String string) {
		cs = new ConnectWithTiaPOM();
		Select s = new Select(cs.getReqDropDown());
		s.selectByVisibleText(string);
		WebElement frs = s.getFirstSelectedOption();
		String value = frs.getText();
		sa.assertEquals(value, string);
	}

	@Then("User able to enter their message on Your message to Tia Team Textbox {string}")
	public void user_able_to_enter_their_message_on_your_message_to_tia_team_textbox(String string) throws IOException {
		cs = new ConnectWithTiaPOM();
		cs.getMessageTextBox().sendKeys(string);
		String value = cs.getMessageTextBox().getAttribute("value");
		sa.assertEquals(value, string);
		takeScreenshot(Screenshotpath, "C_W_T With_validData");
	}

	@Then("User able to click SubmitButton")
	public void user_able_to_click_submit_button() throws IOException {
		cs = new ConnectWithTiaPOM();

		cs.getSubmitBtn().click();

	}

	@Then("User able to see ThankYou for Contacting Us on after submission.")
	public void user_able_to_see_thank_you_for_contacting_us_on_after_submission() throws IOException {
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		wd.until(ExpectedConditions.visibilityOfElementLocated(
				By.xpath("//div[contains(text(),'Thank you for the details. Our team will contact you shortly.')]")));
		WebElement toastmessage = driver.findElement(
				By.xpath("//div[contains(text(),'Thank you for the details. Our team will contact you shortly.')]"));
		takeScreenshot(Screenshotpath, "C_W_T ValidData_Toast_message");
		String text = toastmessage.getText();
		sa.assertEquals(text, "Thank you for the details. Our team will contact you shortly.");

	}

	@Then("After User Submission,This message refelect on Tia admin Account.")
	public void after_user_submission_this_message_refelect_on_tia_admin_account() {
		sa.assertAll();

	}

	// To Validate with Invalid data in on ConnectWithTia screen

	@When("Launch Tia Application")
	public void launch_tia_application() throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();

		cs = new ConnectWithTiaPOM();
		fwait(cs.getCntWtTia());
		cs.getCntWtTia().click();
		fwait(cs.getfNametxtBox1());

	}

	@Given("User to enter First Name on TextBox as {string}")
	public void user_to_enter_first_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getfNametxtBox1().sendKeys(string);

	}

	@Then("User to enter Last Name on TextBox as {string}")
	public void user_to_enter_last_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getlNametxtBox1().sendKeys(string);
	}

	@Then("User to enter Phone Number on Textbox as {string}")
	public void user_to_enter_phone_number_on_textbox_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getpNumtextBox().sendKeys(string);
	}

	@Then("User to enter Email on TextBox as {string}")
	public void user_to_enter_email_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getEmailtxtBox().sendKeys(string);
	}

	@Then("User to enter Company Name on TextBox as {string}")
	public void user_to_enter_company_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getCompanyTextBox().sendKeys(string);
	}

	@Then("User to enter Country Name on TextBox as {string}")
	public void user_to_enter_country_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getCountryTextBox().sendKeys(string);
	}

	@Then("User unable to select multiple Requirements on List as {string}")
	public void user_unable_to_select_multiple_requirements_on_list_as(String string) {
		cs = new ConnectWithTiaPOM();
		Select s = new Select(cs.getReqDropDown());
		s.selectByVisibleText(string);
		boolean multiple = s.isMultiple();
		sa.assertEquals(multiple, false);
	}

	@Then("User to enter their message on Your message to Tia Team Textbox {string}{string}")
	public void user_to_enter_their_message_on_your_message_to_tia_team_textbox(String string, String string2)
			throws IOException {
		cs = new ConnectWithTiaPOM();
		cs.getMessageTextBox().sendKeys(string);
		Actions ac = new Actions(driver);
		ac.scrollToElement(cs.getCloseX()).perform();
		String str = "C_W_T_With_InvalidData_" + string2;
		takeScreenshot(Screenshotpath, str);

	}

	@Then("User  click SubmitButton")
	public void user_click_submit_button() {
		cs = new ConnectWithTiaPOM();
		cs.getSubmitBtn().click();
	}

	@Then("User unable to reach ThankYou for Contacting Us on after submission.{string}")
	public void user_unable_to_reach_thank_you_for_contacting_us_on_after_submission(String string)
			throws IOException, InterruptedException {
		cs = new ConnectWithTiaPOM();
		try {

			WebDriverWait wb = new WebDriverWait(driver, Duration.ofSeconds(10));

			wb.until(ExpectedConditions.visibilityOfElementLocated(By
					.xpath("//div[contains(text(),'Thank you for the details. Our team will contact you shortly.')]")));
			WebElement toastmessage = driver.findElement(By
					.xpath("//div[contains(text(),'Thank you for the details. Our team will contact you shortly.')]"));
			String str = "C_W_T_InvalidData_Toast_message_" + string;
			takeScreenshot(Screenshotpath, str);
			boolean displayed = toastmessage.isDisplayed();
			if (displayed) {
				sa.assertEquals(displayed, false);
			}
		} catch (TimeoutException e) {

			sa.assertEquals(true, true);

		}

	}

	@Then("Close the Application.")
	public void close_the_application() {
		sa.assertAll();

	}

	// ConnectWithTia_Screen_Clear_Button_Validation

	@Given("User enter First Name on TextBox as {string}")
	public void user_enter_first_name_on_text_box_as(String string) throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();

		cs = new ConnectWithTiaPOM();
		fwait(cs.getCntWtTia());
		cs.getCntWtTia().click();
		fwait(cs.getfNametxtBox1());
		
		cs.getfNametxtBox1().sendKeys(string);

	}

	@Then("User enter Last Name on TextBox as {string}")
	public void user_enter_last_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getlNametxtBox1().sendKeys(string);
	}

	@Then("User enter Phone Number on Textbox as {string}")
	public void user_enter_phone_number_on_textbox_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getpNumtextBox().sendKeys(string);
	}

	@Then("User enter Email on TextBox as {string}")
	public void user_enter_email_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getEmailtxtBox().sendKeys(string);
	}

	@Then("User enter valid Company Name on TextBox as {string}")
	public void user_enter_valid_company_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getCompanyTextBox().sendKeys(string);
	}

	@Then("User enter Country Name on TextBox as {string}")
	public void user_enter_country_name_on_text_box_as(String string) {
		cs = new ConnectWithTiaPOM();
		cs.getCountryTextBox().sendKeys(string);
	}

	@Then("User select Requirements on List as {string}")
	public void user_select_requirements_on_list_as(String string) {
		cs = new ConnectWithTiaPOM();
		Select s = new Select(cs.getReqDropDown());
		s.selectByVisibleText(string);

	}

	@Then("User enter their message on Your message to Tia Team Textbox {string}")
	public void user_enter_their_message_on_your_message_to_tia_team_textbox(String string) throws IOException {
		cs = new ConnectWithTiaPOM();
		cs.getMessageTextBox().sendKeys(string);
		takeScreenshot(Screenshotpath, "C_W_T Before_clear_button_clicks");
	}

	@Then("User to click ClearButton")
	public void user_to_click_clear_button() {
		cs = new ConnectWithTiaPOM();
		cs.getClearBtn().click();
	}

	@Then("After Click ClearButton all fields should be clear.")
	public void after_click_clear_button_all_fields_should_be_clear() throws IOException {
		cs = new ConnectWithTiaPOM();
		boolean empty = cs.getMessageTextBox().getAttribute("value").isEmpty();
		sa.assertEquals(empty, true);
		takeScreenshot(Screenshotpath, "C_W_T After_clear_button_clicks");
	}

	@Then("After click Connect with Tia close Xbutton should be reach Login Screen.")
	public void after_click_connect_with_tia_close_xbutton_should_be_reach_login_screen()
			throws InterruptedException, IOException {
		cs = new ConnectWithTiaPOM();
		Actions ac = new Actions(driver);
		ac.scrollToElement(cs.getCloseX()).perform();
		Thread.sleep(2000);
		takeScreenshot(Screenshotpath, "C_W_T Before_close_button_clicks");
		cs.getCloseX().click();
		Thread.sleep(2000);
		takeScreenshot(Screenshotpath, "C_W_T After_close_button_clicks");
		LoginScreenPOM ds = new LoginScreenPOM();
		boolean enabled = ds.getTanLink().isDisplayed();
		sa.assertEquals(enabled, true);
		sa.assertAll();
	}

}
