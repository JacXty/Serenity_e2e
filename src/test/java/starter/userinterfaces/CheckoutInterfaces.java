package starter.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class CheckoutInterfaces {
    public static  final Target BTN_CHECKOUT = Target.the("boton CHECKOUT").located(By.id("checkout"));
    public static  final Target Message_Success = Target.the("Compra Exitosa").locatedBy("div:nth-child(2) div.page_wrapper div:nth-child(1) div.checkout_complete_container > h2.complete-header");

}
