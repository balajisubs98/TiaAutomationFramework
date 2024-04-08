@Validate_Send_Invoices_MTI
Feature: Send Invoices MTI
@Validate_Send_Invoices_MTI_listing_page
Scenario Outline: To Validate MTI Send Invoices listing page
Given MTI Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MTI Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then MTI Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  MTI Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then MTI Validate From Date Filter and To Date Filter on Invoices listing page.
And MTI Validate Status Filter on Invoices listing page.
Then MTI Validate Receiver Filter on Invoices listing page.
And MTI Validate PartnerOrg Filter on Invoices listing page.
Then MTI Validate Partner Filter on Invoices listing page.
Then MTI Validate Serach Text Box on Invoices listing page.
Then MTI Validate the Select Action on Invoices listing page. 
And MTI Validate Shows Entries on Invoices listing page.
Then MTI Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And MTI Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|MTI|T1466A|W!l$0N@Mti#1|
@Validate_Send_MTI_Detail_page
Scenario Outline: To Validate MTI Send Invoices Details page
Given MTI Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When MTI Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then MTI Validate Invoice Details Label and Title of the Invoice Details page.
And MTI Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then MTI Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And MTI Validate Allowance popup window, Print Invoice and Download Invoice. 
And MTI Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|MTI|T1466A|W!l$0N@Mti#1|