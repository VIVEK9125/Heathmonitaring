Feature: verify the feature and options Landing page
@sanity
@Background
Scenario: Verify all aspects of the feature and options landing page
    Given I navigate to the feature and options landing page
    When the page loads successfully
    Then the title of the page should be "Save unlimited brokerage with Futures & Options @ ₹5/order".
    And the URL should be "https://www.mstock.com/sem-landing/futures-and-options".
  
    
    # Verify the OTP screen after entering the phone number
    When the user enters the "9284267917" number
    Then the OTP screen should be displayed.
    
    # Verify the scrolling and shuffling tab
    When the user scrolls down and clicks on the tab.
    Then the tab should be clickable.
    
    # Verify the second phone number field
    When the user enters the "9284267917" number and clicks on the Open Account button
    Then the OTP screen should be displayed.
    
    # Verify the FAQs
    When the user clicks on the down arrow.
    Then the answer should be displayed.
    
    # Verify the footer CTA is clickable
    When the user clicks on any CTA.
    Then the user should navigate to the respective page.