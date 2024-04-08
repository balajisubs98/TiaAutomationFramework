@Validate_Send_Shipments_Indica
Feature: Send Shipments Indica
@Validate_Send_Shipments_Indica_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given Indica Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Indica Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then Indica Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Indica Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Indica Validate From Date Filter and To Date Filter on Shipments list page.
And Indica Validate Status Filter on Packing and Shipments list page.
Then Indica Validate Receiver Filter on Packing and Shipments list page.
And Indica Validate PartnerOrg Filter on Packing and Shipments list page.
Then Indica Validate Partner Filter on Packing and Shipments list page.
Then Indica Validate Serach Text Box on Packing and Shipments list page.
Then Indica Validate the Select Action on Packing and Shipments list page. 
And Indica Validate Shows Entries on Packing and Shipments list page.
Then Indica Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|
@Validate_Send_Shipments_Indica_Detail_page
Scenario Outline:To Validate Send Shipments Details page
Given Indica Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Indica Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And Indica Validate PO or Delfore number on Shipments Details Page.
Then Indica Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And Indica Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then Indica Validate Product Table on Shipments Details Page.
And Indica Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|
