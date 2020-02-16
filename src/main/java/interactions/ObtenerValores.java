package interactions;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;
import userinterface.Productos;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ObtenerValores implements Interaction {

    public Target valorProducto;
    public String valor;
    public int i = 0;
    public ObtenerValores(String producto, Integer i) {
        this.valorProducto = Productos.crearTargetValor(producto);
        this.i = i;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {

        this.valor = Text.of(valorProducto).viewedBy(actor).asString();
        asignarValor(this.valor);
    }
    public void asignarValor(String valor){
        if(this.i==0){
            Serenity.setSessionVariable("valor"+i).to(valor);
        }else {
            Serenity.setSessionVariable("valor"+i).to(valor);
            Serenity.setSessionVariable("cantidad").to(i);
        }
    }

    public static ObtenerValores deLaCompra(String producto , Integer i){
        return instrumented(ObtenerValores.class, producto, i);
    }
}
