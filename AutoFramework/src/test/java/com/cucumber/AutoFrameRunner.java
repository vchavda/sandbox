package com.cucumber;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/",
				 glue = "AutoCucumberSteps"
)
// the above path will run all the features within that features folder.

public class AutoFrameRunner {
		

}
