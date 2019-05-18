$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/MyApplication.feature");
formatter.feature({
  "line": 1,
  "name": "Gmail Testing",
  "description": "",
  "id": "gmail-testing",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Gmail Login",
  "description": "",
  "id": "gmail-testing;gmail-login",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@runthis"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "url opened",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "enter user id and click next",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "enter password",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "click login",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.url_opened()"
});
formatter.result({
  "duration": 8890950324,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enter_user_id_and_click_next()"
});
formatter.result({
  "duration": 1999211099,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.enter_password()"
});
formatter.result({
  "duration": 47884202,
  "error_message": "org.openqa.selenium.ElementNotInteractableException: Element \u003cdiv class\u003d\"Xb9hP\"\u003e is not reachable by keyboard\nBuild info: version: \u00273.4.0\u0027, revision: \u0027unknown\u0027, time: \u0027unknown\u0027\nSystem info: host: \u0027IBM515-PC0EUKMW\u0027, ip: \u00279.140.45.46\u0027, os.name: \u0027Windows 7\u0027, os.arch: \u0027amd64\u0027, os.version: \u00276.1\u0027, java.version: \u00271.8.0_131\u0027\nDriver info: org.openqa.selenium.firefox.FirefoxDriver\nCapabilities [{moz:profile\u003dC:\\Users\\IBM_ADMIN\\AppData\\Local\\Temp\\rust_mozprofile.Vg88pAf9olKz, rotatable\u003dfalse, timeouts\u003d{implicit\u003d0.0, pageLoad\u003d300000.0, script\u003d30000.0}, pageLoadStrategy\u003dnormal, moz:headless\u003dfalse, platform\u003dANY, moz:accessibilityChecks\u003dfalse, moz:useNonSpecCompliantPointerOrigin\u003dfalse, acceptInsecureCerts\u003dfalse, browserVersion\u003d61.0.1, platformVersion\u003d6.1, moz:processID\u003d11652.0, browserName\u003dfirefox, javascriptEnabled\u003dtrue, platformName\u003dwindows_nt, moz:webdriverClick\u003dtrue}]\nSession ID: efa7317a-bea0-4061-8a99-688c098fbf66\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)\r\n\tat sun.reflect.NativeConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat sun.reflect.DelegatingConstructorAccessorImpl.newInstance(Unknown Source)\r\n\tat java.lang.reflect.Constructor.newInstance(Unknown Source)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.createException(W3CHttpResponseCodec.java:150)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:115)\r\n\tat org.openqa.selenium.remote.http.W3CHttpResponseCodec.decode(W3CHttpResponseCodec.java:45)\r\n\tat org.openqa.selenium.remote.HttpCommandExecutor.execute(HttpCommandExecutor.java:164)\r\n\tat org.openqa.selenium.remote.service.DriverCommandExecutor.execute(DriverCommandExecutor.java:82)\r\n\tat org.openqa.selenium.remote.RemoteWebDriver.execute(RemoteWebDriver.java:637)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.execute(RemoteWebElement.java:272)\r\n\tat org.openqa.selenium.remote.RemoteWebElement.sendKeys(RemoteWebElement.java:96)\r\n\tat com.vijay.bdd.steps.stepDefinition.enter_password(stepDefinition.java:30)\r\n\tat ✽.Then enter password(features/MyApplication.feature:7)\r\n",
  "status": "failed"
});
formatter.match({
  "location": "stepDefinition.click_login()"
});
formatter.result({
  "status": "skipped"
});
formatter.scenario({
  "line": 11,
  "name": "Gmail Close",
  "description": "",
  "id": "gmail-testing;gmail-close",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 10,
      "name": "@runthis"
    }
  ]
});
formatter.step({
  "line": 12,
  "name": "Close browser",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.close_browser()"
});
formatter.result({
  "duration": 773885282,
  "status": "passed"
});
});