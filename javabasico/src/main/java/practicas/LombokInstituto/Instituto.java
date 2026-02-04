package practicas.LombokInstituto;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;
import java.util.ArrayList;
import java.util.Objects;

@Getter @ToString
public class Instituto {

    @NonNull
    private String nombre;
    @Setter
    private String poblacion;

    private ArrayList<Estudiante> listaEstudiante;
    private ArrayList<Curso> listaCurso;

    public Instituto(String nombre) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.listaEstudiante = new ArrayList<>();
        this.listaCurso = new ArrayList<>();
    }
}
