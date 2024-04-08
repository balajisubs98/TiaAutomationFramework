@Multivista
@Multivista_Send_Invoices
Feature: Send Invoices Multivista
@Multivista_Send_Invoices_Listing_Page
Scenario Outline: To Validate Multivista Send Invoices listing page
Given Multivista Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Multivista Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Multivista Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Multivista Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Multivista Validate From Date Filter and To Date Filter on Invoices listing page.
And Multivista Validate Status Filter on Invoices listing page.
Then Multivista Validate Receiver Filter on Invoices listing page.
And Multivista Validate PartnerOrg Filter on Invoices listing page.
Then Multivista Validate Partner Filter on Invoices listing page.
Then Multivista Validate Serach Text Box on Invoices listing page.
Then Multivista Validate the Select Action on Invoices listing page. 
And Multivista Validate Shows Entries on Invoices listing page.
Then Multivista Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Multivista Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Multivisa|Nirmala|Nirmala@PG1|
@Multivista_Send_Detail_Page
Scenario Outline: To Validate Multivista Send Invoices Details page
Given Multivista Launch Tia application Multivista Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Multivista Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Multivista Validate Invoice Details Label and Title of the Invoice Details page.
And Multivista Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Multivista Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Multivista Validate Allowance popup window, Print Invoice and Download Invoice. 
And Multivista Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Multivisa|Nirmala|Nirmala@PG1|