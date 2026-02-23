package practicas.SistemaModernizacionMutzamel;

public class Masajista extends MutxamelFC{
    String titulacion;
    int anyosExperiencia;
    public Masajista(String nombre, int edad,String titulacion, int anyosExperiencia){
        super(nombre, edad);
        this.titulacion=titulacion;
        this.anyosExperiencia=anyosExperiencia;
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
}
