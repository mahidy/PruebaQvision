package tasks;

import interactions.AsignarXpath;
import interactions.ObtenerValores;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static userinterface.Productos.*;
import static userinterface.Compras.*;

public class SeleccionarProductos implements Task {

    public String productoUno;
    public String productoDos;

    public SeleccionarProductos(String productoUno, String productoDos) {
        this.productoUno = productoUno;
        this.productoDos = productoDos;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                AsignarXpath.personalizado(productoUno),
                AsignarXpath.personalizado(productoDos),
                ObtenerValores.deLaCompra(productoUno, 0),
                ObtenerValores.deLaCompra(productoDos, 1),
                Click.on(BOTON_CARRO_COMPRAS),
                Click.on(VERIFICAR_COMPRAS));
    }

    public static SeleccionarProductos paraComprar(String productoUno, String productoDos){
        return instrumented(SeleccionarProductos.class, productoUno, productoDos);
    }
}
