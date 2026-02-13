package practicas.SistemaPagoECommerce;

abstract class MetodoPago {

    public MetodoPago(){
    }

    public abstract void procesarPago (double importe);

}
