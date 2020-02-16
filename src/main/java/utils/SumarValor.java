package utils;

import net.serenitybdd.core.Serenity;

public class SumarValor {
    public int i;
    double valor = 0;
    public String valorObtenido;
    public Double sumarValores(){
        this.i = Serenity.sessionVariableCalled("cantidad");

        for (int a = 0; a <= this.i; a++) {
            this.valorObtenido = Serenity.sessionVariableCalled("valor"+a);
            this.valorObtenido = this.valorObtenido.replace("$", "");
            this.valor = Double.parseDouble(this.valorObtenido) + valor;
        }

        return this.valor;
    }
}
