package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Rectangulo;

public class RectanguloTest {
	
	private Rectangulo rectangulo;
	
	@Before
	public void before() {
		rectangulo = new Rectangulo(5,6);
	}

	@Test
	public void compruebaLadosIguales() {
		assertEquals(false, rectangulo.calcularLadosIguales());
	}
	
	@Test
	public void compruebaPerimetro() {
		assertEquals(22, rectangulo.calcularPerimetro());
	}
	
	@Test
	public void compruebaArea() {
		assertEquals(30, rectangulo.calcularArea());
	}
	
	@Test
	public void comprobarDiagonal() {
		assertEquals(7, rectangulo.calcularDiagonal());
	}
	
	@Test
	public void comprobarCircunferencia() {
		assertEquals(2, rectangulo.calcularCircunferencia());
	}
}
