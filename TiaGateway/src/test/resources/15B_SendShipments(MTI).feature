@Validate_Send_Shipments_MTI
Feature: Send Shipments MTI
@Validate_Send_Shipments_MTI_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given MTI Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MTI Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then MTI Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  MTI Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then MTI Validate From Date Filter and To Date Filter on Shipments list page.
And MTI Validate Status Filter on Packing and Shipments list page.
Then MTI Validate Receiver Filter on Packing and Shipments list page.
And MTI Validate PartnerOrg Filter on Packing and Shipments list page.
Then MTI Validate Partner Filter on Packing and Shipments list page.
Then MTI Validate Serach Text Box on Packing and Shipments list page.
Then MTI Validate the Select Action on Packing and Shipments list page. 
And MTI Validate Shows Entries on Packing and Shipments list page.
Then MTI Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|MTI|T1466A|W!l$0N@Mti#1|
@Validate_Send_Shipments_MTI_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given MTI Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MTI Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And MTI Validate PO or Delfore number on Shipments Details Page.
Then MTI Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And MTI Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then MTI Validate Product Table on Shipments Details Page.
And MTI Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|MTI|T1466A|W!l$0N@Mti#1|
