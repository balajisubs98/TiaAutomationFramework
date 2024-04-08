@Validate_Send_Invoices_Tarson
Feature: Send Invoices Tarson
@Validate_Send_Invoices_Tarson_listing_page
Scenario Outline: To Validate Tarson Send Invoices listing page
Given Tarson Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Tarson Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then Tarson Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Tarson Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Tarson Validate From Date Filter and To Date Filter on Invoices listing page.
And Tarson Validate Status Filter on Invoices listing page.
Then Tarson Validate Receiver Filter on Invoices listing page.
And Tarson Validate PartnerOrg Filter on Invoices listing page.
Then Tarson Validate Partner Filter on Invoices listing page.
Then Tarson Validate Serach Text Box on Invoices listing page.
Then Tarson Validate the Select Action on Invoices listing page. 
And Tarson Validate Shows Entries on Invoices listing page.
Then Tarson Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Tarson Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|
@Validate_Send_Tarson_Detail_page
Scenario Outline: To Validate Tarson Send Invoices Details page
Given Tarson Launch Tia application Interplex Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Tarson Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then Tarson Validate Invoice Details Label and Title of the Invoice Details page.
And Tarson Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Tarson Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Tarson Validate Allowance popup window, Print Invoice and Download Invoice. 
And Tarson Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|