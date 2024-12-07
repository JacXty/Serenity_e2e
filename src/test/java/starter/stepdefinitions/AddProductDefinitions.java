package starter.stepdefinitions;

import io.cucumber.java.en.And;
import net.serenitybdd.screenplay.Actor;
import starter.task.AddProduct;

public class AddProductDefinitions {
    @And("{actor} selecciona el primer producto {string} y el segundo producto {string}")
    public void he_selecciona_el_primer_producto(Actor actor,String producto1,String producto2) {
        // Write code here that turns the phrase above into concrete actions
        actor.attemptsTo(
                AddProduct.addProducts(producto1,producto2)
        );
    }

}

