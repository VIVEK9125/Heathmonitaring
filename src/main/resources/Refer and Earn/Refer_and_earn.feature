Feature: Verify the Refer and learn Module
Background:
   @refer_earn       
Scenario: Successful Login with Valid Credentials
     Given the user is on the login page
    When the user enters valid credentials
    And clicks the login button
    And Entering the valid otp
    Then the user should be redirected to the dashboard
    #Scenario: Verify the hamburger
    When the user click on the hamburger.
    Then the side bar should be open
    
    #Scenario: Verify the Refer and earn page
    When the user click on the "refer and earn"
    Then the refer and earn page should be open in new tab
    And verify how much time it takes to load the refer and earn page.
    And Verify the URL and title
    
    When User Enter the refrance number
    And the Click on the Submit button
    Then Verify this "Your referral has been successfully added" Message
    And Verify the live refferal Feed
    
    When click on  the mail report.
    Then Verify Success message "Your referral status report has been emailed on your registered email id!"
    When Copy the link to share it 
    And paste the copied link in a new tab.
    Then the user should be redirected to the registration page.
    @sharelink
    Scenario: Verify The Share link page
    Given User on the Share link
    When the user Entering the number and click on the get otp button
    Then The user Should be redirect on the Enter OTP page
    
   
    