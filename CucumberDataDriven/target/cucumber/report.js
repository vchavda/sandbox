$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/Sum.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber can convert Gherkin data tables to a list of a type you specify.",
  "description": "",
  "id": "cucumber-can-convert-gherkin-data-tables-to-a-list-of-a-type-you-specify.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "The sum of a list of numbers should be calculated",
  "description": "",
  "id": "cucumber-can-convert-gherkin-data-tables-to-a-list-of-a-type-you-specify.;the-sum-of-a-list-of-numbers-should-be-calculated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "a list of numbers",
  "rows": [
    {
      "cells": [
        "10"
      ],
      "line": 5
    },
    {
      "cells": [
        "20"
      ],
      "line": 6
    },
    {
      "cells": [
        "30"
      ],
      "line": 7
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I summarize them",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should get 60",
  "keyword": "Then "
});
formatter.match({
  "location": "Sum.a_list_of_numbers(Integer\u003e)"
});
formatter.result({
  "duration": 141343509,
  "status": "passed"
});
formatter.match({
  "location": "Sum.i_summarize_them()"
});
formatter.result({
  "duration": 164099,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "60",
      "offset": 13
    }
  ],
  "location": "Sum.i_should_get(int)"
});
formatter.result({
  "duration": 8211497,
  "status": "passed"
});
formatter.uri("features/ThreeColumnTable.feature");
formatter.feature({
  "line": 1,
  "name": "Cucumber can convert a Gherkin table to to a map.",
  "description": "This an example of a more complicated price list.",
  "id": "cucumber-can-convert-a-gherkin-table-to-to-a-map.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 4,
  "name": "An international coffee shop must handle currencies",
  "description": "",
  "id": "cucumber-can-convert-a-gherkin-table-to-to-a-map.;an-international-coffee-shop-must-handle-currencies",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "the price list for an international coffee shop",
  "rows": [
    {
      "cells": [
        "product",
        "currency",
        "price"
      ],
      "line": 6
    },
    {
      "cells": [
        "coffee",
        "EUR",
        "1"
      ],
      "line": 7
    },
    {
      "cells": [
        "donut",
        "SEK",
        "18"
      ],
      "line": 8
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I buy 1 coffee and 1 donut",
  "keyword": "When "
});
formatter.step({
  "line": 10,
  "name": "should I pay 1 EUR and 18 SEK",
  "keyword": "Then "
});
formatter.match({
  "location": "ThreeColumnTable.the_price_list_for_an_international_coffee_shop(Price\u003e)"
});
formatter.result({
  "duration": 12222068,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 6
    },
    {
      "val": "coffee",
      "offset": 8
    },
    {
      "val": "1",
      "offset": 19
    },
    {
      "val": "donut",
      "offset": 21
    }
  ],
  "location": "ThreeColumnTable.i_buy_coffee_and_donut(int,String,int,String)"
});
formatter.result({
  "duration": 236712,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 13
    },
    {
      "val": "18",
      "offset": 23
    }
  ],
  "location": "ThreeColumnTable.should_I_pay_EUR_and_SEK(int,int)"
});
formatter.result({
  "duration": 154663,
  "status": "passed"
});
formatter.uri("features/TwoColumnTable.feature");
formatter.feature({
  "line": 1,
  "name": "Two column data driven.",
  "description": "",
  "id": "two-column-data-driven.",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "The sum of a list of numbers should be calculated",
  "description": "",
  "id": "two-column-data-driven.;the-sum-of-a-list-of-numbers-should-be-calculated",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "the price list for a coffee shop",
  "rows": [
    {
      "cells": [
        "coffee",
        "1"
      ],
      "line": 5
    },
    {
      "cells": [
        "donut",
        "2"
      ],
      "line": 6
    }
  ],
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I order 1 coffee and 1 donut",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "I should pay 3",
  "keyword": "Then "
});
formatter.match({
  "location": "TwoColumnTable.the_price_list_for_a_coffee_shop(String,Integer\u003e)"
});
formatter.result({
  "duration": 315890,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 8
    },
    {
      "val": "coffee",
      "offset": 10
    },
    {
      "val": "1",
      "offset": 21
    },
    {
      "val": "donut",
      "offset": 23
    }
  ],
  "location": "TwoColumnTable.i_order_Coffee_and_Donut(int,String,int,String)"
});
formatter.result({
  "duration": 237533,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 13
    }
  ],
  "location": "TwoColumnTable.i_should_pay(int)"
});
formatter.result({
  "duration": 134150,
  "status": "passed"
});
});