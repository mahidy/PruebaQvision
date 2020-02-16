package tasks;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static userinterface.CompraExitosa.MENSAJE_COMPRA;
import static userinterface.DescripcionCompra.FINALIZAR;
import static userinterface.DescripcionCompra.VALOR_COMPRA;
import static userinterface.InformacionPersonal.CONTINUAR;

public class FinalizarCompra implements Task {

    private String mensaje;
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(CONTINUAR, isVisible()),
                Click.on(CONTINUAR)
        );
        Serenity.setSessionVariable("valorCompra").to(Text.of(VALOR_COMPRA).viewedBy(actor).asString());
        actor.attemptsTo(
                Click.on(FINALIZAR)
        );
        mensaje = Text.of(MENSAJE_COMPRA).viewedBy(actor).asString();
        Serenity.setSessionVariable("mensajeExitoso").to(mensaje);
    }

    public static FinalizarCompra exitosa(){
        return instrumented(FinalizarCompra.class);
    }
}
