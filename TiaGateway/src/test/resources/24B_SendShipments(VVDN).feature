@Validate_Send_Shipments_VVDN
Feature: Send Shipments VVDN
@Validate_Send_Shipments_VVDN_listing_page
Scenario Outline: To Validate Send Shipments listing page
Given VVDN Launch Tia application Dashboard via google chrome Browser "<ClientName>" "<Username>" "<Password>"
When VVDN Validate Order To Cash --> Send Shipments --> Shipment list Option Available on under the Menu.
Then VVDN Validate After clicks Shipment list option, it navigates to Packing and Shipments list page.
And  VVDN Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Shipments list page.
Then VVDN Validate From Date Filter and To Date Filter on Shipments list page.
And VVDN Validate Status Filter on Packing and Shipments list page.
Then VVDN Validate Receiver Filter on Packing and Shipments list page.
And VVDN Validate PartnerOrg Filter on Packing and Shipments list page.
Then VVDN Validate Partner Filter on Packing and Shipments list page.
And VVDN Validate Region Filter on Packing and Shipments list page.
Then VVDN Validate Serach Text Box on Packing and Shipments list page.
Then VVDN Validate the Select Action on Packing and Shipments list page. 
And VVDN Validate Shows Entries on Packing and Shipments list page.
Then VVDN Validate sort functionality of ASN number, ASN Date,and ASN Stauts on Packing and Shipments list page.
Examples: 
|ClientName|Username|Password|
|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|
@Validate_Send_Shipments_VVDN_Detail_page
Scenario Outline: To Validate Send Shipments Details page
Given VVDN Launch the Tia application on google chrome Browser "<ClientName>" "<Username>" "<Password>"
When VVDN Validate Order To Cash --> Receive Orders --> Order list--> Select a PO from list --> click >>button should be reach Shipments Details Page.
And VVDN Validate PO or Delfore number on Shipments Details Page.
Then VVDN Validate Barcode number, ASN Date, ASN status, ASN Date, Created Date, Shipment ID, Shipment Date, Delivery Date, Transport Type, Autopack, ShipFrom, ShipTo, Tracking NO and AWB No label are available on Shipments Details Page.
And VVDN Validate Select Task Dropdown Print Shipping Label and Print Packing slip on Shipments Details Page.
Then VVDN Validate Product Table on Shipments Details Page.
And VVDN Validate Print ASN and Download ASN buttons on the Shipments Details Page.
Examples: 
|ClientName|Username|Password|
|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|
