package hellocucumber.src.java.hellocucumber.Stepdefs;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features= {"src/test/resources/hellocucumber/"} ,
    plugin = {"pretty"})
public class RunCucumberTest {
}
