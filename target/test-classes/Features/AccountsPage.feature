Feature: Account Page Feature.

  Background: 
    Given user has already logged in to application
      | Username          | Password      |
      | baljeev@gmail.com | Selenium12345 |

  Scenario: Verify account page title
    Given user is on Accounts page
    When user get the title of the page
    Then page title should be "My account - My Store"

  Scenario: Verify Account section count
    Given user is on Accounts page
    When user gets account section
      | ORDER HISTORY AND DETAILS |
      | MY CREDIT SLIPS           |
      | MY ADDRESSES              |
      | MY PERSONAL INFORMATION   |
      | MY WISHLISTS              |
    And accounts section count should be 5
