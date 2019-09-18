package anagrama;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

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

	@Test
	public void testIsAnagramas() {
		fail("Not yet implemented");
	}

}
