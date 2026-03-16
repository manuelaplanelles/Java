package ra04_gestion_datos_y_aplicaciones.u07_coleccioneDinámicasDatos.Queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Colas {
    static Scanner tecclado = new Scanner(System.in);
    public static void main(String[] args) {
        /*Ejercicio 1
        Queue<Character> cola = new LinkedList<>();
        cola.offer('a');
        cola.offer('b');
        cola.offer('c');
        cola.offer('d');
        cola.offer('e');
        System.out.println("¿La cola esta vacia? " + cola.isEmpty());
        System.out.println("¿Cuantos elemento hay? "+cola.size());
        System.out.println("El primer elemento es: "+cola.peek());
        System.out.println("Elementos eliminados:");
        while (!cola.isEmpty()){
            System.out.print(cola.poll()+", ");
        }
        System.out.println();
        System.out.println("¿La cola esta vacia? " + cola.isEmpty());*/

        //Ejercicio 2
        Queue<String> cola = new LinkedList<>();
        cola.offer("Imprimir documento 1");
        cola.offer("Imprimir documento 2");
        cola.offer("Imprimir documento 3");
        cola.offer("Imprimir documento 4");
        cola.offer("Imprimir documento 5");
        System.out.println("Estado inicial de la cola de imprecion: "+cola);

        while (!cola.isEmpty()){
            System.out.println("Procesando: Imprimir "+cola.poll());
            System.out.println("Estado de la cola despues de procesar el trabajo "+cola);

        }
        if (cola.isEmpty()){
            System.out.println("No hay más trabajos en la cola de impresión.");
        }else{
            System.out.println("Estado de la cola despues de procesar el trabajo "+cola);
        }
        //Ejercicio 3
        //Ejercicio 4
        //Ejercicio 5
    }
}
