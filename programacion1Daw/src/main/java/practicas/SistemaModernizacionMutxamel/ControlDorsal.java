package practicas.SistemaModernizacionMutxamel;

public class ControlDorsal extends RuntimeException {
    public ControlDorsal() {
        super("El dorsal ya esta adjudicado a un jugador.");
    }
}
