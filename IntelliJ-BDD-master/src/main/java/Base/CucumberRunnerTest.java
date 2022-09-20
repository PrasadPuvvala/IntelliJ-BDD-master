package Base;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.junit.runner.RunWith;
import java.io.IOException;
import org.junit.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
//import com.cucumber.listener.Reporter;
//import com.cucumber.listener.Reporter;

@RunWith(Cucumber.class)
@CucumberOptions(
	features = "src/test/resources/Features",
	glue= "StepsDefinitions",
	//tags = {"@Case1,@Case2"},
	tags = {"@Case1"},
	plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"},	
	strict = true,
    monochrome = true
	)


public class CucumberRunnerTest{

	@BeforeSuite
	public void startMethod()
	{
		System.out.println("Before Suite is run");
	}

	@AfterSuite
	public void endMethod()
	{
		System.out.println("After Suite is run");

	}
	/*@AfterClass
	public static void runTest() throws IOException {
		SendEmail se=new SendEmail();
		se.triggerEmail();
		}*/
	
}


	
