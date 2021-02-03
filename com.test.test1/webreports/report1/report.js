$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("featurefiles/test1.feature");
formatter.feature({
  "line": 1,
  "name": "this is test1",
  "description": "",
  "id": "this-is-test1",
  "keyword": "Feature"
});
formatter.before({
  "duration": 254800,
  "status": "passed"
});
formatter.background({
  "line": 2,
  "name": "this is background",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 3,
  "name": "this is background",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "line": 4,
  "name": "this is test1",
  "description": "",
  "id": "this-is-test1;this-is-test1",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user is on one",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user is on \"two\"",
  "rows": [
    {
      "cells": [
        "a",
        "b"
      ],
      "line": 7
    },
    {
      "cells": [
        "hello",
        "google"
      ],
      "line": 8
    }
  ],
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "user is on three",
  "keyword": "And "
});
formatter.match({
  "location": "stepdef1.user_is_on_one()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "arguments": [
    {
      "val": "two",
      "offset": 12
    }
  ],
  "location": "stepdef1.user_is_on(String,DataTable)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "stepdef1.user_is_on_three()"
});
formatter.result({
  "status": "skipped"
});
formatter.after({
  "duration": 42700,
  "status": "passed"
});
});