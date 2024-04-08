@Interplex @Multivista
@NotificationiconScreen
Feature: Notification Icon Screen
Scenario Outline: To Validate Notification icon in Dashboard
Given Launch Tia application On google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate the bell icon available on Dashboard.
Then Validate after click the bell icon, it navigates to the notification List Popup window.
And Validate the notification List label available on the the notification List Popup window.
Then Validate the Search box availability and functionality with valid and Invalid data, on the the notification List Popup window.
And Validate the following table column are Message From Name, Status, Message to Name, Doc Type, Doc Date, Message these are available on the the notification List Popup window.
Then Validate the sort functionality in the Doc Date Column.
And Validate the Maximum five Entries only present in the Notification List table.
Then Validate the page navigation buttons in the Notification List table.
And Validate the Right headed arrow button in the Notification List popup Window.
Examples: 
|ClientName|Username|Password|
|LT Foods (US)|Hans|Hans@1|

@Notification_Menu_Screen
Scenario Outline: To Validate Notification option under the Menu.
Given Launch Tia application On the google chrome Browser "<ClientName>" "<Username>" "<Password>"
When Validate Notification Option Available under the Menu.
Then Validate After clicks Notification option, it navigates to Notifiction list page.
And  Validate Notification Label, MenuButton, Account name with Logo and Notification Bell Icon are available on the Notification Page.
Then Validate From Date Filter and To Date Filter.
And Validate Status Filter.
Then Validate Receiver Filter.
And Validate PartnerOrg Filter.
Then Validate Partner Filter.
And Validate Region Filter.
Then Validate ResetButton.
And Validate Serach Text Box.


Examples: 
|ClientName|Username|Password|
|LT Foods (US)|Hans|Hans@1|



