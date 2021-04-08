$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Lumen.feature");
formatter.feature({
  "line": 1,
  "name": "Validation of Lumens application",
  "description": "",
  "id": "validation-of-lumens-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 2,
  "name": "Account creation and Sign in",
  "description": "",
  "id": "validation-of-lumens-application;account-creation-and-sign-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 3,
  "name": "Navigate to Application URL",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "Verify the title of Home Page",
  "keyword": "When "
});
formatter.step({
  "comments": [
    {
      "line": 5,
      "value": "#    Then User click on Account and and Create Account"
    },
    {
      "line": 6,
      "value": "#    And Account is successfully created"
    }
  ],
  "line": 7,
  "name": "User Sign in the application with User id and Password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "User Search item",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on Add to cart",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Navigate to the Cart and validate the item",
  "keyword": "Then "
});
formatter.match({
  "location": "LumenStepstoTest.navigate_to_Application_URL()"
});
formatter.result({
  "duration": 27850507100,
  "status": "passed"
});
formatter.match({
  "location": "LumenStepstoTest.verify_the_title_of_Home_Page()"
});
formatter.result({
  "duration": 9771600,
  "status": "passed"
});
formatter.match({
  "location": "LumenStepstoTest.user_Sign_in_the_application_with_User_id_and_Password()"
});
formatter.result({
  "duration": 8832924400,
  "status": "passed"
});
formatter.match({
  "location": "LumenStepstoTest.user_Search_item()"
});
formatter.result({
  "duration": 26549895000,
  "status": "passed"
});
formatter.match({
  "location": "LumenStepstoTest.click_on_Add_to_cart()"
});
formatter.result({
  "duration": 16254956200,
  "status": "passed"
});
formatter.match({
  "location": "LumenStepstoTest.navigate_to_the_Cart_and_validate_the_item()"
});
formatter.result({
  "duration": 17510592100,
  "status": "passed"
});
});