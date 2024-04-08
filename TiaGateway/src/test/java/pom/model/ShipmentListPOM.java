package pom.model;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class ShipmentListPOM extends BaseUtility {
	
	public ShipmentListPOM() {
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//span[normalize-space()='Packing and Shipments']") private WebElement packingAndShipmentsLabel;
@FindBy(xpath="//div[@id='b2-b8-Title']") private WebElement sendShipments;
@FindBy(xpath="//span[normalize-space()='Shipment List']") private WebElement shipmentList;
@FindBy(xpath="//span[normalize-space()='Delfor PO #5500068969']") private WebElement delforePO;
@FindBy(id="b5-actions2") private WebElement selectAction;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']") private WebElement asnDatelow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnDatehigh;
@FindBy(xpath="//div[@id='b5-$b15']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnnumlow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnnumhigh;
@FindBy(xpath="//div[@id='b5-$b17']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnstatuslow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnstatushigh;
@FindBy(id="b5-Input_FromDate2") private WebElement fdatefilter;
@FindBy(id="b5-Input_ToDate3") private WebElement todatefilter;
@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input") private WebElement statusFiltersearch;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input")private WebElement recvFiltersearch;
@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input")private WebElement partorgFiltersearch;
@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div/input") private WebElement partnerFiltersearch;
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input") private WebElement regionFiltersearch;
@FindBy(id="b5-b13-Input_searchKeyword") private WebElement posearchBox;
@FindBy(id="b5-b14-Dropdown1")private WebElement showEntries;


@FindBy(css="#b5-b1-Column1 > div > div > a > span") private WebElement pOordel;
@FindBy(xpath="//span[@id='b5-internalShippingNumber']") private WebElement tgTransno;
@FindBy(xpath="//span[@id='b5-ASNNumber']") private WebElement aSNno;
@FindBy(xpath="//span[@id='b5-ASNStatus']") private WebElement aSNStatus;
@FindBy(xpath="//span[@id='b5-ASNDate']") private WebElement aSNDate;
@FindBy(css="#b5-b3-svgcontainersvg > rect") private WebElement barcode;
@FindBy(xpath="//span[@id='b5-CreatedDate']") private WebElement createdDateLbl;
@FindBy(xpath="//select[@id='b5-TaskDropdown']") private WebElement selectTask;
@FindBy(css="#b5-ShipmentFields1 > div:nth-child(1) > span:nth-child(1)") private WebElement shipmentIdLbl;
@FindBy(css="#b5-ShipmentFields1 > div:nth-child(2) > span:nth-child(1)") private WebElement shipmentDateLbl;
@FindBy(xpath="//div[@id='b5-ShipmentFields1']//div[3]//span[1]") private WebElement deliveryDateLbl;
@FindBy(xpath="//div[@id='b5-ShipmentFields1']//div[4]//span[1]") private WebElement transportTypeLbl;
@FindBy(xpath="//span[normalize-space()='Autopack :']") private WebElement autopackLbl;
@FindBy(xpath="//span[normalize-space()='Ship From :']") private WebElement shipFromLbl;
@FindBy(xpath="//span[normalize-space()='Ship To :']") private WebElement shipToLbl;
@FindBy(xpath="//span[normalize-space()='Tracking No :']") private WebElement trackingNoLbl;
@FindBy(xpath="//span[normalize-space()='AWB No :']") private WebElement aWBNoLbl;
@FindBy(xpath="//button[normalize-space()='Download ASN']") private WebElement downloadASNButton;
@FindBy(xpath="//button[normalize-space()='Print ASN']") private WebElement printASNButton;
@FindBy(xpath="//table") private WebElement shipdetailstable;
@FindBy(xpath="//span[normalize-space()='Shipment Details']") private WebElement shipmentDetailsLbl;
@FindBy(css="#b2-b11-SubMenuHeader") private WebElement procuretopay;
@FindBy(xpath="//span[contains(text(),'Receive Shipments')]") private WebElement receiveShipmentsAR;
@FindBy(xpath="//span[contains(text(),'Shipment List')]") private WebElement shipmentsListAR;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input") private WebElement statusFiltersearchMV;
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input")private WebElement recvFiltersearchMV;
@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input")private WebElement partorgFiltersearchMV;
@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input") private WebElement partnerFiltersearchMV;
@FindBy(xpath="//span[@data-testid='Pagination.RecordNumberTo']") private WebElement recordcount;
@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input") private WebElement statusFiltersearchTex;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input")private WebElement recvFiltersearchTex;
@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input")private WebElement partorgFiltersearchTex;
@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div/input") private WebElement partnerFiltersearchTex;
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input") private WebElement regionFiltersearchTex;
@FindBy(xpath="//button[@class='pagination-button']") private List<WebElement> pagenation;




public List<WebElement> getPagenation() {
	return pagenation;
}
public WebElement getStatusFiltersearchTex() {
	return statusFiltersearchTex;
}
public WebElement getRecvFiltersearchTex() {
	return recvFiltersearchTex;
}
public WebElement getPartorgFiltersearchTex() {
	return partorgFiltersearchTex;
}
public WebElement getPartnerFiltersearchTex() {
	return partnerFiltersearchTex;
}
public WebElement getRegionFiltersearchTex() {
	return regionFiltersearchTex;
}
public WebElement getRecordcount() {
	return recordcount;
}
public WebElement getProcuretopay() {
	return procuretopay;
}
public WebElement getReceiveShipmentsAR() {
	return receiveShipmentsAR;
}
public WebElement getStatusFiltersearchMV() {
	return statusFiltersearchMV;
}
public WebElement getRecvFiltersearchMV() {
	return recvFiltersearchMV;
}
public WebElement getPartorgFiltersearchMV() {
	return partorgFiltersearchMV;
}
public WebElement getPartnerFiltersearchMV() {
	return partnerFiltersearchMV;
}
public WebElement getShipmentsListAR() {
	return shipmentsListAR;
}
public WebElement getpOordel() {
	return pOordel;
}
public WebElement getTgTransno() {
	return tgTransno;
}
public WebElement getaSNno() {
	return aSNno;
}
public WebElement getaSNStatus() {
	return aSNStatus;
}
public WebElement getaSNDate() {
	return aSNDate;
}
public WebElement getBarcode() {
	return barcode;
}
public WebElement getCreatedDateLbl() {
	return createdDateLbl;
}
public WebElement getSelectTask() {
	return selectTask;
}
public WebElement getShipmentIdLbl() {
	return shipmentIdLbl;
}
public WebElement getShipmentDateLbl() {
	return shipmentDateLbl;
}
public WebElement getDeliveryDateLbl() {
	return deliveryDateLbl;
}
public WebElement getTransportTypeLbl() {
	return transportTypeLbl;
}
public WebElement getAutopackLbl() {
	return autopackLbl;
}
public WebElement getShipFromLbl() {
	return shipFromLbl;
}
public WebElement getShipToLbl() {
	return shipToLbl;
}
public WebElement getTrackingNoLbl() {
	return trackingNoLbl;
}
public WebElement getaWBNoLbl() {
	return aWBNoLbl;
}
public WebElement getDownloadASNButton() {
	return downloadASNButton;
}
public WebElement getPrintASNButton() {
	return printASNButton;
}
public WebElement getShipdetailstable() {
	return shipdetailstable;
}
public WebElement getShipmentDetailsLbl() {
	return shipmentDetailsLbl;
}
public WebElement getShowEntries() {
	return showEntries;
}
public WebElement getPosearchBox() {
	return posearchBox;
}
public WebElement getStatusFiltersearch() {
	return statusFiltersearch;
}
public WebElement getRecvFiltersearch() {
	return recvFiltersearch;
}
public WebElement getPartorgFiltersearch() {
	return partorgFiltersearch;
}
public WebElement getPartnerFiltersearch() {
	return partnerFiltersearch;
}
public WebElement getRegionFiltersearch() {
	return regionFiltersearch;
}
public WebElement getSelectAction() {
	return selectAction;
}
public WebElement getAsnDatelow() {
	return asnDatelow;
}
public WebElement getAsnDatehigh() {
	return asnDatehigh;
}
public WebElement getAsnnumlow() {
	return asnnumlow;
}
public WebElement getAsnnumhigh() {
	return asnnumhigh;
}
public WebElement getAsnstatuslow() {
	return asnstatuslow;
}
public WebElement getAsnstatushigh() {
	return asnstatushigh;
}
public WebElement getFdatefilter() {
	return fdatefilter;
}
public WebElement getTodatefilter() {
	return todatefilter;
}
public WebElement getPackingAndShipmentsLabel() {
	return packingAndShipmentsLabel;
}
public WebElement getSendShipments() {
	return sendShipments;
}
public WebElement getShipmentList() {
	return shipmentList;
}
public WebElement getDelforePO() {
	return delforePO;
}
	



}
