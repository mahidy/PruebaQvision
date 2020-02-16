package stepDefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import exceptions.ConfirmarMensajeExcepcion;
import exceptions.ConfirmarSumatoriaExcepcion;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.ConfirmarMensajeCompra;
import questions.ConfirmarSumatoriaProductos;
import tasks.*;
import userinterface.EnviarUrl;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.is;
public class ComprarProductosStepDefinition {

    @Before
    public void iniciar(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^el usuario ingresa a la pagina web con sus credenciales correctos (.*) y (.*)$")
    public void elUsuarioIngresaALaPaginaWebConSusCredencialesCorrectosY(String usuario, String contrasena) {
        theActorCalled("actor").attemptsTo(
                LlamarUrl.enNavegador(EnviarUrl.URL_SAWGSLABS),
                IniciarSesion.pagina(usuario, contrasena)
        );
    }

    @When("^el usuario selecciona el producto a comprar (.*) y (.*)$")
    public void elUsuarioSeleccionaElProductoAComprarY(String producto1, String producto2) {
        theActorInTheSpotlight().attemptsTo(
                SeleccionarProductos.paraComprar(producto1, producto2)
        );
    }

    @And("^el usuario continua con el flujo de la compra ingresando los datos solicitados (.*) (.*) (.*) para realizar la compra$")
    public void elUsuarioContinuaConElFlujoDeLaCompraIngresandoLosDatosSolicitadosParaRealizarLaCompra(String nombre, String apellido, String codigoPostal) {
        theActorInTheSpotlight().attemptsTo(
                IngresarInformacionPersonal.paraRealizarCompra(nombre,apellido,codigoPostal),
                FinalizarCompra.exitosa()
        );
    }

    @Then("^el usuario deberia visualizar el mensaje de la compra exitosa$")
    public void elUsuarioDeberiaVisualizarElMensajeDeLaCompraExitosa() {
        theActorInTheSpotlight().should(
                seeThat(ConfirmarSumatoriaProductos.comprados(), is(true)).orComplainWith(ConfirmarSumatoriaExcepcion.class, ConfirmarSumatoriaExcepcion.ERROR_SUMATORIA),
                seeThat(ConfirmarMensajeCompra.exitosa(), is(true)).orComplainWith(ConfirmarMensajeExcepcion.class, ConfirmarMensajeExcepcion.ERROR_MENSAJE_COMPRA)
        );
    }
}
