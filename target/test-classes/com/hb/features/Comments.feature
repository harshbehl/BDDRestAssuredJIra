Feature: Testing the Comments functionality

  Scenario: Login into Jira
    Given username and password as payload
    |username     |password  |
    |harsh.behl   |QAwe@91586|
    When request is sent to "LoginResourcePath" by http method "Post"
    Then server sends the repsonse status code as 200

  #Scenario: Creating the issue in Jira
  
   # Given issueId as path paremter
   # And given createComment payload
   # When request is sent to "CreateComResourcePath" by http method "Post"
   # Then server sends the repsonse status code as 201
   # And extract the response
   # And extract the commentid from response
    
