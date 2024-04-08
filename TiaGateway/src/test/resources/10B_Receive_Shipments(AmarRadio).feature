@Amar_Radio
@Amar_Radio_Receive_Shipments
Feature: Receive Shipments AmarRadio
@Amar_Radio_Receive_Shipments_Listing_Page
Scenario Outline: To Validate Receive Shipments listing page
Given AmarRadio Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When AmarRadio Validate Procure to Pay --> Receive Shipments --> Shipment list Option Available on under the Menu.
Then AmarRadio Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  AmarRadio Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then AmarRadio Validate From Date Filter and To Date Filter on Shipments list page.
And AmarRadio Validate Status Filter on Packing and Shipments list page.
Then AmarRadio Validate Receiver Filter on Packing and Shipments list page.
And AmarRadio Validate PartnerOrg Filter on Packing and Shipments list page.
Then AmarRadio Validate Partner Filter on Packing and Shipments list page.
And AmarRadio Validate Region Filter on Packing and Shipments list page.
Then AmarRadio Validate Serach Text Box on Packing and Shipments list page.
Then AmarRadio Validate the Select Action on Packing and Shipments list page. 
And AmarRadio Validate Shows Entries on Packing and Shipments list page.
Then AmarRadio Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|AmarRadio|AmarRadio|AmarRadio#123|
@Amar_Radio_Receive_Shipments_Detail_Page
Scenario Outline:To Validate Receive Shipments Details Page
Given AmarRadio Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When AmarRadio Validate Procure to Pay --> Receive Shipments --> Shipment list --> click >>button should be reach Shipments Details Page.
And AmarRadio Validate PO or Delfore number on Shipments Details Page.
Then AmarRadio Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.

Then AmarRadio Validate Product Table on Shipments Details Page.
And AmarRadio Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|AmarRadio|AmarRadio|AmarRadio#123|
