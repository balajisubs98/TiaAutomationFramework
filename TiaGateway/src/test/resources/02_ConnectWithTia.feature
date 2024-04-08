@Interplex @Multivista
@ConnectWithTiaFeature
Feature: ConnectWithTia

@ConnectWithTia_Screen_Validation
Scenario: To Validate ConnectWithTia screen
Given To launch Tia Application on Google Chrome Browser
When To Check Whether able to Click connect With Tia and Navigates to Connect With Tia Screen
And To Check Whether TIA Logo present in Connect With Tia Screen
Then To Check Whether Fist Name TextBox along with Label is present in Connect With Tia Screen
And To Check Whether Last Name TextBox along with Label is present in Connect With Tia Screen
Then To Check Whether Phone Number TextBox along with Label is present in Connect With Tia Screen
And To Check Whether Email TextBox along Label with is present in Connect With Tia Screen
Then To Check Whether Country TextBox along Label with is present in Connect With Tia Screen
And To Check Whether Requirements DropDown along with Label is present in Connect With Tia Screen
Then To Check Whether Company TextBox along with Label is present in Connect With Tia Screen
And To Check Whether Your message to TiA team: TextBox along with Label is present in Connect With Tia Screen
Then To Check Whether SubmitButton along with Label is present in Connect With Tia Screen
And To Check Whether ClearButton along with Label is present in Connect With Tia Screen
And To Check Whether CloseX iButton along with Label is present in Connect With Tia Screen

@ConnectWithTia_Screen_Validation_With_Valid_Data
Scenario: To Validate with valid data in Text fields on ConnectWithTia screen 
Given User able to enter valid First Name on TextBox as "Tester"
Then User able to enter valid Last Name on TextBox as "Tangentia"
And User able to enter valid Phone Number on Textbox as "+1234567890"
Then User able to enter valid Email on TextBox as "qateam@gmail.com"
And User able to enter valid Company Name on TextBox as "Tangentia pvt ltd"
Then User able to enter valid Country Name on TextBox as "India" 
And User able to select valid Requirements on List as "Human Resources"
Then User able to enter their message on Your message to Tia Team Textbox "Hi Tia Team, our internal Automation Testing"
And User able to click SubmitButton
Then User able to see ThankYou for Contacting Us on after submission.
And After User Submission,This message refelect on Tia admin Account. 

@ConnectWithTia_Screen_Validation_With_InValid_Data
Scenario Outline: To Validate with Invalid data in on ConnectWithTia screen
When Launch Tia Application  
Given User to enter First Name on TextBox as "<FirstName>"
Then User to enter Last Name on TextBox as "<LastName>"
And User to enter Phone Number on Textbox as "<PhoneNumber>"
Then User to enter Email on TextBox as "<Email>"
And User to enter Company Name on TextBox as "<CompanyName>"
Then User to enter Country Name on TextBox as "<CountryName>" 
And User unable to select multiple Requirements on List as "<Requirements>"
Then User to enter their message on Your message to Tia Team Textbox "<Message>""<Screenshot>"
And User  click SubmitButton
Then User unable to reach ThankYou for Contacting Us on after submission."<Screenshot>" 
And Close the Application.
Examples: 
|Screenshot|FirstName|LastName|PhoneNumber|Email|CompanyName|CountryName|Requirements|Message|
|loopA|655sadhan&|mani|+3298492373|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid FirstName|
|loopB|  |mani|+3298492373|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid Blank FirstName|
|loopC|Testing|/ma+ni245|+3298492373|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid LastName|
|loopD|Testing|  |+3298492373|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid Blank LastName|
|loopE|Testing|pros|+32984923|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid PhoneNumber(below Minlength10)|
|loopF|Testing|pros|  |abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid Balnk PhoneNumber|
|loopG|Testing|pros|+32984923253645655|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid PhoneNumber(above Maxlength15)|
|loopH|Testing|pros|&4923253645655|abc@gmail.com|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid PhoneNumber(+sign only can use)|
|loopI|Testing|pros|+3298492373|abcgmail.com@|abc pvt ltd|India|E-Invoicing|Under Testing: Invalid Email|
|loopJ|Testing|pros|+3298492373|  |abc pvt ltd|India|E-Invoicing|Under Testing: Invalid Blank Email|
|loopK|Testing|pros|+3298492373|abc@gmail.com|abc pvt ltd|Maharastr56a|E-Invoicing|Under Testing: Invalid CountryName|
|loopL|Testing|pros|+3298492373|abc@gmail.com|abc pvt ltd|  |E-Invoicing|Under Testing: Invalid Blank CountryName|
|loopM|Testing|pros|+3298492373|abc@gmail.com|  |India|E-Invoicing|Under Testing: Invalid Blank CompanyName|

@ConnectWithTia_Screen_Clear_Button_Validation
Scenario: To Validate ClearButton on ConnectWithTia screen 
Given User enter First Name on TextBox as "Tester"
Then User enter Last Name on TextBox as "Tangentia"
And User enter Phone Number on Textbox as "+1234567890"
Then User enter Email on TextBox as "qateam@gmail.com"
And User enter valid Company Name on TextBox as "Tangentia pvt ltd"
Then User enter Country Name on TextBox as "India" 
And User select Requirements on List as "Human Resources"
Then User enter their message on Your message to Tia Team Textbox "Hi Tia Team, our internal Automation Testing"
And User to click ClearButton
Then After Click ClearButton all fields should be clear.
Then After click Connect with Tia close Xbutton should be reach Login Screen.
