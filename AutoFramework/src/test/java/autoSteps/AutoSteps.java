package autoSteps;

import net.thucydides.core.annotations.Step;

public class AutoSteps {

	@Step 
	public String reusableStep(String name)
	{
		return ("Hello " + name);
	}
	
	
	@Step ("This is another way to describe the step and passing the parameter: {0}")
	public String reusableStep2(String name)
	{
		return ("Hello " + name);
	}

	
}
