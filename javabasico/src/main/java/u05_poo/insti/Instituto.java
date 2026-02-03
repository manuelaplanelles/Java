package u05_poo.insti;
import lombok.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@ToString // Genera el método toString()
@Getter // Genera getters para todos los atributos
public class Instituto {

    @NonNull
    @Setter(AccessLevel.NONE) // No permite modificar el nombre después de la creación
    private final String nombre; // final hace que no se pueda cambiar después de inicializar

    @Setter // Permite modificar la población
    private String poblacion;

    // Listas para almacenar estudiantes y cursos
    private List<Estudiante> listaEstudiantes;
    private List<Curso> listaCursos;

    public Instituto(String nombre) {
        // Si el nombre es null, asigna un valor por defecto
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.listaEstudiantes = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
    }

    public Instituto(String nombre, String poblacion) {
        this.nombre = Objects.requireNonNullElse(nombre, "Instituto sin nombre");
        this.poblacion = poblacion;
        this.listaEstudiantes = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
    }

   public void agregarEstudiante(Estudiante estudiante) {
        if (estudiante == null) {
            System.out.println("Error: No se puede agregar un estudiante nulo a la lista.");
            return;
        }
        listaEstudiantes.add(estudiante);
        System.out.println("Estudiante agregado: " + estudiante.getNombre());
    }

    public void agregarCurso(Curso curso) {
        if (curso == null) {
            System.out.println("Error: No se puede agregar un curso nulo a la lista.");
            return;
        }

        // Verificar si el curso ya existe (usando el método equals de Curso)
        if (listaCursos.contains(curso)) {
            System.out.println("Error: El curso '" + curso.getNombre() +
                    "' con " + curso.getHoras() + " horas ya existe en el instituto.");
            return;
        }

        listaCursos.add(curso);
        System.out.println("Curso agregado: " + curso.getNombre());
    }
}