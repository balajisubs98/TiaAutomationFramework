@Validate_Purchase_order_VVDN
Feature: Purchase order Listing VVDN
@Validate_Purchase_order_listing_page_VVDN
Scenario Outline: To Validate Purchase order listing page
Given VVDN Launch Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When VVDN Validate Order To Cash --> Receive Orders --> Order list Option Available on under the Menu.
Then VVDN Validate After clicks Order list option, it navigates to Purchase Order list page.
And  VVDN Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then VVDN Validate From Date Filter and To Date Filter on Purchase Order list page.
And VVDN Validate Status Filter on Purchase Order list page.
Then VVDN Validate Receiver Filter on Purchase Order list page.
And VVDN Validate PartnerOrg Filter on Purchase Order list page.
Then VVDN Validate Partner Filter on Purchase Order list page.
And VVDN Validate Region Filter on Purchase Order list page.
Then VVDN Validate Serach Text Box on Purchase Order list page.
Then VVDN Validate the Select Action on Purchase Order list page. 
And VVDN Validate Shows Entries on Purchase Order list page.
Then VVDN Validate sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
And VVDN Purchase order listing page Failures
Examples: 
|ClientName|Username|Password|
|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|


@Validate_Purchase_order_Detail_page_VVDN
Scenario Outline: To Validate Purchase order Detail page
Given VVDN Launch Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When VVDN Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then VVDN Validate Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And VVDN Validate Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then VVDN Validate History module on the purchase order details page.
And VVDN Validate Plus button on the purchase order details page.
Then VVDN Validate Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And VVDN Validate Search module on the purchase order details page.
And VVDN Validate product details table on the purchase order details page.
And VVDN purchase order details page Failures 
 
Examples: 
|ClientName|Username|Password|
|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|



