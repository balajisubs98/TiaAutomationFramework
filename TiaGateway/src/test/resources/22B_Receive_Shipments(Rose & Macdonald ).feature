@Validate_Receive_Shipments_Rose&Macdonald
Feature: Receive Shipments Rose&Macdonald
@Validate_Receive_Shipments_Rose&Macdonald_listing_page
Scenario Outline: To Validate Receive Shipments listing page
Given Rose&Macdonald Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Rose&Macdonald Validate Procure to Pay --> Receive Shipments --> Shipment list Option Available on under the Menu.
Then Rose&Macdonald Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Rose&Macdonald Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Rose&Macdonald Validate From Date Filter and To Date Filter on Shipments list page.
And Rose&Macdonald Validate Status Filter on Packing and Shipments list page.
Then Rose&Macdonald Validate Receiver Filter on Packing and Shipments list page.
And Rose&Macdonald Validate PartnerOrg Filter on Packing and Shipments list page.
Then Rose&Macdonald Validate Partner Filter on Packing and Shipments list page.
And Rose&Macdonald Validate Region Filter on Packing and Shipments list page.
Then Rose&Macdonald Validate Serach Text Box on Packing and Shipments list page.
Then Rose&Macdonald Validate the Select Action on Packing and Shipments list page. 
And Rose&Macdonald Validate Shows Entries on Packing and Shipments list page.
Then Rose&Macdonald Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Rose&Macdonald|MikePowell|MikePowell@123|
@Validate_Receive_Shipments_Rose&Macdonald_Detail_page
Scenario Outline:To Validate Receive Shipments Details Page
Given Rose&Macdonald Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Rose&Macdonald Validate Procure to Pay --> Receive Shipments --> Shipment list --> click >>button should be reach Shipments Details Page.
And Rose&Macdonald Validate PO or Delfore number on Shipments Details Page.
Then Rose&Macdonald Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.

Then Rose&Macdonald Validate Product Table on Shipments Details Page.
And Rose&Macdonald Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Rose&Macdonald|MikePowell|MikePowell@123|
