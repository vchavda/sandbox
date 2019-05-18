package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        monochrome = true,
        format = { "pretty", "html:target/cucumber" },
        glue = "step_definitions",
        features = "classpath:features",
   	 	tags = {"@runthis"}
)

public class runner {

}
