package estudio10.EjerciciosExamen;

import java.util.ArrayList;

public class Equiposs {
    private String nombre;
    private ArrayList<Jugador> listaJugadores = new ArrayList<>();

    public Equiposs(String nombre, ArrayList<Jugador> listaJugadores){
        this.nombre=nombre;
        this.listaJugadores=listaJugadores;
    }
    public void agregarJugador(Jugador j) {
        for (Jugador jugador : this.listaJugadores) {
            if (j.getDorsal() == jugador.getDorsal()) {
                throw new DorsalDuplicadoException();
            }
        }
        this.listaJugadores.add(j);
    }
    public void entrenarEquipo() {
        for (Jugador j : listaJugadores) {
            j.entrenar();
        }
    }
    public void jugarPartido() {
        for (Jugador j : listaJugadores) {
            j.jugarPartido();
        }
    }
    public void mostrarPlantilla() {
        System.out.println("Plantilla de " + this.listaJugadores);
        for (Jugador jugador : listaJugadores) {
            System.out.println(jugador.getNombre()+" "+jugador.getEdad()+" "+jugador.getDorsal()+" "+jugador.getPosicion());
        }
    }

    //get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getListaJugadores() {
        return listaJugadores;
    }

    public void setListaJugadores(ArrayList<Jugador> listaJugadores) {
        this.listaJugadores = listaJugadores;
    }
}
