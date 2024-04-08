@Validate_Send_Invoices_Delmonte
Feature: Send Invoices Delmonte
@Validate_Send_Invoices_Delmonte_listing_page
Scenario Outline: To Validate Delmonte Send Invoices listing page
Given Delmonte Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Delmonte Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Delmonte Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Delmonte Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Delmonte Validate From Date Filter and To Date Filter on Invoices listing page.
And Delmonte Validate Status Filter on Invoices listing page.
Then Delmonte Validate Receiver Filter on Invoices listing page.
And Delmonte Validate PartnerOrg Filter on Invoices listing page.
Then Delmonte Validate Partner Filter on Invoices listing page.
Then Delmonte Validate Serach Text Box on Invoices listing page.
Then Delmonte Validate the Select Action on Invoices listing page. 
And Delmonte Validate Shows Entries on Invoices listing page.
Then Delmonte Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Delmonte Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Delmonte|Shivender|Shivender@FF#1|
@Validate_Send_Delmonte_Detail_page
Scenario Outline: To Validate Delmonte Send Invoices Details page
Given Delmonte Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Delmonte Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Delmonte Validate Invoice Details Label and Title of the Invoice Details page.
And Delmonte Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Delmonte Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Delmonte Validate Allowance popup window, Print Invoice and Download Invoice. 
And Delmonte Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Delmonte|Shivender|Shivender@FF#1|