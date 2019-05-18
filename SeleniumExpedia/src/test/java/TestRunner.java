import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="classpath:features", 
				 format={"pretty", "html:target/Reports"}, 
				 glue = "src/test/java"
				 )

public class TestRunner {

}
