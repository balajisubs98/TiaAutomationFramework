@Texmo
Feature: Send Shipments Texmo
@Validate_Send_Shipments_Texmo_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given Texmo Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Texmo Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then Texmo Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Texmo Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Texmo Validate From Date Filter and To Date Filter on Shipments list page.
And Texmo Validate Status Filter on Packing and Shipments list page.
Then Texmo Validate Receiver Filter on Packing and Shipments list page.
And Texmo Validate PartnerOrg Filter on Packing and Shipments list page.
Then Texmo Validate Partner Filter on Packing and Shipments list page.
Then Texmo Validate Serach Text Box on Packing and Shipments list page.
Then Texmo Validate the Select Action on Packing and Shipments list page. 
And Texmo Validate Shows Entries on Packing and Shipments list page.
Then Texmo Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Texmo|Karthekeyan|Karthekeyan@Texmo.1|
@Validate_Send_Shipments_Texmo_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given Texmo Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Texmo Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And Texmo Validate PO or Delfore number on Shipments Details Page.
Then Texmo Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And Texmo Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then Texmo Validate Product Table on Shipments Details Page.
And Texmo Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Texmo|Karthekeyan|Karthekeyan@Texmo.1|
