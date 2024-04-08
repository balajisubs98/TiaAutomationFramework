@Interplex @Multivista
@InterplexSendShipments
@Validate_Send_Shipments_Interplex
Feature: Send Shipments Interplex
@Validate_Send_Shipments_Interplex_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given Interplex Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Interplex Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then Interplex Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  Interplex Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then Interplex Validate From Date Filter and To Date Filter on Shipments list page.
And Interplex Validate Status Filter on Packing and Shipments list page.
Then Interplex Validate Receiver Filter on Packing and Shipments list page.
And Interplex Validate PartnerOrg Filter on Packing and Shipments list page.
Then Interplex Validate Partner Filter on Packing and Shipments list page.
And Interplex Validate Region Filter on Packing and Shipments list page.
Then Interplex Validate Serach Text Box on Packing and Shipments list page.
Then Interplex Validate the Select Action on Packing and Shipments list page. 
And Interplex Validate Shows Entries on Packing and Shipments list page.
Then Interplex Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|
@Validate_Send_Shipments_Interplex_Detail_page
Scenario Outline: To Validate Send Shipments Details page
Given Interplex Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Interplex Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And Interplex Validate PO or Delfore number on Shipments Details Page.
Then Interplex Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And Interplex Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then Interplex Validate Product Table on Shipments Details Page.
And Interplex Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|
