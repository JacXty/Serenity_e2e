package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;
import starter.userinterfaces.LoginInterfaces;

public class IngresarLogin implements Task {

    private final String username;
    private final String password;

    public IngresarLogin(String username,String password) {
        this.username = username;
        this.password = password;
    }

    public static IngresarLogin Loginuser(String username,String password) {
        return Tasks.instrumented(IngresarLogin.class,username,password);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Enter.theValue(username).into(LoginInterfaces.INPUT_USER_NAME),
                Enter.theValue(password).into(LoginInterfaces.INPUT_PASSWORD)
        );

    }
}
