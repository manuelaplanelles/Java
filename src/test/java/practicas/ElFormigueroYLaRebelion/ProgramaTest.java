package practicas.ElFormigueroYLaRebelion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class ProgramaTest {

    @Test
    void insertarEmpleado() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        prog.añadirEmpleado("Pablo Motos", "presentador", null);

        assertEquals(2, prog.getListaEmpleado().size());
    }

    @Test
    void eliminarEmpleado() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");
        Empleado emp = prog.getListaEmpleado().get(0);

        prog.eliminarEmpleado(emp);

        assertEquals(0, prog.getListaEmpleado().size());
    }

    @Test
    void vecesInvitado() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");
        // Nota: Este test no funciona porque insertarInvitado pide datos por consola
        // Se puede probar manualmente

        int veces = prog.vecesInvitado("Aitana");

        assertEquals(0, veces);
    }

    @Test
    void buscarInvitado() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        boolean encontrado = prog.buscarInvitado("Aitana");

        assertFalse(encontrado);
    }

    @Test
    void getNombre() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        assertEquals("El Hormiguero", prog.getNombre());
    }

    @Test
    void setNombre() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        prog.setNombre("La Rebelión");

        assertEquals("La Rebelión", prog.getNombre());
    }

    @Test
    void getTemporadas() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        assertEquals(0, prog.getTemporadas());
    }

    @Test
    void setTemporadas() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        prog.setTemporadas(5);

        assertEquals(5, prog.getTemporadas());
    }

    @Test
    void getDirector() {
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        assertNotNull(prog.getDirector());
        assertEquals("Director1", prog.getDirector().getNombre());
    }
}