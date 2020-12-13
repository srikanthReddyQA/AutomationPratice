$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Login.feature");
formatter.feature({
  "name": "To verify Practice Page in rahulshatty academy",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "To verify gmail functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "open the browser \"\u003cBrowser\u003e\" and launch the gmail application",
  "keyword": "Given "
});
formatter.step({
  "name": "user enter the username\"\u003cUsername\u003e\" and Password \"\u003cPassword\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.step({
  "name": "User should navigate to Gmail home screen",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Browser",
        "Username",
        "Password"
      ]
    },
    {
      "cells": [
        "chrome",
        "srikanthreddy5c0@gmail.com",
        "srisrikanthra1"
      ]
    }
  ]
});
formatter.scenario({
  "name": "To verify gmail functionality",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "open the browser \"chrome\" and launch the gmail application",
  "keyword": "Given "
});
formatter.match({
  "location": "MyStepdefs.openTheBrowserAndLaunchTheGmailApplication(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enter the username\"srikanthreddy5c0@gmail.com\" and Password \"srisrikanthra1\"",
  "keyword": "When "
});
formatter.match({
  "location": "MyStepdefs.userEnterTheUsernameAndPassword(String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "click on login button",
  "keyword": "And "
});
formatter.match({
  "location": "MyStepdefs.clickOnLoginButton()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to Gmail home screen",
  "keyword": "Then "
});
