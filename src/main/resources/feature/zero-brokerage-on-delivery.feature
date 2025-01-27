Feature: verify the zero brokage on delivery
//@sanity
@Background
Scenario: Verify all aspects of the zero brokage on delivery landing page
    Given I navigate to the zero brokage on delivery landing page
    When the page loads completely
    Then the title of the page should be "Trade in Delivery @ Zero Brokerage for life with m.Stock"
    And the URL should be "https://www.mstock.com/sem-landing/zero-brokerage-on-delivery"
  
    
    # Verify the OTP screen after entering the phone number
    When the user enters the phone number
    Then the OTP screen should be displayed
    
    # Verify the scrolling and shuffling tab
    When the user scrolls down and clicks on the tab
    Then the tab should be clickable
    
    # Verify the second phone number field
    When the user enters the phone number and clicks on the Open Account button
    Then the OTP screen should be displayed
    
    # Verify the FAQs
    When the user clicks on the down arrow
    Then the answer should be displayed
    
    # Verify the footer CTA is clickable
    When the user clicks on any CTA
    Then the user should navigate to the respective page