import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.SnippetType;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/main/resources",
        glue = "",
        dryRun = false,
        strict = true,
        snippets = SnippetType.UNDERSCORE)
public class CucumberTest {


}
