package estudio10.EjerciciosExamen;

import java.util.ArrayList;

public class AppPartido {
    public static void main(String[] args) {

        ArrayList<Jugador> listaJugadores = new ArrayList<>();
        Equiposs e1 = new Equiposs("Mutxamel",listaJugadores);

        Jugador j1 = new Jugador("Juan",25,5, Posicion.DEFENSA);
        Jugador j2 = new Jugador("Juan",25,2, Posicion.DEFENSA);

        e1.agregarJugador(j1);
        e1.agregarJugador(j2);
        e1.mostrarPlantilla();
    }
}
