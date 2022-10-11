package org.executionTestCase;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"C:\\Users\\91971\\eclipse-workspace\\CucumberLetCodeAutomation\\src\\test\\resources\\Features\\LetCodeInitialPage.feature"},glue = "org.test",monochrome = true ,dryRun = false,plugin = "html:C:\\Users\\91971\\eclipse-workspace\\CucumberLetCodeAutomation\\target\\dass.html")
public class TestRunner{

}
