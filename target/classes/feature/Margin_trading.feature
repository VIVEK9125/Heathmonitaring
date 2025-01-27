Feature: verify the Margin trading

@Background
Scenario: Verify all aspects of the Margin trading landing page
    Given I navigate to the Margin trading landing page
    When the title of the page should  "4X investments with Pay Later (MTF) from just 6.99% p.a"
    And the URL should  "https://www.mstock.com/sem-landing/margin-trading"
    Then The title should be displayed
  
    
    # Verify the OTP screen after entering the phone number
    When The user enters the phone number
    Then The OTP screen should be displayed
    
    # Verify the scrolling and shuffling tab
    When The user scrolls down and clicks on the tab
    Then The tab should be clickable
    
    # Verify the second phone number field
    When The user enters the phone number and clicks on the Open Account button
    Then The OTP screen should be displayed
    
    # Verify the FAQs
    When The user clicks on the down arrow
    Then The answer should be displayed
    
    # Verify the footer CTA is clickable
    When The user clicks on any CTA
    Then The user should navigate to the respective page