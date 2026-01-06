package miprimerjava;

import java.util.Scanner;

public class Actividad1 {
    public static void main(String[] args) {
        /*Programa para sumar dos números leídos por teclado y escribir el resultado.
        - Que el programa nos pregunte el nombre.
        - Que el programa nos pregunte el curso y nos dé la bienvenida a la programación.
        */

        Scanner teclado = new Scanner(System.in);

        System.out.println("¿Como te llamas?: ");
        String nom = teclado.next();
        System.out.println("¿A qué curso vas?: ");
        String curs = teclado.next();

        System.out.println("Hola " + nom + ", bienvenido a " + curs + ".");
        System.out.println("Introduce una número: ");
        int num1 = teclado.nextInt();
        System.out.println("Introduce otro número: ");
        int num2 = teclado.nextInt();
        int suma=0;
        suma = num1 + num2;


        System.out.println("El resultado de sumar los dos números es: " + suma + ".");
    }
}
