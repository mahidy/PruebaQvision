package exceptions;

public class ConfirmarMensajeExcepcion extends AssertionError {
    public static final String ERROR_MENSAJE_COMPRA = "Error validando el mensaje de compra exitosa";
    public ConfirmarMensajeExcepcion(String mensaje, Throwable causa){
        super(mensaje, causa);
    }
}
