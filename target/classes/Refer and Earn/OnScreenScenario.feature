  Feature: Verify on Screen modul
  Background: 
  
    Given the user is on the logins page.
    When the user enters valid credential.
    And clicks login button.
    And Entering  valid otp.
    Then  user should be redirected to the dashboard.
    #Scenario: Verify the hamburger
    When the user click on hamburger
    Then the side bar should open.
    
    #*******************************************************Funds Summary **************************************************
   @FundsSummary
     Scenario: Verify the Funds Summary page
     When the user clicks on the Reports Menu
     
     When the user clicks on the Funds Summary
     Then the Funds Summary page is opened
     When the user clicks on "Funds related queries"
     Then the pop-up should open
     When the user clicks on any arrow in this pop-up
     And the user clicks on the "clicking here" button
     And the user enters their query and attaches their attachment
     And  clicks on the Raise Query button
     Then the query is attached successfully
     
    #************************************************************Ledger************************************************************ 
   #@Ledger 
    #Scenario: Verify the Ledger page.
     #When the user clicks on the Reports.
     #And the user clicks on the Ledger Summary.
     #Then the Ledger Summary page is opened.
     #When the user clicks on the" Ledger report related queries?" button.
     #Then the pop-up should be open
     #When the user clicks on any arrow in this pop-up1.
     #And the user clicks on "clicking here" button
     #And the user enters their query and attaches their attachments.
     #And  clicks on Raise Query button.
     #Then the query is attacheds successfully.
    #
     #************************************************************Trade History************************************************************ 
    #@Trade_History 
    #	Scenario: Verify the Trade_History page.
     #When the user clicks on the Reports1.
     #And the user clicks on the Trade_History page.
     #Then the Trade_History page is opened.
     #When the user clicks on the Trade history related queries? button.
     #Then the Trade history pop-up should be open
     #When the user clicks on any arrow on this pop-up1.
     #And the user click on the "clicking here" button
     #And the user enters their query and attaches their attachments on pop up.
     #And  clicks on the Raise Query buttons.
     #Then query is attached successfully.
    #
    #************************************************************IPO************************************************************ 
   #@IPO_Page
    #Scenario: Verify the IPO page
    #When the click on IPO
    #Then The IPO page Should be open
    #When the User click on IPO related queries
    #Then The IPO pop is opened
    #When the user clicks on arrow on this pop-up.
    #And the user click on the "clicking here" button on IPO popup
    #And the user enters their query and attaches the attachments on pop up.
    #And  clicks on the Raise Query button on IPO popup
    #Then query and attachments is attached successfully.
    #And Back to main page
    #When click on the hamburger
    #And click on Help module
    #Then the Help page is open 
    #And the All Recent Queries is displayed on this page
    #
    