@Validate_Purchase_order_MTI
Feature: Purchase order Listing MTI
@Validate_Purchase_order_listing_page_MTI
Scenario Outline: To Validate Purchase order listing page
Given MTI Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MTI Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then MTI Validate After clicks Order list option, it navigates to Purchase Order list page.
And  MTI Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then MTI Validate From Date Filter and To Date Filter on Purchase Order list page.
And MTI Validate Status Filter on Purchase Order list page.
Then MTI Validate Receiver Filter on Purchase Order list page.
And MTI Validate PartnerOrg Filter on Purchase Order list page.
Then MTI Validate Partner Filter on Purchase Order list page.
Then MTI Validate Serach Text Box on Purchase Order list page.
Then MTI Validate the Select Action on Purchase Order list page. 
And MTI Validate Shows Entries on Purchase Order list page.
Then MTI Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And MTI Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|MTI|T1466A|W!l$0N@Mti#1|


@Validate_Purchase_order_Detail_page_MTI
Scenario Outline: To Validate Purchase order Detail page
Given MTI Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When MTI Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then MTI Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And MTI Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then MTI Validate History module on the purchase order details page.
And MTI Validate Plus button on the purchase order details page.
Then MTI Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And MTI Validate Search module on the purchase order details page.
And MTI Validate product details table on the purchase order details page.
And MTI purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|MTI|T1466A|W!l$0N@Mti#1|



