@Validate_Purchase_order_Rexel
Feature: Purchase order Listing Rexel
@Validate_Purchase_order_listing_page_Rexel
Scenario Outline: To Validate Purchase order listing page
Given Rexel Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Rexel Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Rexel Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Rexel Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Rexel Validate From Date Filter and To Date Filter on Purchase Order list page.
And Rexel Validate Status Filter on Purchase Order list page.
Then Rexel Validate Receiver Filter on Purchase Order list page.
And Rexel Validate PartnerOrg Filter on Purchase Order list page.
Then Rexel Validate Partner Filter on Purchase Order list page.
Then Rexel Validate Serach Text Box on Purchase Order list page.
Then Rexel Validate the Select Action on Purchase Order list page. 
And Rexel Validate Shows Entries on Purchase Order list page.
Then Rexel Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Rexel Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Rexel|Abhijiet|  @bhijietM1|


@Validate_Purchase_order_Detail_page_Rexel
Scenario Outline: To Validate Purchase order Detail page
Given Rexel Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Rexel Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Rexel Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Rexel Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Rexel Validate History module on the purchase order details page.
And Rexel Validate Plus button on the purchase order details page.
Then Rexel Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Rexel Validate Search module on the purchase order details page.
And Rexel Validate product details table on the purchase order details page.
And Rexel purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Rexel|Abhijiet|  @bhijietM1|



