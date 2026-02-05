package estudio10.banco;

public class Cuenta {
    private String iban;
    private Cliente titular;
    private double saldo;

    static int contador = 1;


    public Cuenta(){

        iban="ES"+String.format("%03d", contador);
        contador++;
        saldo = 0;
        titular = null;

    }
}
