Feature: Validation of Lumens application
  Scenario: Account creation and Sign in
    Given Navigate to Application URL
    When Verify the title of Home Page
#    Then User click on Account and and Create Account
#    And Account is successfully created
    Then User Sign in the application with User id and Password
     Then User Search item
     Then Click on Add to cart
     Then Navigate to the Cart and validate the item
     