@Multivista
@Multivista_Send_Shipments
Feature: Send Shipments Multivista
@Multivista_Send_Shipments_Listing_Page
Scenario Outline: To Validate Send Shipments listing page
Given Multivista Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Multivista Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then Multivista Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Multivista Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Multivista Validate From Date Filter and To Date Filter on Shipments list page.
And Multivista Validate Status Filter on Packing and Shipments list page.
Then Multivista Validate Receiver Filter on Packing and Shipments list page.
And Multivista Validate PartnerOrg Filter on Packing and Shipments list page.
Then Multivista Validate Partner Filter on Packing and Shipments list page.
Then Multivista Validate Serach Text Box on Packing and Shipments list page.
Then Multivista Validate the Select Action on Packing and Shipments list page. 
And Multivista Validate Shows Entries on Packing and Shipments list page.
Then Multivista Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Multivisa|Nirmala|Nirmala@PG1|
@Multivista_Send_Shipments_Detail_Page
Scenario Outline:To Validate Send Shipments Details page
Given Multivista Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Multivista Validate Order To Cash --> Send Shipments --> Shipment list --> Select a ASN from list --> click >>button should be reach Shipments Details Page.
And Multivista Validate PO or Delfore number on Shipments Details Page.
Then Multivista Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And Multivista Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then Multivista Validate Product Table on Shipments Details Page.
And Multivista Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Multivisa|Nirmala|Nirmala@PG1|
