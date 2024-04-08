@Amar_Radio
@Amar_Radio_Purchase_Order
Feature: Purchase order Listing
@Amar_Radio_Purchase_Order_Listing_Page
Scenario Outline: To Validate AmarRadio Purchase order listing page
Given Launch AmarRadio Tia application Dashboard On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate AmarRadio Procure to Pay --> Purchase Orders --> PO list Option Available on under the Menu.
Then Validate AmarRadio After clicks Order list option, it navigates to Purchase Order list page.
And  Validate AmarRadio Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Purchase Order list page.
Then Validate AmarRadio From Date Filter and To Date Filter on Purchase Order list page.
And Validate AmarRadio Status Filter on Purchase Order list page.
Then Validate AmarRadio Receiver Filter on Purchase Order list page.
And Validate AmarRadio PartnerOrg Filter on Purchase Order list page.
Then Validate AmarRadio Partner Filter on Purchase Order list page.
And Validate AmarRadio Region Filter on Purchase Order list page.
Then Validate AmarRadio Serach Text Box on Purchase Order list page.
Then Validate AmarRadio the Select Action on Purchase Order list page. 
And Validate AmarRadio Shows Entries on Purchase Order list page.
Then Validate AmarRadio sort functionality of PO number, PO Date, Shipment Date and Stauts on Purchase Order list page.
Examples: 
|ClientName|Username|Password|
|AmarRadio|AmarRadio|AmarRadio#123|


@Amar_Radio_Purchase_order_Detail_Page
Scenario Outline: To Validate AmarRadio Purchase order Detail page
Given Launch AmarRadio Tia application On the chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate AmarRadio Procure to Pay --> Purchase Orders --> PO list Select a PO from list --> click >>button should be reach Purchase Order Details Page.
Then Validate AmarRadio Puchase Order Details,PO Number,TG Transaction ID,Order Date,Delivery Date,So Number,Total Order Amount, and Total Order Quantity Labels are Available on Purchase Order Details Page.
And Validate AmarRadio Ship To Label and Logo, Bill To Label and Logo, and PO status are available on the Purchase order details page.
Then Validate AmarRadio History module on the purchase order details page.
And Validate AmarRadio Plus button on the purchase order details page.
Then Validate AmarRadio Download pdf, Print Pdf and Donwload CSV buttons are in purchase order details page.
And Validate AmarRadio Search module on the purchase order details page.
And Validate AmarRadio product details table on the purchase order details page.
 
Examples: 
|ClientName|Username|Password|
|AmarRadio|AmarRadio|AmarRadio#123|



