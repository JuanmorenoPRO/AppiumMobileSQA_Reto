$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/SelendroidForm.feature");
formatter.feature({
  "name": "User Registration",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "User wants to register in a mobile app",
  "description": "",
  "keyword": "Scenario"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "User is in the app",
  "keyword": "Given "
});
formatter.match({
  "location": "SelendroidFormStepDefinitions.user_is_in_the_app()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User wants to register in Selendroid",
  "keyword": "When "
});
formatter.match({
  "location": "SelendroidFormStepDefinitions.user_wants_to_register_in_selendroid()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Registration should be successfully",
  "keyword": "Then "
});
formatter.match({
  "location": "SelendroidFormStepDefinitions.registration_should_be_successfully()"
});
formatter.result({
  "status": "passed"
});
});