package com.basic.postFromTextFileSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


	
@RunWith(Cucumber.class)
@CucumberOptions(
		
			monochrome=true,
			dryRun=false,
			//this path is taken from "postfromtextfile" which is present in "resource"
			features= {"src/test/java/com/basic/postStringJsonSD/PostFromTextFile.feature"},
			//this path is taken from "postfromtextfileSD" copy the name of the package i.e "com.basic.postFromTextFileSD"  then remove dots n keep slashes.
			glue={"com/basic/postFromTextFileSD/"},
			plugin={"pretty",
					"html:target/cucumber-htmlreport",
					"json:target/cucumber-report5.json",
					"com.cucumber.listener.ExtentCucumberFormatter:target/ExtentReport1.html"
			}
		)
		

public class RunMyPostFromTextFileTest {


}
