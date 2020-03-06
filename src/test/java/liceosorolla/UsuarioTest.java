package test.java.liceosorolla;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import org.junit.Before;
import org.junit.Test;

import main.java.liceosorolla.Usuario;

public class UsuarioTest {
	
	private Usuario usuario;
	
	@Before
	public void before() {
		usuario = new Usuario("Pirtmon", "Nova Nara", LocalDate.of(1999,16,10), "54296978G");
	}
	
	@Test
	public void compruebaNombre() {
		assertEquals("Pirtmon", usuario.getNombre());
	}
	
	@Test
	public void compruebaApellidos() {
		assertEquals("Nova Nara", usuario.getApellidos());
	}
	
	@Test
	public void compruebaNombreCompleta() {
		
		assertEquals("Alejandro Nova Nara", usuario.comprobarNombre());
	}
	
	@Test
	public void compruebaMayoriaDeEdad() {
		assertEquals(true, usuario.mayorEdad());
	}
	
	@Test
	public void compruebaIdentificador() {
		
		assertEquals("54296978G", usuario.getIdentificador());
	}
	
	@Test
	public void compruebaNombreMayusculas() {
		
		assertEquals("PIRTMON", usuario.nombreMayusculas());
	}
	
	@Test
	public void compruebaNombreMinusculas() {
		
		assertEquals("pirtmon", usuario.nombreMinisculas());
	}
}