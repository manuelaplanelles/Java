package practicas.SistemaModernizacionMutzamel;

public class Entrenador extends MutxamelFC implements AccionesDeportivas{
    Equipos equipos;
    String formacionPreferida;

    public Entrenador(String nombre, int edad, Equipos equipos, String formacionPreferida){
        super(nombre, edad);
        this.equipos = equipos;
    this.formacionPreferida=formacionPreferida;
    }

    public void planificarEntrenamiento(){

    }
    public void hacerCambios(){

    }




    public Equipos getEquipos() {
        return equipos;
    }

    public void setEquipos(Equipos equipos) {
        this.equipos = equipos;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

}
