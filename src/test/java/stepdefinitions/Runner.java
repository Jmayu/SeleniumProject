package stepdefinitions;

import org.junit.runner.RunWith;

import io.cucumber.junit.CucumberOptions;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/features",
glue= {"stepdefinitions"},
monochrome=true,
dryRun=false,
tags = "@SmokeTests")
public class Runner {

}
