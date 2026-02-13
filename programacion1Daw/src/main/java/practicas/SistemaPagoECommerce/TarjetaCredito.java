package practicas.SistemaPagoECommerce;

class TarjetaCredito extends MetodoPago{

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipoTarjeta='" + tipoTarjeta + '\'' +
                '}';
    }

    private String nro_tarjeta;
    private String tipoTarjeta;

    public TarjetaCredito(String nro_tarjeta, String tipoTarjeta){
        super();
        this.nro_tarjeta = nro_tarjeta;
        this.tipoTarjeta = tipoTarjeta;

    }

    public void validadTarjeta(String nro_tarjeta, String tipo){
        if(!nro_tarjeta.matches("\\d+")){
            System.out.println("Sole se admiten números.");
            return;
        } else if (nro_tarjeta.length() != 16){
            System.out.println("Sole se admiten 16 números.");
            return;
        }else{
            System.out.println("Tarjeta validada");
        }

        if ((tipoTarjeta.equals("VISA")) || (tipoTarjeta.equals("MASTERCARD")) || (tipoTarjeta.equals("MAESTRO")) ){
            System.out.println("Tarjeta validada");
        }else{
            System.out.println("Solo se aceptan VISA, MASTERCARD y MAESTRO");
        }
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe +  "€ con tarjeta de crédito VISA.");

    }
}
