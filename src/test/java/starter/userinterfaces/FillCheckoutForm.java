package starter.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class FillCheckoutForm {
    public static  final Target FIRST_NAME = Target.the(" Nombre").located(By.id("first-name"));
    public static  final Target LAST_NAME = Target.the(" Apellido").located(By.id("last-name"));
    public static  final Target CODE = Target.the("Code").located(By.id("postal-code"));
    public static  final Target BTN_CHEKOUT_Continue = Target.the("boton CHECKOUT Continuar").located(By.id("continue"));
    public static  final Target BTN_CHEKOUT_Buy = Target.the("boton CHECKOUT Continuar").located(By.id("finish"));


}
