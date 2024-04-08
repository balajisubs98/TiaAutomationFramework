package pom.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class NotificationPOM extends BaseUtility {
	
public NotificationPOM() {
		
		PageFactory.initElements(driver, this);
		
	}
@FindBy(xpath="//span[contains(text(),' Dashboard')]") private WebElement dashboardLabel;
@FindBy(xpath="//div[@class='menu-icon OSInline']") private WebElement menuBtn;
@FindBy(xpath="//i[@class='icon fa fa-bell-o fa-2x']") private WebElement iconNotification;
@FindBy(xpath="//input[@id='Input_UsernameVal']") private WebElement usernmeTextbox;
@FindBy(xpath="//input[@id='Input_PasswordVal3']") private WebElement passwTextBox;
@FindBy(xpath="//button[@class='btn btn-primary OSFillParent']") private WebElement buttonLoginn;
@FindBy(xpath="//label[contains(text(),'Notification List')]") private WebElement notificalabel;
@FindBy(xpath="//i[@class='icon fa fa-close fa-1x']") private WebElement notifipopClose;
@FindBy(xpath="//span[contains(text(),'Search :')]") private WebElement search;
@FindBy(xpath="//span[contains(text(),'Doc Type')]")private WebElement docType;
@FindBy(xpath="//span[contains(text(),'Doc Date')]")private WebElement docDate;
@FindBy(xpath="//table[@class='table']")private WebElement notificTable;
@FindBy(xpath="(//input[@placeholder='Search...'])[2]")private WebElement statusfiltersearch;
public WebElement getStatusfiltersearch() {
	return statusfiltersearch;
}
public WebElement getNotificTable() {
	return notificTable;
}
public WebElement getFromdatefilter() {
	return fromdatefilter;
}
public WebElement getTodatefilter() {
	return todatefilter;
}
public WebElement getStatusfilter() {
	return statusfilter;
}
public WebElement getReceiverfilter() {
	return receiverfilter;
}
public WebElement getPartnerORgfilter() {
	return partnerORgfilter;
}
public WebElement getPartnerfilter() {
	return partnerfilter;
}
public WebElement getRegionFilter() {
	return regionFilter;
}
@FindBy(xpath="//span[contains(text(),'Message From Name')]")private WebElement msgfName;
@FindBy(xpath="//span[contains(text(),'Message To Name')]")private WebElement msgtName;
@FindBy(xpath="//input[@id='b4-b8-Input_searchKeyword']")private WebElement searchTextbox;
@FindBy(id="b7-b10-Input_searchKeyword")private WebElement notisearchBox;
@FindBy(id="b7-Reset")private WebElement notireset;
public WebElement getNotireset() {
	return notireset;
}
public WebElement getNotisearchBox() {
	return notisearchBox;
}
@FindBy(xpath="//table[@class='popup_table']")private WebElement popupTable;
@FindBy(xpath="(//*[name()='a']//*[name()='img'])[2]")private WebElement docDateFilter;
@FindBy(xpath="//button[@aria-label='go to next page']")private WebElement nextpageButton;
@FindBy(xpath="//button[@aria-label='go to previous page']")private WebElement prepageButton;
@FindBy(xpath="//button[@class='pagination-button']")private List<WebElement> pagenationButton;
@FindBy(xpath="//i[@class='icon fa fa-angle-double-right fa-2x']")private List<WebElement> rightHeadedArrow;
@FindBy(xpath="//span[contains(text(),'Notification Details')]")private WebElement notigicDetailslabel;
@FindBy(xpath="//span[contains(text(),'No Data Available')]")private WebElement nodataAvail;
@FindBy(xpath="//span[contains(text(),'Notification')]")private WebElement menuNoti;
@FindBy(xpath="//*[@id=\"b1-Title\"]/span")private WebElement Notificationslabel;
@FindBy(xpath="(//span[@class='OSFillParent'])[1]") private WebElement account;
@FindBy(id="b7-Input_FromDate") private WebElement fromdatefilter;
@FindBy(id="b7-Input_ToDate2") private WebElement todatefilter;
@FindBy(xpath="//div[@data-tooltip='Status Filter']") private WebElement statusfilter;
@FindBy(xpath="//div[@data-tooltip='Receiver Filter']") private WebElement receiverfilter;
@FindBy(xpath="//div[@data-tooltip='Partner Org Filter']") private WebElement partnerORgfilter;
@FindBy(xpath="//div[@data-tooltip='Partner Filter']") private WebElement partnerfilter;
@FindBy(xpath="//div[@data-tooltip='Region Filter']") private WebElement regionFilter;

public WebElement getAccount() {
	return account;
}
public WebElement getNotificationslabel() {
	return Notificationslabel;
}
public WebElement getMenuNoti() {
	return menuNoti;
}
public WebElement getNodataAvail() {
	return nodataAvail;
}
public WebElement getNotigicDetailslabel() {
	return notigicDetailslabel;
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
public WebElement getUsernmeTextbox() {
	return usernmeTextbox;
}
public WebElement getPasswTextBox() {
	return passwTextBox;
}
public WebElement getButtonLoginn() {
	return buttonLoginn;
}
public WebElement getNotificalabel() {
	return notificalabel;
}
public WebElement getNotifipopClose() {
	return notifipopClose;
}
public WebElement getSearch() {
	return search;
}
public WebElement getDocType() {
	return docType;
}
public WebElement getDocDate() {
	return docDate;
}
public WebElement getMsgfName() {
	return msgfName;
}
public WebElement getMsgtName() {
	return msgtName;
}
public WebElement getSearchTextbox() {
	return searchTextbox;
}
public WebElement getPopupTable() {
	return popupTable;
}
public WebElement getDocDateFilter() {
	return docDateFilter;
}
public WebElement getNextpageButton() {
	return nextpageButton;
}
public WebElement getPrepageButton() {
	return prepageButton;
}
public List<WebElement> getPagenationButton() {
	return pagenationButton;
}
public List<WebElement> getRightHeadedArrow() {
	return rightHeadedArrow;
}

}
