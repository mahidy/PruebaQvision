package questions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import utils.SumarValor;

public class ConfirmarSumatoriaProductos implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {
        SumarValor text = new SumarValor();
        String valorSumado = String.valueOf(text.sumarValores());
        valorSumado = "$"+valorSumado;
        String valorTotalCompra = Serenity.sessionVariableCalled("valorCompra");
        String [] separador = valorTotalCompra.split(": ");
        return separador[1].equals(valorSumado);
    }
    public static ConfirmarSumatoriaProductos comprados(){
        return new ConfirmarSumatoriaProductos();
    }
}
