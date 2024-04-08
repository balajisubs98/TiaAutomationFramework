@Validate_Purchase_order_Tarson
Feature: Purchase order Listing Tarson
@Validate_Purchase_order_listing_page_Tarson
Scenario Outline: To Validate Purchase order listing page
Given Tarson Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Tarson Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Tarson Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Tarson Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Tarson Validate From Date Filter and To Date Filter on Purchase Order list page.
And Tarson Validate Status Filter on Purchase Order list page.
Then Tarson Validate Receiver Filter on Purchase Order list page.
And Tarson Validate PartnerOrg Filter on Purchase Order list page.
Then Tarson Validate Partner Filter on Purchase Order list page.
Then Tarson Validate Serach Text Box on Purchase Order list page.
Then Tarson Validate the Select Action on Purchase Order list page. 
And Tarson Validate Shows Entries on Purchase Order list page.
Then Tarson Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Tarson Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|


@Validate_Purchase_order_Detail_page_Tarson
Scenario Outline: To Validate Purchase order Detail page
Given Tarson Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Tarson Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Tarson Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Tarson Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Tarson Validate History module on the purchase order details page.
And Tarson Validate Plus button on the purchase order details page.
Then Tarson Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Tarson Validate Search module on the purchase order details page.
And Tarson Validate product details table on the purchase order details page.
And Tarson purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|



