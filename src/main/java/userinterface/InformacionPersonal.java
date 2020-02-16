package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class InformacionPersonal {
    public static final Target NOMBRE = Target.the("campo de texto, nombre del usuario").located(By.id("first-name"));
    public static final Target APELLIDO = Target.the("campo de texto, apellido del usuario").located(By.id("last-name"));
    public static final Target CODIGO_POSTAL = Target.the("campo de texto, código postal del usuario").located(By.id("postal-code"));
    public static final Target CONTINUAR = Target.the("botón continuar").located(By.xpath("//div//input[@class='btn_primary cart_button']"));
}
