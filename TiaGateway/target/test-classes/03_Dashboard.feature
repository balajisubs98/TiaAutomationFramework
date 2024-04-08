@Interplex @Multivista
@To_Validate_Dashboard_Screen
Feature: To Validate Dashboard Screen
 
 Scenario Outline: To Validate Functionality of Dashboard Screen
Given Launch Tia Application on Google Chrome and Login with as "<ClientName>"  Client valid Crendential "<Username>" and "<Password>"
Then To validate user reach "<ClientName>" Dashboard
And To validate Dashborad title label available on top of the "<ClientName>" Dashborad Screen
Then To validate Raw EDI or Consiladted filter dropdown on the "<ClientName>" Dashboard Screen
And To validate Inbound and Outbound filter dropdown on the "<ClientName>" Dashboard Screen
Then To validate Partner filter dropdown on the "<ClientName>" Dashboard Screen
And To validate Region filter dropdown on the "<ClientName>" Dashboard Screen
Then To validate Month filter dropdown on the "<ClientName>" Dashboard Screen
And To validate Select Action dropdown on the "<ClientName>" Dashboard Screen
Then To validate Reset button on the "<ClientName>" Dashboard Screen
And To validate Notification Bell icon on the "<ClientName>" Dashboard Screen
Then To validate Account Name on the "<ClientName>" Dashboard Screen
And To validate Envelope icon on the "<ClientName>" Dashboard Screen
Then To validate Onboard Partner on the "<ClientName>" Dashboard Screen
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



#@Validate_Graphs
#Scenario Outline: Validate Graphs on Dashboard Screen Group1
#Given Launch Tia Application on Google Chrome Browser and Login with as "<ClientName>"  Client valid Crendential "<Username>" and "<Password>"
#And To validate Purchase Order Graph on the "<ClientName>" Dashboard Screen.
#Then To validate Invoice Graph on the "<ClientName>" Dashboard Screen.
#And To validate Shipment Graph on the "<ClientName>" Dashboard Screen.
#Then To validate Delfore Graph on the "<ClientName>" Dashboard Screen.
#And To validate DelJit Graph on the "<ClientName>" Dashboard Screen.


#Examples: 
#|ClientName|Username|Password|
#|Interplex|Chandramouli|ChandramouliInterplex@#123#|




#|Multivista|Nirmala|Nirmala@PG1|
#|Rexel|Abhijiet| @bhijietM1|
#|Masu Brakes|Vikas|Vik@s1|
#|Whitelink|Rasheel|R@sheel@1|
#|BKT Tires|BKT_Tires|BKTTires#123|
#|Zephyr|Zephyr|Zephyr@1|
#|Delmonte|Shivender|Shivender@FF#1|
#|Roop Automotives|MudheserYasin|MudheserYasin#1|
#|Rose & Macdonald|MikePowell|MikePowell@123|
#|LT Foods (US)|Hans|Hans@1|
#|Texmo|Karthekeyan|Karthekeyan@Texmo.1|
#|Interplex|Chandramouli|ChandramouliInterplex@#123#|
#|Buttershoe|DienComeau|DienComeau#@123|
#|AmarRadio|AmarRadio|AmarRadio#123|
#|MTI|T1466A|W!l$0N@Mti#1|
#|Valegear|Valgear|Valgear@1|
#|Tarson|AvijitRakshit|Avijit Rakshit@#123#|
#|Jindal|kamineegirdhar@jindalgroup.com|nJRj$77VF]ZU6v+'|
#|Yanonaka|Yanonaka1|Yanonaka1@123|
#|Indica|prem.verma@indicaindustries.in|zxd^d%U45%Si|
#|VVDN|lalit.mehta@vvdntech.in|qYUMolLwvc@3K|
