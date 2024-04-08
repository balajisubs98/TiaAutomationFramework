@Multivista
@Multivista_Purchase_order
Feature: Purchase order Listing Multivista
@Multivista_Purchase_Order_Listing_Page
Scenario Outline: To Validate Purchase order listing page
Given Multivista Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Multivista Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Multivista Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Multivista Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Multivista Validate From Date Filter and To Date Filter on Purchase Order list page.
And Multivista Validate Status Filter on Purchase Order list page.
Then Multivista Validate Receiver Filter on Purchase Order list page.
And Multivista Validate PartnerOrg Filter on Purchase Order list page.
Then Multivista Validate Partner Filter on Purchase Order list page.
Then Multivista Validate Serach Text Box on Purchase Order list page.
Then Multivista Validate the Select Action on Purchase Order list page. 
And Multivista Validate Shows Entries on Purchase Order list page.
Then Multivista Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Multivista Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Multivisa|Nirmala|Nirmala@PG1|


@Multivista_Purchase_Order_Detail_Page
Scenario Outline: To Validate Purchase order Detail page
Given Multivista Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Multivista Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Multivista Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Multivista Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Multivista Validate History module on the purchase order details page.
And Multivista Validate Plus button on the purchase order details page.
Then Multivista Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Multivista Validate Search module on the purchase order details page.
And Multivista Validate product details table on the purchase order details page.
And Multivista purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Multivisa|Nirmala|Nirmala@PG1|



