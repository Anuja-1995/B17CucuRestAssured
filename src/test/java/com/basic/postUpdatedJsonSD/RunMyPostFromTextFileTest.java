package com.basic.postUpdatedJsonSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			features= {"src/test/java/com/basic/postUpdatedJsonSD/user.json"},//this path is copied from goint to the properties of user.json and then copy the path of it and paste it here.
			glue={"com/basic/postUpdatedJsonSD/"},//this path is copied from the name of the package.
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report4.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
