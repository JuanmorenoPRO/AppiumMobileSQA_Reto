package tasks;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import ui.SelendroidUis;
import utils.SpecialMethods;

public class RegisterUser implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        SpecialMethods.configProperties();
        actor.attemptsTo(
                Click.on(SelendroidUis.SING_UP_BTN),
                Enter.theValue(SpecialMethods.properties.getProperty("userName")).into(SelendroidUis.USERNAME_FIELD),
                Enter.theValue(SpecialMethods.properties.getProperty("userEmail")).into(SelendroidUis.EMAIL_FIELD),
                Enter.theValue(SpecialMethods.properties.getProperty("password")).into(SelendroidUis.PASSWORD_FIELD),
                Enter.theValue(SpecialMethods.properties.getProperty("name")).into(SelendroidUis.NAME_FIELD),
                Click.on(SelendroidUis.PROGRAMMING_SELECT),
                Click.on(SelendroidUis.PROGRAMMING_OPTION),
                Click.on(SelendroidUis.ACCEPT_CHX),
                Click.on(SelendroidUis.REGISTER_BTN)
        );
    }

    public static RegisterUser inSelendroid(){
        return Instrumented.instanceOf(RegisterUser.class).withProperties();
    }
}
