package exceptions;

public class ConfirmarSumatoriaExcepcion extends AssertionError {
    public static final String ERROR_SUMATORIA = "Error validando la sumatoria del valor de los productos";

    public ConfirmarSumatoriaExcepcion(String mensaje, Throwable causa) {
        super(mensaje, causa);
    }
}
