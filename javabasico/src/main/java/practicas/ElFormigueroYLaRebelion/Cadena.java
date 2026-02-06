package practicas.ElFormigueroYLaRebelion;

import java.util.ArrayList;

public class Cadena {

    private String nombre;
    private ArrayList<Programa> listaPrograma;

    public Cadena(String nombre) {
        this.nombre = nombre;
        this.listaPrograma = new ArrayList<>();
    }
    public void agregarPrograma(Programa programa) {
        if (programa != null && !listaPrograma.contains(programa)) {
            listaPrograma.add(programa);
        }
    }

    public void eliminarPrograma(Programa programa) {
        listaPrograma.remove(programa);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Programa> getListaPrograma() {
        return listaPrograma;
    }

    public void setListaPrograma(ArrayList<Programa> listaPrograma) {
        this.listaPrograma = listaPrograma;
    }

    @Override
    public String toString() {
        String resultado = "Cadena: " + nombre + "\n" +
                "Programas: " + listaPrograma.size() + "\n";
        for (Programa programa : listaPrograma) {
            resultado += "  - " + programa.getNombre() + "\n";
        }
        return resultado;
    }
}
