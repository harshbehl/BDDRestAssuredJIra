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
  "name": "Login payload sent to \"LoginResourcePath\"",
  "rows": [
    {},
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.login_payload_sent_to(java.lang.String,java.util.List\u003cjava.util.Map\u003cjava.lang.String, java.lang.String\u003e\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "http method is \"Post\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.http_method_is(java.lang.String)"
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
formatter.scenario({
  "name": "Creating the issue in Jira",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "issueId as path parameter",
  "rows": [
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.as_path_paremter(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "createComment payload sent to \"CreateComResourcePath\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.createcomment_payload_sent_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "http method is \"Post\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.http_method_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "server sends the repsonse status code as 201",
  "keyword": "Then "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.server_sends_the_repsonse_status_code_as(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "extract the \"commentId\" from response",
  "keyword": "And "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.extract_the_from_response(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Updating the issue in Jira",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "issueId and commentId as path parameter",
  "rows": [
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.issueid_and_commentId_as_path_parameter(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "updateComment payload is sent to \"UpdateComResourcePath\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.updatecomment_payload_is_sent_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "http method is \"Put\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.http_method_is(java.lang.String)"
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
formatter.scenario({
  "name": "Uploading the file for an issue",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "issueId as path parameter",
  "rows": [
    {}
  ],
  "keyword": "Given "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.as_path_paremter(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "file to upload",
  "keyword": "And "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.file_to_upload()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "with required headers request is sent to \"uploadAttachmentPath\"",
  "keyword": "And "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.with_required_headers_request_is_sent_to(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "http method is \"Post\"",
  "keyword": "When "
});
formatter.match({
  "location": "com.hb.StepDefinationComments.http_method_is(java.lang.String)"
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