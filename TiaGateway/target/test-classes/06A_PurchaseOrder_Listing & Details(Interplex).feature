@Interplex
@InterplexPO
@Validate_Purchase_order_Interplex
Feature: Purchase order Listing Interplex
@Validate_Purchase_order_listing_page_InterPlex
Scenario Outline: To Validate Purchase order listing page
Given Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Validate From Date Filter and To Date Filter on Purchase Order list page.
And Validate Status Filter on Purchase Order list page.
Then Validate Receiver Filter on Purchase Order list page.
And Validate PartnerOrg Filter on Purchase Order list page.
Then Validate Partner Filter on Purchase Order list page.
And Validate Region Filter on Purchase Order list page.
Then Validate Serach Text Box on Purchase Order list page.
Then Validate the Select Action on Purchase Order list page. 
And Validate Shows Entries on Purchase Order list page.
Then Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Interplex Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|


@Validate_Purchase_order_Detail_page_InterPlex
Scenario Outline: To Validate Purchase order Detail page
Given Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Validate History module on the purchase order details page.
And Validate Plus button on the purchase order details page.
Then Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Validate Search module on the purchase order details page.
And Validate product details table on the purchase order details page.
And Interplex purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|



