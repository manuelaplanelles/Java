package u05_poo.insti;
public class AppCursos {
    public static void main(String[] args) {

        // Crear instituto
        Instituto instituto = new Instituto("IES MUTXAMEL");

        // Crear cursos
        Curso cursoJava = new Curso("Java", 100);
        Curso cursoBDA = new Curso("Base de Datos", 70);
        instituto.agregarCurso(cursoJava);
        instituto.agregarCurso(cursoBDA);

        // Crear estudiantes
        try {
            Estudiante estudiante1 = new Estudiante("Ivan", 20, cursoJava);
            Estudiante estudiante2 = new Estudiante("Jose Luis", 22, cursoBDA);
            instituto.agregarEstudiante(estudiante1);
            instituto.agregarEstudiante(estudiante2);

            // Intento de crear un estudiante con nombre nulo (esto lanza NullPointerException)
            Estudiante estudianteErroneo = new Estudiante(null);
        } catch (NullPointerException e) {
            System.out.println("Error: No se puede crear un estudiante con nombre nulo.");
        }

        // Intento de añadir un estudiante nulo en la lista de estudiantes
        instituto.agregarEstudiante(null);

        // Intento de añadir un curso nulo en la lista de cursos
        instituto.agregarCurso(null);

        // Intento de agregar un curso duplicado
        Curso cursoDuplicado = new Curso("Java", 100);
        instituto.agregarCurso(cursoDuplicado);

        // Mostrar cursos
        System.out.println("Cursos disponibles:");
        System.out.println(instituto.getListaCursos());

        // Mostrar estudiantes
        System.out.println("Estudiantes registrados:");
        System.out.println(instituto.getListaEstudiantes());
    }
}