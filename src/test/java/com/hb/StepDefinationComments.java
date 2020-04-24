package com.hb;

import static io.restassured.RestAssured.given;
import static org.assertj.core.api.Assertions.assertThat;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.hb.Payload.CreateComChildPojo;
import com.hb.Payload.CreateComParentPojo;
import com.hb.Payload.LoginPojo;
import com.hb.base.CommentSpecBuilder;
import com.hb.base.Utilities;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class StepDefinationComments extends CommentSpecBuilder {
	LoginPojo logPayLoad = null;
	CreateComChildPojo createChildLoad = null;
	CreateComParentPojo createParentLoad = null;
	RequestSpecification reqSpec = null;
	ResponseSpecification resSpec = null;
	static CommentSpecBuilder spec = null;
	Response response = null;
	static String commentId = null;
	HashMap<String, String> pathParam = null;
	static File file = null;

	@Given("Login payload sent to {string}")
	public void login_payload_sent_to(String ApiResource, List<Map<String, String>> data) throws FileNotFoundException {
		logPayLoad = new LoginPojo();
		logPayLoad.setUsername(data.get(0).get("username"));
		logPayLoad.setPassword(data.get(0).get("password"));
		spec = new CommentSpecBuilder();
		reqSpec = spec.generateRequest(ApiResource).body(logPayLoad);
	}

	@When("http method is {string}")
	public void http_method_is(String httpMethod) {
		if (httpMethod.equalsIgnoreCase("Post"))
			response = given().spec(reqSpec).when().post();
		else if (httpMethod.equalsIgnoreCase("Put"))
			response = given().spec(reqSpec).when().put();
		else
			response = given().spec(reqSpec).when().delete();
	}

	@Then("server sends the repsonse status code as {int}")
	public void server_sends_the_repsonse_status_code_as(int statusCode) {
		assertThat(response.getStatusCode()).isEqualTo(statusCode);
	}

	@Given("issueId as path parameter")
	public void as_path_paremter(List<String> data) {
		pathParam = new HashMap<String, String>();
		pathParam.put("issueId", data.get(0));

	}

	@And("createComment payload sent to {string}")
	public void createcomment_payload_sent_to(String ApiResource) throws FileNotFoundException {
		createChildLoad = new CreateComChildPojo();
		createChildLoad.setType("role");
		createChildLoad.setValue("Administrators");
		createParentLoad = new CreateComParentPojo();
		createParentLoad.setVisble(createChildLoad);
		createParentLoad.setBody("This is comment via BDD Rest Assured Framework");
		System.out.println(Utilities.filter.getSessionId());
		reqSpec = spec.generateRequest(ApiResource, pathParam).body(createParentLoad);
	}

	@Then("extract the {string} from response")
	public void extract_the_from_response(String key) {
		commentId = Utilities.getJsonPath(response.asString(), "id");

	}

	@Given("issueId and commentId as path parameter")
	public void issueid_and_commentId_as_path_parameter(List<String> data) {
		pathParam = new HashMap<String, String>();
		pathParam.put("issueId", data.get(0));
		pathParam.put("commentId", commentId);
	}

	@Given("updateComment payload is sent to {string}")
	public void updatecomment_payload_is_sent_to(String ApiResource) throws FileNotFoundException {

		createChildLoad = new CreateComChildPojo();
		createChildLoad.setType("role");
		createChildLoad.setValue("Administrators");
		createParentLoad = new CreateComParentPojo();
		createParentLoad.setVisble(createChildLoad);
		createParentLoad.setBody("This is comment updated comment for BDD Rest Assured Framework");
		reqSpec = spec.generateRequest(ApiResource, pathParam).body(createParentLoad);
	}

	@Given("with required headers request is sent to {string}")
	public void with_required_headers_request_is_sent_to(String ApiResource) throws FileNotFoundException {
		reqSpec = spec.generateRequest(ApiResource, pathParam, file).header(Utilities.multiHeadName,
				Utilities.multiHeadValue);
	}

	@And("file to upload")
	public void file_to_upload() {
		file = new File("pom.xml");
	}

}
