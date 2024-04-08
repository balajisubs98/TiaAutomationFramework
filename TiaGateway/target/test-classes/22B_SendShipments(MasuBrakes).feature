@Validate_Send_Shipments_MasuBrakes
Feature: Send Shipments MasuBrakes
@Validate_Send_Shipments_MasuBrakes_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given MasuBrakes Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MasuBrakes Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then MasuBrakes Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  MasuBrakes Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then MasuBrakes Validate From Date Filter and To Date Filter on Shipments list page.
And MasuBrakes Validate Status Filter on Packing and Shipments list page.
Then MasuBrakes Validate Receiver Filter on Packing and Shipments list page.
And MasuBrakes Validate PartnerOrg Filter on Packing and Shipments list page.
Then MasuBrakes Validate Partner Filter on Packing and Shipments list page.
Then MasuBrakes Validate Serach Text Box on Packing and Shipments list page.
Then MasuBrakes Validate the Select Action on Packing and Shipments list page. 
And MasuBrakes Validate Shows Entries on Packing and Shipments list page.
Then MasuBrakes Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Masu Brakes|Vikas|Vik@s1|
@Validate_Send_Shipments_MasuBrakes_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given MasuBrakes Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MasuBrakes Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And MasuBrakes Validate PO or Delfore number on Shipments Details Page.
Then MasuBrakes Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And MasuBrakes Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then MasuBrakes Validate Product Table on Shipments Details Page.
And MasuBrakes Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Masu Brakes|Vikas|Vik@s1|
