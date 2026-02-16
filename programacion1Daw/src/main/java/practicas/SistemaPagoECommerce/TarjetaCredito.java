package practicas.SistemaPagoECommerce;

class TarjetaCredito extends MetodoPago{

    private String nro_tarjeta;
    private String tipoTarjeta;

    public TarjetaCredito(String nro_tarjeta, String tipoTarjeta){
        super();
        this.nro_tarjeta = nro_tarjeta;
        this.tipoTarjeta = tipoTarjeta;

    }
    public boolean validarTarjeta(){
        boolean valida = true;
        if(!nro_tarjeta.matches("\\d+")){
            System.out.println("Solo se admiten números.");
            valida = false;
        }

        if (nro_tarjeta.length() != 16){
            System.out.println("Solo se admiten 16 números.");
            valida = false;
        }

        if ((!tipoTarjeta.equalsIgnoreCase("VISA")) &&
                (!tipoTarjeta.equalsIgnoreCase("MASTERCARD")) &&
                (!tipoTarjeta.equalsIgnoreCase("MAESTRO")) ){
            System.out.println("Solo se aceptan VISA, MASTERCARD y MAESTRO");
            valida = false;
        }
        if (valida){
            System.out.println("Validando tarjeta...");
        }

        return valida;
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }
    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                '}';
    }
    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe +  "€ con tarjeta de crédito VISA");

    }
}
