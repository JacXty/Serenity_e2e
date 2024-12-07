package starter.task;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.questions.TextContent;
import starter.userinterfaces.AddProductsInterfaces;


public class AddProduct implements Task{

    private String producto1;
    private String producto2;
    public AddProduct(String producto1,String producto2) {
        this.producto1 = producto1;
        this.producto2 = producto2;
    }

    public static AddProduct addProducts(String producto1,String producto2) {
        return Tasks.instrumented(AddProduct.class,producto1,producto2);
    }
    public static AddProduct addProduct2() {
        return Tasks.instrumented(AddProduct.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Ensure.that(TextContent.of(AddProductsInterfaces.ADD_PRODUCT1.of(producto1)))
                        .isEqualTo(producto1),
                Click.on("#add-to-cart-sauce-labs-backpack"),
                Ensure.that(TextContent.of(AddProductsInterfaces.ADD_PRODUCT2.of(producto2)))
                        .isEqualTo(producto2),
                Click.on("#add-to-cart-sauce-labs-bike-light")




        );

    }
}
