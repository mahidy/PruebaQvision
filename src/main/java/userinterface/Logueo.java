package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Logueo {
    public static final Target USUARIO = Target.the("campo de texto usuario").located(By.id("user-name"));
    public static final Target CONTRASENA = Target.the("campo de texto contrasena").located(By.id("password"));
    public static final Target INGRESAR = Target.the("botón de ingreso de sesión").located(By.xpath("//*[@class='btn_action']"));

}
