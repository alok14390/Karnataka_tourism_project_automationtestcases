package test_runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features="src/test/resources/Search/Search.feature",glue= {"definition"},tags="@PositiveTesting",plugin={"html:testoutput/alok.html"})
public class test_runner extends AbstractTestNGCucumberTests{}
