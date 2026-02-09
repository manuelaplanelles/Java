package practicas.ElFormigueroYLaRebelion;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class CadenaTest {

    @Test
    void agregarPrograma() {
        Cadena cadena = new Cadena("Antena 3");
        Programa prog = new Programa("El Hormiguero", null, "Director1");

        cadena.agregarPrograma(prog);

        assertEquals(1, cadena.getListaPrograma().size());
    }

    @Test
    void eliminarPrograma() {
        Cadena cadena = new Cadena("Antena 3");
        Programa prog = new Programa("El Hormiguero", null, "Director1");
        cadena.agregarPrograma(prog);

        cadena.eliminarPrograma(prog);

        assertEquals(0, cadena.getListaPrograma().size());
    }

    @Test
    void getNombre() {
        Cadena cadena = new Cadena("Antena 3");

        assertEquals("Antena 3", cadena.getNombre());
    }

    @Test
    void setNombre() {
        Cadena cadena = new Cadena("Antena 3");

        cadena.setNombre("Telecinco");

        assertEquals("Telecinco", cadena.getNombre());
    }

    @Test
    void getListaPrograma() {
        Cadena cadena = new Cadena("Antena 3");

        assertNotNull(cadena.getListaPrograma());
        assertEquals(0, cadena.getListaPrograma().size());
    }
}