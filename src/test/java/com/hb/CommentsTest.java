package com.hb;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = {
		"" }, monochrome = true, strict = true, plugin = { "html:target/reports/reports.html",
				"json:/home/honey/.jenkins/workspace/BDDRestAssured/target/reports/reports.json" })

public class CommentsTest {

}
