package runner;

import org.junit.runner.RunWith;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import CommonFunctions.Commonfunctions;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.CucumberFeatureWrapper;
import cucumber.api.testng.TestNGCucumberRunner;

//@RunWith(Cucumber.class)
@CucumberOptions(features="Features/LoginTest.feature",glue="stepDefinitions")
public class Runner extends Commonfunctions{
	
	private TestNGCucumberRunner testNGCucumberRunner=new TestNGCucumberRunner(this.getClass());

	@Test(dataProvider="features")
	public void feature(CucumberFeatureWrapper cucumberfeaturewrapper)
	{
		testNGCucumberRunner.runCucumber(cucumberfeaturewrapper.getCucumberFeature());
	}
	
	@DataProvider
	public Object[][] features()
	{
		return testNGCucumberRunner.provideFeatures();
	}
}
