package uniandes.dpoo.hamburguesas.tests;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.File;
import java.io.FileNotFoundException;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import uniandes.dpoo.hamburguesas.mundo.Pedido;
import uniandes.dpoo.hamburguesas.mundo.ProductoMenu;

public class PedidoTest {

	private Pedido pedido1;
	@BeforeEach
	void startup() {
		pedido1= new Pedido("Juan Felipe Leon", "Universidad de los Andes");
	}
	@AfterEach
	void tearDown() {
		
	}
	
	@Test
	void testIdIncremental() {
	    Pedido p1 = new Pedido("A", "Dir1");
	    Pedido p2 = new Pedido("B", "Dir2");

	    assertEquals(p1.getIdPedido() + 1, p2.getIdPedido());
	}


	@Test
	void testPrecioTotal() {
	    

	    ProductoMenu prod1 = new ProductoMenu ("Hamburguesa", 10000);
	    ProductoMenu prod2 = new ProductoMenu ("Papas", 5000);

	    pedido1.agregarProducto(prod1);
	    pedido1.agregarProducto(prod2);

	    int precioNeto = 15000;
	    int iva = (int)(precioNeto * 0.19);
	    int totalEsperado = precioNeto + iva;

	    assertEquals(totalEsperado, pedido1.getPrecioTotalPedido());
	}
	@Test
	void testGuardarFactura() throws FileNotFoundException {

	    ProductoMenu prod = new ProductoMenu("Hamburguesa", 10000);
	    pedido1.agregarProducto(prod);

	    File archivo = new File("factura_test.txt");
	    pedido1.guardarFactura(archivo);

	    assertTrue(archivo.exists());
	}
	
	@Test
	void testGenerarFactura() {

	    ProductoMenu prod = new ProductoMenu("Hamburguesa", 10000);
	    pedido1.agregarProducto(prod);

	    String factura = pedido1.generarTextoFactura();

	    assertTrue(factura.contains("Juan Felipe Leon"));
	    assertTrue(factura.contains("Universidad de los Andes"));
	    assertTrue(factura.contains("Hamburguesa"));
	    assertTrue(factura.contains("Precio Total"));
	}
}

