@Validate_Send_Invoices_Rexel
Feature: Send Invoices Rexel
@Validate_Send_Invoices_Rexel_listing_page
Scenario Outline: To Validate Rexel Send Invoices listing page
Given Rexel Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Rexel Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Rexel Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Rexel Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Rexel Validate From Date Filter and To Date Filter on Invoices listing page.
And Rexel Validate Status Filter on Invoices listing page.
Then Rexel Validate Receiver Filter on Invoices listing page.
And Rexel Validate PartnerOrg Filter on Invoices listing page.
Then Rexel Validate Partner Filter on Invoices listing page.
Then Rexel Validate Serach Text Box on Invoices listing page.
Then Rexel Validate the Select Action on Invoices listing page. 
And Rexel Validate Shows Entries on Invoices listing page.
Then Rexel Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Rexel Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Rexel|Abhijiet|  @bhijietM1|
@Validate_Send_Invoices_Rexel_Detail_page
Scenario Outline: To Validate Rexel Send Rexel Details page
Given Rexel Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Rexel Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Rexel Validate Invoice Details Label and Title of the Invoice Details page.
And Rexel Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Rexel Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Rexel Validate Allowance popup window, Print Invoice and Download Invoice. 
And Rexel Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Rexel|Abhijiet|  @bhijietM1|