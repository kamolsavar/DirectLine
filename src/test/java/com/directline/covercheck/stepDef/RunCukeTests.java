package com.directline.covercheck.stepDef;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/java/resources",
        tags={"@smoke"},
        plugin= {"junit:target/junit-reports","json:target/json", "html:target/selenium-reports"}
        )
public class RunCukeTests {

}
