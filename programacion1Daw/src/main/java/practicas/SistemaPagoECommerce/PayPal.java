package practicas.SistemaPagoECommerce;

class PayPal extends MetodoPago{
private String correo;
private double saldo;

public PayPal(String correo){
    super();
    this.correo=correo;
    this.saldo=23.0;
}

public boolean validarPayPal(double importe){
    boolean valido = true;
    if (!correo.contains("@")){
        System.out.println("El formato del correo no es correcto.");
        valido = false;
    }
    if (saldo < importe){
        System.out.println("Saldo insuficiente.");
        valido = false;
    }
    if (valido) {
        System.out.println("Validando PayPal...");
    }
    return valido;
}

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "PayPal{" +
                "correo='" + correo + '\'' +
                ", saldo=" + saldo +
                '}';
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe +  "€ con tarjeta de crédito PayPal");
    }
}
