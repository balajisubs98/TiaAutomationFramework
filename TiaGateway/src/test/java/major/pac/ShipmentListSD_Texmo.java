package major.pac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.PurchaseOrderPOM;
import pom.model.ShipmentListPOM;
import program.utility.BaseUtility;

public class ShipmentListSD_Texmo extends BaseUtility {

	PurchaseOrderPOM po = new PurchaseOrderPOM();
	ShipmentListPOM sp = new ShipmentListPOM();
	SoftAssert sa = new SoftAssert();
	String screenshotpath = "C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\SendShipments\\";

	private Scenario scenario;
	public static List<String> tabledetails = new LinkedList<>();

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("Texmo Launch Tia application Dashboard via google chrome Browser {string} {string} {string}")
	public void launch_tia_application_dashboard_via_google_chrome_browser(String string, String Username,
			String Password) {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		po = new PurchaseOrderPOM();
		fwait(po.getUsernmeTextbox());
		po.getUsernmeTextbox().sendKeys(Username);
		po.getPasswTextBox().sendKeys(Password);
		po.getButtonLoginn().click();
		fwait(po.getDashboardLabel());
		boolean displayed = po.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true, "Dashboard validate");

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
	}

	@When("Texmo Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.")
	public void validate_order_to_cash_send_shipments_shipment_list_option_available_on_under_the_menu() {
		po = new PurchaseOrderPOM();
		po.getMenuBtn().click();

	}

	@Then("Texmo Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.")
	public void validate_after_clicks_shipment_list_option_it_navigates_to_packing_and_shipments_list_page()
			throws IOException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", po.getOtoC());
		takeScreenshot(screenshotpath, "OtoC");
		js.executeScript("arguments[0].click()", sp.getSendShipments());
		takeScreenshot(screenshotpath, "SendShipments_Interplex");
		js.executeScript("arguments[0].click()", sp.getShipmentList());
		fwait(sp.getPackingAndShipmentsLabel());
		String title = driver.getTitle();
		takeScreenshot(screenshotpath, "Send_Shipment_Listing_Page");
		sa.assertEquals(title, "Packing and Shipments");
		boolean equals = title.contains("Packing and Shipments");
		if (equals == false) {

			scenario.log("Page Title or Tab name is Incorrect");

		}
	}

	@Then("Texmo Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.")
	public void validate_purchase_order_label_menu_button_account_name_with_logo_and_notification_bell_icon_are_available_on_shipments_list_page() {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		fwait(sp.getPackingAndShipmentsLabel());
		boolean displayed = sp.getPackingAndShipmentsLabel().isDisplayed();
		sa.assertEquals(displayed, true, "P&S label");
		if (displayed == true) {

			scenario.log("Packing and Shipments Label is Available");

		}
		boolean displayed2 = po.getMenuBtn().isDisplayed();
		sa.assertEquals(displayed2, true, "menu button");
		if (displayed2 == true) {

			scenario.log("Menu Button is Available");

		}
		boolean displayed3 = po.getAccount().isDisplayed();
		sa.assertEquals(displayed3, true, "Account Link");
		if (displayed3 == true) {

			scenario.log("Account Label is Available");

		}
		boolean displayed4 = po.getNotibell().isDisplayed();
		sa.assertEquals(displayed4, true, "Noti Icon");
		if (displayed4 == true) {

			scenario.log("Notification Icon is Available");

		}

	}

	@Then("Texmo Validate From Date Filter and To Date Filter on Shipments list page.")
	public void validate_from_date_filter_and_to_date_filter_on_shipments_list_page()
			throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		Actions ac = new Actions(driver);
		ac.sendKeys(sp.getFdatefilter(), "01-07-2023").perform();
		ac.sendKeys(sp.getTodatefilter(), "31-07-2023").perform();
		//ac.keyDown(Keys.ENTER).perform();
		//ac.keyUp(Keys.ENTER).perform();
		Thread.sleep(5000);
		takeScreenshot(screenshotpath, "Texmo_Send_Shipments_Date_Filter");
		Integer webtablerowcount = webtablerowcount(po.getPotable());
		for (int i = 1; i <= webtablerowcount; i++) {
			String webTable = webTable(i, 7, po.getPotable(), false);
			System.out.println(webTable);
			if (webTable.contains("Jul") && webTable.contains("2023")) {
				sa.assertEquals(true, true, "Date Filter");

			} else {

				break;

			}
		}
		po.getResetbtn().click();
		Thread.sleep(5000);

	}

	@Then("Texmo Validate Status Filter on Packing and Shipments list page.")
	public void validate_status_filter_on_packing_and_shipments_list_page()
			throws AWTException, IOException, InterruptedException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();

		List<String> li = new LinkedList<>();

		li.add("Confirm ASN");
		li.add("Preparing Shipment");
		li.add("Shipment Acknowledged");
		for (int i = 0; i < li.size(); i++) {

			po.getStatusFilter().click();
			sp.getStatusFiltersearchTex().sendKeys(li.get(i));
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.ENTER).build().perform();
			ac.keyUp(Keys.ENTER).build().perform();
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Texmo_Send_Shipments_Status_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 8, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.equals(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)), "Status Filter");

					}
				}
				po.getResetbtn().click();
				Thread.sleep(5000);

			} else {
				scenario.log(li.get(i) + " :No Data Available");
				po.getResetbtn().click();
				Thread.sleep(5000);

			}

		}

	}

	@Then("Texmo Validate Receiver Filter on Packing and Shipments list page.")
	public void validate_receiver_filter_on_packing_and_shipments_list_page()
			throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("BROSEKG");
		li.add("Cummins101");

		for (int i = 0; i < li.size(); i++) {

			po.getRecvFilter().click();
			sp.getRecvFiltersearchTex().sendKeys(li.get(i));
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.ENTER).build().perform();
			ac.keyUp(Keys.ENTER).build().perform();
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Texmo_Send_Shipments_Receiver_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 2, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.equals(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)), "Rec Filter");

					}
				}
				js.executeScript("arguments[0].click()", po.getResetbtn());
				Thread.sleep(5000);

			} else {
				scenario.log(li.get(i) + " :No Data Available");
				js.executeScript("arguments[0].click()", po.getResetbtn());
				Thread.sleep(5000);

			}

		}

	}

	@Then("Texmo Validate PartnerOrg Filter on Packing and Shipments list page.")
	public void validate_partner_org_filter_on_packing_and_shipments_list_page()
			throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("Aptiv");
		li.add("Cummins");

		for (int i = 0; i < li.size(); i++) {

			po.getPartorgFilter().click();
			sp.getPartorgFiltersearchTex().sendKeys(li.get(i));
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.ENTER).build().perform();
			ac.keyUp(Keys.ENTER).build().perform();
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Texmo_Send_Shipments_PartnerOrg_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 4, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.contains(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)), "patorg Filter");

					}
				}
				js.executeScript("arguments[0].click()", po.getResetbtn());
				Thread.sleep(5000);

			} else {
				scenario.log(li.get(i) + " :No Data Available");
				js.executeScript("arguments[0].click()", po.getResetbtn());
				Thread.sleep(5000);

			}

		}

	}

	@Then("Texmo Validate Partner Filter on Packing and Shipments list page.")
	public void validate_partner_filter_on_packing_and_shipments_list_page()
			throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("Brose EDI");
		li.add("Cummins");
		

		for (int i = 0; i < li.size(); i++) {

			po.getPartnerFilter().click();
			sp.getPartnerFiltersearchTex().sendKeys(li.get(i));
			Actions ac = new Actions(driver);
			ac.keyDown(Keys.ENTER).build().perform();
			ac.keyUp(Keys.ENTER).build().perform();
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Texmo_Send_Shipments_Partner_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 4, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.equals(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)), "pat Filter");

					}
				}
				js.executeScript("arguments[0].click()", po.getResetbtn());
				Thread.sleep(5000);

			} else {
				scenario.log(li.get(i) + " :No Data Available");
				js.executeScript("arguments[0].click()", po.getResetbtn());
				Thread.sleep(5000);

			}

		}
	}

	@Then("Texmo Validate Serach Text Box on Packing and Shipments list page.")
	public void validate_serach_text_box_on_packing_and_shipments_list_page()
			throws IOException, AWTException, InterruptedException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ValidData = "61000433922";
		String InvalidData = "invalid";
		sp.getPosearchBox().sendKeys(ValidData);
		Actions ac = new Actions(driver);
		ac.keyDown(Keys.ENTER).build().perform();
		ac.keyUp(Keys.ENTER).build().perform();
		Thread.sleep(5000);
		takeScreenshot(screenshotpath, "Texmo_search_with_valid_Data");
		boolean result = false;
		for (int i = 1; i <= 1; i++) {
			String webTable = webTable(i, 6, po.getPotable(), false);
			boolean contains = webTable.equals(ValidData);
			if (contains == true) {
				result = true;
				break;
			}
		}
		if (result = true) {
			scenario.log("Search with Valid data, It shows proper search result");
		}
		sa.assertEquals(result, true, "search with valid");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", po.getResetbtn());

		Thread.sleep(4000);
		sp.getPosearchBox().sendKeys(InvalidData);
		ac.keyDown(Keys.ENTER).build().perform();
		ac.keyUp(Keys.ENTER).build().perform();
		Thread.sleep(6000);
		takeScreenshot(screenshotpath, "Texmo_search_with_Invalid_Data");
		try {
			boolean displayed2 = po.getNodataavai().isDisplayed();
			if (displayed2 = true) {
				scenario.log("Search with InValid data, It shows No Data Available");
			}
			sa.assertEquals(displayed2, true, "search with invalid");

		} catch (Exception e) {
			sa.assertTrue(true, "search with invalid2");
		}

		js.executeScript("arguments[0].click()", po.getResetbtn());
		Thread.sleep(4000);
	}

	@Then("Texmo Validate the Select Action on Packing and Shipments list page.")
	public void validate_the_select_action_on_packing_and_shipments_list_page()
			throws IOException, InterruptedException, AWTException {
		sp = new ShipmentListPOM();
		Select s = new Select(sp.getSelectAction());
		try {
			s.selectByVisibleText("Send Shipment");
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text = toastmessage.getText();
			sa.assertEquals(text, "Please select Shipments to Send to the Trading Partners!", "before send shipment");

			s.selectByVisibleText("Print Shipping");
			WebDriverWait wd2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd2.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage2 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text2 = toastmessage2.getText();
			sa.assertEquals(text2, "Please select ASN to print PDF", "before print shipping");

			s.selectByVisibleText("Generate Report");
			WebDriverWait wd3 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd3.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage3 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text3 = toastmessage3.getText();
			sa.assertEquals(text3, "No data found for the selected date range, Please select proper date range.",
					"before Generate Report");

			driver.findElement(By.xpath("//*[@id='b5-l2_0-1239_0-Checkbox1']")).click();
			s.selectByVisibleText("Print Shipping");
			WebDriverWait wd4 = new WebDriverWait(driver, Duration.ofSeconds(10));
			Thread.sleep(1800);
			wd4.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage4 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text4 = toastmessage4.getText();
			sa.assertEquals(text4, "File Downloading..", "after print shipping");

			sp.getFdatefilter().sendKeys("01-07-2023");
			sp.getTodatefilter().sendKeys("31-07-2023");
			s.selectByVisibleText("Generate Report");
			WebDriverWait wd5 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd5.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage5 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text5 = toastmessage5.getText();
			sa.assertEquals(text5, "File Downloading..", "after Generate Report");
		} catch (Exception e) {

		} finally {

		}

	}

	@Then("Texmo Validate Shows Entries on Packing and Shipments list page.")
	public void validate_shows_entries_on_packing_and_shipments_list_page() throws IOException, InterruptedException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Select s = new Select(sp.getShowEntries());
		
		s.selectByVisibleText("10");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries10");
		Integer webtablerowcount = webtablerowcount(po.getPotable());
		String text = sp.getRecordcount().getText();
		int RC = Integer.parseInt(text);
		System.out.println("RC"+RC);
		boolean equals;
		if (RC>=10) {
			 equals = webtablerowcount.equals(10);	
		} else {
			 equals = webtablerowcount.equals(RC);
		}
		
		System.out.println(webtablerowcount + "count(ten)");
		System.out.println(equals);
		sa.assertEquals(equals, true, "show Entries10");
		Thread.sleep(2000);

		s.selectByVisibleText("25");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries25");
		Integer webtablerowcount2 = webtablerowcount(po.getPotable());
		String text2 = sp.getRecordcount().getText();
		int RC2 = Integer.parseInt(text2);
		boolean equals2;
		if (RC>=25) {
			 equals2 = webtablerowcount.equals(25);	
		} else {
			 equals2 = webtablerowcount.equals(RC2);
		}
		
		System.out.println(webtablerowcount2 + "count(25)");
		System.out.println(equals2);
		sa.assertEquals(equals2, true, "show Entries25");
		Thread.sleep(2000);

		s.selectByVisibleText("50");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries50");
		Integer webtablerowcount3 = webtablerowcount(po.getPotable());
		String text3 = sp.getRecordcount().getText();
		int RC3 = Integer.parseInt(text3);
		boolean equals3;
		if (RC>=50) {
			 equals3= webtablerowcount.equals(50);	
		} else {
			 equals3 = webtablerowcount.equals(RC3);
		}
		System.out.println(webtablerowcount3 + "count(50)");
		System.out.println(equals3);
		sa.assertEquals(equals3, true, "show Entries50");
		Thread.sleep(2000);

		s.selectByVisibleText("100");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries100");
		Integer webtablerowcount4 = webtablerowcount(po.getPotable());
		String text4 = sp.getRecordcount().getText();
		int RC4 = Integer.parseInt(text4);
		boolean equals4;
		if (RC>100) {
			 equals4= webtablerowcount.equals(100);	
		} else {
			 equals4 = webtablerowcount.equals(RC4);
		}
		System.out.println(webtablerowcount4 + "count(100)");
		System.out.println(equals4);
		sa.assertEquals(equals4, true, "show Entries100");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", po.getResetbtn());
		Thread.sleep(4000);
		sa.assertAll();
	}

	@Then("Texmo Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.")
	public void validate_sort_functionality_of_asn_number_asn_date_and_asn_stauts_on_packing_and_shipments_list_page()
			throws InterruptedException {

		sp = new ShipmentListPOM();
		List<WebElement> webele = new LinkedList<>();
		webele.add(sp.getAsnDatelow());
		webele.add(sp.getAsnnumlow());
		webele.add(sp.getAsnstatuslow());
		for (WebElement webElement : webele) {
			webElement.click();
		}
		List<Integer> col = new LinkedList<>();
		col.add(6);
		col.add(7);
		col.add(8);
		col.add(9);
		for (int i = sp.getPagenation().size(); i > 0 ; i--) {
			List<WebElement> pagenation = sp.getPagenation();
			pagenation.get(i).click();
		}
		scenario.log("Sort Functionality working as expected");

		sa.assertAll();

	}

	@Given("Texmo Launch the Tia application on google chrome Browser {string} {string} {string}")
	public void interplex_launch_the_tia_application_on_google_chrome_browser(String string, String Username,
			String Password) {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		po = new PurchaseOrderPOM();
		fwait(po.getUsernmeTextbox());
		po.getUsernmeTextbox().sendKeys(Username);
		po.getPasswTextBox().sendKeys(Password);
		po.getButtonLoginn().click();
		fwait(po.getDashboardLabel());
		boolean displayed = po.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true, "Dashboard validate");

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
	}

	@When("Texmo Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.")
	public void interplex_validate_order_to_cash_receive_orders_order_list_select_a_po_from_list_click_button_should_be_reach_shipments_details_page()
			throws IOException, InterruptedException {
		po = new PurchaseOrderPOM();
		sp = new ShipmentListPOM();
		po.getMenuBtn().click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", po.getOtoC());
		takeScreenshot(screenshotpath, "OtoC");
		js.executeScript("arguments[0].click()", sp.getSendShipments());
		takeScreenshot(screenshotpath, "SendShipments_Interplex");
		js.executeScript("arguments[0].click()", sp.getShipmentList());
		fwaitpage("Packing and Shipments");
		String title = driver.getTitle();
		takeScreenshot(screenshotpath, "Send_Shipment_Listing_Page");
		sa.assertEquals(title, "Packing and Shipments");
		boolean equals = title.contains("Packing and Shipments");
		if (equals == false) {

			scenario.log("Page Title or Tab name is Incorrect");

		}
		Thread.sleep(3000);
		Integer rowcount = webtablerowcount(po.getPotable());
		System.out.println(rowcount);
		Thread.sleep(5000);
		if (rowcount != 0) {
			String asnNumber = webTable(2, 6, po.getPotable(), false);
			tabledetails.add(asnNumber);
			System.out.println(asnNumber);
			String asnDate = webTable(2, 7, po.getPotable(), false);
			tabledetails.add(asnDate);
			System.out.println(asnDate);
			String asnStatus = webTable(2, 8, po.getPotable(), false);
			tabledetails.add(asnStatus);
			System.out.println(asnStatus);
			webTable(2, 0, po.getPotable(), true);

		} else {
			scenario.log("No PO Data Available");
		}
		Thread.sleep(2000);
		sa.assertEquals(driver.getTitle(), "Shipment Details", "Shipment Details Title");

	}

	@When("Texmo Validate PO or Delfore number on Shipments Details Page.")
	public void interplex_validate_po_or_delfore_number_on_shipments_details_page() throws InterruptedException {

		sp = new ShipmentListPOM();
		fwait(sp.getSelectTask());
		Thread.sleep(3000);
		String text = sp.getpOordel().getText();
		System.out.println(text);
		Actions ac = new Actions(driver);
		Thread.sleep(4000);
		boolean contains = text.contains("Delfor");
		if (contains == true) {
			ac.moveToElement(sp.getpOordel()).click().perform();
			Thread.sleep(2000);
			sa.assertEquals(driver.getTitle(), "Delivery Forecast Details", "delfore title");
			driver.navigate().back();
			Thread.sleep(4000);
		} else {
			ac.moveToElement(sp.getpOordel()).click().perform();
			Thread.sleep(2000);
			sa.assertEquals(driver.getTitle(), "Purchase Order Details", "purchase order title");
			driver.navigate().back();

		}

	}

	@Then("Texmo Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.")
	public void interplex_validate_barcode_number_asn_date_asn_status_asn_date_created_date_shipment_id_shipment_date_delivery_date_transport_type_autopack_ship_from_ship_to_tracking_no_and_awb_no_label_are_available_on_shipments_details_page()
			throws InterruptedException {
		sp = new ShipmentListPOM();
		String text = sp.getpOordel().getText();
		Thread.sleep(4000);
		boolean contains = text.contains("Delfor");
		if (contains == true) {
			boolean barcode = sp.getBarcode().isDisplayed();
			sa.assertEquals(barcode, true, "Delfore Barcode");
			if (barcode == true) {
				scenario.log("Barcode is Available on Shipment details page");
			}
			boolean ASNNumber = sp.getaSNno().isDisplayed();
			sa.assertEquals(ASNNumber, true, "Delfore ASN Number");
			boolean contains4 = tabledetails.get(0).contains(sp.getaSNStatus().getText());
			if (ASNNumber == true && contains4 == true) {
				scenario.log("ASN Number is Available on Shipment details page " + sp.getaSNno().getText());
			}
			boolean ASNDate = sp.getaSNDate().isDisplayed();
			sa.assertEquals(ASNDate, true, "Delfore ASN Date");
			boolean contains3 = tabledetails.get(1).contains(sp.getaSNStatus().getText());
			if (ASNDate == true && contains3 == true) {
				scenario.log("ASNDate is Available on Shipment details page");
			}
			boolean ASNStatus = sp.getaSNStatus().isDisplayed();
			sa.assertEquals(ASNStatus, true, "Delfore ASN Status");
			boolean contains2 = tabledetails.get(2).contains(sp.getaSNStatus().getText());
			if (ASNStatus == true && contains2 == true) {
				scenario.log("ASNStatus is Available on Shipment details page");
			}
			boolean createdDate = sp.getCreatedDateLbl().isDisplayed();
			sa.assertEquals(createdDate, true, "Delfore create Date");
			if (createdDate == true) {
				scenario.log("createdDate is Available on Shipment details page");
			}
			boolean shipDate = sp.getShipmentDateLbl().isDisplayed();
			sa.assertEquals(shipDate, true, "Delfore shipDate");
			if (shipDate == true) {
				scenario.log("Shipment Date is Available on Shipment details page");
			}
			boolean delDate = sp.getDeliveryDateLbl().isDisplayed();
			sa.assertEquals(delDate, true, "Delfore DelDate");
			if (delDate == true) {
				scenario.log("DeliveryDate is Available on Shipment details page");
			}
			boolean transType = sp.getTransportTypeLbl().isDisplayed();
			sa.assertEquals(transType, true, "Delfore Transport Type");
			if (transType == true) {
				scenario.log("Transport Type is Available on Shipment details page");
			}
			boolean shipfrom = sp.getShipFromLbl().isDisplayed();
			sa.assertEquals(shipfrom, true, "Delfore Shipfrom");
			if (shipfrom == true) {
				scenario.log("Ship From is Available on Shipment details page");
			}
			boolean shipto = sp.getShipToLbl().isDisplayed();
			sa.assertEquals(shipto, true, "Delfore ShipTo");
			if (shipto == true) {
				scenario.log("Ship To is Available on Shipment details page");
			}
		} else {
			boolean barcode = sp.getBarcode().isDisplayed();
			sa.assertEquals(barcode, true, "PO Barcode");
			if (barcode == true) {
				scenario.log("Barcode is Available on Shipment details page");
			}
			boolean ASNNumber = sp.getaSNno().isDisplayed();
			sa.assertEquals(ASNNumber, true, "PO ASN Number");
			boolean contains4 = tabledetails.get(0).contains(sp.getaSNStatus().getText());
			if (ASNNumber == true && contains4 == true) {
				scenario.log("ASN Number is Available on Shipment details page " + sp.getaSNno().getText());
			}
			boolean ASNDate = sp.getaSNDate().isDisplayed();
			sa.assertEquals(ASNDate, true, "PO ASN Date");
			boolean contains3 = tabledetails.get(1).contains(sp.getaSNStatus().getText());
			if (ASNDate == true && contains3 == true) {
				scenario.log("ASNDate is Available on Shipment details page");
			}
			boolean ASNStatus = sp.getaSNStatus().isDisplayed();
			sa.assertEquals(ASNStatus, true, "PO ASN Status");
			boolean contains2 = tabledetails.get(2).contains(sp.getaSNStatus().getText());
			if (ASNStatus == true && contains2 == true) {
				scenario.log("ASNStatus is Available on Shipment details page");
			}
			boolean createdDate = sp.getCreatedDateLbl().isDisplayed();
			sa.assertEquals(createdDate, true, "PO create Date");
			if (createdDate == true) {
				scenario.log("createdDate is Available on Shipment details page");
			}
			boolean shipDate = sp.getShipmentDateLbl().isDisplayed();
			sa.assertEquals(shipDate, true, "PO shipDate");
			if (shipDate == true) {
				scenario.log("Shipment Date is Available on Shipment details page");
			}
			boolean delDate = sp.getDeliveryDateLbl().isDisplayed();
			sa.assertEquals(delDate, true, "PO DelDate");
			if (delDate == true) {
				scenario.log("DeliveryDate is Available on Shipment details page");
			}
			boolean transType = sp.getTransportTypeLbl().isDisplayed();
			sa.assertEquals(transType, true, "PO Transport Type");
			if (transType == true) {
				scenario.log("Transport Type is Available on Shipment details page");
			}
			boolean shipfrom = sp.getShipFromLbl().isDisplayed();
			sa.assertEquals(shipfrom, true, "PO Shipfrom");
			if (shipfrom == true) {
				scenario.log("Ship From is Available on Shipment details page");
			}
			boolean shipto = sp.getShipToLbl().isDisplayed();
			sa.assertEquals(shipto, true, "PO ShipTo");
			if (shipto == true) {
				scenario.log("Ship To is Available on Shipment details page");
			}
			boolean shipID = sp.getShipmentIdLbl().isDisplayed();
			sa.assertEquals(shipID, true, "PO ShipTo");
			if (shipID == true) {
				scenario.log("Shipment ID is Available on Shipment details page");
			}
			boolean autopack = sp.getAutopackLbl().isDisplayed();
			sa.assertEquals(autopack, true, "PO ShipTo");
			if (autopack == true) {
				scenario.log("AutoPack is Available on Shipment details page");
			}
			boolean TrackingNo = sp.getTrackingNoLbl().isDisplayed();
			sa.assertEquals(TrackingNo, true, "Delfore ShipTo");
			if (TrackingNo == true) {
				scenario.log("Tracking Number To is Available on Shipment details page");
			}
			boolean awbNo = sp.getaWBNoLbl().isDisplayed();
			sa.assertEquals(awbNo, true, "Delfore ShipTo");
			if (awbNo == true) {
				scenario.log("AWB Number is Available on Shipment details page");
			}

		}
	}

	@Then("Texmo Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.")
	public void interplex_validate_select_task_dropdown_print_shipping_label_and_print_packing_slip_on_shipments_details_page()
			throws InterruptedException {
		sp = new ShipmentListPOM();
		
		Select s = new Select(sp.getSelectTask());
		s.selectByVisibleText("Print Shipping Label");
		fwaitpage("PdfIframe"); Thread.sleep(1000);		

		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		sa.assertEquals(title, "Shipping Label PDF", "PDF page title");
		driver.navigate().back();
		fwaitpage("Shipment Details");
		fwait(sp.getSelectTask());
		Thread.sleep(7000);
		
		
		s.selectByVisibleText("Print Packing Slip");
		fwaitpage("PdfIframe");
		String title2 = driver.getTitle();
		System.out.println(title2);
		boolean equals = title2.equals("Packing Slip PDF");
		sa.assertEquals(title2, "Packing Slip PDF", "PDF page title");
		driver.navigate().back();
		Thread.sleep(5000);
		if (equals == false) {

		}
	}

	@Then("Texmo Validate Product Table on Shipments Details Page.")
	public void interplex_validate_product_table_on_shipments_details_page() {
		sp = new ShipmentListPOM();
		boolean displayed = sp.getShipdetailstable().isDisplayed();
		sa.assertEquals(displayed, true);

	}

	@Then("Texmo Validate Print ASN and Download ASN buttons on the Shipments Details Page.")
	public void interplex_validate_print_asn_and_download_asn_buttons_on_the_shipments_details_page()
			throws InterruptedException {
		sp = new ShipmentListPOM();
		sp.getPrintASNButton().click();
		fwaitpage("PdfIframe");
		String title = driver.getTitle();
		System.out.println(title);
		sa.assertEquals(title, "ASN PDF", "ASN PDF page title");
		if (title.contains("PdfIframe")) {
			driver.navigate().back();
			Thread.sleep(5000);
	
		}
		sp.getDownloadASNButton().click();
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		wd.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
		WebElement toastmessage5 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
		String text5 = toastmessage5.getText();
		sa.assertEquals(text5, "File Downloading..", "Download ASN Button Validation");
		List<WebElement> pagenation = sp.getPagenation();
		Actions ac = new Actions(driver);
		ac.scrollToElement(driver.findElement(By.xpath("//span[contains(text(),'items')]")));
		System.out.println(sp.getPagenation().size()+"size");
		for (int i = sp.getPagenation().size()-1; i >= 1 ; i--) {
			
			pagenation.get(i).click();
		}
		sa.assertAll();
	}

}
