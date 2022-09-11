package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/CreateAccount.feature",glue= {"StepDefination"},
monochrome=true,
plugin = { "pretty", "html:target/Reports","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})

public class Runnable {

}
