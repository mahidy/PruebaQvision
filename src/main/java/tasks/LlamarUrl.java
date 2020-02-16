package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.EnviarUrl;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlamarUrl implements Task {
    private EnviarUrl navegacion;

    public LlamarUrl(EnviarUrl navegacion) {
        this.navegacion = navegacion;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(navegacion.getUrl())
        );
    }

    public static LlamarUrl enNavegador(EnviarUrl navegacion){
        return instrumented(LlamarUrl.class, navegacion);
    }
}
