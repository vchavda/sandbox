$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("cucumber/calculator.feature");
formatter.feature({
  "line": 1,
  "name": "Calculator",
  "description": "As a user\r\nI want to use a calculator\r\nSo that I don\u0027t need to calculate myself",
  "id": "calculator",
  "keyword": "Feature"
});
formatter.before({
  "duration": 14514299,
  "status": "passed"
});
formatter.before({
  "duration": 71378,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Add two numbers",
  "description": "",
  "id": "calculator;add-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I add 2 and 3",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the result should be 5",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.i_have_a_calculator()"
});
formatter.result({
  "duration": 150783064,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "2",
      "offset": 6
    },
    {
      "val": "3",
      "offset": 12
    }
  ],
  "location": "CalculatorSteps.i_add_and(int,int)"
});
formatter.result({
  "duration": 2471558,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.the_result_should_be(int)"
});
formatter.result({
  "duration": 105016,
  "status": "passed"
});
formatter.before({
  "duration": 24203,
  "status": "passed"
});
formatter.before({
  "duration": 36919,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "Multiply two numbers",
  "description": "",
  "id": "calculator;multiply-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I multiply 9 and 3",
  "keyword": "When "
});
formatter.step({
  "line": 14,
  "name": "the result should be 27",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.i_have_a_calculator()"
});
formatter.result({
  "duration": 49636,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 11
    },
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "CalculatorSteps.i_multiply_and(int,int)"
});
formatter.result({
  "duration": 125937,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "27",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.the_result_should_be(int)"
});
formatter.result({
  "duration": 89428,
  "status": "passed"
});
formatter.before({
  "duration": 42253,
  "status": "passed"
});
formatter.before({
  "duration": 34459,
  "status": "passed"
});
formatter.scenario({
  "line": 16,
  "name": "Subtract two numbers",
  "description": "",
  "id": "calculator;subtract-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 17,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 18,
  "name": "I subtract 9 and 3",
  "keyword": "When "
});
formatter.step({
  "line": 19,
  "name": "the result should be 6",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.i_have_a_calculator()"
});
formatter.result({
  "duration": 25024,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "9",
      "offset": 11
    },
    {
      "val": "3",
      "offset": 17
    }
  ],
  "location": "CalculatorSteps.i_subtract_and(int,int)"
});
formatter.result({
  "duration": 149729,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "6",
      "offset": 21
    }
  ],
  "location": "CalculatorSteps.the_result_should_be(int)"
});
formatter.result({
  "duration": 75480,
  "status": "passed"
});
formatter.uri("cucumber/devide.feature");
formatter.feature({
  "line": 1,
  "name": "Devide",
  "description": "As a user\r\nI want to use a calculator1\r\nSo that I don\u0027t need to calculate myself",
  "id": "devide",
  "keyword": "Feature"
});
formatter.before({
  "duration": 50457,
  "status": "passed"
});
formatter.before({
  "duration": 33227,
  "status": "passed"
});
formatter.scenario({
  "line": 6,
  "name": "Devide two numbers",
  "description": "",
  "id": "devide;devide-two-numbers",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 7,
  "name": "I have a calculator",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I devide 10 and 2",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "the answer should be 5",
  "keyword": "Then "
});
formatter.match({
  "location": "CalculatorSteps.i_have_a_calculator()"
});
formatter.result({
  "duration": 40201,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "10",
      "offset": 9
    },
    {
      "val": "2",
      "offset": 16
    }
  ],
  "location": "DevideSteps.i_devide_and(int,int)"
});
formatter.result({
  "duration": 201416,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "5",
      "offset": 21
    }
  ],
  "location": "DevideSteps.the_answer_should_be(int)"
});
formatter.result({
  "duration": 129218,
  "status": "passed"
});
});