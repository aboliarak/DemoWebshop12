package com.stepefinition;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\abarak\\eclipse-workspace\\Maven_DemoWebshop\\src\\test\\java\\com\\feature\\demoweb.feature",
glue={"com.stepefinition"},
monochrome=true,
plugin={"pretty", "html:target/HtmlReports", "junit:target/JUnitReports/report.xml",
         "json:target/JSONReports/reports.json"},
strict=true
		)

public class TestRun {

}
