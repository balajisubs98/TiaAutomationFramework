@Amar_Radio
@Amar_Radio_Send_Invoices
Feature: Recevie Invoices AmarRadio
@Amar_Radio_Send_Invoices_Listing_Page
Scenario Outline: To Validate AmarRadio Send Invoices listing page
Given AmarRadio Launch Tia application Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When AmarRadio Validate Procure to Pay --> Receive Invoices --> Invoice list Option Available on under the Menu.
Then AmarRadio Validate After clicks Invoices list option, it navigates to Invoices listing page.
And  AmarRadio Validate Purchase Order Label, MenuButton, Account name with Logo and Notification Bell Icon are available on Invoices listing page.
Then AmarRadio Validate From Date Filter and To Date Filter on Invoices listing page.
And AmarRadio Validate Status Filter on Invoices listing page.
Then AmarRadio Validate Receiver Filter on Invoices listing page.
And AmarRadio Validate PartnerOrg Filter on Invoices listing page.
Then AmarRadio Validate Partner Filter on Invoices listing page.
Then AmarRadio Validate Serach Text Box on Invoices listing page.
Then AmarRadio Validate the Select Action on Invoices listing page. 
And AmarRadio Validate Shows Entries on Invoices listing page.
Then AmarRadio Validate sort functionality of Invoice Date, Invoice Status,Tax, and Grand Total on Invoices listing page.
And AmarRadio Interplex Invoice listing page Failures
Examples: To Validate AmarRadio Send Invoices Details page
|ClientName|Username|Password|
|AmarRadio|AmarRadio|AmarRadio#123|
@Amar_Radio_Send_Invoices_Detail_Page
Scenario Outline: To Validate AmarRadio Send Invoices Details page
Given AmarRadio Launch Tia application AmarRadio Dashboard by google chrome Browser "<ClientName>" "<Username>" "<Password>"
When AmarRadio Validate Procure to Pay --> Receive Invoices --> Invoice list --> >> --> Invoice Details.
Then AmarRadio Validate Invoice Details Label and Title of the Invoice Details page.
And AmarRadio Validate Invoice Number, Invoice Date, Delivery Date, TG Transaction ID, Created Date, Invoice status, Allowance Total,and Payment Terms, label are available on Invoice Details Page.
Then AmarRadio Validate Product Detail Table, Total, Total Tax Amount, Taxable Amount, Other Charges, RoundOff, Grand Total, SubTotal Amount (In Words),Total Tax Amount (In Words),Amount Chargeable (In Words),and Declaration are available on Invoice Details Page.
And AmarRadio Validate Allowance popup window, Print Invoice,Download Invoice, PO Number link and ASN Link 
And AmarRadio Invoice details page Failures
Examples: 
|ClientName|Username|Password|
|AmarRadio|AmarRadio|AmarRadio#123|