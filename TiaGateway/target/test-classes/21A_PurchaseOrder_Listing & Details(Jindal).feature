@Validate_Purchase_order_Jindal
Feature: Purchase order Listing Jindal
@Validate_Purchase_order_listing_page_Jindal
Scenario Outline: To Validate Purchase order listing page
Given Jindal Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Jindal Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Jindal Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Jindal Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Jindal Validate From Date Filter and To Date Filter on Purchase Order list page.
And Jindal Validate Status Filter on Purchase Order list page.
Then Jindal Validate Receiver Filter on Purchase Order list page.
And Jindal Validate PartnerOrg Filter on Purchase Order list page.
Then Jindal Validate Partner Filter on Purchase Order list page.
Then Jindal Validate Serach Text Box on Purchase Order list page.
Then Jindal Validate the Select Action on Purchase Order list page. 
And Jindal Validate Shows Entries on Purchase Order list page.
Then Jindal Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Jindal Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|


@Validate_Purchase_order_Detail_page_Jindal
Scenario Outline: To Validate Purchase order Detail page
Given Jindal Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Jindal Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Jindal Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Jindal Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Jindal Validate History module on the purchase order details page.
And Jindal Validate Plus button on the purchase order details page.
Then Jindal Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Jindal Validate Search module on the purchase order details page.
And Jindal Validate product details table on the purchase order details page.
And Jindal purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|



