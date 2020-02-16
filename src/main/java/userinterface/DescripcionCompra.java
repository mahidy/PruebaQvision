package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class DescripcionCompra {
    public static final Target VALOR_COMPRA = Target.the("valor total de la compra de los productos seleccionados").located(By.xpath("//*[@id=\"checkout_summary_container\"]/div/div[2]/div[5]"));
    public static final Target FINALIZAR = Target.the("botón finalización de la compra").located(By.xpath("//div//div//a[contains(text(),'FINISH')]"));
}
