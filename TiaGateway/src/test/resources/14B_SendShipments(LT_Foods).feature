@Validate_Send_Shipments_LT_Foods
Feature: Send Shipments LT_Foods
@Validate_Send_Shipments_LT_Foods_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given LT_Foods Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When LT_Foods Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then LT_Foods Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  LT_Foods Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then LT_Foods Validate From Date Filter and To Date Filter on Shipments list page.
And LT_Foods Validate Status Filter on Packing and Shipments list page.
Then LT_Foods Validate Receiver Filter on Packing and Shipments list page.
And LT_Foods Validate PartnerOrg Filter on Packing and Shipments list page.
Then LT_Foods Validate Partner Filter on Packing and Shipments list page.
And LT_Foods Validate Region Filter on Packing and Shipments list page.
Then LT_Foods Validate Serach Text Box on Packing and Shipments list page.
Then LT_Foods Validate the Select Action on Packing and Shipments list page. 
And LT_Foods Validate Shows Entries on Packing and Shipments list page.
Then LT_Foods Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|LT Foods|Hans|Hans@1|
@Validate_Send_Shipments_LT_Foods_Detail_page
Scenario Outline: To Validate Send Shipments Details page
Given LT_Foods Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When LT_Foods Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And LT_Foods Validate PO or Delfore number on Shipments Details Page.
Then LT_Foods Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And LT_Foods Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then LT_Foods Validate Product Table on Shipments Details Page.
And LT_Foods Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|LT Foods|Hans|Hans@1|
