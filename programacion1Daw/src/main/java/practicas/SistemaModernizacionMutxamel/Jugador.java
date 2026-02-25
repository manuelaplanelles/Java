package practicas.SistemaModernizacionMutxamel;

import java.util.ArrayList;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    private Equipos categoria;
    private int dorsal;
    private Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posiciones, ArrayList<Jugador> listaJugadores){
        super(nombre, edad);
        this.categoria=categoria;
        this.posiciones=posiciones;
        setDorsal(dorsal, listaJugadores);

    }


    public void calentar(){
        System.out.println(this.getNombre() + " esta calentando para salir al campo.");
    }
    public void descansar(){
        System.out.println(this.getNombre() + "le toca descansar este partido.");
    }
    public void marcarGol(){
        System.out.println(this.getNombre() + " levanta los brazos y grita ¡GOOOLL!");
    }



    public Posiciones getPosiciones() {
        return posiciones;
    }

    public void setPosiciones(Posiciones posiciones) {
        this.posiciones = posiciones;
    }
    public int getDorsal() {

        return dorsal;
    }


    //Si se intenta crear o modificar a un jugador en un mismo equipo con un dorsal que ya tiene asignado otro jugador.

    public void setDorsal(int dorsal, ArrayList<Jugador> listaJugadores) {

        for (Jugador jugador : listaJugadores){
            if (dorsal == jugador.getDorsal() && jugador.getCategoria().equals(categoria)){
                throw new ControlDorsal();
            }
        }
        this.dorsal = dorsal;
        listaJugadores.add(this);
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }


    @Override
    public void entrenar() {
        System.out.println(this.getNombre() + "esta entrenando para la posción " + this.posiciones);
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println(this.getNombre() + " jugara el partido con el dorsal "+ this.dorsal);
    }
    @Override
    public void concentrarse() {
        System.out.println(this.getNombre() + " se esta concentrando.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(this.getNombre() + " viaja a " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(this.getNombre() + " grita ¡GOOOL!");
    }
}
