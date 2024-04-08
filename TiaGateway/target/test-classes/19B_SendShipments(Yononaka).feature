@Validate_Send_Shipments_Yanonaka
Feature: Send Shipments Yanonaka
@Validate_Send_Shipments_Yanonaka_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given Yanonaka Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Yanonaka Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then Yanonaka Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Yanonaka Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Yanonaka Validate From Date Filter and To Date Filter on Shipments list page.
And Yanonaka Validate Status Filter on Packing and Shipments list page.
Then Yanonaka Validate Receiver Filter on Packing and Shipments list page.
And Yanonaka Validate PartnerOrg Filter on Packing and Shipments list page.
Then Yanonaka Validate Partner Filter on Packing and Shipments list page.
Then Yanonaka Validate Serach Text Box on Packing and Shipments list page.
Then Yanonaka Validate the Select Action on Packing and Shipments list page. 
And Yanonaka Validate Shows Entries on Packing and Shipments list page.
Then Yanonaka Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Yanonaka|Yanonaka1|Yanonaka1@123|
@Validate_Send_Shipments_Yanonaka_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given Yanonaka Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Yanonaka Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And Yanonaka Validate PO or Delfore number on Shipments Details Page.
Then Yanonaka Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And Yanonaka Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then Yanonaka Validate Product Table on Shipments Details Page.
And Yanonaka Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Yanonaka|Yanonaka1|Yanonaka1@123|
