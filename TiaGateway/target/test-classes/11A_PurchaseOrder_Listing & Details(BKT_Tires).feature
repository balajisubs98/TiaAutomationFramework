@BKT_Tires
@BKT_Tires_Purchase_Order
Feature: Purchase order Listing BKT_Tires
@BKT_Tires_Purchase_Order_Listing_Page
Scenario Outline: To Validate Purchase order listing page
Given BKT_Tires Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When BKT_Tires Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then BKT_Tires Validate After clicks Order list option, it navigates to Purchase Order list page.
And  BKT_Tires Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then BKT_Tires Validate From Date Filter and To Date Filter on Purchase Order list page.
And BKT_Tires Validate Status Filter on Purchase Order list page.
Then BKT_Tires Validate Receiver Filter on Purchase Order list page.
And BKT_Tires Validate PartnerOrg Filter on Purchase Order list page.
Then BKT_Tires Validate Partner Filter on Purchase Order list page.
And BKT_Tires Validate Region Filter on Purchase Order list page.
Then BKT_Tires Validate Serach Text Box on Purchase Order list page.
Then BKT_Tires Validate the Select Action on Purchase Order list page. 
And BKT_Tires Validate Shows Entries on Purchase Order list page.
Then BKT_Tires Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And BKT_Tires Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|BKT Tires|BKT_Tires|BKTTires#123|


@BKT_Tires_Purchase_Order_Detail_Page
Scenario Outline: To Validate Purchase order Detail page
Given BKT_Tires Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When BKT_Tires Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then BKT_Tires Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And BKT_Tires Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then BKT_Tires Validate History module on the purchase order details page.
And BKT_Tires Validate Plus button on the purchase order details page.
Then BKT_Tires Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And BKT_Tires Validate Search module on the purchase order details page.
And BKT_Tires Validate product details table on the purchase order details page.
And BKT_Tires purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|BKT Tires|BKT_Tires|BKTTires#123|



