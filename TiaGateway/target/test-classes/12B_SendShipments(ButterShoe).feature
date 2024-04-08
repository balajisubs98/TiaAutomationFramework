@ButterShoe
@ButterShoe_Send_Shipments
Feature: Send Shipments butter_shoe
@ButterShoe_Send_Shipments_Listing_Page
Scenario Outline: To Validate Send Shipments listing page
Given butter_shoe Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When butter_shoe Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then butter_shoe Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  butter_shoe Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then butter_shoe Validate From Date Filter and To Date Filter on Shipments list page.
And butter_shoe Validate Status Filter on Packing and Shipments list page.
Then butter_shoe Validate Receiver Filter on Packing and Shipments list page.
And butter_shoe Validate PartnerOrg Filter on Packing and Shipments list page.
Then butter_shoe Validate Partner Filter on Packing and Shipments list page.
Then butter_shoe Validate Serach Text Box on Packing and Shipments list page.
Then butter_shoe Validate the Select Action on Packing and Shipments list page. 
And butter_shoe Validate Shows Entries on Packing and Shipments list page.
Then butter_shoe Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|buttershoe|DienComeau|DienComeau#@123|
@ButterShoe_Send_Shipments_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given butter_shoe Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When butter_shoe Validate Order To Cash --> Send Shipments --> Shipment list --> Select a ASN from list --> click >>button should be reach Shipments Details Page.
And butter_shoe Validate PO or Delfore number on Shipments Details Page.
Then butter_shoe Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And butter_shoe Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then butter_shoe Validate Product Table on Shipments Details Page.
And butter_shoe Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|buttershoe|DienComeau|DienComeau#@123|
