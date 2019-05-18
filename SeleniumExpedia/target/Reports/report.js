$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/HomePage.feature");
formatter.feature({
  "line": 1,
  "name": "HomePage",
  "description": "As a user\r\nI want to user when I log into a url\r\nI want to verify I am on the correct home page",
  "id": "homepage",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 6,
  "name": "Url log in",
  "description": "",
  "id": "homepage;url-log-in",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "url opens",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "page loads",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "verify on the correct home page",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});