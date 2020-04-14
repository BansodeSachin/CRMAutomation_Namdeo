package com.crm.cucumberOptions;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(  
	    features = "src/test/java/com/crm/features",
	    glue="stepDefinations")
public class TestRunner extends AbstractTestNGCucumberTests {

}