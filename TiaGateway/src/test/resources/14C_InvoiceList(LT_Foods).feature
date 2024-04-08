@Validate_Send_Invoices_LT_Foods
Feature: Send Invoices LT_Foods
@Validate_Send_Invoices_LT_Foods_listing_page
Scenario Outline: To Validate LT_Foods Send Invoices listing page
Given LT_Foods Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When LT_Foods Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then LT_Foods Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  LT_Foods Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then LT_Foods Validate From Date Filter and To Date Filter on Invoices listing page.
And LT_Foods Validate Status Filter on Invoices listing page.
Then LT_Foods Validate Receiver Filter on Invoices listing page.
And LT_Foods Validate PartnerOrg Filter on Invoices listing page.
Then LT_Foods Validate Partner Filter on Invoices listing page.
Then LT_Foods Validate Serach Text Box on Invoices listing page.
Then LT_Foods Validate the Select Action on Invoices listing page. 
And LT_Foods Validate Shows Entries on Invoices listing page.
Then LT_Foods Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And LT_Foods Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|LT Foods|Hans|Hans@1|
@Validate_Send_Invoices_LT_Foods_Detail_page
Scenario Outline: To Validate LT_Foods Send Invoice Details page
Given LT_Foods Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When LT_Foods Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then LT_Foods Validate Invoice Details Label and Title of the Invoice Details page.
And LT_Foods Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then LT_Foods Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And LT_Foods Validate Allowance popup window, Print Invoice and Download Invoice. 
And LT_Foods Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|LT Foods|Hans|Hans@1|