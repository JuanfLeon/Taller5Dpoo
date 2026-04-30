package uniandes.dpoo.hamburguesas.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Combo;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class ComboTest {

	private Combo combo1;
	
	@BeforeEach
	void setup() {
		ProductoMenu producto1= new ProductoMenu("Hamburguesa", 10000);
		ProductoMenu producto2= new ProductoMenu("papas", 5000);
		ArrayList<ProductoMenu> productos= new ArrayList<>();
		productos.add(producto1);
		productos.add(producto2);
		combo1= new Combo("Hamburguesa y papas", 0.03, productos);
	}
	
	@AfterEach
	void tearDown() throws Exception
	{	
	}
	
	@Test
	void testGetNombre() {
		assertEquals("Hamburguesa y papas", combo1.getNombre(), "El nombre no es el esperado");
	}
	
	@Test
	void testGetPrecio() {
		assertEquals(14550, combo1.getPrecio(),"El precio no es el esperado");
	}
}
