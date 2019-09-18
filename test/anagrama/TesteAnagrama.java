package anagrama;

import org.junit.*;
import static org.junit.Assert.*;

/**
 * A classe <code>TesteAnagrama</code> é responsável por testar métodos da
 * classe <code>Anagrama</code>.
 * 
 * <p>
 * Categorias: Texto válido <i>(Requisito: Este anagrama trata de palavras ou
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
	 * Teste de duas strings que são anagramas.
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
	 * Teste de duas frases que são anagramas.
	 * 
	 */
	@Test
	public void testFraseIsAnagrama() {
		// 1A
		String s1 = "O céu é azul";
		String s2 = "É azul o céu";
		// 2A
		boolean result = anagrama.isAnagramas(s1, s2);
		// 3A
		assertTrue(result);
	}

	/**
	 * Teste de não aceitação de números.
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
	 * Teste de duas strings que não são anagrama.
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
	 * Teste de exceção
	 * 
	 */
	@Test(expected = NullPointerException.class)
	public void testIsAnagramaNull() {
		String s1 = null;
		String s2 = null;
		anagrama.isAnagramas(s1, s2);
	}

}
