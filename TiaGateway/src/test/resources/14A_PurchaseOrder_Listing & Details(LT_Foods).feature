@Validate_Purchase_order_LT_Foods
Feature: Purchase order Listing LT_Foods
@Validate_Purchase_order_listing_page_LT_Foods
Scenario Outline: To Validate Purchase order listing page
Given LT_Foods Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When LT_Foods Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then LT_Foods Validate After clicks Order list option, it navigates to Purchase Order list page.
And  LT_Foods Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then LT_Foods Validate From Date Filter and To Date Filter on Purchase Order list page.
And LT_Foods Validate Status Filter on Purchase Order list page.
Then LT_Foods Validate Receiver Filter on Purchase Order list page.
And LT_Foods Validate PartnerOrg Filter on Purchase Order list page.
Then LT_Foods Validate Partner Filter on Purchase Order list page.
And LT_Foods Validate Region Filter on Purchase Order list page.
Then LT_Foods Validate Serach Text Box on Purchase Order list page.
Then LT_Foods Validate the Select Action on Purchase Order list page. 
And LT_Foods Validate Shows Entries on Purchase Order list page.
Then LT_Foods Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And LT_Foods Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|LT Foods|Hans|Hans@1|


@Validate_Purchase_order_Detail_page_LT_Foods
Scenario Outline: To Validate Purchase order Detail page
Given LT_Foods Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When LT_Foods Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then LT_Foods Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And LT_Foods Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then LT_Foods Validate History module on the purchase order details page.
And LT_Foods Validate Plus button on the purchase order details page.
Then LT_Foods Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And LT_Foods Validate Search module on the purchase order details page.
And LT_Foods Validate product details table on the purchase order details page.
And LT_Foods purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|LT Foods|Hans|Hans@1|



