Feature: Testing the Comments functionality 

Scenario: Login into Jira 
	Given Login payload sent to "LoginResourcePath" 
		|username     |password  |
		|harsh.behl   |QAwe@91586|
	When http method is "Post" 
	Then server sends the repsonse status code as 200 
	
Scenario: Creating the issue in Jira 

	Given issueId as path parameter 
		|RES-9|
	And createComment payload sent to "CreateComResourcePath" 
	When http method is "Post" 
	Then server sends the repsonse status code as 201 
	And extract the "commentId" from response 
	
Scenario: Updating the issue in Jira 

	Given  issueId and commentId as path parameter 
		|RES-9|
	And updateComment payload is sent to "UpdateComResourcePath" 
	When http method is "Put" 
	Then server sends the repsonse status code as 200 
	
Scenario: Uploading the file for an issue 

	Given issueId as path parameter 
		|RES-9|
	And file to upload 
	And with required headers request is sent to "uploadAttachmentPath" 
	When http method is "Post" 
	Then server sends the repsonse status code as 200 
	
	
	
	
	
	
	
	
	
