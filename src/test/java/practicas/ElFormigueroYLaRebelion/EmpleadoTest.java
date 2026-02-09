package practicas.ElFormigueroYLaRebelion;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class EmpleadoTest {

    @Test
    void getId() {
        Empleado emp = new Empleado("Juan", "técnico", null);

        assertNotNull(emp.getId());
        assertTrue(emp.getId().startsWith("EP"));
    }

    @Test
    void getNombre() {
        Empleado emp = new Empleado("Juan", "técnico", null);

        assertEquals("Juan", emp.getNombre());
    }

    @Test
    void setNombre() {
        Empleado emp = new Empleado("Juan", "técnico", null);

        emp.setNombre("Pedro");

        assertEquals("Pedro", emp.getNombre());
    }

    @Test
    void getCargo() {
        Empleado emp = new Empleado("Juan", "técnico", null);

        assertEquals("técnico", emp.getCargo());
    }

    @Test
    void setCargo() {
        Empleado emp = new Empleado("Juan", "técnico", null);

        emp.setCargo("presentador");

        assertEquals("presentador", emp.getCargo());
    }

    @Test
    void setCargoInvalido() {
        Empleado emp = new Empleado("Juan", "actor", null);

        assertEquals("pte", emp.getCargo());
    }

    @Test
    void getDirector() {
        Empleado director = new Empleado("Director1", "director", null);
        Empleado emp = new Empleado("Juan", "técnico", director);

        assertNotNull(emp.getDirector());
        assertEquals("Director1", emp.getDirector().getNombre());
    }

    @Test
    void directorSinDirector() {
        Empleado director = new Empleado("Director1", "director", null);

        assertNull(director.getDirector());
    }
}