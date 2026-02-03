package u05_poo.insti;
import lombok.*;
    @NoArgsConstructor // Constructor sin parámetros
    @AllArgsConstructor // Constructor con todos los parámetros
    @RequiredArgsConstructor // Constructor solo con atributos @NonNull
    @ToString // Genera el método toString()
    @Getter // Genera getters para todos los atributos
    @Setter // Genera setters para todos los atributos
    public class Estudiante {

        @NonNull // El nombre es obligatorio, no puede ser null
        private String nombre;

        private int edad;

        private Curso curso; // El curso al que está inscrito el estudiante
    }