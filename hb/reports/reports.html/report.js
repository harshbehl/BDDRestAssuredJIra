$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/io/cucumber/Comments.feature");
formatter.feature({
  "name": "Testing the Comments functionality",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
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
  "location": "io.cucumber.StepDefinationComments.username_and_password_as_payload(java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "request is sent to \"LoginAPI\" by http method \"Post\"",
  "keyword": "When "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.request_is_sent_to_LoginAPI_by_http_method_Post(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "server sends the repsonse status code as 200",
  "keyword": "Then "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.server_sends_the_repsonse_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Creating the issue in Jira",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "issueId as path paremter",
  "keyword": "Given "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.issueid_as_path_paremter()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "given createComment payload",
  "keyword": "And "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.given_createComment_payload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "request is sent to \"CreateCommentAPI\" by http method \"Post\"",
  "keyword": "When "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.request_is_sent_to_LoginAPI_by_http_method_Post(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "server sends the repsonse status code as 201",
  "keyword": "Then "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.server_sends_the_repsonse_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "extract the response",
  "keyword": "And "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.extract_the_response()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "extract the commentid from response",
  "keyword": "And "
});
formatter.match({
  "location": "io.cucumber.StepDefinationComments.extract_the_commentid_from_response()"
});
formatter.result({
  "status": "passed"
});
});