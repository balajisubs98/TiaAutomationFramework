@Interplex @Multivista
@InterplexInvoice
@Validate_Send_Invoices_Interplex
Feature: Send Invoices Interplex
@Validate_Send_Invoices_Interplex_listing_page
Scenario Outline: To Validate Interplex Send Invoices listing page
Given Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Validate From Date Filter and To Date Filter on Invoices listing page.
And Validate Status Filter on Invoices listing page.
Then Validate Receiver Filter on Invoices listing page.
And Validate PartnerOrg Filter on Invoices listing page.
Then Validate Partner Filter on Invoices listing page.
Then Validate Serach Text Box on Invoices listing page.
Then Validate the Select Action on Invoices listing page. 
And Validate Shows Entries on Invoices listing page.
Then Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Interplex Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|
@Validate_Send_Invoices_Interplex_Detail_page
Scenario Outline: To Validate Interplex Send Invoices Details page
Given Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Validate Invoice Details Label and Title of the Invoice Details page.
And Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Validate Allowance popup window, Print Invoice and Download Invoice. 
And Interplex Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|