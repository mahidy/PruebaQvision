package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CompraExitosa {
    public static final Target MENSAJE_COMPRA = Target.the("mensaje de compra exitosa").located(By.xpath("//*[@id='checkout_complete_container']/div[1]"));
}
