package modelo;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TrabajadorTest {

    Trabajador trabajadorPrueba;

    @BeforeEach
    void setUp() {
        trabajadorPrueba = new Trabajador("Juan", "Perez", "12345678-9", "Colmena", "Cuprum");
    }

    @AfterEach
    void tearDown() {
        trabajadorPrueba = null;
    }

    @Test
    void mostrarDatos() {
        trabajadorPrueba.mostraDatos();
    }

    @Test
    void claseTrabajador(){
        assertEquals(trabajadorPrueba.getClass(), Trabajador.class);
    }


}