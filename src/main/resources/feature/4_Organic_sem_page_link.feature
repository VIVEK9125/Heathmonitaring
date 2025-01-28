Feature: Verify Trading Account multiple page

 @priority1
   Scenario: Verify the brokerage-calculato page is loads successfully
   Given I am on the brokerage-calculato Page.
   Then verify the title of the page should "brokerage-calculato"
   And Page URL should "https://www.mstock.com/brokerage-calculator".
   And Validate page should contain a heading. "Open Your Demat Account".
   And Verify how much time takes to load the page.
    
    ######################## equity-trading #######################
    @priority2
   Scenario: Verify the equity-trading page loads successfully

Given I am on the equity-trading page.
When the page loads successfully.
Then verify the page title is "equity-trading".
And verify how much time it takes to load the page.
When we enter a mobile number on the main page and click on "Open Your Demat Account" button
And the page URL is "https://www.mstock.com/equity-trading".
And validate the page contains a heading "Open Your Demat Account".

    
    ##################### ipo ##################
     @priority3
   Scenario: Verify the IPO page loads successfully

Given I am on the IPO main page.
When we enter a mobile number on the main page and click on the "Open Your Demat Account" button.
Then the user should be redirected to the respective OTP screen page.
And verify how much time it takes to load the IPO page.
And verify the IPO page title is "IPO Main Page".
And the Mstock main page URL is "https://www.mstock.com/ipo".

  
   
   ##################### mstock videos ##################
   @priority4
  Scenario: Verify the Mstock videos page loads successfully

Given I am on the Mstock videos page.
When I click on a popular topic.
Then the topic should change accordingly.
And verify how much time it takes to load the Mstock videos page.
And verify the Mstock videos page title is "Videos".
And the Organic SEM Open Demat Account page URL is "https://www.mstock.com/videos".
   
   
    
    #################### partner page #######################
     @priority5
    Scenario: Verify the partner page loads successfully

Given I am on the partner page.
Then verify the Margin Trading Facility page title is "India's Largest Business Partner Program".
When I click on the "View Document Checklist".
Then the Margin Trading Facility page URL is "https://www.mstock.com/margin-trading-facility".
And verify how much time it takes to load the Partner page.
  
    
   