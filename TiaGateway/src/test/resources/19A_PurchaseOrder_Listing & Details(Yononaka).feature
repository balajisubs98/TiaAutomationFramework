@Validate_Purchase_order_Yanonaka
Feature: Purchase order Listing Yanonaka
@Validate_Purchase_order_listing_page_Yanonaka
Scenario Outline: To Validate Purchase order listing page
Given Yanonaka Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Yanonaka Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then Yanonaka Validate After clicks Order list option, it navigates to Purchase Order list page.
And  Yanonaka Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Yanonaka Validate From Date Filter and To Date Filter on Purchase Order list page.
And Yanonaka Validate Status Filter on Purchase Order list page.
Then Yanonaka Validate Receiver Filter on Purchase Order list page.
And Yanonaka Validate PartnerOrg Filter on Purchase Order list page.
Then Yanonaka Validate Partner Filter on Purchase Order list page.
Then Yanonaka Validate Serach Text Box on Purchase Order list page.
Then Yanonaka Validate the Select Action on Purchase Order list page. 
And Yanonaka Validate Shows Entries on Purchase Order list page.
Then Yanonaka Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And Yanonaka Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|Yanonaka|Yanonaka1|Yanonaka1@123|


@Validate_Purchase_order_Detail_page_Yanonaka
Scenario Outline: To Validate Purchase order Detail page
Given Yanonaka Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Yanonaka Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Yanonaka Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Yanonaka Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Yanonaka Validate History module on the purchase order details page.
And Yanonaka Validate Plus button on the purchase order details page.
Then Yanonaka Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Yanonaka Validate Search module on the purchase order details page.
And Yanonaka Validate product details table on the purchase order details page.
And Yanonaka purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|Yanonaka|Yanonaka1|Yanonaka1@123|



