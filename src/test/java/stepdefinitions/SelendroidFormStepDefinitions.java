package stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import driver.DriverAppiumAndroid;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.WebElementQuestion;
import org.openqa.selenium.WebElement;
import tasks.RegisterUser;
import ui.SelendroidUis;

import java.io.IOException;

public class SelendroidFormStepDefinitions {

    @Before
    public void before() throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("User is in the app")
    public void user_is_in_the_app()  {
        OnStage.theActorCalled("").can(BrowseTheWeb.with(DriverAppiumAndroid.yourBrowser().on()));
    }

    @When("User wants to register in Selendroid")
    public void user_wants_to_register_in_selendroid() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUser.inSelendroid());

    }

    @Then("Registration should be successfully")
    public void registration_should_be_successfully() {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(WebElementQuestion.the(SelendroidUis.VERIFY_USER), WebElementStateMatchers.isVisible()));
    }
}
