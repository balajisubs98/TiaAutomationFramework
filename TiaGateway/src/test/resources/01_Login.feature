@Interplex @Multivista
@LoginScreen
Feature: LoginScreen

@LoginScreen_Validation_Test
  Scenario: Validate the LoginScreen 
    Given Launch Tia Application on Google Chrome Browser 
    When User able to reach Login Screen Succesfully
    Then To Check Whether Tia Logo available on Login Screen 
    And To Check Whether UserName Label available on Login Screen
    Then To Check Whether UserName TextBox with infoLabel available on Login Screen
    And To Check Whether Password Label available on Login Screen
    Then To Check Whether Password TextBox with infoLabel available on Login Screen
    Then To Check Whether over the Password TestBox Eye icon is Available on Login Screen
    And To Check Whether LoginButton with infoLabel available on Login Screen
    Then To Check Whether ConnectWithTia Link available on Login Screen
    And To Check Whether Tangentia Link available on Login Screen
   
@Login_With_Valid_Credential    
 Scenario Outline: Validate the functionality of the Login with Valid Credential. 
 		Given Launch Tia Application on Google Chrome Browser. 
    When validate User able to reach Login Screen Succesfully.
    Then validate User able to pass username on Username TextBox as "<Username>"
    And  validate User able to pass password on password TextBox as "<Password>" "<ClientName>".
    Then validate User able to click LoginButton.
    And  validate User able to reach Dashborad screen."<ClientName>"

Examples:
|ClientName|Username|Password|
|Multivista|Nirmala|Nirmala@PG1|
|Rexel|Abhijiet| @bhijietM1|
|Masu Brakes|Vikas|Vik@s1|
|Whitelink|Rasheel|R@sheel@1|
|BKT Tires|BKT_Tires|BKTTires#123|
|Zephyr|Zephyr|Zephyr@1|
|Delmonte|Shivender|Shivender@FF#1|
|Roop Automotives|MudheserYasin|MudheserYasin#1|
|Rose & Macdonald|MikePowell|MikePowell@123|
|LT Foods (US)|Hans|Hans@1|
|Texmo|Karthekeyan|Karthekeyan@Texmo.1|
|Interplex|Chandramouli|ChandramouliInterplex@#123#|
|Buttershoe|DienComeau|DienComeau#@123|
|AmarRadio|AmarRadio|AmarRadio#123|
|MTI|T1466A|W!l$0N@Mti#1|
|Valegear|Valgear|Valgear@1|
|Tarson|AvijitRakshit|Avijit Rakshit@#123#|
|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|
|Yanonaka|Yanonaka1|Yanonaka1@123|
|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|
|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|
    
  
 @Login_With_InValid_Credential    
 Scenario: Validate the functionality of the Login with InValid Credential. 
 Given Launch Tia Application on Chrome Browser. 
 When validate User should reach Login Screen Succesfully.
 Given User pass the InValid Username on Username Textbox as "Sonia"
 And  User pass the InValid password on password Textbox as "Sonia456"
 When User Clik the LoginButton unable to reach Dashboard and get Invalid Credential Entered message popup.
 Given User to pass the Valid Username on Username Textbox as "Abhijiet"
 And  User to pass the InValid password on password Textbox as "  Abi7896 "
 When User to Clik the LoginButton unable to reach Dashboard and get Invalid Credential Entered message popup.
 Given User to pass the InValid Username on Username Textbox as "Yasen"
 And  User to pass the Valid password on password Textbox as "MudheserYasin#1"
 When User able Clik the LoginButton unable to reach Dashboard and get Invalid Credential Entered message popup.
 Given User left Blank Username on Username Textbox as ""
 And  User left Blank password on password Textbox as ""
 When User Clik the LoginButton unable to reach Dashboard and get This Field is Required message under the both Textbox.
 Given User left the Blank Username on Username Textbox as ""
 And  User should to enter valid password on password Textbox as "MudheserYasin#1"
 When User Clik the LoginButton unable to reach Dashboard and get This Field is Required message under the username Textbox.
 Given User to valid Username on Username Textbox as "Abhijiet"
 And  User to pass the blank password on password Textbox as 
 When Users Clik LoginButton unable to reach Dashboard and get This Field is Required message under the username Textbox.    
 Given User able to click Connect with Tia link
 When  User navigates to Connect with Tia screen.
 Given User able to click Tangentia link
 And  User navigates to Tangentia Webpage 
@Logout#1_Scenario    
 Scenario Outline: Validate the functionality of the LogOut under the profile. 
 		Given User open Tia Application on Chrome Browser. 
    When User Login on Tia Application. "<Username>" "<Password>".
    Then User cliks signout button under profile on Tia Application."<ClientName>"
    And  If User clicks Yes, should be LogOut and reach Login Screen.Else User clicks Cancel, stays on Dashborad. as "<Yes/Cancel>" "<ClientName>"
    
    Examples:
    |ClientName|Username|Password|Yes/Cancel|
    |Multivista|Nirmala|Nirmala@PG1|Yes|
    |Multivista|Nirmala|Nirmala@PG1|Cancel|
    |Rexel|Abhijiet| @bhijietM1|Yes|
    |Rexel|Abhijiet| @bhijietM1|Cancel|
    |Masu Brakes|Vikas|Vik@s1|Yes|
    |Masu Brakes|Vikas|Vik@s1|Cancel|
    |Whitelink|Rasheel|R@sheel@1|Yes|
    |Whitelink|Rasheel|R@sheel@1|Cancel|
		|BKT Tires|BKT_Tires|BKTTires#123|Yes|
		|BKT Tires|BKT_Tires|BKTTires#123|Cancel|
		|Zephyr|Zephyr|Zephyr@1|Yes|
		|Zephyr|Zephyr|Zephyr@1|Cancel|
		|Delmonte|Shivender|Shivender@FF#1|Yes|
		|Delmonte|Shivender|Shivender@FF#1|Cancel|
		|Roop Automotives|MudheserYasin|MudheserYasin#1|Yes|
		|Roop Automotives|MudheserYasin|MudheserYasin#1|Cancel|
		|Rose & Macdonald|MikePowell|MikePowell@123|Yes|
		|Rose & Macdonald|MikePowell|MikePowell@123|Cancel|
		|LT Foods (US)|Hans|Hans@1|Yes|
		|LT Foods (US)|Hans|Hans@1|Cancel|
		|Texmo|Karthekeyan|Karthekeyan@Texmo.1|Yes|
		|Texmo|Karthekeyan|Karthekeyan@Texmo.1|Cancel|
		|Interplex|Chandramouli|ChandramouliInterplex@#123#|Yes|
		|Interplex|Chandramouli|ChandramouliInterplex@#123#|Cancel|
		|Buttershoe|DienComeau|DienComeau#@123|Yes|
		|Buttershoe|DienComeau|DienComeau#@123|Cancel|
		|AmarRadio|AmarRadio|AmarRadio#123|Yes|
		|AmarRadio|AmarRadio|AmarRadio#123|Cancel|
		|MTI|T1466A|W!l$0N@Mti#1|Yes|
		|MTI|T1466A|W!l$0N@Mti#1|Cancel|
		|Valegear|Valgear|Valgear@1|Yes|
		|Valegear|Valgear|Valgear@1|Cancel|
		|Tarson|AvijitRakshit|Avijit Rakshit@#123#|Yes|
		|Tarson|AvijitRakshit|Avijit Rakshit@#123#|Cancel|
		|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|Yes|
		|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|Cancel|
		|Yanonaka|Yanonaka1|Yanonaka1@123|Yes|
		|Yanonaka|Yanonaka1|Yanonaka1@123|Cancel|
		|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|Yes|
		|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|Cancel|
		|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|Yes|
		|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|Cancel|
 @Logout#2_Scenario  
  Scenario Outline: Validate the functionality of the LogOut under the Menu. 
 		Given User open Tia Application on the Chrome Browser. 
    When User should Login on Tia Application "<Username>" "<Password>".
    Then User cliks Logout button under the Menu on Tia Application."<ClientName>"
    And  If User clicks the Yes, should be LogOut and reach Login Screen.Else User clicks Cancel, stays on Dashborad. as "<Yes/Cancel>" "<ClientName>"
    
    Examples:
    |ClientName|Username|Password|Yes/Cancel|
    |Multivista|Nirmala|Nirmala@PG1|Yes|
    |Multivista|Nirmala|Nirmala@PG1|Cancel|
    |Rexel|Abhijiet| @bhijietM1|Yes|
    |Rexel|Abhijiet| @bhijietM1|Cancel|
    |Masu Brakes|Vikas|Vik@s1|Yes|
    |Masu Brakes|Vikas|Vik@s1|Cancel|
    |Whitelink|Rasheel|R@sheel@1|Yes|
    |Whitelink|Rasheel|R@sheel@1|Cancel|
		|BKT Tires|BKT_Tires|BKTTires#123|Yes|
		|BKT Tires|BKT_Tires|BKTTires#123|Cancel|
		|Zephyr|Zephyr|Zephyr@1|Yes|
		|Zephyr|Zephyr|Zephyr@1|Cancel|
		|Delmonte|Shivender|Shivender@FF#1|Yes|
		|Delmonte|Shivender|Shivender@FF#1|Cancel|
		|Roop Automotives|MudheserYasin|MudheserYasin#1|Yes|
		|Roop Automotives|MudheserYasin|MudheserYasin#1|Cancel|
		|Rose & Macdonald|MikePowell|MikePowell@123|Yes|
		|Rose & Macdonald|MikePowell|MikePowell@123|Cancel|
		|LT Foods (US)|Hans|Hans@1|Yes|
		|LT Foods (US)|Hans|Hans@1|Cancel|
		|Texmo|Karthekeyan|Karthekeyan@Texmo.1|Yes|
		|Texmo|Karthekeyan|Karthekeyan@Texmo.1|Cancel|
		|Interplex|Chandramouli|ChandramouliInterplex@#123#|Yes|
		|Interplex|Chandramouli|ChandramouliInterplex@#123#|Cancel|
		|Buttershoe|DienComeau|DienComeau#@123|Yes|
		|Buttershoe|DienComeau|DienComeau#@123|Cancel|
		|AmarRadio|AmarRadio|AmarRadio#123|Yes|
		|AmarRadio|AmarRadio|AmarRadio#123|Cancel|
		|MTI|T1466A|W!l$0N@Mti#1|Yes|
		|MTI|T1466A|W!l$0N@Mti#1|Cancel|
		|Valegear|Valgear|Valgear@1|Yes|
		|Valegear|Valgear|Valgear@1|Cancel|
		|Tarson|AvijitRakshit|Avijit Rakshit@#123#|Yes|
		|Tarson|AvijitRakshit|Avijit Rakshit@#123#|Cancel|
		|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|Yes|
		|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|Cancel|
		|Yanonaka|Yanonaka1|Yanonaka1@123|Yes|
		|Yanonaka|Yanonaka1|Yanonaka1@123|Cancel|
		|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|Yes|
		|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|Cancel|
		|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|Yes|
		|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|Cancel|
   
    
 
 
  