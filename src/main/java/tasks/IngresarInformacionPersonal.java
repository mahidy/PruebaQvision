package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import utils.SumarValor;
import utils.TextoConfirmacion;

import static userinterface.InformacionPersonal.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class IngresarInformacionPersonal implements Task {

    public String nombre;
    public String apellido;
    public String codigoPostal;

    public IngresarInformacionPersonal(String nombre, String apellido, String codigoPostal){
        this.nombre = nombre;
        this.apellido = apellido;
        this.codigoPostal = codigoPostal;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(NOMBRE, isVisible()),
                Enter.theValue(nombre).into(NOMBRE),
                Enter.theValue(apellido).into(APELLIDO),
                Enter.theValue(codigoPostal).into(CODIGO_POSTAL)
        );
    }

    public static IngresarInformacionPersonal paraRealizarCompra(String nombre, String apellido, String codigoPostal){
        return instrumented(IngresarInformacionPersonal.class, nombre, apellido, codigoPostal);
    }
}
