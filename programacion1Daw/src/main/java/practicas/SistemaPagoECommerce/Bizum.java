package practicas.SistemaPagoECommerce;

import java.util.Random;
import java.util.Scanner;

class Bizum extends MetodoPago{
    private String telefono;
    private int pin;

    public Bizum (String telefono){
        super();
        this.telefono=telefono;
        Random random = new Random();
        this.pin = random.nextInt(900000) + 100000;
        System.out.println(pin);
    }
    public boolean validarBizum() {
        boolean valido = true;

        if (!telefono.matches("\\d+")) {
            System.out.println("Solo se admiten 9 números.");
            valido = false;
        }
        if (telefono.length() != 9){
            System.out.println("Solo se admiten 9 números.");
            valido = false;
        }

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce tu PIN: ");
        int pinIntroducido = teclado.nextInt();

        if (pinIntroducido != this.pin){
            System.out.println("El PIN introducido es incorrecto.");
            valido = false;

        }
        if (valido){
            System.out.println("Validando tarjeta...");
        }

        return valido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }

    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de " + importe +  "€ con tarjeta de crédito Bizum");
    }
}
