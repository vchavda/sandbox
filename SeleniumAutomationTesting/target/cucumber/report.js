$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/RegisterNewUser.feature");
formatter.feature({
  "line": 1,
  "name": "Register a new user",
  "description": "",
  "id": "register-a-new-user",
  "keyword": "Feature"
});
formatter.before({
  "duration": 4112001722,
  "status": "passed"
});
formatter.before({
  "duration": 1418353911,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Register new user",
  "description": "",
  "id": "register-a-new-user;register-new-user",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@runthis"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I navigate to the register page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I fill in the new user details",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should be registered to the system",
  "keyword": "Then "
});
formatter.match({
  "location": "RegisterNewUser.i_navigate_to_the_register_page()"
});
formatter.result({
  "duration": 6664761885,
  "status": "passed"
});
formatter.match({
  "location": "RegisterNewUser.i_fill_in_the_new_user_details()"
});
formatter.result({
  "duration": 2605962508,
  "status": "passed"
});
formatter.match({
  "location": "RegisterNewUser.i_should_be_registered_to_the_system()"
});
formatter.result({
  "duration": 42250,
  "status": "passed"
});
formatter.after({
  "duration": 1011565282,
  "status": "passed"
});
formatter.after({
  "duration": 1148564338,
  "status": "passed"
});
});