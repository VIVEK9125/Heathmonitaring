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
   @Ledger 
    Scenario: Verify the Ledger page
     When the user clicks on the Reports Menu
     When the user clicks on the Ledger Summary
     Then the Ledger Summary page is opened
     When the user clicks on" Ledger report related queries?"
     Then the pop-up should open
     When the user clicks on any arrow in this pop-up
     And the user clicks on the "clicking here" button
     And the user enters their query and attaches their attachment
     And  clicks on the Raise Query button
     Then the query is attached successfully
    
    
    
    
    
    
    Scenario: Verify the Onscreen mutiple page
    When the click on IPO
    Then The IPO page Should be open
    