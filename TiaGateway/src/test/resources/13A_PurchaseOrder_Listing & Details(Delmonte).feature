@Validate_Purchase_order_Delmonte
Feature: Purchase order Listing Delmonte
@Validate_Purchase_order_listing_page_Delmonte
Scenario Outline: To Validate Purchase order listing page
Given Delmonte Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Delmonte Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Delmonte Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Delmonte Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Delmonte Validate From Date Filter and To Date Filter on Purchase Order list page.
And Delmonte Validate Status Filter on Purchase Order list page.
Then Delmonte Validate Receiver Filter on Purchase Order list page.
And Delmonte Validate PartnerOrg Filter on Purchase Order list page.
Then Delmonte Validate Partner Filter on Purchase Order list page.
Then Delmonte Validate Serach Text Box on Purchase Order list page.
Then Delmonte Validate the Select Action on Purchase Order list page. 
And Delmonte Validate Shows Entries on Purchase Order list page.
Then Delmonte Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Delmonte Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Delmonte|Shivender|Shivender@FF#1|


@Validate_Purchase_order_Detail_page_Delmonte
Scenario Outline: To Validate Purchase order Detail page
Given Delmonte Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Delmonte Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Delmonte Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Delmonte Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Delmonte Validate History module on the purchase order details page.
And Delmonte Validate Plus button on the purchase order details page.
Then Delmonte Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Delmonte Validate Search module on the purchase order details page.
And Delmonte Validate product details table on the purchase order details page.
And Delmonte purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Delmonte|Shivender|Shivender@FF#1|



