$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/login.feature");
formatter.feature({
  "name": "Feature to test login functionality",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenario({
  "name": "Validate Volunteer Sign up is working",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "browser is open",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefination.loginSteps.browser_is_open()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User is on Volunteer Sign up page",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefination.loginSteps.user_is_on_Volunteer_Sign_up_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters text fields",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.loginSteps.user_enters_text_fields()"
});
formatter.result({
  "error_message": "io.cucumber.java.PendingException: TODO: implement me\r\n\tat StepDefination.loginSteps.user_enters_text_fields(loginSteps.java:35)\r\n\tat ✽.User enters text fields(file:///C:/Users/vadhav/eclipse-workspace/CucumberJava/src/test/resources/Features/login.feature:7)\r\n",
  "status": "pending"
});
formatter.step({
  "name": "User selects radio button \u0026 checkbox",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.loginSteps.user_selects_radio_button_checkbox()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User selects option from drop down",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.loginSteps.user_selects_option_from_drop_down()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User uploads file",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefination.loginSteps.user_uploads_file()"
});
formatter.result({
  "status": "skipped"
});
formatter.step({
  "name": "User clicks on submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefination.loginSteps.user_clicks_on_submit_button()"
});
formatter.result({
  "status": "skipped"
});
});