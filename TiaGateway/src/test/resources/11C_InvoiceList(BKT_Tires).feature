@BKT_Tires
@BKT_Tires_Send_Invoices
Feature: Send Invoices BKT_Tires
@BKT_Tires_Send_Invoices_Listing_Page
Scenario Outline: To Validate BKT_Tires Send Invoices listing page
Given BKT_Tires Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When BKT_Tires Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then BKT_Tires Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  BKT_Tires Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then BKT_Tires Validate From Date Filter and To Date Filter on Invoices listing page.
And BKT_Tires Validate Status Filter on Invoices listing page.
Then BKT_Tires Validate Receiver Filter on Invoices listing page.
And BKT_Tires Validate PartnerOrg Filter on Invoices listing page.
Then BKT_Tires Validate Partner Filter on Invoices listing page.
Then BKT_Tires Validate Serach Text Box on Invoices listing page.
Then BKT_Tires Validate the Select Action on Invoices listing page. 
And BKT_Tires Validate Shows Entries on Invoices listing page.
Then BKT_Tires Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And BKT_Tires Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|BKT Tires|BKT_Tires|BKTTires#123|
@BKT_Tires_Send_Invoices_Detail_Page
Scenario Outline: To Validate BKT_Tires Send Invoice Details page
Given BKT_Tires Launch Tia application BKT_Tires Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When BKT_Tires Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then BKT_Tires Validate Invoice Details Label and Title of the Invoice Details page.
And BKT_Tires Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then BKT_Tires Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And BKT_Tires Validate Allowance popup window, Print Invoice and Download Invoice. 
And BKT_Tires Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|BKT Tires|BKT_Tires|BKTTires#123|