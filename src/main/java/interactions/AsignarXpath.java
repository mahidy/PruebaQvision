package interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.Productos;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AsignarXpath  implements Interaction {

    public Target producto;

    public AsignarXpath(String producto) {
        this.producto = Productos.crearTarget(producto);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(producto)
                );
    }

    public static AsignarXpath personalizado(String producto){
        return instrumented(AsignarXpath.class, producto);
    }
}
