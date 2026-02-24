package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        Jugador j1 = new Jugador("Juan",30, Equipos.SENIOR,9,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j2 = new Jugador("Ivan",29, Equipos.SENIOR,3,Posiciones.CENTROCAMPISTA,listaJugadores);


        ArrayList<Entrenador> listaEntrenador = new ArrayList<>();

        Entrenador e1 = new Entrenador("Pepe",40, Equipos.SENIOR,"4-4-2",listaEntrenador);
        Entrenador e2 = new Entrenador("Pepe",40, Equipos.SENIOR,"4-4",listaEntrenador);
    }
}
