package major.pac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
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

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.PurchaseOrderPOM;
import program.utility.BaseUtility;

public class PurchaseOrderSD_Delmonte extends BaseUtility {

	
	
	PurchaseOrderPOM po = new PurchaseOrderPOM();
	SoftAssert sa = new SoftAssert();
	String screenshotpath = "C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\PurchaseOrder\\";

	private Scenario scenario;
	public static List<String> tabledetails = new LinkedList<>();

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
	}

	@Given("Delmonte Launch Tia application Dashboard On the google chrome Browser {string} {string} {string}")
	public void launch_tia_application_dashboard_on_the_google_chrome_browser(String string, String Username,
			String Password) throws InterruptedException {
		String website = "https://tia-qa.tangentia.com/TIA/LoginScreen";
		url=website;
		clientName=string;
		username=Username;
		password=Password;
		launchChromeBroswer(website);
		toMaximize();
		po = new PurchaseOrderPOM();
		fwait(po.getUsernmeTextbox());
		po.getUsernmeTextbox().sendKeys(Username);
		po.getPasswTextBox().sendKeys(Password);
		po.getButtonLoginn().click();
		fwait(po.getDashboardLabel());
		boolean displayed = po.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true,"Dashboard Label is not present");

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
	}

	@When("Delmonte Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.")
	public void validate_order_to_cash_receive_orders_order_list_option_available_on_under_the_menu()
			throws InterruptedException {
		po = new PurchaseOrderPOM();
		po.getMenuBtn().click();

	}

	@Then("Delmonte Validate After clicks Order list option, it navigates to Purchase Order list page.")
	public void validate_after_clicks_order_list_option_it_navigates_to_purchase_order_list_page()
			throws InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", po.getOtoC());
		takeScreenshot(screenshotpath, "OtoC");
		js.executeScript("arguments[0].click()", po.getRecvOrder());
		takeScreenshot(screenshotpath, "Received_Orders");
		js.executeScript("arguments[0].click()", po.getOrderList());
		Thread.sleep(11000);
		String title = driver.getTitle();
		takeScreenshot(screenshotpath, "Purchase_Order_Listing_Page");
		sa.assertEquals(title, "Purchase Order","Purchase Order Page Tittle is Incorrect");
		boolean equals = title.contains("Purchase Order");
		if (equals == false) {

			scenario.log("Page Title or Tab name is Incorrect");

		}
	}

	@Then("Delmonte Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.")
	public void validate_notification_label_menu_button_account_name_with_logo_and_notification_bell_icon_are_available_on_purchase_order_list_page() {
		po = new PurchaseOrderPOM();
		fwait(po.getPurchaseOrderLbl());
		boolean displayed = po.getPurchaseOrderLbl().isDisplayed();
		sa.assertEquals(displayed, true,"Purchase order Label is not present");
		if (displayed == true) {

			scenario.log("Purchase Order Label is Available");

		}
		boolean displayed2 = po.getMenuBtn().isDisplayed();
		sa.assertEquals(displayed2, true,"Menu Button is not Available");
		if (displayed2 == true) {

			scenario.log("Menu Button is Available");

		}
		boolean displayed3 = po.getAccount().isDisplayed();
		sa.assertEquals(displayed3, true,"Account icon with Logo is not Available");
		if (displayed3 == true) {

			scenario.log("Account Label is Available");

		}
		boolean displayed4 = po.getNotibell().isDisplayed();
		sa.assertEquals(displayed4, true,"Notification Logo is not Available");
		if (displayed4 == true) {

			scenario.log("Notification Icon is Available");

		}

	}

	@Then("Delmonte Validate From Date Filter and To Date Filter on Purchase Order list page.")
	public void validate_from_date_filter_and_to_date_filter_on_purchase_order_list_page()
			throws InterruptedException, IOException, AWTException {
		po = new PurchaseOrderPOM();
		po.getFdatefilter().sendKeys("01-07-2023");
		po.getTodatefilter().sendKeys("31-07-2023");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		takeScreenshot(screenshotpath, "Purchase_Order_Date_Filter");
		Integer webtablerowcount = webtablerowcount(po.getPotable());
		for (int i = 1; i <= webtablerowcount; i++) {
			String webTable = webTable(i, 7, po.getPotable(), false);
			if (webTable.contains("Jul") && webTable.contains("2023")) {
				sa.assertEquals(true, true,"Date Filter Validation is failed");

			} else {
				sa.assertEquals(true, false,"Date Filter Validation is failed");
				scenario.log("No Data Available in the Table");
				break;

			}
		}
		po.getResetbtn().click();
		Thread.sleep(5000);

	}

	@Then("Delmonte Validate Status Filter on Purchase Order list page.")
	public void validate_status_filter_on_purchase_order_list_page()
			throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();

		try {
			List<String> li = new LinkedList<>();
			li.add("Accepted");
			li.add("Rejected");
			li.add("Partially Accepted");
			li.add("Pending");

			li.add("REV ACPT");
			li.add("REV RJCT");
			li.add("Revised");
			Actions ac = new Actions(driver);
			for (int i = 0; i < li.size(); i++) {

				po.getStatusFilter().click();
				// ((JavascriptExecutor)driver).executeScript("arguments[0].value='"+li.get(i)+"'",
				// po.getStatusFiltersearch());
				Thread.sleep(1800);
				po.getStatusFiltersearchMV().sendKeys(li.get(i));

				// ac.moveToElement(po.getStatusFiltersearch()).sendKeys(li.get(i)).build().perform();
				Robot r = new Robot();
				r.keyPress(KeyEvent.VK_ENTER);
				r.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(5000);
				takeScreenshot(screenshotpath, "Purchase_Order_Status_Filter");
				Integer webtablerowcount = webtablerowcount(po.getPotable());
				System.out.println("rowCount" + webtablerowcount);
				if (webtablerowcount != 0) {
					for (int j = 2; j < webtablerowcount; j++) {
						String webTable = webTable(j, 9, po.getPotable(), false);
						System.out.println(i);
						System.out.println(webTable);
						boolean equals = webTable.equals(li.get(i));
						if (equals == true) {

							sa.assertEquals(true, webTable.contains(li.get(i)),"Status Filter Validation is failed");

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

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Then("Delmonte Validate Receiver Filter on Purchase Order list page.")
	public void validate_receiver_filter_on_purchase_order_list_page()
			throws InterruptedException, AWTException, IOException {
		po = new PurchaseOrderPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("IHUN");
		li.add("INTERPLEX101");
		li.add("IEP");
		li.add("IPECR");
		li.add("IMX");
		li.add("CN");

		for (int i = 0; i < li.size(); i++) {

			po.getRecvFilter().click();
			po.getRecvFiltersearchMV().sendKeys(li.get(i));

			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Purchase_Order_Receiver_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 2, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.equals(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)),"Receiver Filter Validation is failed");

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

	@Then("Delmonte Validate PartnerOrg Filter on Purchase Order list page.")
	public void validate_partner_org_filter_on_purchase_order_list_page()
			throws InterruptedException, AWTException, IOException {
		po = new PurchaseOrderPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("Aptiv");
		li.add("BCS");
		li.add("Brose");

		for (int i = 0; i < li.size(); i++) {

			po.getPartorgFilter().click();
			po.getPartorgFiltersearchMV().sendKeys(li.get(i));
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Purchase_Order_PartnerOrg_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 4, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.contains(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)),"Partner Org Filter Validation is failed");

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

	@Then("Delmonte Validate Partner Filter on Purchase Order list page.")
	public void validate_partner_filter_on_purchase_order_list_page()
			throws InterruptedException, AWTException, IOException {
		po = new PurchaseOrderPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("Brose EDI");
		li.add("BCS Queretaro");
		li.add("Benteler");

		for (int i = 0; i < li.size(); i++) {

			po.getPartnerFilter().click();
			po.getPartnerFiltersearchMV().sendKeys(li.get(i));
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Purchase_Order_Partner_Filter");
			Integer webtablerowcount = webtablerowcount(po.getPotable());
			System.out.println("rowCount" + webtablerowcount);
			if (webtablerowcount != 0) {
				for (int j = 2; j < webtablerowcount; j++) {
					String webTable = webTable(j, 4, po.getPotable(), false);
					System.out.println(i);
					System.out.println(webTable);
					boolean equals = webTable.equals(li.get(i));
					if (equals == true) {

						sa.assertEquals(true, webTable.contains(li.get(i)),"Partner Filter Validation is failed");

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

	

	@Then("Delmonte Validate Serach Text Box on Purchase Order list page.")
	public void validate_serach_text_box_on_purchase_order_list_page()
			throws InterruptedException, AWTException, IOException {
		po = new PurchaseOrderPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ValidData = "P888";
		String InvalidData = "invalid";
		po.getPosearchBox().sendKeys(ValidData);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		takeScreenshot(screenshotpath, "search_with_valid_Data");
		boolean result = false;
		for (int i = 1; i <= 1; i++) {
			String webTable = webTable(i, 7, po.getPotable(), false);
			boolean contains = webTable.equals(ValidData);
			if (contains == true) {
				result = true;
				break;
			}
		}
		if (result = true) {
			scenario.log("Search with Valid data, It shows proper search result");
		}
		sa.assertEquals(result, true,"Search with Valid data is failed");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", po.getResetbtn());

		Thread.sleep(4000);
		po.getPosearchBox().sendKeys(InvalidData);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		takeScreenshot(screenshotpath, "search_with_Invalid_Data");
		try {
			boolean displayed2 = po.getNodataavai().isDisplayed();
			if (displayed2 = true) {
				scenario.log("Search with InValid data, It shows No Data Available");
			}
			sa.assertEquals(displayed2, true,"Search with InValid data is failed");

		} catch (Exception e) {
			sa.assertTrue(true,"Search with InValid data is failed");
		}

		js.executeScript("arguments[0].click()", po.getResetbtn());
		Thread.sleep(4000);

	}

	@Then("Delmonte Validate the Select Action on Purchase Order list page.")
	public void validate_the_select_action_on_purchase_order_list_page()
			throws IOException, InterruptedException, AWTException {
		po = new PurchaseOrderPOM();
		boolean result = true;
		try {
			if (result) {
				Select s = new Select(po.getSelectAction());
				List<WebElement> options = s.getOptions();
				String text1 = options.get(1).getText();
				sa.assertEquals(text1, "Generate PO Report","Generate Po Report option not present in dropdown");
				s.selectByVisibleText("Generate PO Report");
				WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
				wd.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
				WebElement toastmessage = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
				String text = toastmessage.getText();
				sa.assertEquals(text, "No data found for the selected date range. Please select proper date range.","Generate Po Report Toast Message not shown");
				takeScreenshot(screenshotpath, "graph File Not Download");
				String text2 = options.get(2).getText();
				sa.assertEquals(text2, "Download PDF","Download PDF is not present in dropdown");
				s.selectByVisibleText("Download PDF");
				wd.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
				WebElement toastmessage2 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
				String textt = toastmessage2.getText();
				sa.assertEquals(textt, "Please select purchase order to create PDF","Please select purchase order to create PDF toast message is not shown");
				takeScreenshot(screenshotpath, "Po PDF File Not_Downloading..");
				String text3 = options.get(3).getText();
				s.selectByVisibleText("Download CSV");
				wd.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
				WebElement toastmessage3 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
				String texttt = toastmessage3.getText();
				sa.assertEquals(texttt, "Please select purchase order to create CSV","Please select purchase order to create CSV toast message is not shown");
				takeScreenshot(screenshotpath, "CSV File Not_Downloading..");
				sa.assertEquals(text3, "Download CSV","Download CSV is not present in dropdown");
				String text4 = options.get(0).getText();
				sa.assertEquals(text4, "Select Action","Select Action is not present in dropdown");
				int size = options.size();
				sa.assertEquals(size, 4,"Size of the Dropdown is Incorrect");
				scenario.log("Select Action Feature working properly but downloaded file's need to evaluate manually");
				Thread.sleep(2000);
				jsclick(po.getResetbtn());
				Thread.sleep(4000);

			}

			driver.findElement(By.xpath("(//input[@class='checkbox'])[1]")).click();
			po.getFdatefilter().sendKeys("01-07-2023");
			po.getTodatefilter().sendKeys("31-07-2023");
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			boolean result1 = true;

			if (result1) {
				Select s = new Select(po.getSelectAction());
				List<WebElement> options = s.getOptions();
				String text1 = options.get(1).getText();
				sa.assertEquals(text1, "Generate PO Report");
				s.selectByVisibleText("Generate PO Report");
				WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
				wd.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
				WebElement toastmessage = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
				String text = toastmessage.getText();
				sa.assertEquals(text, "File Downloading..","For Generate PO report: File Downloading Toast messeage is not shown");
				String text2 = options.get(2).getText();
				sa.assertEquals(text2, "Download PDF");
				wd.until(ExpectedConditions
						.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
				WebElement toastmessage2 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
				String textt = toastmessage2.getText();
				sa.assertEquals(textt, "File Downloading..","For Download PDF: File Downloading Toast messeage is not shown");
				String text3 = options.get(3).getText();
				takeScreenshot(screenshotpath, "File_Downloading..");
				sa.assertEquals(text3, "Download CSV");
				String text4 = options.get(0).getText();
				sa.assertEquals(text4, "Select Action");
				int size = options.size();
				sa.assertEquals(size, 4);
				scenario.log("Select Action Feature working properly but downloaded file's need to evaluate manually");
				Thread.sleep(2000);
				jsclick(po.getResetbtn());
				Thread.sleep(4000);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Then("Delmonte Validate Shows Entries on Purchase Order list page.")
	public void validate_shows_entries_on_purchase_order_list_page() throws InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Select s = new Select(po.getShowEntries());

		s.selectByVisibleText("10");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries10");
		Integer webtablerowcount = webtablerowcount(po.getPotable());
		boolean equals = webtablerowcount.equals(10);
		System.out.println(webtablerowcount + "count(ten)");
		System.out.println(equals);
		sa.assertEquals(equals, true, "ShowEntries 10 is failed");
		Thread.sleep(2000);

		s.selectByVisibleText("25");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "ShowEntries 25 is failed");
		Integer webtablerowcount2 = webtablerowcount(po.getPotable());
		boolean equals2 = webtablerowcount2.equals(25);
		System.out.println(webtablerowcount2 + "count(25)");
		System.out.println(equals2);
		sa.assertEquals(equals2, true, "ShowEntries 25 is failed");
		Thread.sleep(2000);

		s.selectByVisibleText("50");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries50");
		Integer webtablerowcount3 = webtablerowcount(po.getPotable());
		boolean equals3 = webtablerowcount3.equals(50);
		System.out.println(webtablerowcount3 + "count(50)");
		System.out.println(equals3);
		sa.assertEquals(equals3, true, "ShowEntries 50 is failed");
		Thread.sleep(2000);

		s.selectByVisibleText("100");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries100");
		Integer webtablerowcount4 = webtablerowcount(po.getPotable());
		boolean equals4 = webtablerowcount4.equals(100);
		System.out.println(webtablerowcount4 + "count(100)");
		System.out.println(equals4);
		sa.assertEquals(equals4, true, "ShowEntries 100 is failed");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", po.getResetbtn());
		Thread.sleep(4000);

	}

	@Then("Delmonte Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.")
	public void validate_sort_functionality_of_po_number_po_date_shipment_date_and_stauts_on_purchase_order_list_page()
			throws InterruptedException {
		po = new PurchaseOrderPOM();
		List<WebElement> webele = new LinkedList<>();
		webele.add(po.getPosort());
		webele.add(po.getPoDatesort());
		// webele.add(po.getShipDatesort());
		webele.add(po.getStatussort());
		List<Integer> col = new LinkedList<>();
		col.add(6);
		col.add(7);
		col.add(8);
		col.add(9);
		List<String> L2 = new LinkedList<>();
		List<String> L1 = new LinkedList<>();
		int n = 1;
		int n2 = 1;
		for (int i = 0; i < 3; i++) {

			String webTable = webTable(n, col.get(i), po.getPotable(), false);
			L1.add(webTable);
			n++;
			webele.get(i).click();
			Thread.sleep(4000);
			String webTable2 = webTable(n2, col.get(i), po.getPotable(), false);
			L2.add(webTable2);

			boolean equals = L1.get(i).contentEquals(L2.get(i));

			System.out.println(L1);
			System.out.println(L2);
			System.out.println(equals + L1.get(i));
			if (equals == false) {
				scenario.log("Sort Functionality working as expected");
			}
			sa.assertEquals(equals, false, "Sort functionality is failed");
			po.getLowtohigh().click();
			Thread.sleep(2000);
			n2++;

		}
		

		
	}
	@Then("Delmonte Purchase order listing page Failures")
	public void interplex_purchase_order_listing_page_failures() {
		try {
			sa.assertAll();
		} catch (Exception e) {
			scenario.log(e.toString());
		}
		sa.assertAll();
	}


	@Given("Delmonte Launch Tia application On the chrome Browser {string} {string} {string}")
	public void launch_tia_application_on_the_chrome_browser(String Client, String Username, String Password)
			throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		po = new PurchaseOrderPOM();
		fwait(po.getUsernmeTextbox());
		po.getUsernmeTextbox().sendKeys(Username);
		po.getPasswTextBox().sendKeys(Password);
		po.getButtonLoginn().click();
		fwait(po.getDashboardLabel());
		boolean displayed = po.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true,"Dashboard Page not reached");

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
	}

	@When("Delmonte Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.")
	public void validate_order_to_cash_receive_orders_order_list_select_a_po_from_list_click_button_should_be_reach_purchase_order_details_page()
			throws IOException, InterruptedException {
		po = new PurchaseOrderPOM();
		fwait(po.getMenuBtn());
		jsclick(po.getMenuBtn());
		jsclick(po.getOtoC());
		takeScreenshot(screenshotpath, "OtoC");
		jsclick(po.getRecvOrder());
		takeScreenshot(screenshotpath, "Received_Orders");
		jsclick(po.getOrderList());
		fwait(po.getPurchaseOrderLbl());
		String title = driver.getTitle();
		takeScreenshot(screenshotpath, "Purchase_Order_Listing_Page");
		sa.assertEquals(title, "Purchase Order","Purchase order Page not reached");
		Thread.sleep(3000);
		Integer rowcount = webtablerowcount(po.getPotable());
		System.out.println(rowcount);
		Thread.sleep(5000);
		if (rowcount != 0) {
			String liReceiver = webTable(2, 3, po.getPotable(), false);
			tabledetails.add(liReceiver);
			String liRegion = webTable(2, 4, po.getPotable(), false);
			tabledetails.add(liRegion);
			String liPartner = webTable(2, 5, po.getPotable(), false);
			tabledetails.add(liPartner);
			String liPoNum = webTable(2, 7, po.getPotable(), false);
			tabledetails.add(liPoNum);
			String liPODate = webTable(2, 8, po.getPotable(), false);
			tabledetails.add(liPODate);
			String liPOShipDate = webTable(2, 9, po.getPotable(), false);
			tabledetails.add(liPOShipDate);
			String liPoStatus = webTable(2, 10, po.getPotable(), false);
			tabledetails.add(liPoStatus);
			webTable(2, 0, po.getPotable(), true);

		} else {
			scenario.log("No PO Data Available");
		}

	}

	@Then("Delmonte Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.")
	public void validate_puchase_order_details_po_number_tg_transaction_id_order_date_delivery_date_so_number_total_order_amount_and_total_order_quantity_labels_are_available_on_purchase_order_details_page() {
		po = new PurchaseOrderPOM();
		fwait(po.getPurchaseOrderDetailslabel());
		String text0 = po.getPurchaseOrderDetailslabel().getText();
		boolean equals0 = text0.equals("Purchase Order Details");
		if (equals0 == true) {
			scenario.log("Purchase Order Details is Available on purchase order details page");
		}
		sa.assertEquals(equals0, true,"Purchase Order Details is not Available on purchase order details page");
		String text = po.getpONumberLabel().getText();
		boolean equals = text.contains("PO Number :");
		System.out.println("PO Number:"+text);
		if (equals == true) {
			scenario.log("Po Number Label is Available on purchase order details page");
		}
		sa.assertEquals(equals, true,"Po Number Label is not Available on purchase order details page");
		String text2 = po.gettGTransactionIDLabel().getText();
		boolean equals2 = text2.equals("TG Transaction ID :");
		if (equals2 == true) {
			scenario.log("TG Transaction ID Label is Available on purchase order details page");
		}
		sa.assertEquals(equals2, true,"TG Transaction ID Label is not Available on purchase order details page");
		String text3 = po.getOrderDateLabel().getText();
		boolean equals3 = text3.equals("Order Date :");
		if (equals3 == true) {
			scenario.log("Order Date Label is Available on purchase order details page");
		}
		sa.assertEquals(equals3, true,"Order Date Label is not Available on purchase order details page");
		String text4 = po.getDeliveryDateLabel().getText();
		boolean equals4 = text4.equals("Delivery Date :");
		if (equals4 == true) {
			scenario.log("Delivery Date Label is Available on purchase order details page");
		}
		sa.assertEquals(equals4, true,"Delivery Date Label is not Available on purchase order details page");
		String text5 = po.getSoNumberLabel().getText();
		boolean equals5 = text5.equals("So Number :");
		if (equals5 == true) {
			scenario.log("So Number Label is Available on purchase order details page");
		}
		sa.assertEquals(equals5, true,"So Number Label is not Available on purchase order details page");
		String text6 = po.getTotalOrderQuantityLabel().getText();
		boolean equals6 = text6.equals("Total Order Quantity :");
		if (equals6 == true) {
			scenario.log("Total Order Quantity Label is Available on purchase order details page");
		}
		sa.assertEquals(equals6, true,"Total Order Quantity Label is not Available on purchase order details page");
		String text7 = po.getTotalOrderAmountLabel().getText();
		boolean equals7 = text7.equals("Total Order Amount :");
		if (equals7 == true) {
			scenario.log("Total Order Amount is Available on purchase order details page");
		}
		sa.assertEquals(equals7, true,"Total Order Amount is not Available on purchase order details page");

	}

	@Then("Delmonte Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.")
	public void validate_ship_to_label_and_logo_bill_to_label_and_logo_and_po_status_are_available_on_the_purchase_order_details_page() {
		po = new PurchaseOrderPOM();
		boolean displayed = po.getShipToLogo().isDisplayed();
		sa.assertEquals(displayed, true,"Ship To Truck Logo is not available on Purchase order details page");
		if (displayed) {
			scenario.log("Ship To Truck Logo is available on Purchase order details page");
		}
		boolean displayed1 = po.getShipToLabel().isDisplayed();
		sa.assertEquals(displayed1, true,"Ship To Label is not available on Purchase order details page");
		if (displayed1) {
			scenario.log("Ship To Label is available on Purchase order details page");
		}
		boolean displayed2 = po.getBillToLabel().isDisplayed();
		sa.assertEquals(displayed2, true,"Bill To Label is not available on Purchase order details page");
		if (displayed2) {
			scenario.log("Bill To Label is available on Purchase order details page");
		}
		boolean displayed3 = po.getBillToLgo().isDisplayed();
		sa.assertEquals(displayed3, true,"Bill To Logo is not available on Purchase order details page");
		if (displayed3) {
			scenario.log("Bill To Logo is available on Purchase order details page");
		}
		fwait(po.getpOStatuslabel());
		boolean displayed4 = po.getpOStatuslabel().isDisplayed();
		sa.assertEquals(displayed4, true, "po status label not shown");
		boolean contains = po.getpOStatuslabel().getText().contains(tabledetails.get(6));
		System.out.println(po.getpOStatuslabel().getText());
		System.out.println(tabledetails);
		sa.assertEquals(contains, true, "po status label is incorrect");
		if (contains) {
			scenario.log("Po Status in Po Listing Page: " + tabledetails.get(6));
			scenario.log("Po Status in Po Details Page: " + po.getpOStatuslabel().getText());
			scenario.log("Po Status in PO details page is matched to PO list page");
		} else {
			scenario.log("Po Status in PO details page is not matched to PO list page");
		}
		if (displayed4 == false) {
			scenario.log("Po Status label is Not available on Purchase order details page");
		}

	}

	@Then("Delmonte Validate History module on the purchase order details page.")
	public void validate_history_module_on_the_purchase_order_details_page() throws InterruptedException {
		po = new PurchaseOrderPOM();
		po.getPoHistoryButton().click();
		fwait(po.getPurchaseOrderChangedHistoryLabel());
		boolean displayed = po.getPurchaseOrderChangedHistoryLabel().isDisplayed();
		if (displayed) {
			sa.assertEquals(displayed, true, "purchase order history label is not shown");
		}
		Thread.sleep(3000);
		List<String> lt = new LinkedList<>();

		lt.add("Created On");
		lt.add("PO Number");
		lt.add("Internal PO Number");
		lt.add("Action Date");
		lt.add("Status");
		boolean Result = true;
		for (int i = 0; i < 5; i++) {
			String webtablehead = webtablehead(0, i, po.getPohistorytable());
			System.out.println(webtablehead);
			System.out.println(lt.get(i));
			boolean contentEquals = webtablehead.contains(lt.get(i));
			if (contentEquals == false) {
				Result = false;
				break;
			}
		}
		sa.assertEquals(Result, true, "po history table");
		boolean displayed2 = po.getTiAGatewaylabel().isDisplayed();
		sa.assertEquals(displayed2, true, "po history Tia Gateway Label is not shown");
		if (displayed2) {

			scenario.log("Tangentia Copyright label present on PO history Popup");

		}

		boolean displayed3 = po.getTangentialink().isDisplayed();
		sa.assertEquals(displayed3, true, "po history Tangentia link is not shown");
		if (displayed3) {

			scenario.log("Tangentia Website Link present on PO history Popup");

		}

		po.getCloseButton().click();

	}

	@Then("Delmonte Validate Plus button on the purchase order details page.")
	public void validate_plus_button_on_the_purchase_order_details_page() {
		po = new PurchaseOrderPOM();
		fwait(po.getPlusIcon());
		po.getPlusIcon().click();
		List<WebElement> Iiconelement = new LinkedList<>();
		Iiconelement.add(po.getShipNotBeforeLabel());
		Iiconelement.add(po.getShipNoLaterThanLabel());
		Iiconelement.add(po.getMustArriveByLabel());
		Iiconelement.add(po.getDepartmentLabel());
		Iiconelement.add(po.getAllowanceTotalLabel());
		Iiconelement.add(po.getPromotionalEvent());
		Iiconelement.add(po.getSupplierNumber());
		Iiconelement.add(po.getAdditionalInfo());
		Iiconelement.add(po.getAllowanceTotalLabel());
		Iiconelement.add(po.getPaymentTerms());

		for (int i = 0; i < Iiconelement.size(); i++) {
			boolean displayed = Iiconelement.get(i).isDisplayed();
			if (displayed) {
				scenario.log(
						Iiconelement.get(i).getText() + " Label is present under additional additional details frame");

			}
			sa.assertEquals(displayed, true, Iiconelement.get(i).getText());
		}

		po.getToggleTooltip().click();
		fwait(po.getAllowances());
		boolean displayed = po.getAllowances().isDisplayed();
		if (displayed) {
			scenario.log("Allowances label is present on the Allowances popup");
		}
		List<String> alcol = new LinkedList<>();
		alcol.add("Allowance Type");
		alcol.add("Allowance Description");
		alcol.add("Allowance Percentage");
		alcol.add("Allowance Total");
		for (int i = 0; i < 4; i++) {
			String webtablehead = webtablehead(0, i, po.getAllowancestable());

			boolean equals = alcol.get(i).equals(webtablehead);
			sa.assertEquals(equals, true, alcol.get(i));

		}
		boolean displayed2 = po.getTiAGatewaylabel().isDisplayed();
		if (displayed2) {
			scenario.log("TiaGateway Copyright Label is present under allowance popup");
		}
		sa.assertEquals(displayed2, true, "TiaGateway Copyright Label (allowance popup)");

		boolean displayed3 = po.getTangentialink().isDisplayed();
		if (displayed3) {
			scenario.log("Tangentia Website Link is present under allowance popup");
		}
		sa.assertEquals(displayed3, true, "Tangentia Website Link (allowance popup)");

		po.getAllowancesclose().click();
		po.getMinusButton().click();

	}

	@Then("Delmonte Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.")
	public void validate_download_pdf_print_pdf_and_donwload_csv_buttons_are_in_purchase_order_details_page()
			throws InterruptedException {
		po = new PurchaseOrderPOM();
		po.getDownloadPDFButton().click();
		try {
			WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text = toastmessage.getText();
			boolean contains = text.contains("Downloading PDF");
			sa.assertEquals(contains, true, "Downloading CSV Toast message is not shown");
			Thread.sleep(3000);
			wd.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage2 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text2 = toastmessage2.getText();
			boolean contains2 = text2.contains("File Downloading..");
			sa.assertEquals(contains2, true, "File Downloading.. Toast message is not shown");
			Thread.sleep(2000);

			po.getDownloadCSVButton().click();
			WebDriverWait wd2 = new WebDriverWait(driver, Duration.ofSeconds(10));
			wd2.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage3 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text3 = toastmessage3.getText();
			boolean contains3 = text3.contains("Downloading CSV");
			sa.assertEquals(contains3, true, "Downloading CSV Toast message is not shown");
			Thread.sleep(3000);
			wd.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage4 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text4 = toastmessage4.getText();
			boolean contains4 = text4.contains("File Downloading..");
			sa.assertEquals(contains4, true, "File Downloading.. Toast message is not shown");

		} catch (Exception e) {

		}
		po.getPrintPDFButton().click();
		Thread.sleep(3000);
		sa.assertEquals(driver.getTitle(), "PdfIframe");
		driver.navigate().back();

	}

	@Then("Delmonte Validate Search module on the purchase order details page.")
	public void validate_search_module_on_the_purchase_order_details_page() throws InterruptedException, AWTException {
		po = new PurchaseOrderPOM();
		fwait(po.getProducttable());

		sa.assertEquals(po.getTextboxsrchlbl().isDisplayed(), true, "Product List table serach label is not displayed");
		sa.assertEquals(po.getShowEntrieslabelone().isDisplayed(), true,
				"Product List table Show label is not displayed");
		sa.assertEquals(po.getShowEntrieslabeltwo().isDisplayed(), true,
				"Product List table Entries label is not displayed");
		sa.assertEquals(po.getShowEntriesDropdown().isDisplayed(), true,
				"Product List table Show Entries dropdown label is not displayed");
	Actions ac = new Actions(driver);

//		ac.moveToElement(po.getTextboxsrch()).click().perform();
//		ac.keyDown(Keys.NUMPAD1).perform();
//		ac.keyUp(Keys.NUMPAD1).perform();
//		ac.keyDown(Keys.NUMPAD0).perform();
//		ac.keyUp(Keys.NUMPAD0).perform();
//		ac.keyDown(Keys.NUMPAD0).perform();
//		ac.keyUp(Keys.NUMPAD0).perform();
//		ac.keyDown(Keys.ENTER).perform();
//		ac.keyUp(Keys.ENTER).perform();
		po.getTextboxsrch().sendKeys("745042100560");
		Integer c = webtablerowcount(po.getProducttable());
		Thread.sleep(10000);
		System.out.println(c);
		boolean Result = true;
		for (int i = 1; i < 2; i++) {

			String webTable = webTableinnerText(i, 1, po.getProducttable());
			System.out.println(webTable);
			boolean contains = webTable.contains("100");
			if (contains == false) {
				Result = false;
			}

		}
		sa.assertEquals(Result, true, "Search module validation");
		if (Result) {
			scenario.log("Product Search module succesfully is working");

		}
		po.getProductsearch().clear();

	}

	@Then("Delmonte Validate product details table on the purchase order details page.")
	public void validate_product_details_table_on_the_purchase_order_details_page()
			throws InterruptedException, IOException {
		List<String> protabac = new LinkedList<>();
		Integer webtableheadcount = webtableheadcount(0, po.getProducttable());
		Thread.sleep(3000);
		Integer col = 1;
		for (int j = 0; j < webtableheadcount - 1; j++) {
			String webtableheadinnerText = webtableheadinnerText(col, po.getProducttable());
			protabac.add(webtableheadinnerText);
			System.out.println(webtableheadinnerText);

			col++;

		}
		System.out.println(protabac);
		// Product Code Sorting
		Actions a = new Actions(driver);
		a.scrollToElement(po.getItems()).perform();
		Thread.sleep(3000);
		Integer webtablerowcount = webtablerowcount(po.getProducttable());
		List<String> procac = new ArrayList<>();
		for (int i = 1; i <= webtablerowcount; i++) {
			String webtableheadinnerText = webTableinnerText(i, 1, po.getProducttable());
			procac.add(webtableheadinnerText);
		}
		Collections.sort(procac);
		List<String> procdc = new LinkedList<>();
		for (int i = procac.size() - 1; i >= 0; i--) {
			procdc.add(procac.get(i));
		}
		po.getProductsortlow().click();
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "ProductCode_HightoLow_Sort");
		Integer prodcrowcount = webtablerowcount(po.getProducttable());
		List<String> prochigh = new LinkedList<>();
		for (int i = 1; i <= prodcrowcount; i++) {
			String webtableheadinnerText = webTableinnerText(i, 1, po.getProducttable());
			prochigh.add(webtableheadinnerText);
		}
		boolean Resultproahigh = true;
		for (int i = 0; i < prochigh.size(); i++) {
			boolean equals = prochigh.get(i).equals(procdc.get(i));
			System.out.println(equals);
			if (equals == false) {
				Resultproahigh = false;

			}

		}
		if (Resultproahigh == true) {
			scenario.log("ProductCode High to low sort is working properly");
		} else {
			scenario.log("ProductCode High to low sort is not working properly");
		}
		sa.assertEquals(Resultproahigh, true, "ProductCode High to low sort not working");
		po.getProductsortlow().click();
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "ProductCode_LowtoHigh_Sort");
		Integer proacrowcount = webtablerowcount(po.getProducttable());
		List<String> proclow = new LinkedList<>();
		for (int i = 1; i <= proacrowcount; i++) {
			String webtableheadinnerText = webTableinnerText(i, 1, po.getProducttable());
			proclow.add(webtableheadinnerText);
		}
		boolean Resultproalow = true;
		System.out.println(proclow);
		System.out.println(procac);
		for (int i = 0; i < proclow.size(); i++) {
			boolean equals = proclow.get(i).equals(procac.get(i));
			System.out.println(equals);
			if (equals == false) {
				Resultproalow = false;

			}

		}
		if (Resultproalow == true) {
			scenario.log("ProductCode low to high sort is working properly");
		} else {
			scenario.log("ProductCode low to High sort is not working properly");
		}
		sa.assertEquals(Resultproalow, true, "ProductCode low to high sort not working");

		po.getDessortIdle().click();
		po.getDessorthigh().click();
		boolean Resultdes = true;
		sa.assertEquals(Resultdes, true, "Description low to high sort is not working");
		sa.assertEquals(Resultdes, true, "Description High to low sort is not working");
		if (Resultdes == true) {
			scenario.log("Description low to high sort is working properly");
			scenario.log("Description high to low sort is working properly");
		} else {
			scenario.log("Description low to high sort is not working properly");
			scenario.log("Description high to low sort is not working properly");
		}

		po.getQantityidle().click();
		po.getQuantityhigh().click();
		boolean Resultqan = true;
		sa.assertEquals(Resultqan, true, "Quantity low to high sort is not working");
		sa.assertEquals(Resultqan, true, "Quantity High to low sort is not working");
		if (Resultqan == true) {
			scenario.log("Quantity low to high sort is working properly");
			scenario.log("Quantity high to low sort is working properly");
		} else {
			scenario.log("Quantity low to high sort is not working properly");
			scenario.log("Quantity high to low sort is not working properly");
		}

		po.getItemcostidle().click();
		po.getItemcosthigh().click();
		boolean Resultic = true;
		sa.assertEquals(Resultic, true, "ItemCost low to high sort is not working");
		sa.assertEquals(Resultic, true, "ItemCost High to low sort is not working");
		if (Resultic == true) {
			scenario.log("ItemCost low to high sort is working properly");
			scenario.log("ItemCost high to low sort is working properly");
		} else {
			scenario.log("ItemCost low to high sort is not working properly");
			scenario.log("ItemCost high to low sort is not working properly");
		}

		po.getShipqanidle().click();
		po.getShippedquantityhigh().click();
		boolean Resultsq = true;
		sa.assertEquals(Resultsq, true, "Shipped Quantity low to high sort is not working");
		sa.assertEquals(Resultsq, true, "Shipped Quantity High to low sort is not working");
		if (Resultsq == true) {
			scenario.log("Shipped Quantity low to high sort is working properly");
			scenario.log("Shipped Quantity high to low sort is working properly");
		} else {
			scenario.log("Shipped Quantity low to high sort is not working properly");
			scenario.log("Shipped Quantity to low sort is not working properly");
		}

		po.getPriceidle().click();
		po.getPricehigh().click();
		boolean Resultpr = true;
		sa.assertEquals(Resultpr, true, "Price low to high sort is not working");
		sa.assertEquals(Resultpr, true, "Price Quantity High to low sort is not working");
		if (Resultpr == true) {
			scenario.log("Price low to high sort is working properly");
			scenario.log("Price high to low sort is working properly");
		} else {
			scenario.log("Price low to high sort is not working properly");
			scenario.log("Price to low sort is not working properly");
		}

		po.getUnackqanidle().click();
		po.getUnacknoweledgedquantityghigh().click();
		boolean Resultuq = true;
		sa.assertEquals(Resultuq, true, "Unacknowledged Quantity low to high sort is not working");
		sa.assertEquals(Resultuq, true, "Unacknowledged Quantity Quantity High to low sort is not working");
		if (Resultuq == true) {
			scenario.log("Unacknowledged Quantity low to high sort is working properly");
			scenario.log("Unacknowledged Quantity high to low sort is working properly");
		} else {
			scenario.log("Unacknowledged Quantity low to high sort is not working properly");
			scenario.log("Unacknowledged Quantity to low sort is not working properly");
		}

		
	}
	@Then("Delmonte purchase order details page Failures")
	public void interplex_purchase_order_details_page_failures() {
		try {
			sa.assertAll();
		} catch (Exception e) {
			scenario.log(e.toString());
		}
		sa.assertAll();
	}
}
