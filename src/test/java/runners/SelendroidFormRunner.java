package runners;





import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src\\test\\resources\\features\\SelendroidForm.feature",
        glue = "stepdefinitions",
        snippets = SnippetType.CAMELCASE,
        plugin = {"pretty","html:target/cucumber-html-report.html"})


public class SelendroidFormRunner {
}
