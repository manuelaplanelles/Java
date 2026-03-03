package ra04_gestion_datos_y_aplicaciones;

import java.util.ArrayList;
import java.util.Stack;

public class Colecciones {
    public static void main(String[] args) {
        ArrayList<String>coches= new ArrayList<>(); //lista

        Stack<String>pila=new Stack<>(); //pilas
        pila.push("caniche");
        pila.push("chiuaua");
        pila.push("husky");
        pila.pop();
        System.out.println(pila.peek());
    }

}
