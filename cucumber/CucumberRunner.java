package cucumber;
import org.junit.runner.*;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@Cucumber.Options(
		format = {"pretty"},
		features = {"src/cucumber"}
		)
public class CucumberRunner {

}
