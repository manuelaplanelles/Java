package practicas.ElFormigueroYLaRebelion;

import java.util.ArrayList;

public class Programa {
    private String nombre;
    private Cadena cadena;
    private int temporadas;

    private ArrayList<Empleado>  listaEmpleado = new ArrayList<>();
    private ArrayList<Invitado> listaInvitado = new ArrayList<>();

    public Programa(String nombre, Cadena cadna, int temporadas, ArrayList listaEmpleado, ArrayList listaInvitado){
        this.nombre = nombre;
        this.cadena = cadena;
        this.temporadas = 0;
        this.listaInvitado=listaInvitado;
        this.listaEmpleado=listaEmpleado;
    }
}
