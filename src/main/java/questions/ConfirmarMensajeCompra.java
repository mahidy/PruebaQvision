package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.core.Serenity;

import static utils.TextoConfirmacion.MENSAJE_COMPRA_EXITOSA;

public class ConfirmarMensajeCompra implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {
        return MENSAJE_COMPRA_EXITOSA.obtenerMensaje().equals(Serenity.sessionVariableCalled("mensajeExitoso"));
    }

    public static ConfirmarMensajeCompra exitosa(){
        return new ConfirmarMensajeCompra();
    }
}
