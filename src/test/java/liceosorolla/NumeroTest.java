package test.java.liceosorolla;
import org.junit.Before;
import org.junit.Test;
import main.java.liceosorolla.Numero;
import static org.junit.Assert.assertEquals;

public class NumeroTest {
	
	private Numero numero;
	
	@Before
	public void Before() {
		
		numero = new Numero(2,6);
	}
	
	@Test
	public void comprobarNum1() {
		
		assertEquals(2,numero.getNumero1());
	}
	
	@Test
	public void comprobarNum2() {
		
		assertEquals(6,numero.getNumero2());
	}
	
	@Test
	public void comprobarSuma() {
		
		assertEquals(8,numero.suma());
	}
	
	@Test
	public void comprobarResta() {
		
		assertEquals(4,numero.resta());
	}
	
	@Test
	public void comprobarMultiplicar() {
		
		assertEquals(12,numero.multiplicacion());
	}
	
	@Test
	public void comprobarDividir() {
		
		assertEquals(3,numero.division());
	}
	
	@Test
	public void comprobarPotencia() {
		
		assertEquals(36,numero.potencia());
	}
	
	@Test
	public void comprobarmultiplo() {
		
		assertEquals(true,numero.multiplo());
	}
	

}
