package u04_modular;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicioMetodos4 {
    public static void main(String[] args) {
        float []cantidad= generarDatos();
        for (int i = 0; i <= 5; i++){
            System.out.println(cantidad[i]);
        }
    }

    public static float[] generarDatos(){
        Scanner teclado = new Scanner(System.in);

        float [] datos=new float[6];
        float aux = 0;

        for (int i = 0; i <=5; i++){
            aux= teclado.nextFloat();
            if (i==0 && aux == -1 ){
                return datos;
            }else{
                datos [i] = aux;
            }

        }
        return datos;
    }
    public static String maxim(float [] datos){
        float max = 0;
        int pos = 1;
        for(int i = 0; i>datos.length; i++){
            if (datos[i] > max){
                max=datos[i];
                pos=i;
            }
        }
        switch (pos){
            case 0 : return "Martes";
        }

    }
}
