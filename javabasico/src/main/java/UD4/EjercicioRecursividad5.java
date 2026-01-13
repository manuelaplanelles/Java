package UD4;

public class EjercicioRecursividad5 {
<<<<<<< HEAD
    public static void main(String[] args) {

    }
    public static String decimalABinario(int n) {
        if (n == 0) {
            return "0";
=======
    public static String decimalABinario(int numero) {
        if (numero == 0 || numero == 1){
            return Integer.toString(numero);
        }else{
            return decimalABinario(numero/2)+numero%2;
>>>>>>> a8808e40e0b3e9f4cafb2f7ddd03050cb0a535af
        }
    }
}
