package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actions.Click;
import starter.navigation.NavegateTo;
import net.serenitybdd.screenplay.Actor;
import starter.navigation.OpenPage;
import starter.task.IngresarLogin;
import starter.userinterfaces.LoginInterfaces;

public class LoginDefinition {
    @Given("{actor} ingresa a la pagina")
    public void Searching (Actor actor) {
        actor.wasAbleTo(NavegateTo.theSearchHomePage());
    }
    @When("{actor} ingresa el usuario {string} y constraseña {string}")
    public void ingresa_el_usuario(Actor actor,String username, String password) {

        actor.wasAbleTo(
                IngresarLogin.Loginuser(username,password)
        );
    }
    @When("{actor} selecciona el boton de ingresar")
    public void selecciona_el_boton_de_ingresar(Actor actor) {
        // Write code here that turns the phrase above into concrete actions
       actor.attemptsTo(
               Click.on(LoginInterfaces.BTN_LOGIN)
       );
    }

}

