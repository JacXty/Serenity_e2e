package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.userinterfaces.AddProductsInterfaces;
import starter.userinterfaces.FillCheckoutForm;

public class ChekoutForm implements Task {
    private  String firstName;
    private  String lastName;
    private  String zipCode;

    public ChekoutForm(String firstName, String lastName, String zipCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.zipCode = zipCode;
    }

    public static ChekoutForm withDetails(String firstName, String lastName, String zipCode) {
        return Tasks.instrumented(ChekoutForm.class,firstName,lastName,zipCode);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(firstName).into(FillCheckoutForm.FIRST_NAME),
                Enter.theValue(lastName).into(FillCheckoutForm.LAST_NAME),
                Enter.theValue(zipCode).into(FillCheckoutForm.CODE),
                Click.on(FillCheckoutForm.BTN_CHEKOUT_Continue)
        );
    }
}
