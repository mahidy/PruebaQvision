package userinterface;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Compras {
    public static final Target VERIFICAR_COMPRAS= Target.the("Boton verificar productos seleccionados").located(By.xpath("//div//div//a[contains(text(),'CHECKOUT')]"));
}
