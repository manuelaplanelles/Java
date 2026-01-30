package u05_poo.chalet;

import java.util.ArrayList;

public class Habitacion {

    private double metros;
    private String nombre;
    private ArrayList<Electrodomesticos> listaElectrodomesticos;

    public Habitacion (String nombre, double metros){
        this.nombre=nombre;
        this.metros=metros;
        listaElectrodomesticos=new ArrayList<>();
    }
    public void crearElectrodomesticos(String nombre, int consumo){
        listaElectrodomesticos.add(new Electrodomesticos(nombre, consumo));

    }
    public void mostrarElectrodomesticos(String nombre, int consumo){

    }


    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Electrodomesticos> getListaHelectrodomesticos() {
        return listaElectrodomesticos;
    }

    public void setListaHelectrodomesticos(ArrayList<Electrodomesticos> listaHelectrodomesticos) {
        this.listaElectrodomesticos = listaHelectrodomesticos;
    }



    @Override
    public String toString() {
        return "Habitacion{" +
                "nombre='" + nombre + '\'' +
                ", metros=" + metros +
                "Elctrodomestico " +
                listaElectrodomesticos +
                '}';
    }

}
