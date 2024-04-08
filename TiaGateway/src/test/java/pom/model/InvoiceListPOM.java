package pom.model;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import program.utility.BaseUtility;

public class InvoiceListPOM extends BaseUtility {
	public InvoiceListPOM() {
		PageFactory.initElements(driver, this);
	}


@FindBy(xpath="//span[normalize-space()='Invoices']") private WebElement invoicesLabel;
@FindBy(xpath="//span[contains(text(),'Send Invoices')]") private WebElement sendInvoices;
@FindBy(xpath="//span[contains(text(),'Invoice List')]") private WebElement invoiceList;
@FindBy(xpath="//span[normalize-space()='Delfor PO #5500068969']") private WebElement delforePO;
@FindBy(id="b6-actions2") private WebElement selectAction;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']") private WebElement asnDatelow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnDatehigh;
@FindBy(xpath="//div[@id='b5-$b15']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnnumlow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnnumhigh;
@FindBy(xpath="//div[@id='b5-$b17']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnstatuslow;
@FindBy(xpath="//div[@class='OSInline']//div[@class='OSInline']//div[@class='OSInline']//a[@href='#']//img") private WebElement asnstatushigh;
@FindBy(id="b6-Input_FromDate3") private WebElement fdatefilter;
@FindBy(id="b6-Input_ToDate3") private WebElement todatefilter;
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input") private WebElement statusFiltersearch;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input")private WebElement recvFiltersearch;
@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input")private WebElement partorgFiltersearch;
@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input") private WebElement partnerFiltersearch;

@FindBy(xpath="/html/body/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div/div[3]/div/div/div/div/div") private WebElement statusfilter;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div/div[4]/div/div/div/div/div/div[1]") private WebElement receiverfilter;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div/div[5]/div/div/div/div/div/div[1]") private WebElement partnerOrgFilter;
@FindBy(xpath="/html/body/div[1]/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div/div[1]/div/div/div[6]/div/div/div/div/div/div[1]") private WebElement partnerFilter;

@FindBy(xpath="//span[normalize-space()='Invoice Details']") private WebElement invoiceDetailsLbl;
@FindBy(xpath="//div[@id='b9-$b1']//span[1]") private WebElement invoiceNumberLbl;
@FindBy(xpath="//span[normalize-space()='Invoice Date :']") private WebElement invoiceDateLbl;
@FindBy(xpath="//span[normalize-space()='Delivery Date :']") private WebElement deliveryDateLbl;
@FindBy(xpath="//span[normalize-space()='TG Transaction  ID :']") private WebElement tGTransactionIDLbl;
@FindBy(xpath="//span[normalize-space()='Created Date :']") private WebElement createdDateLbl;
@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[2]/div[6]/span") private WebElement invoiceStatus;
@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[2]/div[6]/span") private WebElement invoiceStatusAR;

public WebElement getInvoiceStatusAR() {
	return invoiceStatusAR;
}


@FindBy(xpath="//i[@class='icon fa fa-info fa-1x']") private WebElement allowancepopup;
@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[3]/div/div/span[1]") private WebElement allowanceTotalLbl;
@FindBy(css="#b9-b6-Content > span.ThemeGrid_MarginGutter") private WebElement allowanceTotalLblAR;
@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[1]/a/span") private WebElement ponumberlinkAR;
@FindBy(xpath="/html/body/div/div/div/div/div/div[1]/div/div/div/div/div/div[1]/div[1]/div/a/span") private WebElement asnnumberlinkAR;
public WebElement getPonumberlinkAR() {
	return ponumberlinkAR;
}
public WebElement getAsnnumberlinkAR() {
	return asnnumberlinkAR;
}
public WebElement getAllowanceTotalLblAR() {
	return allowanceTotalLblAR;
}


@FindBy(xpath="//span[@class='ThemeGrid_Margin1']") private WebElement paymentTermsLbl;
@FindBy(xpath="//button[normalize-space()='Print Invoice']") private WebElement printInvoiceButton;
@FindBy(xpath="//button[normalize-space()='Download Invoice']") private WebElement downloadInvoiceButton;
@FindBy(xpath="//span[normalize-space()='SubTotal Amount (In Words) :']") private WebElement subTotalAmountInWordsLbl;
@FindBy(xpath="//span[normalize-space()='Total Tax Amount (In Words) :']") private WebElement totalTaxAmountInWordsLbl;
@FindBy(xpath="//span[normalize-space()='Amount Chargeable (In Words) :']") private WebElement amountChargeableInWordsLbl;
@FindBy(xpath="//span[normalize-space()='Declaration']") private WebElement declarationLbl;
@FindBy(xpath="//span[contains(text(),'We Declare To The Best Of Our Knowledge And Belief')]") private WebElement weDeclareLbl;

@FindBy(xpath="//span[normalize-space()='Allowances:']") private WebElement allowancesLbl;
@FindBy(xpath="//i[@class='icon fa fa-times fa-1x']") private WebElement allowancepopclose;
@FindBy(xpath="//label[normalize-space()='© TiA Gateway. -']") private WebElement TiAGatewayLbl;
@FindBy(xpath="//span[normalize-space()='Tangentia.com']") private WebElement tangentialink;
@FindBy(css="#b6-\\$b15 > div > div > div > a > img") private WebElement invoicedatesort;

@FindBy(css="#b6-\\$b16 > div > div > a > img") private WebElement invoicestatussort;
@FindBy(css="#b6-\\$b18 > div > div > a > img") private WebElement invoicetotalsort;
@FindBy(css="#b6-\\$b17 > div > div > a > img") private WebElement invoicetaxsort;

@FindBy(xpath="//span[normalize-space()='Total']") private WebElement totallbl;
@FindBy(xpath="//span[normalize-space()='Total Tax Amount:']") private WebElement totalTaxAmountlbl;
@FindBy(xpath="//span[normalize-space()='Taxable Amount:']") private WebElement taxableAmountlbl;
@FindBy(xpath="//span[normalize-space()='Other Charges:']") private WebElement otherChargeslbl;
@FindBy(xpath="//span[normalize-space()='Round Off:']") private WebElement roundOfflbl;
@FindBy(xpath="//span[normalize-space()='Grand Total:']") private WebElement grandTotallbl;
@FindBy(css="#b2-b11-SubMenuHeader") private WebElement procuretopayAR;
@FindBy(xpath="//span[contains(text(),'Receive Invoices')]") private WebElement receiveInvoiceAR;
@FindBy(xpath="//span[contains(text(),'Invoice List')]") private WebElement InvoicelistAR;
//@FindBy(css="#b2-b11-SubMenuHeader") private WebElement procuretopay;
@FindBy(xpath="/html/body/div[3]/div/div/div[1]/div/input") private WebElement statusFiltersearchzep;
@FindBy(xpath="/html/body/div[2]/div/div/div[1]/div/input") private WebElement receiverFiltersearchzep;
@FindBy(xpath="/html/body/div[4]/div/div/div[1]/div/input") private WebElement partnerOrgFiltersearchzep;
@FindBy(xpath="/html/body/div[5]/div/div/div[1]/div/input") private WebElement partnerFiltersearchzep;
@FindBy(xpath="//span[@data-testid='Pagination.RecordNumberTo']") private WebElement recordcount;




public WebElement getRecordcount() {
	return recordcount;
}
public WebElement getStatusFiltersearchzep() {
	return statusFiltersearchzep;
}
public WebElement getReceiverFiltersearchzep() {
	return receiverFiltersearchzep;
}
public WebElement getPartnerOrgFiltersearchzep() {
	return partnerOrgFiltersearchzep;
}
public WebElement getPartnerFiltersearchzep() {
	return partnerFiltersearchzep;
}
public WebElement getProcuretopayAR() {
	return procuretopayAR;
}
public WebElement getReceiveInvoiceAR() {
	return receiveInvoiceAR;
}
public WebElement getInvoicelistAR() {
	return InvoicelistAR;
}
public WebElement getInvoicedatesort() {
	return invoicedatesort;
}
public WebElement getInvoicestatussort() {
	return invoicestatussort;
}
public WebElement getInvoicetotalsort() {
	return invoicetotalsort;
}
public WebElement getInvoicetaxsort() {
	return invoicetaxsort;
}
public WebElement getTotallbl() {
	return totallbl;
}
public WebElement getTotalTaxAmountlbl() {
	return totalTaxAmountlbl;
}
public WebElement getTaxableAmountlbl() {
	return taxableAmountlbl;
}
public WebElement getOtherChargeslbl() {
	return otherChargeslbl;
}
public WebElement getRoundOfflbl() {
	return roundOfflbl;
}
public WebElement getGrandTotallbl() {
	return grandTotallbl;
}
public WebElement getAllowancesLbl() {
	return allowancesLbl;
}
public WebElement getAllowancepopclose() {
	return allowancepopclose;
}
public WebElement getTiAGatewayLbl() {
	return TiAGatewayLbl;
}
public WebElement getTangentialink() {
	return tangentialink;
}
public WebElement getInvoiceDetailsLbl() {
	return invoiceDetailsLbl;
}
public WebElement getInvoiceNumberLbl() {
	return invoiceNumberLbl;
}
public WebElement getInvoiceDateLbl() {
	return invoiceDateLbl;
}
public WebElement getDeliveryDateLbl() {
	return deliveryDateLbl;
}
public WebElement gettGTransactionIDLbl() {
	return tGTransactionIDLbl;
}
public WebElement getCreatedDateLbl() {
	return createdDateLbl;
}
public WebElement getInvoiceStatus() {
	return invoiceStatus;
}
public WebElement getAllowancepopup() {
	return allowancepopup;
}
public WebElement getAllowanceTotalLbl() {
	return allowanceTotalLbl;
}
public WebElement getPaymentTermsLbl() {
	return paymentTermsLbl;
}
public WebElement getPrintInvoiceButton() {
	return printInvoiceButton;
}
public WebElement getDownloadInvoiceButton() {
	return downloadInvoiceButton;
}
public WebElement getSubTotalAmountInWordsLbl() {
	return subTotalAmountInWordsLbl;
}
public WebElement getTotalTaxAmountInWordsLbl() {
	return totalTaxAmountInWordsLbl;
}
public WebElement getAmountChargeableInWordsLbl() {
	return amountChargeableInWordsLbl;
}
public WebElement getDeclarationLbl() {
	return declarationLbl;
}
public WebElement getWeDeclareLbl() {
	return weDeclareLbl;
}
public WebElement getStatusfilter() {
	return statusfilter;
}
public WebElement getReceiverfilter() {
	return receiverfilter;
}
public WebElement getPartnerOrgFilter() {
	return partnerOrgFilter;
}
public WebElement getPartnerFilter() {
	return partnerFilter;
}


@FindBy(id="b6-b13-Input_searchKeyword") private WebElement posearchBox;
@FindBy(id="b6-b14-Dropdown1")private WebElement showEntries;
public WebElement getInvoicesLabel() {
	return invoicesLabel;
}
public WebElement getSendInvoices() {
	return sendInvoices;
}
public WebElement getInvoiceList() {
	return invoiceList;
}
public WebElement getDelforePO() {
	return delforePO;
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
public WebElement getPosearchBox() {
	return posearchBox;
}
public WebElement getShowEntries() {
	return showEntries;
}

}
