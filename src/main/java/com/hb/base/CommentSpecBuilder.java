package com.hb.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;

public class CommentSpecBuilder extends Utilities {

	public RequestSpecification generateRequest(String ApiResource) throws FileNotFoundException

	{
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));

		Resources resource = Resources.valueOf(ApiResource);

		RequestSpecification reqSpec = new RequestSpecBuilder().setBaseUri(Utilities.getPropValue("baseUri").toString())
				.addFilter(Utilities.filter).setBasePath(resource.getResourcePath())
				.setContentType(Utilities.content_type).addFilter(RequestLoggingFilter.logRequestTo(log))
				.addFilter(ResponseLoggingFilter.logResponseTo(log)).build();
		return reqSpec;

	}

	public RequestSpecification generateRequest(String ApiResource, File file) throws FileNotFoundException

	{
		PrintStream log = new PrintStream(new FileOutputStream("logging.txt"));

		Resources resource = Resources.valueOf(ApiResource);

		RequestSpecification reqSpec = new RequestSpecBuilder().addMultiPart(file)
				.setBaseUri(Utilities.getPropValue("baseUri").toString()).addFilter(Utilities.filter)
				.setBasePath(resource.getResourcePath()).addHeader(Utilities.multiHeadName, Utilities.multiHeadValue)
				.addFilter(RequestLoggingFilter.logRequestTo(log)).addFilter(ResponseLoggingFilter.logResponseTo(log))
				.build();
		return reqSpec;

	}

}
