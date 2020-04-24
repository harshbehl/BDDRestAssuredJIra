package com.hb;

import java.io.FileNotFoundException;
import java.util.List;
import java.util.Map;

import com.hb.Payload.CreateComChildPojo;
import com.hb.Payload.CreateComParentPojo;
import com.hb.Payload.LoginPojo;
import com.hb.base.CommentSpecBuilder;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.*;


public class StepDefinationComments extends CommentSpecBuilder {
	LoginPojo logPayLoad = null;
	CreateComChildPojo createChildLoad = null;
	CreateComParentPojo createParentLoad = null;
	RequestSpecification reqSpec = null;
	ResponseSpecification resSpec = null;
	CommentSpecBuilder spec = null;
	Response response = null;

	@Given("username and password as payload")
	public void username_and_password_as_payload(List<Map<String, String>> data) {
		logPayLoad = new LoginPojo();
		logPayLoad.setUsername(data.get(0).get("username"));
		logPayLoad.setPassword(data.get(0).get("password"));

	}

	@When("request is sent to {string} by http method {string}")
	public void request_is_sent_to_LoginAPI_by_http_method_Post(String apiName, String httpMethod) {
		spec = new CommentSpecBuilder();
		try {
			reqSpec = spec.generateRequest(apiName);
			if (httpMethod.equalsIgnoreCase("Post"))
				response = given().spec(reqSpec).body(logPayLoad).when().post().then().extract().response();

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Then("server sends the repsonse status code as {int}")
	public void server_sends_the_repsonse_status_code_as(int statusCode) {
	   assertThat(response.getStatusCode()).isEqualTo(statusCode);
	   }

	/*@Given("issueId as path paremter")
	public void issueid_as_path_paremter() {
		System.out.println(System.getProperty("user.dir"));
	}

	@Given("given createComment payload")
	public void given_createComment_payload() {

	}

	@Then("extract the response")
	public void extract_the_response() {

	}

	@Then("extract the commentid from response")
	public void extract_the_commentid_from_response() {

	}*/

}
