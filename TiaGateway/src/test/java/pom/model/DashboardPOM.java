package pom.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class DashboardPOM extends BaseUtility {
	
	public DashboardPOM() {
		
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(xpath="//span[contains(text(),' Dashboard')]") private WebElement dashboardLabel;
	@FindBy(xpath="//div[@class='menu-icon OSInline']") private WebElement menuBtn;
	@FindBy(xpath="//i[@class='icon fa fa-bell-o fa-2x']") private WebElement iconNotification;
	@FindBy(xpath="//*[@id=\"b4-b1-Content\"]/div/div/img") private WebElement userlogo;
	@FindBy(xpath="(//span[@class='OSFillParent'])[1]") private WebElement accountLink;
	@FindBy(xpath="//select[@id='Dropdown5']") private WebElement rawedifilter;
	@FindBy(xpath="//div[contains(text(),'Partner Filter')]") private WebElement partnerFilter;
	@FindBy(xpath="//div[contains(text(),'Region Filter')] ") private WebElement regionFilter;
	@FindBy(xpath="//select[@id='Dropdown7']") private WebElement monthfilter;
	@FindBy(xpath="//select[@id='Dropdown8']") private WebElement selectActiondropdown;
	@FindBy(xpath="//span[contains(text(),'Reset')]") private WebElement reset;
	@FindBy(xpath="//span[contains(text(),'Onboarded Partners')]") private WebElement onboardPartnerLbl;
	@FindBy(xpath="(//*[name()='div']//*[name()='button' and @class='btn btn-primary'])[1]") private WebElement gotolistButton;
	@FindBy(xpath="//select[@id='Dropdown6']") private WebElement inboundOutboundfilter;
	@FindBy(xpath="//button[contains(text(),'Go To Listing')]")private WebElement gotolist;
	public WebElement getGotolist() {
		return gotolist;
	}
	public WebElement getRawedifilter() {
		return rawedifilter;
	}
	public WebElement getMonthfilter() {
		return monthfilter;
	}
	public WebElement getSelectActiondropdown() {
		return selectActiondropdown;
	}
	public WebElement getInboundOutboundfilter() {
		return inboundOutboundfilter;
	}

	@FindBy(xpath="(//*[name()='div']//*[name()='button' and @class='btn btn-primary'])[2]") private WebElement closeButton;
	@FindBy(xpath="//table[@class='table']") private WebElement table;
	@FindBy(xpath="(//*[@class='highcharts-container '])[6]//*[name()='svg']//*[name()='g' and @class='highcharts-markers highcharts-series-0 highcharts-area-series highcharts-tracker']//*[name()='path']") private List<WebElement> purchaseorderGraph;
	@FindBy(xpath="(//*[name()='div' and @class='highcharts-container '])[7]//*[name()='svg']//*[name()='g' and @class='highcharts-series highcharts-series-0 highcharts-pie-series highcharts-tracker']//*[name()='path']") private List<WebElement> invoiceGraph;
	@FindBy(xpath="(//*[name()='div' and @class='highcharts-container '])[8]//*[name()='svg']//*[name()='g' and @class='highcharts-markers highcharts-series-0 highcharts-area-series highcharts-tracker']//*[name()='path' and @class='highcharts-point']") private List<WebElement> shipmentsGraph;
	@FindBy(xpath="(//*[name()='div' and @class='highcharts-container '])[9]//*[name()='svg']//*[name()='g' and @class='highcharts-series highcharts-series-0 highcharts-pie-series highcharts-tracker']//*[name()='path']") private List<WebElement> delforeGraph;
	@FindBy(xpath="(//*[name()='div' and @class='highcharts-container '])[10]//*[name()='svg']//*[name()='g' and @class='highcharts-markers highcharts-series-0 highcharts-area-series highcharts-tracker']//*[name()='path']") private List<WebElement> jitGraph;
	@FindBy(css="#highcharts-0b44sct-1237 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text") private List<WebElement> purchaseorderGraphMonths;
	@FindBy(css="#highcharts-0b44sct-1254 > div.highcharts-a11y-proxy-container-after > div.highcharts-a11y-proxy-group.highcharts-a11y-proxy-group-legend > ul > li > button") private List<WebElement> invoiceGraphMonths;
	@FindBy(css="#highcharts-0b44sct-1269 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text") private List<WebElement> shipmentsGraphMonths;
	@FindBy(css="#highcharts-0b44sct-1286 > div.highcharts-a11y-proxy-container-after > div.highcharts-a11y-proxy-group.highcharts-a11y-proxy-group-legend > ul > li > button") private List<WebElement> delforeGraphMonths;
	@FindBy(css="#highcharts-0b44sct-1301 > svg > g.highcharts-axis-labels.highcharts-xaxis-labels > text") private List<WebElement> jitGraphMonths;
	@FindBy(xpath="//span[@data-testid='Pagination.RecordsNumber']") private WebElement countItems;
	@FindBy(xpath="//*[@id=\"b28-PaginationList\"]/button") private List <WebElement> listingpages;
	@FindBy(xpath="//*[@id=\"b28-PaginationContainer\"]/div/button") private WebElement listingcurrentpage;
	@FindBy(xpath="//button[@aria-label='go to next page']") private WebElement nextPage;
	@FindBy(xpath="//button[@aria-label='go to previous page']") private WebElement previousPageButton;
	@FindBy(xpath="//img[@src='/TIA/img/TIA.o2cLogo.png?FcatOaUWoeJvJqmWWx_wbQ']") private WebElement tiaLogo;
	@FindBy(xpath="//i[@class='icon fa fa-pie-chart fa-2x']") private WebElement dashboadPieMenu;
	@FindBy(xpath="//i[@class='icon fa fa-envelope fa-2x']") private WebElement envelopeicon;
	@FindBy(xpath="//i[@class='icon fa fa-arrow-left fa-2x']") private WebElement menuBack;
	@FindBy(xpath="//input[@id='Input_UsernameVal']") private WebElement usernmeTextbox;
	@FindBy(xpath="//input[@id='Input_PasswordVal3']") private WebElement passwTextBox;
	@FindBy(xpath="//button[@class='btn btn-primary OSFillParent']") private WebElement buttonLoginn;
	@FindBy(xpath="//i[@class='icon fa fa-suitcase fa-2x']") private WebElement ordertoCashSuitMenu;
	@FindBy(xpath="//i[@class='icon fa fa-line-chart fa-2x']") private WebElement trafficReportMenu;
	@FindBy(xpath="//i[@class='icon fa fa-bell fa-2x']") private WebElement notificationbellMenu;
	@FindBy(xpath="//i[@class='icon fa fa-question-circle fa-2x']") private WebElement helpAndFaqQuestMenu;
	@FindBy(xpath="//i[@class='icon fa fa-sticky-note fa-2x']") private WebElement releaseNoteStickyMenu;
	@FindBy(xpath="//span[contains(text(),'Logout')]") private WebElement logOutbutton;
	@FindBy(css="#Vendorsrecord > div.ThemeGrid_Width9.ThemeGrid_MarginGutter > span") private WebElement onboardPartnerCount;
	@FindBy(xpath="//label[contains(text(),'Notification List')]") private WebElement notificalabel;
	@FindBy(xpath="//i[@class='icon fa fa-close fa-1x']") private WebElement notifipopClose;
	@FindBy(xpath="//span[contains(text(),'TiA Release Notes')]") private WebElement releasenoteLbl;
	@FindBy(css="#PO2 > div:nth-child(1) > span") private WebElement Pograph;
	@FindBy(css="#Invoice2 > div:nth-child(1) > span") private WebElement Invgraph;
	@FindBy(css="#Shipment2 > div:nth-child(1) > span") private WebElement shipgraph;
	@FindBy(css="#Delfor2 > div:nth-child(1) > span") private WebElement delfgraph;
	@FindBy(css="#Deljit2 > div:nth-child(1) > span") private WebElement deljitgraph;
	@FindBy(xpath="//span[contains(text(),'Search :')]") private WebElement posearch;
	
	
	
	
	public WebElement getPosearch() {
		return posearch;
	}
	public WebElement getPograph() {
		return Pograph;
	}
	public WebElement getInvgraph() {
		return Invgraph;
	}
	public WebElement getReleasenoteLbl() {
		return releasenoteLbl;
	}
	public WebElement getShipgraph() {
		return shipgraph;
	}
	public WebElement getDelfgraph() {
		return delfgraph;
	}
	public WebElement getDeljitgraph() {
		return deljitgraph;
	}
	public WebElement getNotificalabel() {
		return notificalabel;
	}
	public WebElement getNotifipopClose() {
		return notifipopClose;
	}
	public WebElement getMenuBack() {
		return menuBack;
	}
	public List<WebElement> getPurchaseorderGraphMonths() {
		return purchaseorderGraphMonths;
	}
	public List<WebElement> getInvoiceGraphMonths() {
		return invoiceGraphMonths;
	}
	public List<WebElement> getShipmentsGraphMonths() {
		return shipmentsGraphMonths;
	}
	public List<WebElement> getDelforeGraphMonths() {
		return delforeGraphMonths;
	}
	public List<WebElement> getJitGraphMonths() {
		return jitGraphMonths;
	}
	public WebElement getEnvelopeicon() {
		return envelopeicon;
	}
	public WebElement getDashboardLabel() {
		return dashboardLabel;
	}
	public WebElement getMenuBtn() {
		return menuBtn;
	}
	public WebElement getIconNotification() {
		return iconNotification;
	}
	public WebElement getUserlogo() {
		return userlogo;
	}
	public WebElement getAccountLink() {
		return accountLink;
	}
	
	public WebElement getPartnerFilter() {
		return partnerFilter;
	}
	public WebElement getRegionFilter() {
		return regionFilter;
	}
	
	public WebElement getReset() {
		return reset;
	}
	public WebElement getOnboardPartnerLbl() {
		return onboardPartnerLbl;
	}
	public WebElement getGotolistButton() {
		return gotolistButton;
	}
	public WebElement getCloseButton() {
		return closeButton;
	}
	public WebElement getTable() {
		return table;
	}
	public List<WebElement> getPurchaseorderGraph() {
		return purchaseorderGraph;
	}
	public List<WebElement> getInvoiceGraph() {
		return invoiceGraph;
	}
	public List<WebElement> getShipmentsGraph() {
		return shipmentsGraph;
	}
	public List<WebElement> getDelforeGraph() {
		return delforeGraph;
	}
	public List<WebElement> getJitGraph() {
		return jitGraph;
	}
	public WebElement getCountItems() {
		return countItems;
	}
	public List<WebElement> getListingpages() {
		return listingpages;
	}
	public WebElement getListingcurrentpage() {
		return listingcurrentpage;
	}
	public WebElement getNextPage() {
		return nextPage;
	}
	public WebElement getPreviousPageButton() {
		return previousPageButton;
	}
	public WebElement getTiaLogo() {
		return tiaLogo;
	}
	public WebElement getDashboadPieMenu() {
		return dashboadPieMenu;
	}
	public WebElement getOrdertoCashSuitMenu() {
		return ordertoCashSuitMenu;
	}
	public WebElement getTrafficReportMenu() {
		return trafficReportMenu;
	}
	public WebElement getNotificationbellMenu() {
		return notificationbellMenu;
	}
	public WebElement getHelpAndFaqQuestMenu() {
		return helpAndFaqQuestMenu;
	}
	public WebElement getReleaseNoteStickyMenu() {
		return releaseNoteStickyMenu;
	}
	public WebElement getLogOutbutton() {
		return logOutbutton;
	}
	public WebElement getOnboardPartnerCount() {
		return onboardPartnerCount;
	}

	public WebElement getUsernmeTextbox() {
		return usernmeTextbox;
	}
	public WebElement getPasswTextBox() {
		return passwTextBox;
	}
	public WebElement getButtonLoginn() {
		return buttonLoginn;
	}

	
}
