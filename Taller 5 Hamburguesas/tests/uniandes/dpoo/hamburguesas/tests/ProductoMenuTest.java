package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ProductoMenuTest {
	
	private ProductoMenu productoMenu1;
	
	@BeforeEach
	void setup() throws Exception {
		productoMenu1= new ProductoMenu("Hamburguesa", 10000);
		
	}
	
	@AfterEach
	void tearDown( ) throws Exception
    {
    }
	
	@Test
	void testGetNombre()
	{
		assertEquals("Hamburguesa", productoMenu1.getNombre(), "El nombre del producto no es el esperado");
	}
	
	@Test
	void testGetPrecio()
	{
		assertEquals(10000, productoMenu1.getPrecio(), "El precio no es el esperado");
	}
	
}
