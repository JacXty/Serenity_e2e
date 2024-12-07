package starter.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginInterfaces {
    public static  final Target INPUT_USER_NAME = Target.the("Input donde ingresa el usuario").locatedBy("#user-name");
    public static  final Target INPUT_PASSWORD = Target.the("Input donde ingresar la contraseña").located(By.id("password"));
    public static  final Target BTN_LOGIN = Target.the("boton login").located(By.id("login-button"));
}
