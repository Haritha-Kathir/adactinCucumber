$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Adactin.feature");
formatter.feature({
  "line": 1,
  "name": "Hotel Booking In Adactin Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"\u003cUsername\u003e\" In The Username Field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"\u003cpassword\u003e\" In The Password Field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And Navigate to Search Hotel Page",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;",
  "rows": [
    {
      "cells": [
        "Username",
        "password"
      ],
      "line": 11,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;1"
    },
    {
      "cells": [
        "Haritha11",
        "R3230N"
      ],
      "line": 12,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;2"
    },
    {
      "cells": [
        "aaa",
        "bbb"
      ],
      "line": 13,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;3"
    },
    {
      "cells": [
        "asdv",
        "1235"
      ],
      "line": 14,
      "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;4"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"Haritha11\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"R3230N\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And Navigate to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 6218867399,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Haritha11",
      "offset": 16
    }
  ],
  "location": "stepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 1509913900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "R3230N",
      "offset": 16
    }
  ],
  "location": "stepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 586353500,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Click_The_Login_Button_And_Navigate_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1577977999,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;3",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"aaa\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"bbb\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And Navigate to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 730135600,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "aaa",
      "offset": 16
    }
  ],
  "location": "stepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 980740700,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "bbb",
      "offset": 16
    }
  ],
  "location": "stepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 487801399,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Click_The_Login_Button_And_Navigate_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 1724522900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "User Login In The Web Application",
  "description": "",
  "id": "hotel-booking-in-adactin-application;user-login-in-the-web-application;;4",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@smokeTest"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "user Launch The Adactin Application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user Enter The \"asdv\" In The Username Field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user Enter The \"1235\" In The Password Field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user Click The Login Button And Navigate to Search Hotel Page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefinition.user_Launch_The_Adactin_Application()"
});
formatter.result({
  "duration": 510622900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "asdv",
      "offset": 16
    }
  ],
  "location": "stepDefinition.user_Enter_The_In_The_Username_Field(String)"
});
formatter.result({
  "duration": 563843800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1235",
      "offset": 16
    }
  ],
  "location": "stepDefinition.user_Enter_The_In_The_Password_Field(String)"
});
formatter.result({
  "duration": 518469200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.user_Click_The_Login_Button_And_Navigate_to_Search_Hotel_Page()"
});
formatter.result({
  "duration": 762352900,
  "status": "passed"
});
});