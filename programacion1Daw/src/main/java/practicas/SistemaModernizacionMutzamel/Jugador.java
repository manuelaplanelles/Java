package practicas.SistemaModernizacionMutzamel;

public class Jugador extends MutxamelFC implements AccionesDeportivas{
    Equipos categoria;
    int dorsal;
    Posiciones posiciones;

    public Jugador(String nombre, int edad, Equipos categoria, int dorsal, Posiciones posiciones){
        super(nombre, edad);
        this.categoria=categoria;
        this.dorsal=dorsal;
        this.posiciones=posiciones;
    }
    public void calentar(){

    }
    public void descansar(){

    }
    public void narcarGol(){

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

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }
}
