package com.hb;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = { "src/test/resources" }, glue = {
		"" }, monochrome = true, strict = true, plugin = { "html:target/reports/html",
				"json:target/reports/Json/reports.json", "pretty" })

public class CommentsTest {

}
