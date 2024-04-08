@BKT_Tires
@BKT_Tires_Send_Shipments
Feature: Send Shipments BKT_Tires
@BKT_Tires_Send_Shipments_Listing_Page
Scenario Outline: To Validate Send Shipments listing page
Given BKT_Tires Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When BKT_Tires Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then BKT_Tires Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  BKT_Tires Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then BKT_Tires Validate From Date Filter and To Date Filter on Shipments list page.
And BKT_Tires Validate Status Filter on Packing and Shipments list page.
Then BKT_Tires Validate Receiver Filter on Packing and Shipments list page.
And BKT_Tires Validate PartnerOrg Filter on Packing and Shipments list page.
Then BKT_Tires Validate Partner Filter on Packing and Shipments list page.
And BKT_Tires Validate Region Filter on Packing and Shipments list page.
Then BKT_Tires Validate Serach Text Box on Packing and Shipments list page.
Then BKT_Tires Validate the Select Action on Packing and Shipments list page. 
And BKT_Tires Validate Shows Entries on Packing and Shipments list page.
Then BKT_Tires Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|BKT Tires|BKT_Tires|BKTTires#123|
@BKT_Tires_Send_Shipments_Detail_Page
Scenario Outline: To Validate Send Shipments Details page
Given BKT_Tires Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When BKT_Tires Validate Order To Cash --> Send Shipments --> Shipment list--> Select a ASN from list --> click >>button should be reach Shipments Details Page.
And BKT_Tires Validate PO or Delfore number on Shipments Details Page.
Then BKT_Tires Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And BKT_Tires Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then BKT_Tires Validate Product Table on Shipments Details Page.
And BKT_Tires Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|BKT Tires|BKT_Tires|BKTTires#123|
