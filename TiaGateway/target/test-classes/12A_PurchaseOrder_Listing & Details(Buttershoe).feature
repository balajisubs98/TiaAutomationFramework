@ButterShoe
@ButterShoe_Purchase_Order
Feature: Purchase order Listing butter_shoe
@ButterShoe_Purchase_Order_Listing_Page
Scenario Outline: To Validate Purchase order listing page
Given butter_shoe Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When butter_shoe Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then butter_shoe Validate After clicks Order list option, it navigates to Purchase Order list page.
And  butter_shoe Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then butter_shoe Validate From Date Filter and To Date Filter on Purchase Order list page.
And butter_shoe Validate Status Filter on Purchase Order list page.
Then butter_shoe Validate Receiver Filter on Purchase Order list page.
And butter_shoe Validate PartnerOrg Filter on Purchase Order list page.
Then butter_shoe Validate Partner Filter on Purchase Order list page.
Then butter_shoe Validate Serach Text Box on Purchase Order list page.
Then butter_shoe Validate the Select Action on Purchase Order list page. 
And butter_shoe Validate Shows Entries on Purchase Order list page.
Then butter_shoe Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And butter_shoe Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|buttershoe|DienComeau|DienComeau#@123|


@ButterShoe_Purchase_Order_Detail_Page
Scenario Outline: To Validate Purchase order Detail page
Given butter_shoe Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When butter_shoe Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then butter_shoe Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And butter_shoe Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then butter_shoe Validate History module on the purchase order details page.
And butter_shoe Validate Plus button on the purchase order details page.
Then butter_shoe Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And butter_shoe Validate Search module on the purchase order details page.
And butter_shoe Validate product details table on the purchase order details page.
And butter_shoe purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|buttershoe|DienComeau|DienComeau#@123|



