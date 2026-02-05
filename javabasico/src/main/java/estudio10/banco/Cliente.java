package estudio10.banco;

import java.util.Scanner;

public class Cliente {
    private String nombre;
    private String apellidos;

    static int contador = 1;
    Scanner teclado = new Scanner(System.in);
    private final int id;

    public Cliente (){
        id = contador;
        contador++;

        System.out.println("Indica Nombre: ");
        String nombre = teclado.next();
        System.out.println("Indica Apellidos: ");
        String apellidos = teclado.next();
    }


    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
        Cliente.contador = contador;
    }

    public Scanner getTeclado() {
        return teclado;
    }

    public void setTeclado(Scanner teclado) {
        this.teclado = teclado;
    }
}
