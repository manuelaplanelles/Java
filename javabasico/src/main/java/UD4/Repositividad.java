package UD4;

public class Repositividad {

    static int limite = 10;

    static void main(){
        imprimir(1);
    }
    public static void imprimir(int num){
        if (num<=limite){
            System.out.println(num);
            imprimir(num+1);
            return;
        }
    }
}
