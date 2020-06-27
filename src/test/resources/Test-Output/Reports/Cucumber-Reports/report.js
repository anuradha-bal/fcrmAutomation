$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/Test-Data/FeatureFiles/login.feature");
formatter.feature({
  "line": 1,
  "name": "To Launch CRM Application Home Page",
  "description": "",
  "id": "to-launch-crm-application-home-page",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Free CRM Login Page",
  "description": "",
  "id": "to-launch-crm-application-home-page;free-crm-login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on free crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email \"\u003cemail\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters password \"\u003cpassword\u003e\"",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on free crm home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.examples({
  "line": 12,
  "name": "",
  "description": "",
  "id": "to-launch-crm-application-home-page;free-crm-login-page;",
  "rows": [
    {
      "cells": [
        "email",
        "password"
      ],
      "line": 13,
      "id": "to-launch-crm-application-home-page;free-crm-login-page;;1"
    },
    {
      "cells": [
        "anu1311balas@gmail.com",
        "Anajay123$"
      ],
      "line": 14,
      "id": "to-launch-crm-application-home-page;free-crm-login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 14,
  "name": "Free CRM Login Page",
  "description": "",
  "id": "to-launch-crm-application-home-page;free-crm-login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user is on free crm login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enters email \"anu1311balas@gmail.com\"",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enters password \"Anajay123$\"",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user clicks on login button",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "user is on free crm home page",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginStepDef.setup()"
});
formatter.result({
  "duration": 9863417200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "anu1311balas@gmail.com",
      "offset": 19
    }
  ],
  "location": "LoginStepDef.enterEmail(String)"
});
formatter.result({
  "duration": 186065300,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Anajay123$",
      "offset": 22
    }
  ],
  "location": "LoginStepDef.enterPassword(String)"
});
formatter.result({
  "duration": 76749900,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.login()"
});
formatter.result({
  "duration": 56362400,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.loggedOn()"
});
formatter.result({
  "duration": 3327006200,
  "status": "passed"
});
formatter.match({
  "location": "LoginStepDef.tearDown()"
});
formatter.result({
  "duration": 653651500,
  "status": "passed"
});
});