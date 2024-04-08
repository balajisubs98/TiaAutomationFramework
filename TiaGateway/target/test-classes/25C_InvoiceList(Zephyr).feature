@Zephyr
@Zephyr_Send_Invoices
Feature: Recevie Invoices Zephyr
@Zephyr_Send_Invoices_Listing_Page
Scenario Outline: To Validate Zephyr Send Invoices listing page
Given Zephyr Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Zephyr Validate Procure to Pay --> Receive Invoices --> Invoice list Option Available on under the Menu.
Then Zephyr Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  Zephyr Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then Zephyr Validate From Date Filter and To Date Filter on Invoices listing page.
And Zephyr Validate Status Filter on Invoices listing page.
Then Zephyr Validate Receiver Filter on Invoices listing page.
And Zephyr Validate PartnerOrg Filter on Invoices listing page.
Then Zephyr Validate Partner Filter on Invoices listing page.
Then Zephyr Validate Serach Text Box on Invoices listing page.
Then Zephyr Validate the Select Action on Invoices listing page. 
And Zephyr Validate Shows Entries on Invoices listing page.
Then Zephyr Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And Zephyr Interplex Invoice listing page Failures
Examples:
|ClientName|Username|Password|
|Zephyr|Zephyr|Zephyr@1|
@Zephyr_Send_Invoices_Detail_Page
Scenario Outline: To Validate Zephyr Send Invoices Details page
Given Zephyr Launch Tia application Zephyr Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Zephyr Validate Procure to Pay --> Receive Invoices --> Invoice list --> >> --> Invoice Details.
Then Zephyr Validate Invoice Details Label and Title of the Invoice Details page.
And Zephyr Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then Zephyr Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And Zephyr Validate Allowance popup window, Print Invoice,Download Invoice, PO Number link and ASN Link 
And Zephyr Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|Zephyr|Zephyr|Zephyr@1|