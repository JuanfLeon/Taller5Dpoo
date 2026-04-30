package uniandes.dpoo.hamburguesas.tests;


import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.excepciones.IngredienteRepetidoException;
import uniandes.dpoo.hamburguesas.excepciones.NoHayPedidoEnCursoException;
import uniandes.dpoo.hamburguesas.excepciones.ProductoFaltanteException;
import uniandes.dpoo.hamburguesas.excepciones.ProductoRepetidoException;
import uniandes.dpoo.hamburguesas.excepciones.YaHayUnPedidoEnCursoException;
import uniandes.dpoo.hamburguesas.mundo.Restaurante;

public class RestauranteTest {

    private Restaurante restaurante;

    @BeforeEach
    void setUp() {
        restaurante = new Restaurante();
    }
    
    @AfterEach
    void TurnDown() {
    }

    @Test
    void testIniciarPedidoCorrecto() throws Exception {
        restaurante.iniciarPedido("Juan", "Calle 123");

        assertNotNull(restaurante.getPedidoEnCurso());
        assertEquals("Juan", restaurante.getPedidoEnCurso().getNombreCliente());
    }
    
    @Test
    void testIniciarPedidoYaExiste() throws Exception {
        restaurante.iniciarPedido("Juan", "Calle 123");

        assertThrows(YaHayUnPedidoEnCursoException.class, () -> {
            restaurante.iniciarPedido("Pedro", "Otra");
        });
    }
    
    @Test
    void testCerrarSinPedido() {
        assertThrows(NoHayPedidoEnCursoException.class, () -> {
            restaurante.cerrarYGuardarPedido();
        });
    }
    
    @Test
    void testCerrarPedidoCorrecto() throws Exception {
        restaurante.iniciarPedido("Juan", "Calle 123");

        restaurante.cerrarYGuardarPedido();

        assertNull(restaurante.getPedidoEnCurso());
    }
    @Test
    void testCargaCorrecta() throws Exception {
        File ingredientes = new File("data/ingredientes.txt");
        File menu = new File("data/menu.txt");
        File combos = new File("data/combos.txt");

        restaurante.cargarInformacionRestaurante(ingredientes, menu, combos);

        assertFalse(restaurante.getIngredientes().isEmpty());
        assertFalse(restaurante.getMenuBase().isEmpty());
        assertFalse(restaurante.getMenuCombos().isEmpty());
    }
    
    @Test
    void testIngredienteRepetido() {
        File ingredientes = new File("data/ingredientes_repetidos.txt");
        File menu = new File("data/menu.txt");
        File combos = new File("data/combos.txt");

        assertThrows(IngredienteRepetidoException.class, () -> {
            restaurante.cargarInformacionRestaurante(ingredientes, menu, combos);
        });
    }
    
    @Test
    void testProductoRepetido() {
        File ingredientes = new File("data/ingredientes.txt");
        File menu = new File("data/menu_repetido.txt");
        File combos = new File("data/combos.txt");

        assertThrows(ProductoRepetidoException.class, () -> {
            restaurante.cargarInformacionRestaurante(ingredientes, menu, combos);
        });
    }
    
    @Test
    void testProductoFaltante() {
        File ingredientes = new File("data/ingredientes.txt");
        File menu = new File("data/menu.txt");
        File combos = new File("data/combos_error.txt");

        assertThrows(ProductoFaltanteException.class, () -> {
            restaurante.cargarInformacionRestaurante(ingredientes, menu, combos);
        });
    }
    
}
