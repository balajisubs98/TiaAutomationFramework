package major.pac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.DashboardPOM;
import pom.model.NotificationPOM;
import program.utility.BaseUtility;

public class NotificationSD extends BaseUtility {
	NotificationPOM np = new NotificationPOM();
	SoftAssert sa = new SoftAssert();
	String screenshotpath="C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\Notifications\\";

	private Scenario scenario;

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("Launch Tia application On google chrome Browser {string} {string} {string}")
	public void launch_tia_application_on_google_chrome_browser(String string, String Username, String Password)
			throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		
		np = new NotificationPOM();
		fwait(np.getButtonLoginn());
		np.getUsernmeTextbox().sendKeys(Username);
		np.getPasswTextBox().sendKeys(Password);
		np.getButtonLoginn().click();
		fwait(np.getDashboardLabel());
		boolean displayed = np.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true);

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
		Thread.sleep(2000);

	}

	@When("Validate the bell icon available on Dashboard.")
	public void validate_the_bell_icon_available_on_dashboard() {
		np = new NotificationPOM();
		boolean displayed = np.getIconNotification().isDisplayed();
		if (displayed = true) {
			scenario.log("Bell Icon available on Dashboard.");
		}
		sa.assertEquals(displayed, true);

	}

	@Then("Validate after click the bell icon, it navigates to the notification List Popup window.")
	public void validate_after_click_the_bell_icon_it_navigates_to_the_notification_list_popup_window()
			throws InterruptedException, IOException {
		np = new NotificationPOM();
		np.getIconNotification().click();
		Thread.sleep(2000);
		boolean displayed = np.getNotificalabel().isDisplayed();
		if (displayed = true) {
			scenario.log("After click the bell icon,notification List Popup window shown");
		}
		takeScreenshot(screenshotpath, "Notification_popup");
		sa.assertEquals(displayed, true);
	}

	@Then("Validate the notification List label available on the the notification List Popup window.")
	public void validate_the_notification_list_label_available_on_the_the_notification_list_popup_window() {
		np = new NotificationPOM();
		boolean displayed = np.getNotificalabel().isDisplayed();
		if (displayed = true) {
			scenario.log("Notification List label available on the the notification List Popup window");
		}
		sa.assertEquals(displayed, true);
	}

	@Then("Validate the Search box availability and functionality with valid and Invalid data, on the the notification List Popup window.")
	public void validate_the_search_box_availability_and_functionality_with_valid_and_invalid_data_on_the_the_notification_list_popup_window()
			throws AWTException, InterruptedException, IOException {
		np = new NotificationPOM();
		boolean displayed = np.getSearch().isDisplayed();
		if (displayed = true) {
			scenario.log("Search box is available on the notification List Popup window.");
		}
		sa.assertEquals(displayed, true);
		String ValidData = "Test";
		String InvalidData = "grammer";
		np.getSearchTextbox().sendKeys(ValidData);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "Notification_popup_search");
		boolean result = false;
		for (int i = 2; i <= 3; i++) {
			String webTable = webTable(1, i, np.getPopupTable(), true);
			boolean contains = webTable.contains(ValidData);
			if (contains == true) {
				result = true;
				break;
			}
		}
		if (result= true) {
			scenario.log("Search with Valid data, It shows proper search result");
		}
		sa.assertEquals(result, true);
		Thread.sleep(6000);
		boolean res = np.getNotigicDetailslabel().isDisplayed();
		takeScreenshot(screenshotpath, "Notification_Details_page");
		sa.assertEquals(res, true);
		driver.navigate().back();
		Thread.sleep(2000);
		np.getSearchTextbox().sendKeys(InvalidData);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		boolean displayed2 = np.getNodataAvail().isDisplayed();
		takeScreenshot(screenshotpath, "Notification_search_withInvalidData");
		if (displayed2= true) {
			scenario.log("Search with InValid data, It shows No Data Available");
		}
		sa.assertEquals(displayed2, true);
		np.getNotifipopClose().click();
		Thread.sleep(2000);
		np.getIconNotification().click();
		Thread.sleep(2000);
		np.getSearchTextbox().sendKeys("");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	}

	@Then("Validate the following table column are Message From Name, Status, Message to Name, Doc Type, Doc Date, Message these are available on the the notification List Popup window.")
	public void validate_the_following_table_column_are_message_from_name_status_message_to_name_doc_type_doc_date_message_these_are_available_on_the_the_notification_list_popup_window()
			throws InterruptedException {
		np = new NotificationPOM();
		Set<String> s = new HashSet<>();
		s.add("Doc Type");
		s.add("Doc Date");
		s.add("Message From Name");
		s.add("Message To Name");
		s.add("Status");
		s.add("Message");
		Thread.sleep(5000);
		boolean Result = false;
		for (int i = 0; i <= 5; i++) {
			String webTable = webtablehead(0, i, np.getPopupTable());
			boolean res = s.contains(webTable);
			if (res == true) {
				Result = true;
			} else {
				Result = false;
			}

		}
		if (Result= true) {
			scenario.log("Message From Name, Status, Message to Name, Doc Type, Doc Date, Message these are available on the notification List Popup window.");
		}
		sa.assertEquals(Result, true);
		Thread.sleep(3000);
	}

	@Then("Validate the sort functionality in the Doc Date Column.")
	public void validate_the_sort_functionality_in_the_doc_date_column() throws InterruptedException, IOException {
		np = new NotificationPOM();
		
		List<String> L1 = new LinkedList<>();
		Integer webtablerowcount = webtablerowcount(np.getPopupTable());
		for (int i = 1; i < webtablerowcount; i++) {
			String webTable = webTable(i, 1, np.getPopupTable(), false);
			L1.add(webTable);
			
		}
		np.getDocDateFilter().click();
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "Notification_sort");
	
		List<String> L2 = new LinkedList<>();
		for (int i = 1; i < webtablerowcount; i++) {
			String webTable = webTable(i, 1, np.getPopupTable(), false);
			L2.add(webTable);
			
		}

		boolean equals = L1.get(1).equals(L2.get(1));
		if (equals= false) {
			scenario.log("Sort Functionality working as expected");
		}
		sa.assertEquals(equals, false);
		np.getDocDateFilter().click();
		Thread.sleep(2000);
	}

	@Then("Validate the Maximum five Entries only present in the Notification List table.")
	public void validate_the_maximum_five_entries_only_present_in_the_notification_list_table() {
		np = new NotificationPOM();
		Integer webtablerowcount = webtablerowcount(np.getPopupTable());
		boolean equals = webtablerowcount.equals(5);
		if (equals= true) {
			scenario.log("Entries count shows as expected");
		}
		sa.assertEquals(equals, true);
	}

	@Then("Validate the page navigation buttons in the Notification List table.")
	public void validate_the_page_navigation_buttons_in_the_notification_list_table() throws InterruptedException, IOException {
		np = new NotificationPOM();
		np.getNextpageButton().click();
		
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "Notification_nextpage");
		np.getPrepageButton().click();
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "Notification_prepage");
		scenario.log("Page navigation buttons are working as expected");

	}

	@Then("Validate the Right headed arrow button in the Notification List popup Window.")
	public void validate_the_right_headed_arrow_button_in_the_notification_list_popup_window()
			throws InterruptedException {
		np = new NotificationPOM();
		List<WebElement> rightHeadedArrow = np.getRightHeadedArrow();
		rightHeadedArrow.get(0).click();
		Thread.sleep(2000);
		boolean displayed = np.getNotigicDetailslabel().isDisplayed();
		System.out.println(displayed);
		if (displayed= true) {
			scenario.log("Right headed arrow buttons are working as expected");
		}

		sa.assertEquals(displayed, true);
		sa.assertAll();
	}
	
	
	//@Notification_Menu_Screen
	@Given("Launch Tia application On the google chrome Browser {string} {string} {string}")
	public void launch_tia_application_on_the_google_chrome_browser(String string, String Username, String Password) throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		
		np = new NotificationPOM();
		fwait(np.getButtonLoginn());
		np.getUsernmeTextbox().sendKeys(Username);
		np.getPasswTextBox().sendKeys(Password);
		np.getButtonLoginn().click();
		fwait(np.getDashboardLabel());
		boolean displayed = np.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true);

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
		Thread.sleep(2000);

	}

	
	@When("Validate Notification Option Available under the Menu.")
	public void validate_notification_option_available_under_the_menu() throws IOException {
	    np = new NotificationPOM();
	    fwait(np.getMenuBtn());
	    np.getMenuBtn().click();
	    boolean displayed = np.getMenuNoti().isDisplayed();
	    takeScreenshot(screenshotpath, "Notification_option_under_menu");
	    sa.assertEquals(displayed, true);
	    
	    
	}
	@Then("Validate After clicks Notification option, it navigates to Notifiction list page.")
	public void validate_after_clicks_notification_option_it_navigates_to_notifiction_list_page() throws InterruptedException, IOException {
		 np = new NotificationPOM();
		 fwait(np.getMenuNoti());
		   np.getMenuNoti().click();
		   Thread.sleep(3000);
		   boolean displayed = np.getNotificationslabel().isDisplayed();
		   takeScreenshot(screenshotpath, "Notification_listpage");
		   sa.assertEquals(displayed, true);
		   sa.assertEquals(driver.getTitle(), "Notifications");
	}
	@Then("Validate Notification Label, MenuButton, Account name with Logo and Notification Bell Icon are available on the Notification Page.")
	public void validate_notification_label_menu_button_account_name_with_logo_and_notification_bell_icon_are_available_on_the_notification_page() throws InterruptedException {
		 np = new NotificationPOM();
		   boolean displayed2 = np.getMenuBtn().isDisplayed();
		   sa.assertEquals(displayed2, true);
		   boolean displayed = np.getNotificationslabel().isDisplayed();
		   sa.assertEquals(displayed, true);
		   boolean displayed3 = np.getAccount().isDisplayed();
		   sa.assertEquals(displayed3, true);
		   boolean displayed4 = np.getIconNotification().isDisplayed();
		   sa.assertEquals(displayed4, true);
		   
	}
	
	@Then("Validate From Date Filter and To Date Filter.")
	public void validate_from_date_filter_and_to_date_filter() throws InterruptedException, IOException, AWTException {
		np = new NotificationPOM();
		Thread.sleep(4000);
		np.getFromdatefilter().sendKeys("02-01-2024");
		np.getTodatefilter().sendKeys("02-01-2024");
		Thread.sleep(2000);
		String webTable = webTable(1, 2, np.getNotificTable(), false);
		takeScreenshot(screenshotpath, "Notification_Date_Filter");
		boolean equals = webTable.equals("02-01-2024");
		sa.assertEquals(equals, true);
		np.getNotireset().click();
		
		
	}
	@Then("Validate Status Filter.")
	public void validate_status_filter() throws IOException, AWTException, InterruptedException {
		np = new NotificationPOM();
		boolean displayed = np.getStatusfilter().isDisplayed();
		np.getStatusfilter().click();
		takeScreenshot(screenshotpath, "Before_status_filter");
		Thread.sleep(2000);
		Actions ac = new Actions(driver);
		ac.sendKeys(np.getStatusfiltersearch(), "03-01-2024");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		scenario.log("No Data available: Status Filter Results are Incorrect");
		sa.assertEquals(displayed, true);
		takeScreenshot(screenshotpath, "After_status_filter");
		sa.assertEquals(false, true);
	}
	@Then("Validate Receiver Filter.")
	public void validate_receiver_filter() {
		np = new NotificationPOM();
		boolean displayed = np.getReceiverfilter().isDisplayed();
		sa.assertEquals(displayed, true);
	    
	}
	@Then("Validate PartnerOrg Filter.")
	public void validate_partner_org_filter() {
		np = new NotificationPOM();
		boolean displayed = np.getReceiverfilter().isDisplayed();
		sa.assertEquals(displayed, true);
	}
	@Then("Validate Partner Filter.")
	public void validate_partner_filter() {
		np = new NotificationPOM();
		boolean displayed = np.getPartnerfilter().isDisplayed();
		sa.assertEquals(displayed, true);
	   
	}
	@Then("Validate Region Filter.")
	public void validate_region_filter() {
		np = new NotificationPOM();
		boolean displayed = np.getRegionFilter().isDisplayed();
		sa.assertEquals(displayed, true);
	}
	@Then("Validate ResetButton.")
	public void validate_reset_button() throws InterruptedException {
		np= new NotificationPOM();
		boolean displayed = np.getNotireset().isDisplayed();
		np.getNotireset().click();
		Thread.sleep(5000);
		sa.assertEquals(displayed, true);
	}
	@Then("Validate Serach Text Box.")
	public void validate_serach_text_box() throws InterruptedException, AWTException, IOException {
		np = new NotificationPOM();
		boolean displayed = np.getNotisearchBox().isDisplayed();
		if (displayed = true) {
			scenario.log("Search box is available on the notification List Popup window.");
		}
		sa.assertEquals(displayed, true);
		String ValidData = "Test";
		String InvalidData = "grammer";
		np.getNotisearchBox().sendKeys(ValidData);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		boolean result = false;
		for (int i = 2; i <= 3; i++) {
			String webTable = webTable(1, i, np.getNotificTable(), true);
			boolean contains = webTable.contains(ValidData);
			if (contains == true) {
				result = true;
				break;
			}
		}
		if (result= true) {
			scenario.log("Search with Valid data, It shows proper search result");
		}
		takeScreenshot(screenshotpath, "search_with_valid_data");
		scenario.log("Searching Results are not within the Filter assigned");
		sa.assertTrue(false, "Searching Results are not within the Filter assigned");
		sa.assertEquals(result, true);
		Thread.sleep(2000);
		boolean res = np.getNotigicDetailslabel().isDisplayed();
		sa.assertEquals(res, true);
		sa.assertEquals(driver.getTitle(), "Notification Details");
		
		driver.navigate().back();
		Thread.sleep(2000);
		np.getNotisearchBox().sendKeys(InvalidData);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(8000);
		boolean displayed2 = np.getNodataAvail().isDisplayed();
		if (displayed2= true) {
			scenario.log("Search with InValid data, It shows No Data Available");
		}
		takeScreenshot(screenshotpath, "search_with_Invalid_data");
		sa.assertEquals(displayed2, true);
		np.getNotisearchBox().sendKeys("");
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
	   sa.assertAll();
	}
	
	

}
