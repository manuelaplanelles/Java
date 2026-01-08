package UD4;

public class Repositividad2 {

        static int limite = 10;

        static void main(){
            imprimir(1);
            System.out.println(suma(10));
        }
        public static void imprimir(int num){
            if (num<=limite){
                System.out.println(num);
                imprimir(num+1);
                return;
            }
        }
        public static int suma (int nums){
            if (nums == 0) {
                return 0;
            }else{
                return nums + suma(nums-1);
            }
        }
}
