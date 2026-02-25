package estudio10.EjerciciosExamen;

public class Jugador {
    private String nombre;
    private int edad;
    private int dorsal;
    private Posicion posicion;

    public Jugador(String nombre, int edad, int dorsal, Posicion posicion){
        this.nombre = nombre;
        this.edad = edad;
        this.dorsal = dorsal;
        this.posicion = posicion;
    }

    public void entrenar(){
        System.out.println(this.nombre + "está entrenando.");
    }
    public void jugarPartido(){
        System.out.println(this.nombre + "está jugando el partido.");
    }
    public void marcaGol(){
        System.out.println("¡GOOOL! de " + this.nombre);
    }

    //get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }


}
