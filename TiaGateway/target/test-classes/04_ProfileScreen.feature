@Interplex @Multivista
@Profile_Screen_Validation
Feature: Profile_Screen_Validation


Scenario: To Validate Profile Screen Functionality
    Given User sholud launch and Login to Tia application via Google Chrome Browser
    And User to click account and it shows drop down with profile option. 
    When User click on profile, Will Profile Screen popup window will appear.
    And To Check Whether Profile screen Title label is User Profile.
    Then To Check Whether Profile screen shows user details under About label.
    And To Check Whether Profile screen shows settings details under Setting label.
    Then To Check Whether Copyright and Tangentia link is available on Login Screen.
    And To Check Whether user able to click Tangentia link and it navigate to Tangentia WebPage.
    Then To Check Whether user able to click Xclose button and After click profile popscreen will disappear. 
    
    
