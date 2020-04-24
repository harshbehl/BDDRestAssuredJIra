package com.hb.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class CommentSpecBuilder extends Utilities {

	public RequestSpecification generateRequest(String ApiResource) throws FileNotFoundException

	{

		Resources resource = Resources.valueOf(ApiResource);

		RequestSpecification reqSpec = new RequestSpecBuilder().setBaseUri(Utilities.getPropValue("baseUri").toString())
				.addFilter(Utilities.filter).setBasePath(resource.getResourcePath())
				.setContentType(Utilities.content_type)
				.addFilter(RequestLoggingFilter.logRequestTo(Utilities.getPrintStream()))
				.addFilter(ResponseLoggingFilter.logResponseTo(Utilities.getPrintStream())).build();
		return reqSpec;

	}

	public RequestSpecification generateRequest(String ApiResource, HashMap<String, String> pathParam)
			throws FileNotFoundException

	{

		Resources resource = Resources.valueOf(ApiResource);

		RequestSpecification reqSpec = new RequestSpecBuilder().addPathParams(pathParam)
				.setBaseUri(Utilities.getPropValue("baseUri").toString()).addFilter(Utilities.filter)
				.setBasePath(resource.getResourcePath()).setContentType(Utilities.content_type)
				.addFilter(RequestLoggingFilter.logRequestTo(Utilities.getPrintStream()))
				.addFilter(ResponseLoggingFilter.logResponseTo(Utilities.getPrintStream())).build();
		return reqSpec;

	}

	public RequestSpecification generateRequest(String ApiResource, HashMap<String, String> pathParam, File file)
			throws FileNotFoundException

	{

		Resources resource = Resources.valueOf(ApiResource);

		RequestSpecification reqSpec = new RequestSpecBuilder().addMultiPart(file).addPathParams(pathParam)
				.setBaseUri(Utilities.getPropValue("baseUri").toString()).addFilter(Utilities.filter)
				.setBasePath(resource.getResourcePath()).addHeader(Utilities.multiHeadName, Utilities.multiHeadValue)
				.addFilter(RequestLoggingFilter.logRequestTo(Utilities.getPrintStream()))
				.addFilter(ResponseLoggingFilter.logResponseTo(Utilities.getPrintStream())).build();
		return reqSpec;

	}

}
