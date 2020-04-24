$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/com/hb/features/Comments.feature");
formatter.feature({
  "name": "Testing the Comments functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login into Jira",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "username and password as payload",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.username_and_password_as_payload(java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "request is sent to \"LoginResourcePath\" by http method \"Post\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.request_is_sent_to_LoginAPI_by_http_method_Post(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "server sends the repsonse status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.server_sends_the_repsonse_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
});