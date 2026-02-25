package estudio10.EjerciciosExamen;

public class DorsalDuplicadoException extends RuntimeException {
    public DorsalDuplicadoException() {
        super("Este dorsal ya lo tiene un jugador.");
    }
}
