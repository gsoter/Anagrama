package anagrama;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * A classe <code>TesteAnagrama</code> � respons�vel por testar m�todos da
 * classe <code>Anagrama</code>.
 * 
 * <p>
 * Categorias: Texto v�lido <i>(Requisito: Este anagrama trata de palavras ou
 * frases apenas).</i>
 * 
 * @author gsoter
 *
 */
public class TesteAnagrama {

	IAnagrama anagrama;

	@Before
	public void setUp() throws Exception {
		anagrama = new Anagrama();
	}

	@After
	public void tearDown() throws Exception {
		anagrama = null;
		System.gc();
	}

	/**
	 * Teste de duas strings que s�o anagramas.
	 * 
	 */
	@Test
	public void testPalavraIsAnagramas() {
		// 1A
		String s1 = "Amor";
		String s2 = "Roma";
		// 2A
		boolean result = anagrama.isAnagramas(s1, s2);
		// 3A
		assertTrue(result);
	}

	/**
	 * Teste de duas frases que s�o anagramas.
	 * 
	 */
	@Test
	public void testFraseIsAnagrama() {
		// 1A
		String s1 = "O c�u � azul";
		String s2 = "� azul o c�u";
		// 2A
		boolean result = anagrama.isAnagramas(s1, s2);
		// 3A
		assertTrue(result);
	}

	/**
	 * Teste de n�o aceita��o de n�meros.
	 * 
	 */
	@Test
	public void testNumeroIsAnagrama() {
		// 1A
		String n1 = "123456";
		String n2 = "563412";
		// 2A
		boolean result = anagrama.isAnagramas(n1, n2);
		// 3A
		assertEquals(false, result);
	}

	/**
	 * Teste de duas strings que n�o s�o anagrama.
	 * 
	 */
	@Test
	public void testIsNotAnagrama() {
		// 1A
		String s1 = "Teste";
		String s2 = "Anagrama";
		// 2A
		boolean result = anagrama.isAnagramas(s1, s2);
		// 3A
		assertFalse(result);
	}

	/**
	 * Teste de exce��o
	 * 
	 */
	@Test(expected = NullPointerException.class)
	public void testIsAnagramaNull() {
		String s1 = null;
		String s2 = null;
		anagrama.isAnagramas(s1, s2);
	}

}
