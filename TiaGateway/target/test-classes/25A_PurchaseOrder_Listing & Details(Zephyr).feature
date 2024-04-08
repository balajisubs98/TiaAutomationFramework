
@Validate_Purchase_order_Zephyr
Feature: Purchase order Listing
@Validate_Purchase_order_listing_page_Zephyr
Scenario Outline: To Validate Zephyr Purchase order listing page
Given Launch Zephyr Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Zephyr Procure to Pay --> Purchase Orders --> PO list Option Available on under the Menu.
Then Validate Zephyr After clicks Order list option, it navigates to Purchase Order list page.
And  Validate Zephyr Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Validate Zephyr From Date Filter and To Date Filter on Purchase Order list page.
And Validate Zephyr Status Filter on Purchase Order list page.
Then Validate Zephyr Receiver Filter on Purchase Order list page.
And Validate Zephyr PartnerOrg Filter on Purchase Order list page.
Then Validate Zephyr Partner Filter on Purchase Order list page.
And Validate Zephyr Region Filter on Purchase Order list page.
Then Validate Zephyr Serach Text Box on Purchase Order list page.
Then Validate Zephyr the Select Action on Purchase Order list page. 
And Validate Zephyr Shows Entries on Purchase Order list page.
Then Validate Zephyr sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
Examples: 
|ClientName|Username|Password|
|Zephyr|Zephyr|Zephyr@1|


@Validate_Purchase_order_Detail_page_Zephyr
Scenario Outline: To Validate Zephyr Purchase order Detail page
Given Launch Zephyr Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Zephyr Procure to Pay --> Purchase Orders --> PO list Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Validate Zephyr Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Validate Zephyr Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Validate Zephyr History module on the purchase order details page.
And Validate Zephyr Plus button on the purchase order details page.
Then Validate Zephyr Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Validate Zephyr Search module on the purchase order details page.
And Validate Zephyr product details table on the purchase order details page.
 
Examples: 
|ClientName|Username|Password|
|Zephyr|Zephyr|Zephyr@1|



