package hellocucumber.src.test.java.book.BookStepDefinitions;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features= {"src/test/resources/book/"} ,
    plugin = {"pretty"})
public class RunBookTest {
}
