package starter.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class AddProductsInterfaces {
    public static  final Target ADD_PRODUCT1 = Target.the("Agregar producto 1").locatedBy("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(1) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name");
    public static final Target ADD_PRODUCT2 = Target.the("ingresar el producto 2").locatedBy("div.page_wrapper div.inventory_container div.inventory_list div.inventory_item:nth-child(2) div.inventory_item_description div.inventory_item_label a:nth-child(1) > div.inventory_item_name");
};
