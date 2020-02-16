package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static userinterface.Logueo.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IniciarSesion implements Task {

    public String usuario;
    public String contrasena;

    public IniciarSesion (String usuario, String contrasena) {
        this.usuario = usuario;
        this.contrasena = contrasena;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(USUARIO, isVisible()),
                Enter.theValue(this.usuario).into(USUARIO),
                Enter.theValue(this.contrasena).into(CONTRASENA),
                Click.on(INGRESAR)
        );
    }
    public static IniciarSesion pagina(String usuario, String contrasena){
        return instrumented(IniciarSesion.class, usuario, contrasena);
    }

}

