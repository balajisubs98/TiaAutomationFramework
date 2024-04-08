package major.pac;

import java.io.IOException;
import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
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
import net.sourceforge.tess4j.TesseractException;
import pom.model.DashboardPOM;
import program.utility.BaseUtility;

public class DashboardSD extends BaseUtility {

	DashboardPOM dp = new DashboardPOM();
	SoftAssert sa = new SoftAssert();
	String screenshotpath="C:\\Users\\Balaji S\\eclipse-workspace1\\TiaGateway\\Screenshots\\Dashboard\\";
	

	private Scenario scenario;

	@Before
	public void setUp(Scenario scenario) {
		this.scenario = scenario;
	}
	// @Validate_Dashborad
	@Given("Launch Tia Application on Google Chrome and Login with as {string}  Client valid Crendential {string} and {string}")
	public void launch_tia_application_on_google_chrome_and_login_with_as_client_valid_crendential_and(String Client,
			String Username, String Password) throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		
		dp = new DashboardPOM();
		fwait(dp.getUsernmeTextbox());
		dp.getUsernmeTextbox().sendKeys(Username);
		dp.getPasswTextBox().sendKeys(Password);
		dp.getButtonLoginn().click();
		fwait(dp.getDashboardLabel());
		boolean displayed = dp.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true,"Line No: 52");

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}
	

	}

	@Then("To validate user reach {string} Dashboard")
	public void to_validate_user_reach_dashboard(String Client) throws InterruptedException {
		dp = new DashboardPOM();
		fwait(dp.getDashboardLabel());
		boolean displayed = dp.getDashboardLabel().isDisplayed();
		sa.assertEquals(driver.getTitle(), "Dashboard");
		sa.assertEquals(displayed, true,"Line No: 67");
		if (displayed = true) {
			scenario.log("User Reached  Dashboard Sucessfully");
		}
		
	}

	@Then("To validate Dashborad title label available on top of the {string} Dashborad Screen")
	public void to_validate_dashborad_title_label_available_on_top_of_the_dashborad_screen(String Client)
			throws InterruptedException {
		dp = new DashboardPOM();
		
		String text = dp.getDashboardLabel().getText();
		sa.assertEquals(text, "Dashboard","Line No: 80");
		sa.assertEquals(driver.getTitle(), "Dashboard","Line No: 81");
		if (text.equals("Dashboard")) {
			scenario.log("Dashboard title label available on dashboard screen");
		}
		

	}

	@Then("To validate Raw EDI or Consiladted filter dropdown on the {string} Dashboard Screen")
	public void to_validate_raw_edi_or_consiladted_filter_dropdown_on_the_dashboard_screen(String string)
			throws InterruptedException, IOException {
		dp = new DashboardPOM();
		fwait(dp.getRawedifilter());
		Select s = new Select(dp.getRawedifilter());
		List<WebElement> options = s.getOptions();
		String text1 = options.get(0).getText();
		sa.assertEquals(text1, "Raw EDI","Line No: 97");
		String text2 = options.get(1).getText();
		sa.assertEquals(text2, "Consolidated","Line No: 99");
		s.selectByVisibleText("Raw EDI");
		takeScreenshot(screenshotpath, "RAW EDI Filter"+string);
		Thread.sleep(700);
		s.selectByVisibleText("Consolidated");
		takeScreenshot(screenshotpath, "Consolidated Filter"+string);
		
		int size = options.size();
		sa.assertEquals(size, 2,"Line No: 107");

		if (text1.equals("Raw EDI") && text2.equals("Consolidated") && size == 2) {

			scenario.log("Result : RAW EDI Filter available on Dashboard Screen");

		}
		Thread.sleep(2000);

	}

	@Then("To validate Inbound and Outbound filter dropdown on the {string} Dashboard Screen")
	public void to_validate_inbound_and_outbound_filter_dropdown_on_the_dashboard_screen(String string)
			throws InterruptedException, IOException {
		dp = new DashboardPOM();
		Select s = new Select(dp.getInboundOutboundfilter());
		List<WebElement> options = s.getOptions();
		String text1 = options.get(0).getText();
		sa.assertEquals(text1, "Inbound Outbound","Line No: 125");
		String text2 = options.get(1).getText();
		sa.assertEquals(text2, "Inbound","Inbound filter");
		String text3 = options.get(2).getText();
		sa.assertEquals(text3, "Outbound","Outbound filter");
		s.selectByVisibleText("Inbound Outbound");
		takeScreenshot(screenshotpath, "Inbound Outbound filter"+string);
		Thread.sleep(700);
		s.selectByVisibleText("Inbound");
		takeScreenshot(screenshotpath, "Inbound filter"+string);
		Thread.sleep(700);
		s.selectByVisibleText("Outbound");
		takeScreenshot(screenshotpath, "Outbound filter"+string);
		int size = options.size();
		sa.assertEquals(size, 3,"Inbound Outbound filter size");
		scenario.log("Inboud and Outbound available on Dashboard Screen");
		Thread.sleep(2000);
	}

	@Then("To validate Partner filter dropdown on the {string} Dashboard Screen")
	public void to_validate_partner_filter_dropdown_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		boolean displayed = dp.getPartnerFilter().isDisplayed();
		sa.assertEquals(displayed, true,"Partner filter");
		dp.getPartnerFilter().click();
		takeScreenshot(screenshotpath, "Partner Filter"+string);
		Thread.sleep(700);
		dp.getPartnerFilter().click();
		scenario.log("PartnerFilter available on Dashboard Screen");
		Thread.sleep(2000);
	}

	@Then("To validate Region filter dropdown on the {string} Dashboard Screen")
	public void to_validate_region_filter_dropdown_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		boolean displayed = dp.getRegionFilter().isDisplayed();
		sa.assertEquals(displayed, true,"Region filter");
		dp.getRegionFilter().click();
		takeScreenshot(screenshotpath, "Region Filter"+string);
		Thread.sleep(700);
		dp.getRegionFilter().click();
		scenario.log("RegionFilter available on Dashboard Screen");
		Thread.sleep(2000);
	}

	@Then("To validate Month filter dropdown on the {string} Dashboard Screen")
	public void to_validate_month_filter_dropdown_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		Select s = new Select(dp.getMonthfilter());
		List<WebElement> options = s.getOptions();
		String text1 = options.get(0).getText();
		sa.assertEquals(text1, "Year","year filter");
		String text2 = options.get(1).getText();
		sa.assertEquals(text2, "Month","Month filter");
		String text3 = options.get(2).getText();
		sa.assertEquals(text3, "Day","Day filter");
		int size = options.size();
		sa.assertEquals(size, 3,"Month filter size");
		s.selectByVisibleText("Year");
		takeScreenshot(screenshotpath, "Year Filter"+string);
		Thread.sleep(700);
		s.selectByVisibleText("Month");
		takeScreenshot(screenshotpath, "Month Filter"+string);
		Thread.sleep(700);
		s.selectByVisibleText("Day");
		takeScreenshot(screenshotpath, "Day Filter"+string);
		scenario.log("Month Filter available on Dashboard Screen");
		Thread.sleep(2000);
	}

	@Then("To validate Select Action dropdown on the {string} Dashboard Screen")
	public void to_validate_select_action_dropdown_on_the_dashboard_screen(String string)
			throws InterruptedException, IOException, TesseractException {
		dp = new DashboardPOM();
		Select s = new Select(dp.getSelectActiondropdown());
		List<WebElement> options = s.getOptions();
		String text1 = options.get(1).getText();
		sa.assertEquals(text1, "Export Graph data to Excel","Export Graph data to Excel");
		options.get(1).click();
		WebDriverWait wd = new WebDriverWait(driver, Duration.ofSeconds(10));
		wd.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
		WebElement toastmessage = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
		takeScreenshot(screenshotpath, "Export Graph fileDownloading"+string);
		String text = toastmessage.getText();
		sa.assertEquals(text, "File Downloading..","Export Graph data to Excel FD");
		String text2 = options.get(2).getText();
		sa.assertEquals(text2, "Download Graph Report","Download Graph Report");
		s.selectByVisibleText("Download Graph Report");
		wd.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#feedbackMessageContainer > div > div")));
		WebElement toastmessage2 = driver.findElement(By.cssSelector("#feedbackMessageContainer > div > div"));
		takeScreenshot(screenshotpath, "Download Graph fileDownloading"+string);
		String textt = toastmessage2.getText();
		sa.assertEquals(textt, "File Downloading..","Download Graph Report FD");
		String text3 = options.get(3).getText();
		takeScreenshot(screenshotpath,"filedownloading");
		String text4 = options.get(0).getText();
		sa.assertEquals(text4, "Select Action","Select Action");
		int size = options.size();
		sa.assertEquals(size, 4);
		sa.assertEquals(text3, "Print Graph Report","Print Graph Report");
		s.selectByVisibleText("Print Graph Report");
		fwaitpage("PdfIframe");
		
		sa.assertEquals(driver.getTitle(), "Graph Report","Print Graph Report title");
		Thread.sleep(3000);
		
		driver.navigate().back();
		scenario.log("Select Action Feature working properly but downloaded file's need to evaluate manually");
		Thread.sleep(2000);
	}

	@Then("To validate Reset button on the {string} Dashboard Screen")
	public void to_validate_reset_button_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		dp.getReset().click();
		Thread.sleep(2000);
		takeScreenshot(screenshotpath, "resetbutton"+string);
		scenario.log("Reset Button Validation Sucessfully completed");
		Thread.sleep(2000);

	}

	@Then("To validate Notification Bell icon on the {string} Dashboard Screen")
	public void to_validate_notification_bell_icon_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		dp.getIconNotification().click();
		boolean displayed = dp.getNotifipopClose().isDisplayed();
		sa.assertEquals(displayed, true);
		takeScreenshot(screenshotpath, "notification_Popup"+string);
		if (displayed = true) {
			scenario.log(
					"When clicks Notification Bell icon, it successfully shows the Notification List Popup window");
			dp.getNotifipopClose().click();
		}
		Thread.sleep(2000);
	}

	@Then("To validate Account Name on the {string} Dashboard Screen")
	public void to_validate_account_name_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		dp.getAccountLink().click();
		boolean displayed = dp.getAccountLink().isDisplayed();
		sa.assertEquals(displayed, true);
		takeScreenshot(screenshotpath, "AccountnameLink"+string);
		if (displayed = true) {
			scenario.log(
					"Result: When clicks Account Name Link, it successfully shows the account options");
			
		}
	}

	@Then("To validate Envelope icon on the {string} Dashboard Screen")
	public void to_validate_envelope_icon_on_the_dashboard_screen(String string) throws InterruptedException, IOException {
		dp = new DashboardPOM();
		fwait(dp.getEnvelopeicon());
		dp.getEnvelopeicon().click();
		boolean displayed = dp.getReleasenoteLbl().isDisplayed();
		sa.assertEquals(displayed, true);
		takeScreenshot(screenshotpath, "Envelopicon"+string);
		if (displayed = true) {
			scenario.log("Result: When clicks envelope icon, it successfully navigates to the Release Notes Screen");
			driver.navigate().back();
		}
		Thread.sleep(2000);
	}

	@Then("To validate Onboard Partner on the {string} Dashboard Screen")
	public void to_validate_onboard_partner_on_the_dashboard_screen(String string) {
		dp = new DashboardPOM();
		boolean displayed = dp.getOnboardPartnerLbl().isDisplayed();
		sa.assertEquals(displayed, true);
		String text = dp.getOnboardPartnerCount().getText();

		boolean equalsIgnoreCase = text.equalsIgnoreCase("Onboarded Partners");
		if (displayed == true && equalsIgnoreCase == true) {
			scenario.log("Result: Onborad board Partner label with counts available on Dashboard Screen");
			driver.navigate().back();
		}
		sa.assertAll();
	}

	// @Validate_Graphs
	@Given("Launch Tia Application on Google Chrome Browser and Login with as {string}  Client valid Crendential {string} and {string}")
	public void launch_tia_application_on_google_chrome_browser_and_login_with_as_client_valid_crendential_and(
			String string, String Username, String Password) throws InterruptedException {
		launchChromeBroswer("https://tia-qa.tangentia.com/TIA/LoginScreen");
		toMaximize();
		
		dp = new DashboardPOM();
		fwait(dp.getUsernmeTextbox());
		dp.getUsernmeTextbox().sendKeys(Username);
		dp.getPasswTextBox().sendKeys(Password);
		dp.getButtonLoginn().click();
		fwait(dp.getDashboardLabel());
		boolean displayed = dp.getDashboardLabel().isDisplayed();
		sa.assertEquals(displayed, true);

		if (displayed = true) {
			scenario.log("Login SuccessFully");
		}

		Thread.sleep(2000);
	}

	@Given("To validate Purchase Order Graph on the {string} Dashboard Screen.")
	public void to_validate_purchase_order_graph_on_the_dashboard_screen(String string) throws InterruptedException {
		dp = new DashboardPOM();
		Thread.sleep(10000);
		
		if (string.equals("Whitelink") | string.equals("Texmo")) {

			scenario.log("Purchase Order graph is Not Applicale for: "+string+" Client");

		} else {

			try {

				boolean displayed = dp.getPograph().isDisplayed();
				if (displayed) {
					scenario.log("Purchase Order is Available on Dashborad Screen");
					List<WebElement> purchaseorderGraph = dp.getPurchaseorderGraph();
					System.out.println(purchaseorderGraph.size());
					Actions ac = new Actions(driver);
					for (WebElement e : purchaseorderGraph) {
						ac.moveToElement(e).perform();
						
						ac.moveToElement(e).click().perform();
						Thread.sleep(6000);
						boolean displayed2 = dp.getCountItems().isDisplayed();
						ac.scrollToElement(dp.getCountItems()).perform();
						takeScreenshot(screenshotpath, "purchase_order_graph_listing");
						sa.assertEquals(displayed2, true);
						if (displayed2==true) {
						scenario.log("After Click the Purchase Order Graph List shown properly");
						dp.getCloseButton().click();
						scenario.log("After Click the close Botton listing disappear successfully");
						}
						Thread.sleep(3000);
						ac.scrollToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(3000);
						dp.getGotolistButton().click();
						Thread.sleep(10000);
						takeScreenshot(screenshotpath, "purchase_order_graph_listing_Details");
						boolean displayed3 = dp.getPosearch().isDisplayed();
						if (displayed3==true) {
						scenario.log("After Click the Go to List Button, It navigates to Po Listing page Successfully");
								
							}
							driver.navigate().back();
							Thread.sleep(8000);
							break;
						}
					}
					
					
				 
					
				

			} catch (Exception e) {
				scenario.log("Purchase Order Data not Available");
			}

		}
	}

	@Then("To validate Invoice Graph on the {string} Dashboard Screen.")
	public void to_validate_invoice_graph_on_the_dashboard_screen(String string) throws InterruptedException {
		dp = new DashboardPOM();
		Thread.sleep(10000);
		if (string.equals("Whitelink") | string.equals("Masu Brakes") | string.equals("Rose & Macdonald")
				| string.equals("Texmo")) {

			scenario.log("Invoice graph is Not Applicale for: "+string+" Client");

		} else {

			try {

				boolean displayed = dp.getInvgraph().isDisplayed();
				if (displayed) {
					scenario.log("Invoice Graph is Available on Dashborad Screen");
					List<WebElement> InvGraph = dp.getInvoiceGraph();
					System.out.println(InvGraph.size());
					Actions ac = new Actions(driver);
					for (WebElement e : InvGraph) {
						ac.moveToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(6000);
						boolean displayed2 = dp.getCountItems().isDisplayed();
						ac.scrollToElement(dp.getCountItems()).perform();
						takeScreenshot(screenshotpath, "Invoice_graph_listing");
						sa.assertEquals(displayed2, true);
						if (displayed2==true) {
						scenario.log("After Click the Invoice Graph List shown properly");
						dp.getCloseButton().click();
						scenario.log("After Click the close Botton listing disappear successfully");
						}
						Thread.sleep(3000);
						ac.scrollToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(3000);
						dp.getGotolistButton().click();
						Thread.sleep(10000);
						boolean displayed3 = dp.getPosearch().isDisplayed();
						takeScreenshot(screenshotpath, "Invoice_graph_listing_Details");
						if (displayed3==true) {
						scenario.log("After Click the Go to List Button, It navigates to Invoice Listing page Successfully");
								
							}
							driver.navigate().back();
							Thread.sleep(8000);
							break;
						}
					}
					
				
			} catch (Exception e) {

				scenario.log("Invoice Graph Data not Available");

			}

		}
	}

	@Then("To validate Shipment Graph on the {string} Dashboard Screen.")
	public void to_validate_shipment_graph_on_the_dashboard_screen(String string) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		dp = new DashboardPOM();
		Thread.sleep(10000);
		if (string.equals("Whitelink") | string.equals("Delmonte") | string.equals("Zephyr")) {

			scenario.log("Shipment graph is Not Applicale for: "+string+" Client");

		} else {

			try {

				boolean displayed = dp.getShipgraph().isDisplayed();
				if (displayed) {
					scenario.log("Shipments Graph is Available on Dashborad Screen");
					List<WebElement> shpGraph = dp.getShipmentsGraph();
					System.out.println(shpGraph.size());
					Actions ac = new Actions(driver);
					for (WebElement e : shpGraph) {
						ac.moveToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(6000);
						boolean displayed2 = dp.getCountItems().isDisplayed();
						ac.scrollToElement(dp.getCountItems()).perform();
						takeScreenshot(screenshotpath, "Shipments_graph_listing");
						sa.assertEquals(displayed2, true);
						if (displayed2==true) {
						scenario.log("After Click the Shipment Graph List shown properly");
						js.executeScript("arguments[0].click()", dp.getCloseButton());
						scenario.log("After Click the close Botton listing disappear successfully");
						}
						js.executeScript("arguments[0].scrollIntoView(false)",e);
						ac.moveToElement(e).click().build().perform();
						Thread.sleep(2000);
						js.executeScript("arguments[0].click()",dp.getGotolist());
						Thread.sleep(10000);
						takeScreenshot(screenshotpath, "Shipments_graph_listing_Details");
						boolean displayed3 = dp.getPosearch().isDisplayed();
						if (displayed3==true) {
						scenario.log("After Click the Go to List Button, It navigates to Shipments Listing page Successfully");
								
							}
							driver.navigate().back();
							Thread.sleep(8000);
							break;
						}
					}

			} catch (Exception e) {

				scenario.log("Shipments Graph Data not Available");
				e.printStackTrace();

			}

		}
	}

	@Then("To validate Delfore Graph on the {string} Dashboard Screen.")
	public void to_validate_delfore_graph_on_the_dashboard_screen(String string) throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		dp = new DashboardPOM();
		Thread.sleep(10000);
		if (string.equals("Roop Automotives") | string.equals("Texmo") | string.equals("Interplex")) {
			try {

				boolean displayed = dp.getDelfgraph().isDisplayed();
				if (displayed) {
					scenario.log("Delfor Graph is Available on Dashborad Screen");
					List<WebElement> delfGraph = dp.getDelforeGraph();
					System.out.println(delfGraph.size());
					Actions ac = new Actions(driver);
					
					for (WebElement e : delfGraph) {
						ac.moveToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(6000);
						boolean displayed2 = dp.getCountItems().isDisplayed();
						ac.scrollToElement(dp.getCountItems()).perform();
						takeScreenshot(screenshotpath, "delfor_graph_listing");
						sa.assertEquals(displayed2, true);
						if (displayed2==true) {
						scenario.log("After Click the Delfor Graph List shown properly");
						
						js.executeScript("arguments[0].click()", dp.getCloseButton());
						scenario.log("After Click the close Botton listing disappear successfully");
						}
						Thread.sleep(3000);
						ac.scrollToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(3000);
						
						js.executeScript("arguments[0].click()", dp.getGotolistButton());
						Thread.sleep(10000);
						takeScreenshot(screenshotpath, "delfor_graph_listing_Details");
						boolean displayed3 = dp.getPosearch().isDisplayed();
						if (displayed3==true) {
						scenario.log("After Click the Go to List Button, It navigates to Delfor Listing page Successfully");
								
							}
							driver.navigate().back();
							Thread.sleep(8000);
							break;
						}
					}

			} catch (Exception e) {

				scenario.log("Delfor Graph Data not Available");
				e.printStackTrace();

			}

		} else {
			scenario.log("DelFor graph is Not Applicale for: "+string+" Client");

		}

	}

	@Then("To validate DelJit Graph on the {string} Dashboard Screen.")
	public void to_validate_del_jit_graph_on_the_dashboard_screen(String string) throws InterruptedException {
		dp = new DashboardPOM();
		Thread.sleep(10000);
		if (string.equals("Roop Automotives") |string.equals("Interplex")) {
			try {

				boolean displayed = dp.getDeljitgraph().isDisplayed();
				if (displayed) {
					scenario.log("DelJit Graph is Available on Dashborad Screen");
					List<WebElement> jitGraph = dp.getJitGraph();
					System.out.println(jitGraph.size());
					Actions ac = new Actions(driver);
					for (WebElement e : jitGraph) {
						ac.moveToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(6000);
						boolean displayed2 = dp.getCountItems().isDisplayed();
						ac.scrollToElement(dp.getCountItems()).perform();
						takeScreenshot(screenshotpath, "deljit_graph_listing");
						sa.assertEquals(displayed2, true);
						if (displayed2==true) {
						scenario.log("After Click the DelJit Graph List shown properly");
						dp.getCloseButton().click();
						scenario.log("After Click the close Botton listing disappear successfully");
						}
						Thread.sleep(3000);
						ac.scrollToElement(e).perform();
						ac.moveToElement(e).click().perform();
						Thread.sleep(3000);
						dp.getGotolistButton().click();
						Thread.sleep(10000);
						takeScreenshot(screenshotpath, "deljit_graph_listing_Details");
						boolean displayed3 = dp.getPosearch().isDisplayed();
						if (displayed3==true) {
						scenario.log("After Click the Go to List Button, It navigates to DelJit Listing page Successfully");
								
							}
							driver.navigate().back();
							Thread.sleep(8000);
							break;
						}
					}

			} catch (Exception e) {

				scenario.log("DelJit Graph Data not Available");

			}

		} else {
			scenario.log("DelJit graph is Not Applicale for: "+string+" Client");

		}
		
	}
}
