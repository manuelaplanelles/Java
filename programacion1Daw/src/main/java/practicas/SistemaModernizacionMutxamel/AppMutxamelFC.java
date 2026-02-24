package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class AppMutxamelFC {
    public static void main(String[] args) {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        Jugador j1 = new Jugador("Juan",30,Equipos.SENIOR,9,Posiciones.CENTROCAMPISTA,listaJugadores);
        Jugador j2 = new Jugador("Ivan",29,Equipos.SENIOR,5,Posiciones.CENTROCAMPISTA,listaJugadores);

    }
}
