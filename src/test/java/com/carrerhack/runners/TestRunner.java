package com.carrerhack.runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		
	features = "Features",
	glue = "com.carrerhack.steps"
		
	)

public class TestRunner extends AbstractTestNGCucumberTests {

}
