package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Productos {

    public static final Target BOTON_CARRO_COMPRAS = Target.the("Botoón carro de compras").located(By.id("shopping_cart_container"));

    public static Target crearTarget(String xpath){
        String botonAgregar = "//div[text()='%s']//preceding::div[1]//parent::div[@class='inventory_item']//button[text()='ADD TO CART']";
        botonAgregar = String.format(botonAgregar, xpath);
        return Target.the("Botón agregar al carrito de compras").located(By.xpath(botonAgregar));
    }

    public static Target crearTargetValor(String xpath){
        String valorProducto = "//div[text()='%s']//preceding::div[1]//parent::div//div[contains(@class,'pricebar')]//div";
        valorProducto = String.format(valorProducto, xpath);
        return Target.the("Valor del producto seleccionado").located(By.xpath(valorProducto));
    }
}
