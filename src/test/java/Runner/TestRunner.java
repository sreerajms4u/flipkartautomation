package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
  features="C:/Users/sreeraj.surendran/workspace/FlipkartCucumberFramework/src/test/java/Feature/LoginFlipkart.feature"
  ,glue={"StepDefinition"}
  )
 
public class TestRunner {

}
