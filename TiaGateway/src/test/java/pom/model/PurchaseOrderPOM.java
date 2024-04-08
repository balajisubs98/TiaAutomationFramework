
package pom.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class PurchaseOrderPOM extends BaseUtility {
	
	public PurchaseOrderPOM() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//span[contains(text(),' Dashboard')]") private WebElement dashboardLabel;
	@FindBy(xpath="//div[@class='menu-icon OSInline']") private WebElement menuBtn;
	@FindBy(xpath="//input[@id='Input_UsernameVal']") private WebElement usernmeTextbox;
	@FindBy(xpath="//input[@id='Input_PasswordVal3']") private WebElement passwTextBox;
	@FindBy(xpath="//button[@class='btn btn-primary OSFillParent']") private WebElement buttonLoginn;
	@FindBy(xpath="//span[contains(text(),'Order to Cash')]") private WebElement otoC;
	@FindBy(xpath="//span[contains(text(),'Receive Orders')]") private WebElement recvOrder;
	@FindBy(xpath="//span[contains(text(),'Order List')]") private WebElement orderList;
	@FindBy(xpath="//span[contains(text(),'Purchase Order')]") private WebElement purchaseOrderLbl;
	@FindBy(xpath="(//span[contains(text(),'Purchase Order')])[2]") private WebElement purchaseOrderLblamar;
	@FindBy(xpath="//i[@class='icon fa fa-bell-o fa-2x']")private WebElement notibell;
	@FindBy(xpath="(//span[@class='OSFillParent'])[1]") private WebElement account;
	@FindBy(id="b8-Input_FromDate2") private WebElement fdatefilter;
	@FindBy(id="b8-Input_ToDate3") private WebElement todatefilter;
	@FindBy(xpath="//div[@data-tooltip='Status Filter']") private WebElement statusFilter;
	@FindBy(xpath="//div[@data-tooltip='Receiver Filter']") private WebElement recvFilter;
	@FindBy(xpath="//div[@data-tooltip='Partner Org Filter']")private WebElement partorgFilter;
	@FindBy(xpath="//div[@data-tooltip='Partner Filter']") private WebElement partnerFilter;
	public WebElement getPurchaseOrderLblamar() {
		return purchaseOrderLblamar;
	}


	@FindBy(xpath="//div[@data-tooltip='Region Filter']") private WebElement regionFilter;
	@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input") private WebElement statusFiltersearch;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input")private WebElement recvFiltersearch;
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input")private WebElement partorgFiltersearch;
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div/input") private WebElement partnerFiltersearch;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input") private WebElement regionFiltersearch;
	@FindBy(id="b8-actions2") private WebElement selectAction;
	@FindBy(xpath="//button[contains(text(),'Reset')]") private WebElement resetbtn;
	@FindBy(id="b8-b16-Input_searchKeyword") private WebElement posearchBox;
	@FindBy(xpath="//table[@class='table']") private WebElement potable;
	@FindBy(xpath="//span[contains(text(),'No Data Available')]")private WebElement nodataavai;
	@FindBy(xpath="//img[@src='/TIA/img/TIA.sort_high_to_low.png?0TVpEFQTv9p5lAIbwEwgLw']")private WebElement posort;
	@FindBy(xpath="(//img[@src='/TIA/img/TIA.sort_icon.png?_Ttgtm+gsHskmgIhDNkxpQ'])[1]")private WebElement poDatesort;
	@FindBy(xpath="(//img[@src='/TIA/img/TIA.sort_icon.png?_Ttgtm+gsHskmgIhDNkxpQ'])[2]")private WebElement ShipDatesort;
	@FindBy(xpath="(//img[@src='/TIA/img/TIA.sort_icon.png?_Ttgtm+gsHskmgIhDNkxpQ'])[3]")private WebElement statussort;
	@FindBy(xpath="//img[@src='/TIA/img/TIA.sort_low_to_high.png?z4XYmGWJnvgIOdQT5DXs9g']") private WebElement lowtohigh;
	@FindBy(xpath="//span[contains(text(),'Procure to Pay')]")private WebElement procuretopay;
	@FindBy(xpath="//span[contains(text(),'PO List')]")private WebElement polist;
	@FindBy(css="#b8-\\$b18 > div > div > div > a > img")private WebElement posortAR;

	@FindBy(css="#b8-\\$b19 > div > div > a > img")private WebElement podatesortAR;
	@FindBy(css="#b8-\\$b20 > div > div > a > img")private WebElement shipdatesortAR;
	@FindBy(css="#b8-\\$b21 > div > div > a > img")private WebElement statussortAR;
	@FindBy(xpath="//*[@id=\"b2-b12-Title\"]/span")private WebElement purchaseorders;
	
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input") private WebElement statusFiltersearchMV;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input")private WebElement recvFiltersearchMV;
	@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input")private WebElement partorgFiltersearchMV;
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input") private WebElement partnerFiltersearchMV;
	
	@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input") private WebElement statusFiltersearchBKT;
	@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input")private WebElement recvFiltersearchBKT;
	@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input")private WebElement partorgFiltersearchBKT;
	@FindBy(xpath="/html/body/div[6]/div/div/div[1]/div/input") private WebElement partnerFiltersearchBKT;
	@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input") private WebElement regionFiltersearchBKT;
	@FindBy(xpath="//span[contains(text(),'No Data Available')]")private WebElement nodatavailableBS;
	
	public WebElement getNodatavailableBS() {
		return nodatavailableBS;
	}
	public WebElement getStatusFiltersearchBKT() {
		return statusFiltersearchBKT;
	}
	public WebElement getRecvFiltersearchBKT() {
		return recvFiltersearchBKT;
	}
	public WebElement getPartorgFiltersearchBKT() {
		return partorgFiltersearchBKT;
	}
	public WebElement getPartnerFiltersearchBKT() {
		return partnerFiltersearchBKT;
	}
	public WebElement getRegionFiltersearchBKT() {
		return regionFiltersearchBKT;
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
	public WebElement getProcuretopay() {
		return procuretopay;
	}
	public WebElement getPosortAR() {
		return posortAR;
	}
	public WebElement getPodatesortAR() {
		return podatesortAR;
	}
	public WebElement getShipdatesortAR() {
		return shipdatesortAR;
	}
	public WebElement getStatussortAR() {
		return statussortAR;
	}
	public WebElement getPolist() {
		return polist;
	}
	public WebElement getPurchaseorders() {
		return purchaseorders;
	}
	public WebElement getLowtohigh() {
		return lowtohigh;
	}


	@FindBy(id="b8-b17-Dropdown1")private WebElement showEntries;
	public WebElement getShowEntries() {
		return showEntries;
	}
	public WebElement getPosort() {
		return posort;
	}
	public WebElement getPoDatesort() {
		return poDatesort;
	}
	public WebElement getShipDatesort() {
		return ShipDatesort;
	}
	public WebElement getStatussort() {
		return statussort;
	}
	public WebElement getNodataavai() {
		return nodataavai;
	}
	public WebElement getFdatefilter() {
		return fdatefilter;
	}
	public WebElement getTodatefilter() {
		return todatefilter;
	}
	public WebElement getStatusFilter() {
		return statusFilter;
	}
	public WebElement getRecvFilter() {
		return recvFilter;
	}
	public WebElement getPartorgFilter() {
		return partorgFilter;
	}
	public WebElement getPartnerFilter() {
		return partnerFilter;
	}
	public WebElement getRegionFilter() {
		return regionFilter;
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
	public WebElement getResetbtn() {
		return resetbtn;
	}
	public WebElement getPosearchBox() {
		return posearchBox;
	}
	public WebElement getPotable() {
		return potable;
	}
	public WebElement getAccount() {
		return account;
	}
	public WebElement getPurchaseOrderLbl() {
		return purchaseOrderLbl;
	}
	public WebElement getNotibell() {
		return notibell;
	}
	public WebElement getOtoC() {
		return otoC;
	}
	public WebElement getRecvOrder() {
		return recvOrder;
	}
	public WebElement getOrderList() {
		return orderList;
	}
	public WebElement getDashboardLabel() {
		return dashboardLabel;
	}
	public WebElement getMenuBtn() {
		return menuBtn;
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
	
	@FindBy(xpath="//div[@id='b6-$b2']//span[1]") private WebElement pONumberLabel;
	@FindBy(xpath="//span[normalize-space()='TG Transaction ID :']") private WebElement tGTransactionIDLabel;
	@FindBy(xpath="//span[normalize-space()='Order Date :']") private WebElement orderDateLabel;
	@FindBy(xpath="//span[normalize-space()='Delivery Date :']") private WebElement deliveryDateLabel;
	@FindBy(xpath="//span[normalize-space()='So Number :']") private WebElement soNumberLabel;
	@FindBy(xpath="//span[normalize-space()='Total Order Amount :']") private WebElement totalOrderAmountLabel;
	@FindBy(xpath="//span[normalize-space()='Total Order Quantity :']") private WebElement totalOrderQuantityLabel;
	@FindBy(xpath="//i[@class='icon fa fa-truck fa-2x']") private WebElement shipToLogo;
	@FindBy(xpath="//i[@class='icon fa fa-files-o fa-2x']") private WebElement billToLgo;
	@FindBy(xpath="//span[normalize-space()='Ship To']") private WebElement shipToLabel;
	@FindBy(xpath="//span[normalize-space()='Bill To']") private WebElement billToLabel;
	@FindBy(xpath="//i[@class='icon fa fa-history fa-2x']") private WebElement poHistory;
	@FindBy(xpath="//i[@class='icon fa fa-plus fa-2x']") private WebElement plusIcon;
	@FindBy(xpath="//span[normalize-space()='Ship Not Before :']") private WebElement shipNotBeforeLabel;
	@FindBy(xpath="//span[normalize-space()='Ship No Later Than :']") private WebElement shipNoLaterThanLabel;
	@FindBy(xpath="//span[normalize-space()='Must Arrive By :']") private WebElement mustArriveByLabel;
	@FindBy(xpath="//span[normalize-space()='Department :']") private WebElement departmentLabel;
	@FindBy(xpath="//span[normalize-space()='Allowance Total :']") private WebElement allowanceTotalLabel;
	@FindBy(xpath="//span[normalize-space()='Payment Terms :']") private WebElement paymentTermsLabel;
	@FindBy(xpath="//span[normalize-space()='Additional Info :']") private WebElement additionalInfoLabel;
	@FindBy(xpath="//i[@class='icon fa fa-minus fa-2x']") private WebElement minusIcon;
	@FindBy(xpath="//button[@id='b6-DownloadPDF']") private WebElement downloadPDFButton;
	@FindBy(xpath="//button[@id='b6-PrintPDF']") private WebElement printPDFButton;
	@FindBy(xpath="//button[@id='b6-DownloadCSV']") private WebElement downloadCSVButton;
	@FindBy(xpath="//span[normalize-space()='Purchase order changed history']") private WebElement purchaseOrderChangedHistoryLabel;
	@FindBy(xpath="//th[normalize-space()='Created On']") private WebElement createdOnLabel;
	@FindBy(xpath="//th[normalize-space()='PO Number']") private WebElement pOnumberhistoryLabel;
	@FindBy(xpath="//th[normalize-space()='Internal PO Number']") private WebElement internalPONumberLabel;
	@FindBy(xpath="//th[normalize-space()='Action Date']") private WebElement actionDateLabel;
	@FindBy(xpath="//th[normalize-space()='Status']") private WebElement statusLabel;

	@FindBy(xpath="//button[normalize-space()='Close']") private WebElement closeButton;
	@FindBy(xpath="//span[normalize-space()='Tangentia.com']") private WebElement tangentialink;
	@FindBy(xpath="//button[normalize-space()='Close']") private WebElement close;
	@FindBy(xpath="//input[@id='b6-b28-Input_searchKeyword']") private WebElement searchBoxLabel;
	@FindBy(xpath="//span[normalize-space()='Search :']") private WebElement search;
	@FindBy(xpath="(//span[normalize-space()='Purchase Order Details'])[1]") private WebElement purchaseOrderDetailslabel;
	@FindBy(css="div[id='b6-b2-Content'] span[class='ThemeGrid_MarginGutter']") private WebElement ponumberdata;
	@FindBy(xpath="//*[@id=\"b6-b13-Content\"]/a/i") private WebElement poHistoryButton;

public WebElement getPoHistoryButton() {
		return poHistoryButton;
	}


@FindBy(css="div[id='b6-b3-Content'] span[class='ThemeGrid_MarginGutter']") private WebElement Tgtransdata;
@FindBy(css="body > div.portal-class > div > div > div > div > table") private WebElement pohistorytable;
public WebElement getPohistorytable() {
	return pohistorytable;
}


@FindBy(css="div[id='b6-b4-Content'] span[class='ThemeGrid_MarginGutter']") private WebElement orderDatedata;
@FindBy(css="div[id='b6-b5-Content'] span[class='ThemeGrid_MarginGutter']") private WebElement delDatedata;
@FindBy(xpath="//span[contains(text(),'PO Status')]") private WebElement pOStatuslabel;
@FindBy(xpath="//span[normalize-space()='Promotional Event :']") private WebElement promotionalEvent;
public WebElement getItems() {
	return items;
}


@FindBy(xpath="//span[normalize-space()='Payment Terms :']") private WebElement paymentTerms;
@FindBy(xpath="//span[normalize-space()='Supplier Number :']") private WebElement supplierNumber;
@FindBy(xpath="//span[normalize-space()='Additional Info :']") private WebElement additionalInfo;
@FindBy(xpath="//i[@class='icon fa fa-minus fa-2x']") private WebElement minusButton;
@FindBy(xpath="//i[@class='icon fa fa-info fa-1x']") private WebElement toggleTooltip;
@FindBy(xpath="//label[@class='OSInline']") private WebElement TiAGatewaylabels;
@FindBy(xpath="//span[normalize-space()='Tangentia.com']") private WebElement tangentiacom;
@FindBy(xpath="//span[normalize-space()='Allowances:']") private WebElement allowances;
@FindBy(xpath="//table[@class='table table-allowance']") private WebElement allowancestable;
@FindBy(xpath="//table[@class='table']") private WebElement producttable;
@FindBy(xpath="//input[@id='b6-b28-Input_searchKeyword']") private WebElement productsearch;
@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/div/div/div/div/div/div[2]/div/div[1]/div/span[1]") private WebElement productsearchlabel;
@FindBy(xpath="//span[@id='b6-b29-showtext']") private WebElement showEntrieslabelone;
@FindBy(xpath="//select[@id='b6-b29-Dropdown1']") private WebElement ShowEntriesDropdown;
@FindBy(css="#b6-b28-Input_searchKeyword") private WebElement textboxsrch;
@FindBy(css="#b6-\\$b28 > span:nth-child(1)") private WebElement textboxsrchlbl;
public WebElement getTextboxsrch() {
	return textboxsrch;
}
public WebElement getTextboxsrchlbl() {
	return textboxsrchlbl;
}
public WebElement getSearchlblPD() {
	return searchlblPD;
}


@FindBy(xpath="//span[contains(text(),'Search :')]")private WebElement searchlblPD;

@FindBy(xpath="//div[@id='b6-$b37']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement qantityidle;
@FindBy(xpath="//div[@id='b6-$b38']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement itemcostidle;
@FindBy(xpath="//div[@id='b6-$b39']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement shipqanidle;
@FindBy(xpath="//div[@id='b6-$b40']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement priceidle;
@FindBy(xpath="//div[@id='b6-$b41']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement unackqanidle;

public WebElement getQantityidle() {
	return qantityidle;
}
public WebElement getItemcostidle() {
	return itemcostidle;
}
public WebElement getShipqanidle() {
	return shipqanidle;
}
public WebElement getPriceidle() {
	return priceidle;
}
public WebElement getUnackqanidle() {
	return unackqanidle;
}


@FindBy(xpath="//span[normalize-space()='items']") private WebElement items;
public WebElement getProductsearch() {
	return productsearch;
}
public WebElement getProductsearchlabel() {
	return productsearchlabel;
}
public WebElement getShowEntrieslabelone() {
	return showEntrieslabelone;
}
public WebElement getShowEntriesDropdown() {
	return ShowEntriesDropdown;
}
public WebElement getShowEntrieslabeltwo() {
	return showEntrieslabeltwo;
}


@FindBy(xpath="//span[@id='b6-b29-entriestext']") private WebElement showEntrieslabeltwo;
public WebElement getTiAGatewaylabels() {
	return TiAGatewaylabels;
}
public WebElement getProducttable() {
	return producttable;
}
public WebElement getAllowancesclose() {
	return allowancesclose;
}


@FindBy(xpath="//i[@class='icon fa fa-times fa-1x']") private WebElement allowancesclose;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement productsortlow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']") private WebElement productsorthigh;
@FindBy(xpath="//div[@id='b6-$b34']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement dessortIdle;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement dessortlow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement dessorthigh;
@FindBy(xpath="//div[@id='b6-$b37']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement quantitylow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement quantityhigh;
@FindBy(xpath="//div[@id='b6-$b38']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']") private WebElement itemcostlow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement itemcosthigh;
@FindBy(xpath="//div[@id='b6-$b39']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement shippedquantitylow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement shippedquantityhigh;
@FindBy(xpath="//div[@id='b6-$b40']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement pricelow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement pricehigh;
@FindBy(xpath="//div[@id='b6-$b41']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']") private WebElement unacknoweledgedquantitylow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement unacknoweledgedquantityghigh;

@FindBy(css="#b6-\\$b30 > div > div > a > img") private WebElement eansortBKT;
@FindBy(css="#b6-\\$b31 > div > div > a > img") private WebElement buyerpartnumsortBKT;
@FindBy(css="#b6-\\$b32 > div > div > a > img") private WebElement sellerpartnumsortBKT;
@FindBy(css="#b6-\\$b34 > div > div > a > img") private WebElement descriptionsortBKT;
@FindBy(css="#b6-\\$b35 > div > div > a > img") private WebElement reshipdatesortBKT;
@FindBy(css="#b6-\\$b37 > div > div > a > img") private WebElement QuantitysortBKT;
@FindBy(css="#b6-\\$b38 > div > div > a > img") private WebElement itemcostsortBKT;
@FindBy(css="#b6-\\$b39 > div > div > a > img") private WebElement shippedqtysortBKT;
@FindBy(css="#b6-\\$b40 > div > div > a > img") private WebElement pricesortBKT;
@FindBy(css="#b6-\\$b41 > div > div > a > img") private WebElement unackqtysortBKT;
@FindBy(xpath="//img[@src='/TIA/img/TIA.sort_low_to_high.png?z4XYmGWJnvgIOdQT5DXs9g']") private WebElement lastsortbkt;
@FindBy(xpath="//span[contains(text(),' items')]") private WebElement enditemsBS;

	public WebElement getEnditemsBS() {
	return enditemsBS;
	
}
	public WebElement getLastsortbkt() {
	return lastsortbkt;
}
	public WebElement getEansortBKT() {
	return eansortBKT;
}
public WebElement getBuyerpartnumsortBKT() {
	return buyerpartnumsortBKT;
}
public WebElement getSellerpartnumsortBKT() {
	return sellerpartnumsortBKT;
}
public WebElement getDescriptionsortBKT() {
	return descriptionsortBKT;
}
public WebElement getReshipdatesortBKT() {
	return reshipdatesortBKT;
}
public WebElement getQuantitysortBKT() {
	return QuantitysortBKT;
}
public WebElement getItemcostsortBKT() {
	return itemcostsortBKT;
}
public WebElement getShippedqtysortBKT() {
	return shippedqtysortBKT;
}
public WebElement getPricesortBKT() {
	return pricesortBKT;
}
public WebElement getUnackqtysortBKT() {
	return unackqtysortBKT;
}
	public WebElement getAllowancestable() {
	return allowancestable;
}
public void setAllowancestable(WebElement allowancestable) {
	this.allowancestable = allowancestable;
}
	public WebElement getAllowances() {
	return allowances;
}
	public WebElement getPromotionalEvent() {
	return promotionalEvent;
}
public WebElement getTiAGatewaylabel() {
		return TiAGatewaylabels;
	}
	public WebElement getTangentiacom() {
		return tangentiacom;
	}
public WebElement getPaymentTerms() {
	return paymentTerms;
}
public WebElement getSupplierNumber() {
	return supplierNumber;
}
public WebElement getAdditionalInfo() {
	return additionalInfo;
}
public WebElement getMinusButton() {
	return minusButton;
}
public WebElement getToggleTooltip() {
	return toggleTooltip;
}
	public WebElement getPurchaseOrderDetailslabel() {
		return purchaseOrderDetailslabel;
	}
	public WebElement getPonumberdata() {
		return ponumberdata;
	}
	public WebElement getTgtransdata() {
		return Tgtransdata;
	}
	public WebElement getOrderDatedata() {
		return orderDatedata;
	}
	public WebElement getDelDatedata() {
		return delDatedata;
	}
	public WebElement getpOStatuslabel() {
		return pOStatuslabel;
	}
	public WebElement getpONumberLabel() {
		return pONumberLabel;
	}
	public WebElement gettGTransactionIDLabel() {
		return tGTransactionIDLabel;
	}
	public WebElement getOrderDateLabel() {
		return orderDateLabel;
	}
	public WebElement getDeliveryDateLabel() {
		return deliveryDateLabel;
	}
	public WebElement getSoNumberLabel() {
		return soNumberLabel;
	}
	public WebElement getTotalOrderAmountLabel() {
		return totalOrderAmountLabel;
	}
	public WebElement getTotalOrderQuantityLabel() {
		return totalOrderQuantityLabel;
	}
	public WebElement getShipToLogo() {
		return shipToLogo;
	}
	public WebElement getBillToLgo() {
		return billToLgo;
	}
	public WebElement getShipToLabel() {
		return shipToLabel;
	}
	public WebElement getBillToLabel() {
		return billToLabel;
	}
	public WebElement getPoHistory() {
		return poHistory;
	}
	public WebElement getPlusIcon() {
		return plusIcon;
	}
	public WebElement getShipNotBeforeLabel() {
		return shipNotBeforeLabel;
	}
	public WebElement getShipNoLaterThanLabel() {
		return shipNoLaterThanLabel;
	}
	public WebElement getMustArriveByLabel() {
		return mustArriveByLabel;
	}
	public WebElement getDepartmentLabel() {
		return departmentLabel;
	}
	public WebElement getAllowanceTotalLabel() {
		return allowanceTotalLabel;
	}
	public WebElement getPaymentTermsLabel() {
		return paymentTermsLabel;
	}
	public WebElement getProductsortlow() {
		return productsortlow;
	}
	public WebElement getProductsorthigh() {
		return productsorthigh;
	}
	public WebElement getDessortIdle() {
		return dessortIdle;
	}
	public WebElement getDessortlow() {
		return dessortlow;
	}
	public WebElement getDessorthigh() {
		return dessorthigh;
	}
	public WebElement getQuantitylow() {
		return quantitylow;
	}
	public WebElement getQuantityhigh() {
		return quantityhigh;
	}
	public WebElement getItemcostlow() {
		return itemcostlow;
	}
	public WebElement getItemcosthigh() {
		return itemcosthigh;
	}
	public WebElement getShippedquantitylow() {
		return shippedquantitylow;
	}
	public WebElement getShippedquantityhigh() {
		return shippedquantityhigh;
	}
	public WebElement getPricelow() {
		return pricelow;
	}
	public WebElement getPricehigh() {
		return pricehigh;
	}
	public WebElement getUnacknoweledgedquantitylow() {
		return unacknoweledgedquantitylow;
	}
	public WebElement getUnacknoweledgedquantityghigh() {
		return unacknoweledgedquantityghigh;
	}
	public WebElement getAdditionalInfoLabel() {
		return additionalInfoLabel;
	}
	public WebElement getMinusIcon() {
		return minusIcon;
	}
	public WebElement getDownloadPDFButton() {
		return downloadPDFButton;
	}
	public WebElement getPrintPDFButton() {
		return printPDFButton;
	}
	public WebElement getDownloadCSVButton() {
		return downloadCSVButton;
	}
	public WebElement getPurchaseOrderChangedHistoryLabel() {
		return purchaseOrderChangedHistoryLabel;
	}
	public WebElement getCreatedOnLabel() {
		return createdOnLabel;
	}
	public WebElement getpOnumberhistoryLabel() {
		return pOnumberhistoryLabel;
	}
	public WebElement getInternalPONumberLabel() {
		return internalPONumberLabel;
	}
	public WebElement getActionDateLabel() {
		return actionDateLabel;
	}
	public WebElement getStatusLabel() {
		return statusLabel;
	}
	
	public WebElement getCloseButton() {
		return closeButton;
	}
	public WebElement getTangentialink() {
		return tangentialink;
	}
	public WebElement getClose() {
		return close;
	}
	public WebElement getSearchBoxLabel() {
		return searchBoxLabel;
	}
	public WebElement getSearch() {
		return search;
	}

	
}
