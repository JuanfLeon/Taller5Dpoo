package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.ProductoAjustado;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoAjustadoTest {
	
	private ProductoAjustado productoAjustado1;
	
	@BeforeEach
	void setup( ) throws Exception
	{
		ProductoMenu productoMenu= new ProductoMenu("Hamburguesa", 10000 );
		productoAjustado1= new ProductoAjustado(productoMenu);
	}
	@AfterEach
	void tearDown( ) throws Exception
    {
    }
	
	@Test
	void testGetNombre() {
		assertEquals("Hamburguesa", productoAjustado1.getNombre(), "El nombre no es el esperado");
		
	}
	@Test
	void testGetPrecio() {
		assertEquals(10000, productoAjustado1.getPrecio(), "El precio no es el esperado");
	}
}
