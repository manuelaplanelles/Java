package u05_poo.insti;
import lombok.*;

    @NoArgsConstructor // Constructor sin parámetros
    @AllArgsConstructor // Constructor con todos los parámetros
    @RequiredArgsConstructor // Constructor solo con atributos @NonNull
    @ToString // Genera el método toString()
    @Getter // Genera getters para todos los atributos
    @Setter // Genera setters para todos los atributos
    public class Curso {

        @NonNull // El nombre es obligatorio, no puede ser null
        private String nombre;

        private int horas;

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (obj == null || getClass() != obj.getClass()) return false;
            Curso curso = (Curso) obj;
            return horas == curso.horas && nombre.equals(curso.nombre);
        }

        @Override
        public int hashCode() {
            return java.util.Objects.hash(nombre, horas);
        }
    }