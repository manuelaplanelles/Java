package practicas.LombokInstituto;
import lombok.*;

@NoArgsConstructor @AllArgsConstructor @RequiredArgsConstructor
@Getter @Setter
@ToString
public class Curso {

    @NonNull
    private String nombre;
    private int horas;
}
