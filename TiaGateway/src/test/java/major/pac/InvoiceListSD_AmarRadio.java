package major.pac;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.time.Duration;
import java.util.LinkedList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pom.model.InvoiceListPOM;
import pom.model.PurchaseOrderPOM;
import pom.model.ShipmentListPOM;
import program.utility.BaseUtility;

public class InvoiceListSD_AmarRadio extends BaseUtility {

	PurchaseOrderPOM po = new PurchaseOrderPOM();
	InvoiceListPOM il = new InvoiceListPOM();
	SoftAssert sa = new SoftAssert();
	String screenshotpath = "C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\SendInvoices\\";

	private Scenario scenario;
	public static List<String> tabledetails = new LinkedList<>();

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
	}

	
	
	
	@Given("AmarRadio Launch Tia application Dashboard by google chrome Browser {string} {string} {string}")
	public void launch_tia_application_dashboard_by_google_chrome_browser(String string, String Username, String Password) {
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
	@When("AmarRadio Validate Procure to Pay --> Receive Invoices --> Invoice list Option Available on under the Menu.")
	public void validate_order_to_cash_send_invoices_invoice_list_option_available_on_under_the_menu() {
		po = new PurchaseOrderPOM();
		po.getMenuBtn().click();
	}
	@Then("AmarRadio Validate After clicks Invoices list option, it navigates to Invoices listing page.")
	public void validate_after_clicks_invoices_list_option_it_navigates_to_invoices_listing_page() throws IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click()", il.getProcuretopayAR());
		takeScreenshot(screenshotpath, "OtoC");
		js.executeScript("arguments[0].click()", il.getReceiveInvoiceAR());
		takeScreenshot(screenshotpath, "SendInvoice_Interplex");
		js.executeScript("arguments[0].click()", il.getInvoicelistAR());
		fwait(il.getInvoicesLabel());
		String title = driver.getTitle();
		takeScreenshot(screenshotpath, "Send_Invoices_Listing_Page");
		sa.assertEquals(title, "Invoices");
		boolean equals = title.contains("Invoices");
		if (equals == false) {

			scenario.log("Page Title or Tab name is Incorrect");

		}
	}
	@Then("AmarRadio Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.")
	public void validate_purchase_order_label_menu_button_account_name_with_logo_and_notification_bell_icon_are_available_on_invoices_listing_page() {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		fwait(il.getInvoicesLabel());
		boolean displayed = il.getInvoicesLabel().isDisplayed();
		sa.assertEquals(displayed, true, "Invoice label");
		if (displayed == true) {

			scenario.log("Invoices Label is Available");

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
	@Then("AmarRadio Validate From Date Filter and To Date Filter on Invoices listing page.")
	public void validate_from_date_filter_and_to_date_filter_on_invoices_listing_page() throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		il.getFdatefilter().sendKeys("01-07-2023");
		il.getTodatefilter().sendKeys("31-07-2023");
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		takeScreenshot(screenshotpath, "Send_Invoices_Date_Filter");
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
	@Then("AmarRadio Validate Status Filter on Invoices listing page.")
	public void validate_status_filter_on_invoices_listing_page() throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();

		List<String> li = new LinkedList<>();
		li.add("Preparing Invoice");
//		li.add("Confirm ASN");
//		li.add("Preparing Shipment");
//		li.add("Shipment Acknowledged");
		for (int i = 0; i < li.size(); i++) {

			il.getStatusfilter().click();
			il.getStatusFiltersearch().sendKeys(li.get(i));
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Send_Invoices_Status_Filter");
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
	@Then("AmarRadio Validate Receiver Filter on Invoices listing page.")
	public void validate_receiver_filter_on_invoices_listing_page() throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
	li.add("BROSEKG");
//		li.add("SATPRA");
//		li.add("DPH-H004");

		for (int i = 0; i < li.size(); i++) {

			il.getReceiverfilter().click();
			il.getRecvFiltersearch().sendKeys(li.get(i));
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Send_Invoices_Receiver_Filter");
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
	@Then("AmarRadio Validate PartnerOrg Filter on Invoices listing page.")
	public void validate_partner_org_filter_on_invoices_listing_page() throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("Brose EDI");
//		li.add("BCS");
//		li.add("Brose");

		for (int i = 0; i < li.size(); i++) {

			il.getPartnerOrgFilter().click();
			il.getPartorgFiltersearch().sendKeys(li.get(i));
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Send_Shipments_PartnerOrg_Filter");
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
	@Then("AmarRadio Validate Partner Filter on Invoices listing page.")
	public void validate_partner_filter_on_invoices_listing_page() throws AWTException, InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		List<String> li = new LinkedList<>();
		li.add("Brose EDI");
//		li.add("BCS Queretaro");
//		li.add("Aptiv Hugary : Szombathely");

		for (int i = 0; i < li.size(); i++) {

			il.getPartnerFilter().click();
			il.getPartnerFiltersearch().sendKeys(li.get(i));
			Robot r = new Robot();
			r.keyPress(KeyEvent.VK_ENTER);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(5000);
			takeScreenshot(screenshotpath, "Send_Invoices_Partner_Filter");
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
	
	@Then("AmarRadio Validate Serach Text Box on Invoices listing page.")
	public void validate_serach_text_box_on_invoices_listing_page() throws InterruptedException, AWTException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		String ValidData = "INV220515";
		String InvalidData = "invalid";
		il.getPosearchBox().sendKeys(ValidData);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		takeScreenshot(screenshotpath, "search_with_valid_Data");
		boolean result = false;
		for (int i = 1; i <= 1; i++) {
			String webTable = webTable(i, 5, po.getPotable(), false);
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
		il.getPosearchBox().sendKeys(InvalidData);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(6000);
		takeScreenshot(screenshotpath, "search_with_Invalid_Data");
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
	@Then("AmarRadio Validate the Select Action on Invoices listing page.")
	public void validate_the_select_action_on_invoices_listing_page() throws InterruptedException {
		il = new InvoiceListPOM();
		//Select s = new Select(il.getSelectAction());
		
//			s.selectByVisibleText("Generate Invoice Report");
//			WebDriverWait wd3 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wd3.until(ExpectedConditions
//					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
//			WebElement toastmessage3 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
//			String text3 = toastmessage3.getText();
//			sa.assertEquals(text3, "No data found for the selected date range, Please select proper date range.","before Generate Report");
//			
//			
//			Thread.sleep(2000);
//			il.getFdatefilter().sendKeys("01-07-2023");
//			il.getTodatefilter().sendKeys("31-07-2023");
//			s.selectByVisibleText("Generate Invoice Report");
//			WebDriverWait wd5 = new WebDriverWait(driver, Duration.ofSeconds(10));
//			wd5.until(ExpectedConditions
//					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div")));
//			WebElement toastmessage5 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div"));
//			String text5 = toastmessage5.getText();
//			sa.assertEquals("File Downloading..", "File Downloading..","after Generate Report");
//			
			

	}
	@Then("AmarRadio Validate Shows Entries on Invoices listing page.")
	public void validate_shows_entries_on_invoices_listing_page() throws InterruptedException, IOException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Select s = new Select(il.getShowEntries());

		s.selectByVisibleText("10");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries10");
		Integer webtablerowcount = webtablerowcount(po.getPotable());
		boolean equals = webtablerowcount.equals(10);
		System.out.println(webtablerowcount + "count(ten)");
		System.out.println(equals);
		sa.assertEquals(true, true, "show Entries10");
		Thread.sleep(2000);

		s.selectByVisibleText("25");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries25");
		Integer webtablerowcount2 = webtablerowcount(po.getPotable());
		boolean equals2 = webtablerowcount2.equals(25);
		System.out.println(webtablerowcount2 + "count(25)");
		System.out.println(equals2);
		sa.assertEquals(true, true, "show Entries25");
		Thread.sleep(2000);

		s.selectByVisibleText("50");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries50");
		Integer webtablerowcount3 = webtablerowcount(po.getPotable());
		boolean equals3 = webtablerowcount3.equals(50);
		System.out.println(webtablerowcount3 + "count(50)");
		System.out.println(equals3);
		sa.assertEquals(true, true, "show Entries50");
		Thread.sleep(2000);

		s.selectByVisibleText("100");
		Thread.sleep(4000);
		takeScreenshot(screenshotpath, "showEntries100");
		Integer webtablerowcount4 = webtablerowcount(po.getPotable());
		System.out.println(webtablerowcount4);
		boolean equals4 = webtablerowcount4.equals(100);
		System.out.println(webtablerowcount4 + "count(100)");
		System.out.println(equals4);
		sa.assertEquals(true, true, "show Entries100");
		Thread.sleep(2000);
		js.executeScript("arguments[0].click()", po.getResetbtn());
		Thread.sleep(4000);
		
	}
	@Then("AmarRadio Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.")
	public void validate_sort_functionality_of_invoice_date_invoice_status_tax_and_grand_total_on_invoices_listing_page() throws InterruptedException {
		il= new InvoiceListPOM();
		po = new PurchaseOrderPOM();
		List<WebElement> webele = new LinkedList<>();
		webele.add(il.getInvoicedatesort());
		//webele.add(il.getInvoicestatussort());
		//webele.add(il.getInvoicetaxsort());
		webele.add(il.getInvoicetotalsort());
		List<Integer> col = new LinkedList<>();
		col.add(6);
		//col.add(7);
		//col.add(8);
		col.add(9);
		List<String> finalsorted = new LinkedList<>();
		List<String> Initialsorted = new LinkedList<>();
		int n = 1;
		int n2 = 1;
		for (int i = 0; i < 2; i++) {

			String webTable = webTable(n, col.get(i), po.getPotable(), false);
			Initialsorted.add(webTable);
			n++;
			webele.get(i).click();
			Thread.sleep(4000);
			String webTable2 = webTable(n2, col.get(i), po.getPotable(), false);
			finalsorted.add(webTable2);

		boolean equals = Initialsorted.equals(finalsorted);

			System.out.println(Initialsorted);
			System.out.println(finalsorted);
			
			if (equals == false) {
				scenario.log("Sort Functionality working as expected");
			}
			sa.assertEquals(false, false, "sort functionality");
			po.getLowtohigh().click();
			Thread.sleep(2000);
			n2++;

		}
	}
	@Then("AmarRadio Interplex Invoice listing page Failures")
	public void interplex_invoice_listing_page_failures() {
		try {
			sa.assertAll();
		} catch (AssertionError e) {
			scenario.log(e.toString());
		}
		sa.assertAll();
	}

	
	
	
	
	
	@Given("AmarRadio Launch Tia application AmarRadio Dashboard by google chrome Browser {string} {string} {string}")
	public void launch_tia_application_interplex_dashboard_by_google_chrome_browser(String string, String Username, String Password) {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		po = new PurchaseOrderPOM();
		fwait(po.getUsernmeTextbox());
		po.getUsernmeTextbox().sendKeys(Username);
		po.getPasswTextBox().sendKeys(Password);
		po.getButtonLoginn().click();
		fwait(po.getDashboardLabel());
		boolean displayed = po.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true);

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
	}
	@When("AmarRadio Validate Procure to Pay --> Receive Invoices --> Invoice list --> >> --> Invoice Details.")
	public void validate_order_to_cash_send_invoices_invoice_list_invoice_details() throws IOException, InterruptedException {
		po = new PurchaseOrderPOM();
		il = new InvoiceListPOM();
		fwait(po.getMenuBtn());
		jsclick(po.getMenuBtn());
		jsclick(il.getProcuretopayAR());
		takeScreenshot(screenshotpath, "PtoP");
		jsclick(il.getReceiveInvoiceAR());
		takeScreenshot(screenshotpath, "Received_Orders");
		jsclick(il.getInvoicelistAR());
		Thread.sleep(3000);
		fwait(il.getInvoicesLabel());
		String title = driver.getTitle();
		takeScreenshot(screenshotpath, "Purchase_Order_Listing_Page");
		sa.assertEquals(title, "Invoices");
		Thread.sleep(3000);
		Integer rowcount = webtablerowcount(po.getPotable());
		System.out.println(rowcount);
		Thread.sleep(5000);
		if (rowcount != 0) {
			
			webTable(2, 0, po.getPotable(), true);

		} else {
			scenario.log("No PO Data Available");
		}

	}
	@Then("AmarRadio Validate Invoice Details Label and Title of the Invoice Details page.")
	public void validate_invoice_details_label_and_title_of_the_invoice_details_page() throws InterruptedException {
		il = new InvoiceListPOM();
		Thread.sleep(5000);

		boolean displayed = il.getInvoiceDetailsLbl().isDisplayed();
		sa.assertEquals(displayed, true,"Invoice Details Label Validation");
		sa.assertEquals(driver.getTitle(), "Invoice Details");
	    
	}
	@Then("AmarRadio Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.")
	public void validate_invoice_number_invoice_date_delivery_date_tg_transaction_id_created_date_invoice_status_allowance_total_and_payment_terms_label_are_available_on_invoice_details_page() throws InterruptedException {
		il = new InvoiceListPOM();
		
		fwait(il.getInvoiceNumberLbl());
		boolean displayed = il.getInvoiceNumberLbl().isDisplayed();
		sa.assertEquals(displayed, true,"Invoice Invoice Label Validation");
		boolean displayed1 = il.getInvoiceDateLbl().isDisplayed();
		sa.assertEquals(displayed1, true,"Invoice Date Label Validation");
		boolean displayed2 = il.gettGTransactionIDLbl().isDisplayed();
		sa.assertEquals(displayed2, true,"TG Transaction ID Label Validation");
		boolean displayed3 = il.getCreatedDateLbl().isDisplayed();
		sa.assertEquals(displayed3, true,"Created Date Label Validation");
		boolean displayed4 = il.getInvoiceStatusAR().isDisplayed();
		sa.assertEquals(displayed4, true,"Invoice status Label Validation");
		boolean displayed5 = il.getAllowanceTotalLblAR().isDisplayed();
		sa.assertEquals(displayed5, true,"Allowance Total Label Validation");
		boolean displayed6 = il.getPaymentTermsLbl().isDisplayed();
		sa.assertEquals(displayed6, true,"Payment Terms Label Validation");
	}
	@Then("AmarRadio Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount \\(In Words),Total Tax Amount \\(In Words),Amount Chargeable \\(In Words),and Declaration are available on Invoice Details Page.")
	public void validate_product_detail_table_total_total_tax_amount_taxable_amount_other_charges_round_off_grand_total_sub_total_amount_in_words_total_tax_amount_in_words_amount_chargeable_in_words_and_declaration_are_available_on_invoice_details_page() {
		il = new InvoiceListPOM(); 
		boolean displayed = il.getTotallbl().isDisplayed();
		sa.assertEquals(displayed, true,"Total Label Validation");
		boolean displayed1 = il.getTotalTaxAmountlbl().isDisplayed();
		sa.assertEquals(displayed1, true,"Total Tax Amount Label Validation");
		boolean displayed2 = il.getTaxableAmountlbl().isDisplayed();
		sa.assertEquals(displayed2, true,"Taxable Amount Validation");
		boolean displayed3 = il.getOtherChargeslbl().isDisplayed();
		sa.assertEquals(displayed3, true,"Other Charges Label Validation");
		boolean displayed4 = il.getRoundOfflbl().isDisplayed();
		sa.assertEquals(displayed4, true,"RoundOff Label Validation");
		boolean displayed5 = il.getGrandTotallbl().isDisplayed();
		sa.assertEquals(displayed5, true,"Grand Total Label Validation");
		boolean displayed6 = il.getSubTotalAmountInWordsLbl().isDisplayed();
		sa.assertEquals(displayed6, true,"Sub Total Amount in Words Label Validation");
		boolean displayed7 = il.getTotalTaxAmountInWordsLbl().isDisplayed();
		sa.assertEquals(displayed7, true,"Total Tax Amount in Words Label Validation");
		boolean displayed8 = il.getAmountChargeableInWordsLbl().isDisplayed();
		sa.assertEquals(displayed8, true,"Amount Chargeable in Words Label Validation");
		boolean displayed9 = il.getDeclarationLbl().isDisplayed();
		sa.assertEquals(displayed9, true,"Declaration Label Validation");
		boolean displayed10 = il.getWeDeclareLbl().isDisplayed();
		sa.assertEquals(displayed10, true,"Declaration messeage Label Validation");
		String text = il.getWeDeclareLbl().getText();
		boolean equals = text.equals("We Declare To The Best Of Our Knowledge And Belief That The Particulars Stated Herein Are True And Correct And There Is No Additional Consideration Accruing To Us Either Directly Or Indirectly In Any Manner Other Than The Amounts Indicated Here.");
		sa.assertEquals(equals, true,"Declaration messeage content Validation");
	}
	@Then("AmarRadio Validate Allowance popup window, Print Invoice,Download Invoice, PO Number link and ASN Link")
	public void validate_allowance_popup_window() throws InterruptedException {
		il = new InvoiceListPOM();
		il.getAllowancepopup().click();
		fwait(il.getAllowancesLbl());
		boolean displayed = il.getAllowancesLbl().isDisplayed();
		sa.assertEquals(displayed, true,"Allowances Label Validation");
		boolean displayed1 = il.getTangentialink().isDisplayed();
		sa.assertEquals(displayed1, true,"Tangentia Link Validation");
		boolean displayed2 = il.getTiAGatewayLbl().isDisplayed();
		sa.assertEquals(displayed2, true,"Tangentia CopyWright Label");
		il.getAllowancepopclose().click();
		
		il.getPrintInvoiceButton().click();
		Thread.sleep(5000);
		   String title = driver.getTitle();
		   System.out.println(title);
		   sa.assertEquals(title, "Invoice PDF","Invoice PDF page title");
		   driver.navigate().back();
		   Thread.sleep(5000);
		   
		   il.getPonumberlinkAR().click();
			Thread.sleep(5000);
			   String title2 = driver.getTitle();
			   System.out.println(title2);
			   sa.assertEquals(title2, "Purchase Order Details","Po redirect");
			   driver.navigate().back();
			   Thread.sleep(5000);
			   
			   il.getAsnnumberlinkAR().click();
				Thread.sleep(5000);
				   String title3 = driver.getTitle();
				   System.out.println(title3);
				   sa.assertEquals(title3, "Shipment Details","ASN redirect");
				   driver.navigate().back();
				   Thread.sleep(5000);
		   
		   
		   
		   
		   
		   il.getDownloadInvoiceButton().click();
		   WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		   wd.until(ExpectedConditions
					.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
			WebElement toastmessage5 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
			String text5 = toastmessage5.getText();
			sa.assertEquals(text5, "File Downloading..","Download Invoice Button Validation");
		
	}
	@Then("AmarRadio Invoice details page Failures")
	public void interplex_invoice_details_page_failures() {
	   sa.assertAll();
	}
}
