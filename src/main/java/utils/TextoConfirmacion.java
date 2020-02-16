package utils;

public enum TextoConfirmacion {

    MENSAJE_COMPRA_EXITOSA("Your order has been dispatched, and will arrive just as fast as the pony can get there!");

    private final String mensaje;

    TextoConfirmacion(String mensaje){
        this.mensaje = mensaje;
    }

    public String obtenerMensaje(){
        return  this.mensaje;
    }
}
