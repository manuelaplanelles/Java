package basic;

public class Integradores {
    public static void main(String[] args) {
        //4a. Manipulacion basica de cadenas.
        String usuario="Manuela Planelles Lucas";
        System.out.println(usuario);
        System.out.println(usuario.length());
        String sinEspacios=usuario.replace(" ","");
        System.out.println(usuario.toUpperCase());
        int longitudSinEspacios = sinEspacios.length();
        int mitad = longitudSinEspacios/2;
        String mitad1 = sinEspacios.substring(0,mitad);
        String mitad2=sinEspacios.substring(mitad);
        System.out.println(mitad1+ " | "+mitad2);

        //4b. Cadena más larga.
        String usuario1="Manuela Planelles Lucas";
        String usuario2="Juan Ev Planelles Lucas";
        int longU1 = usuario1.length();
        int longU2 = usuario2.length();
        System.out.println(longU1);
        System.out.println(longU2);
        if(longU1>longU2){
            System.out.println(usuario1 + " tiene mas caracteres.");
        } else if (longU2>longU1) {
            System.out.println(usuario2 + " tiene mas caracteres.");

        }else
            System.out.println(usuario1 + " y " +usuario2 + " tiene los mismos caracteres.");
    }
}
