@Validate_Purchase_order_Valegear
Feature: Purchase order Listing Valegear
@Validate_Purchase_order_listing_page_Valegear
Scenario Outline: To Validate Purchase order listing page
Given Valegear Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Valegear Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Valegear Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Valegear Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Valegear Validate From Date Filter and To Date Filter on Purchase Order list page.
And Valegear Validate Status Filter on Purchase Order list page.
Then Valegear Validate Receiver Filter on Purchase Order list page.
And Valegear Validate PartnerOrg Filter on Purchase Order list page.
Then Valegear Validate Partner Filter on Purchase Order list page.
Then Valegear Validate Serach Text Box on Purchase Order list page.
Then Valegear Validate the Select Action on Purchase Order list page. 
And Valegear Validate Shows Entries on Purchase Order list page.
Then Valegear Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Valegear Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Valegear|Valgear|Valgear@1|


@Validate_Purchase_order_Detail_page_Valegear
Scenario Outline: To Validate Purchase order Detail page
Given Valegear Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Valegear Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Valegear Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Valegear Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Valegear Validate History module on the purchase order details page.
And Valegear Validate Plus button on the purchase order details page.
Then Valegear Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Valegear Validate Search module on the purchase order details page.
And Valegear Validate product details table on the purchase order details page.
And Valegear purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Valegear|Valgear|Valgear@1|



