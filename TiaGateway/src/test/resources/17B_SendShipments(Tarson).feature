@Validate_Send_Shipments_Tarson
Feature: Send Shipments Tarson
@Validate_Send_Shipments_Tarson_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given Tarson Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Tarson Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then Tarson Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Tarson Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Tarson Validate From Date Filter and To Date Filter on Shipments list page.
And Tarson Validate Status Filter on Packing and Shipments list page.
Then Tarson Validate Receiver Filter on Packing and Shipments list page.
And Tarson Validate PartnerOrg Filter on Packing and Shipments list page.
Then Tarson Validate Partner Filter on Packing and Shipments list page.
Then Tarson Validate Serach Text Box on Packing and Shipments list page.
Then Tarson Validate the Select Action on Packing and Shipments list page. 
And Tarson Validate Shows Entries on Packing and Shipments list page.
Then Tarson Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|
@Validate_Send_Shipments_Tarson_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given Tarson Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Tarson Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And Tarson Validate PO or Delfore number on Shipments Details Page.
Then Tarson Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And Tarson Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then Tarson Validate Product Table on Shipments Details Page.
And Tarson Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|
