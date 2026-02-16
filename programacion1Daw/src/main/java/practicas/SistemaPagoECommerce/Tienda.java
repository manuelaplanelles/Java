package practicas.SistemaPagoECommerce;

import java.util.Scanner;

public class Tienda {
    public static void realizarPago(MetodoPago metodo) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Introduce el importe a pagar: ");
        double importe = teclado.nextDouble();

        metodo.procesarPago(importe);

        System.out.println("Pago aceptado. Muchas gracias.");
    }

    public static void iniciarPago() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("¿Qué método de pago quieres usar? [Bizum, Paypal, Tarjeta]: ");
        String metodo = teclado.nextLine();

        MetodoPago metodoPago = null;

        switch (metodo.toLowerCase()) {

            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                String numeroTarjeta = teclado.nextLine();

                System.out.print("Selecciona el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]: ");
                String tipoTarjeta = teclado.nextLine();

                TarjetaCredito tarjeta = new TarjetaCredito(numeroTarjeta, tipoTarjeta);

                System.out.println("Validando tarjeta...");
                if (tarjeta.validarTarjeta()) {
                    metodoPago = tarjeta;
                }
                break;

            case "paypal":
                System.out.print("Introduce tu correo de PayPal: ");
                String correoPayPal = teclado.nextLine();

                PayPal paypal = new PayPal(correoPayPal);

                System.out.print("Introduce el importe a pagar: ");
                double importePayPal = teclado.nextDouble();

                System.out.println("Validando PayPal...");
                if (paypal.validarPayPal(importePayPal)) {
                    metodoPago = paypal;
                }
                break;

            case "bizum":
                System.out.print("Introduce tu número de teléfono vinculado con Bizum: ");
                String telefonoBizum = teclado.nextLine();

                Bizum bizum = new Bizum(telefonoBizum);

                System.out.println("Validando Bizum...");
                if (bizum.validarBizum()) {
                    metodoPago = bizum;
                }
                break;

            default:
                System.out.println("El método de pago no existe.");
                return;
        }

        if (metodoPago != null) {
            realizarPago(metodoPago);
        }

    }
}
