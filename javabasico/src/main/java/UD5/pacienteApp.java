package UD5;

import org.w3c.dom.xpath.XPathResult;

public class pacienteApp {
    static void main() {
        paciente manuela = new paciente();
        System.out.println(manuela.getDni());
        paciente ivan = new paciente("ivan",20, 'H',100,170);

        System.out.println(manuela.esMayorDeEdad());
        System.out.println(ivan.esMayorDeEdad());
        System.out.println(ivan.getSexo());
        System.out.println(manuela.getSexo());
    }
}
