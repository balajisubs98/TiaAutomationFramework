@Validate_Send_Invoices_Yanonaka
Feature: Send Invoices Yanonaka
@Validate_Send_Invoices_Yanonaka_listing_page
Scenario Outline: To Validate Yanonaka Send Invoices listing page
Given Yanonaka Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Yanonaka Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Yanonaka Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Yanonaka Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Yanonaka Validate From Date Filter and To Date Filter on Invoices listing page.
And Yanonaka Validate Status Filter on Invoices listing page.
Then Yanonaka Validate Receiver Filter on Invoices listing page.
And Yanonaka Validate PartnerOrg Filter on Invoices listing page.
Then Yanonaka Validate Partner Filter on Invoices listing page.
Then Yanonaka Validate Serach Text Box on Invoices listing page.
Then Yanonaka Validate the Select Action on Invoices listing page. 
And Yanonaka Validate Shows Entries on Invoices listing page.
Then Yanonaka Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Yanonaka Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Yanonaka|Yanonaka1|Yanonaka1@123|
@Validate_Send_Multivista_Detail_page
Scenario Outline: To Validate Yanonaka Send Invoices Details page
Given Yanonaka Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Yanonaka Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Yanonaka Validate Invoice Details Label and Title of the Invoice Details page.
And Yanonaka Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Yanonaka Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Yanonaka Validate Allowance popup window, Print Invoice and Download Invoice. 
And Yanonaka Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Yanonaka|Yanonaka1|Yanonaka1@123|