package u06_herencia.RedesSociales;

import u05_poo.chalet.Habitacion;

import java.util.ArrayList;

public class Influencer extends Usuario {

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nomUsuario, int seguidores) {
        super(nombre, edad, nomUsuario, seguidores);
        this.colaboraciones = new ArrayList<>();
    }

    public void agregarColaboracion(String colaboracion) {
        colaboraciones.add(colaboracion);
    }
    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    @Override
    public void mostrarInfo() {
        System.out.println("Informacion del Influencer:");
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Nombre de usuario: " + getNomUsuario());
        System.out.println("Seguidores: " + getSeguidores());
        System.out.print("Colaboraciones: ");

        // Mostramos las colaboraciones entre comillas y separadas por comas
        for (int i = 0; i < colaboraciones.size(); i++) {
            System.out.print("\"" + colaboraciones.get(i) + "\"");
            // Si no es el ultimo elemento, ponemos coma y espacio
            if (i < colaboraciones.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println(".");
    }
}
