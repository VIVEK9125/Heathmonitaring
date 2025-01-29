    Feature: Verify the pledge mStock modules
    Background: 
    @Mstcokmodule
    Scenario: Verify the pledge-shares page loads successfully
    Given I am on the pledge-shares page
    When I enter a mobile number and click on the "Open your demat account" button
    Then the user should be redirected to the OTP screen page
    And verify how much time it takes to load the pledge-shares page
    And verify the pledge-shares page title should be "Pledge shares & get EXTRAAAAAAAAA margin"
    And the pledge-shares page URL should be "https://www.mstock.com/sem-landing/pledge-shares"
    
    
    
    
    #******************************************brokerage-savings**********************************
    @Brokage_saving
     Scenario: Verify the brokerage-savings page loads successfully.
    Given User on the brokerage-savings page.
    When enter a mobile number and click on the "Open your demat account" button.
    Then user should be redirected to the OTP screen page.
    And verify how much time it takes to load the brokerage-savings pages.
    And verify the brokerage-savings page title should  "Pledge shares & get EXTRAAAAAAAAA margin"
    And the brokerage-savings page URL should "https://www.mstock.com/sem-landing/brokerage-savings"
    
    
     #******************************************Mstock**********************************
     
      #Scenario: Verify the Mstock page loads successfully.
    #Given Useron the brokerage-savings page.
    #When enter a mobile number and click on the "Open your demat account" button.
    #Then user should be redirected to the OTP screen page.
    #And verify how much time it takes to load the brokerage-savings pages.
    #And verify the brokerage-savings page title should  "Pledge shares & get EXTRAAAAAAAAA margin"
    #And the brokerage-savings page URL should "https://www.mstock.com/sem-landing/brokerage-savings"
    #And validate the Margin Trading Facility page should contain heading."Open Your Demat Account"