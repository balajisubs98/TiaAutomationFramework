@Validate_Purchase_order
@Validate_Purchase_order_Rose&Macdonald
Feature: Purchase order Listing
@Validate_Purchase_order_listing_page_Rose&Macdonald
Scenario Outline: To Validate Rose&Macdonald Purchase order listing page
Given Launch Rose&Macdonald Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Rose&Macdonald Procure to Pay --> Purchase Orders --> PO list Option Available on under the Menu.
Then Validate Rose&Macdonald After clicks Order list option, it navigates to Purchase Order list page.
And  Validate Rose&Macdonald Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Validate Rose&Macdonald From Date Filter and To Date Filter on Purchase Order list page.
And Validate Rose&Macdonald Status Filter on Purchase Order list page.
Then Validate Rose&Macdonald Receiver Filter on Purchase Order list page.
And Validate Rose&Macdonald PartnerOrg Filter on Purchase Order list page.
Then Validate Rose&Macdonald Partner Filter on Purchase Order list page.
And Validate Rose&Macdonald Region Filter on Purchase Order list page.
Then Validate Rose&Macdonald Serach Text Box on Purchase Order list page.
Then Validate Rose&Macdonald the Select Action on Purchase Order list page. 
And Validate Rose&Macdonald Shows Entries on Purchase Order list page.
Then Validate Rose&Macdonald sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
Examples: 
|ClientName|Username|Password|
|Rose&Macdonald|MikePowell|MikePowell@123|


@Validate_Purchase_order_Detail_page_Rose&Macdonald
Scenario Outline: To Validate Rose&Macdonald Purchase order Detail page
Given Launch Rose&Macdonald Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Rose&Macdonald Procure to Pay --> Purchase Orders --> PO list Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Validate Rose&Macdonald Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Validate Rose&Macdonald Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Validate Rose&Macdonald History module on the purchase order details page.
And Validate Rose&Macdonald Plus button on the purchase order details page.
Then Validate Rose&Macdonald Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Validate Rose&Macdonald Search module on the purchase order details page.
And Validate Rose&Macdonald product details table on the purchase order details page.
 
Examples: 
|ClientName|Username|Password|
|Rose&Macdonald|MikePowell|MikePowell@123|



