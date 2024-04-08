@Validate_Purchase_order_MasuBrakes
Feature: Purchase order Listing MasuBrakes
@Validate_Purchase_order_listing_page_MasuBrakes
Scenario Outline: To Validate Purchase order listing page
Given MasuBrakes Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MasuBrakes Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then MasuBrakes Validate After clicks Order list option, it navigates to Purchase Order list page.
And  MasuBrakes Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then MasuBrakes Validate From Date Filter and To Date Filter on Purchase Order list page.
And MasuBrakes Validate Status Filter on Purchase Order list page.
Then MasuBrakes Validate Receiver Filter on Purchase Order list page.
And MasuBrakes Validate PartnerOrg Filter on Purchase Order list page.
Then MasuBrakes Validate Partner Filter on Purchase Order list page.
Then MasuBrakes Validate Serach Text Box on Purchase Order list page.
Then MasuBrakes Validate the Select Action on Purchase Order list page. 
And MasuBrakes Validate Shows Entries on Purchase Order list page.
Then MasuBrakes Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And MasuBrakes Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Masu Brakes|Vikas|Vik@s1|


@Validate_Purchase_order_Detail_page_Rexel
Scenario Outline: To Validate Purchase order Detail page
Given MasuBrakes Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When MasuBrakes Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then MasuBrakes Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And MasuBrakes Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then MasuBrakes Validate History module on the purchase order details page.
And MasuBrakes Validate Plus button on the purchase order details page.
Then MasuBrakes Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And MasuBrakes Validate Search module on the purchase order details page.
And MasuBrakes Validate product details table on the purchase order details page.
And MasuBrakes purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Rexel|Abhijiet|  @bhijietM1|



