@ButterShoe
@ButterShoe_Send_Invoices
Feature: Send Invoices butter_shoe
@ButterShoe_Send_Invoices_Listing_Page
Scenario Outline: To Validate butter_shoe Send Invoices listing page
Given butter_shoe Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When butter_shoe Validate Order To Cash --> Send Invoices --> Invoice list Option Available on under the Menu.
Then butter_shoe Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  butter_shoe Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then butter_shoe Validate From Date Filter and To Date Filter on Invoices listing page.
And butter_shoe Validate Status Filter on Invoices listing page.
Then butter_shoe Validate Receiver Filter on Invoices listing page.
And butter_shoe Validate PartnerOrg Filter on Invoices listing page.
Then butter_shoe Validate Partner Filter on Invoices listing page.
Then butter_shoe Validate Serach Text Box on Invoices listing page.
Then butter_shoe Validate the Select Action on Invoices listing page. 
And butter_shoe Validate Shows Entries on Invoices listing page.
Then butter_shoe Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And butter_shoe Invoice listing page Failures
Examples: 
|ClientName|Username|Password|
|buttershoe|DienComeau|DienComeau#@123|
@ButterShoe_Send_Invoice_Detail_page
Scenario Outline: To Validate butter_shoe Send Invoices Details page
Given butter_shoe Launch Tia application butter_shoe Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When butter_shoe Validate Order To Cash --> Send Invoices --> Invoice list --> >> --> Invoice Details.
Then butter_shoe Validate Invoice Details Label and Title of the Invoice Details page.
And butter_shoe Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then butter_shoe Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And butter_shoe Validate Allowance popup window, Print Invoice and Download Invoice. 
And butter_shoe Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|buttershoe|DienComeau|DienComeau#@123|