package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.task.ChekoutForm;
import starter.userinterfaces.AddProductsInterfaces;
import starter.userinterfaces.CheckoutInterfaces;
import starter.userinterfaces.FillCheckoutForm;

public class FillCheckoutFormDefinitions {
    @And("{actor} completa el formulario de compra {string} {string} {string}")
    public void he_elecciona_el_carrito(Actor actor,String First_Name,String Last_Name,String Zip_Code) {
        actor.attemptsTo(
                ChekoutForm.withDetails(First_Name, Last_Name, Zip_Code)
        );
    }
    @And("{actor} finaliza compra")
    public void finaliza_compra(Actor actor) {
        actor.attemptsTo(
                Click.on(FillCheckoutForm.BTN_CHEKOUT_Buy)
        );
    }
    @And("{actor} valida mensaje de compra exitosa {string}")
    public void valida_mensaje(Actor actor,String message) {
        actor.attemptsTo(
                Ensure.that(TextContent.of(CheckoutInterfaces.Message_Success.of(message)))
                        .isEqualTo("Thank you for your order!")
        );
    }
}
