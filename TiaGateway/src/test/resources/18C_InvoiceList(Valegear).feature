@Validate_Send_Invoices_Valegear
Feature: Send Invoices Valegear
@Validate_Send_Invoices_Valegear_listing_page
Scenario Outline: To Validate Valegear Send Invoices listing page
Given Valegear Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Valegear Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Valegear Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Valegear Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Valegear Validate From Date Filter and To Date Filter on Invoices listing page.
And Valegear Validate Status Filter on Invoices listing page.
Then Valegear Validate Receiver Filter on Invoices listing page.
And Valegear Validate PartnerOrg Filter on Invoices listing page.
Then Valegear Validate Partner Filter on Invoices listing page.
Then Valegear Validate Serach Text Box on Invoices listing page.
Then Valegear Validate the Select Action on Invoices listing page. 
And Valegear Validate Shows Entries on Invoices listing page.
Then Valegear Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Valegear Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Valegear|Valgear|Valgear@1|
@Validate_Send_Valegear_Detail_page
Scenario Outline: To Validate Valegear Send Invoices Details page
Given Valegear Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Valegear Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Valegear Validate Invoice Details Label and Title of the Invoice Details page.
And Valegear Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Valegear Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Valegear Validate Allowance popup window, Print Invoice and Download Invoice. 
And Valegear Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Valegear|Valgear|Valgear@1|