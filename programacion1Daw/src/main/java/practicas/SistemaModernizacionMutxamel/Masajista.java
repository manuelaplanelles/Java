package practicas.SistemaModernizacionMutxamel;

public class Masajista extends MutxamelFC{
    private String titulacion;
    private int anyosExperiencia;

    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia){
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
    }



    public void darMasaje(Jugador jugador){
        System.out.println(this.nombre + " esta dando un masaje a " + this.nombre);
    }


    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnyosExperiencia() {
        return anyosExperiencia;
    }

    public void setAnyosExperiencia(int anyosExperiencia) {
        this.anyosExperiencia = anyosExperiencia;
    }



    @Override
    public void concentrarse() {
        System.out.println(this.nombre + " esta en una concentracion con el equipo.");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println(this.nombre + " esta de viaje en " + ciudad);
    }

    @Override
    public void celebrarGol() {
        System.out.println(nombre + " grita ¡GOOOL!");
    }
}
