package com.mushahid.bdd.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = { "pretty", "html:target/cucumber" },
        glue = "com.mushahid.bdd.steps",
        features = "classpath:cucumber"
)
public class RunCalculatorTest {

}
