package com.hb.base;

import io.restassured.filter.session.SessionFilter;

public class Constants {

	public final static String content_type = "Application/Json";
	public final static String properties_file_path = System.getProperty("user.dir")
			+ "/src/test/resources/com/hb/properties/project.properties";
	public final static String features_path = System.getProperty("user.dir") + "src/test/resources/com/hb/features";
	public final static String step_Definations = System.getProperty("user.dir") + "src/test/java/com/hb";
	public final static String htmlReport = System.getProperty("user.dir") + "target/Reports/testReport.html";
	public final static String jsonReport = System.getProperty("user.dir") + "target/Reports/testReport.json";
	public final static SessionFilter filter = new SessionFilter();
	public final static String multiHeadName = "X-Atlassian-Token";
	public final static String multiHeadValue = "no-check";

}
