@Validate_Purchase_order_Indica
Feature: Purchase order Listing Indica
@Validate_Purchase_order_listing_page_Indica
Scenario Outline: To Validate Purchase order listing page
Given Indica Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Indica Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Indica Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Indica Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Indica Validate From Date Filter and To Date Filter on Purchase Order list page.
And Indica Validate Status Filter on Purchase Order list page.
Then Indica Validate Receiver Filter on Purchase Order list page.
And Indica Validate PartnerOrg Filter on Purchase Order list page.
Then Indica Validate Partner Filter on Purchase Order list page.
Then Indica Validate Serach Text Box on Purchase Order list page.
Then Indica Validate the Select Action on Purchase Order list page. 
And Indica Validate Shows Entries on Purchase Order list page.
Then Indica Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Indica Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|


@Validate_Purchase_order_Detail_page_Indica
Scenario Outline: To Validate Purchase order Detail page
Given Indica Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Indica Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Indica Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Indica Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Indica Validate History module on the purchase order details page.
And Indica Validate Plus button on the purchase order details page.
Then Indica Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Indica Validate Search module on the purchase order details page.
And Indica Validate product details table on the purchase order details page.
And Indica purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|



