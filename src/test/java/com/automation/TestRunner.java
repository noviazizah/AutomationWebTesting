package com.automation;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/logout.feature", glue = { "com.automation" }, plugin = {
                "html:target/cucumber-reports.html" })

public class TestRunner {
}
