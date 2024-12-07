package starter.stepdefinitions;

import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import starter.userinterfaces.CheckoutInterfaces;

public class ViewCar {
    @Then("{actor} selecciona el carrito")
        public void he_elecciona_el_carrito(Actor actor) {
            actor.attemptsTo(
                    Click.on("div.page_wrapper div:nth-child(1) div.header_container:nth-child(1) div.primary_header div.shopping_cart_container:nth-child(3) > a.shopping_cart_link"),
                    Click.on(CheckoutInterfaces.BTN_CHECKOUT)
            );
        }

}
