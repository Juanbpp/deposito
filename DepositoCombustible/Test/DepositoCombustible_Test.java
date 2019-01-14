import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class DepositoCombustible_Test {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetDepositoNivel() {
		DepositoCombustible dep = new DepositoCombustible(0,5);
		double lev = dep.getDepositoNivel();
		assertEquals(5,lev,0);
	}

	@Test
	public void testGetDepositoMax() {
		DepositoCombustible dep = new DepositoCombustible(10,0);
		Double res = dep.getDepositoMax();
		assertEquals(10,res,0);
	}

	@Test
	public void testEstaVacio() {
		DepositoCombustible dep = new DepositoCombustible(10,5);
		boolean vac = dep.estaVacio();
		assertFalse(vac);
	}

	@Test
	public void testEstaLlenoMitad() {
		DepositoCombustible dep = new DepositoCombustible(2000,1000);
		double lev = dep.getDepositoNivel();
		double max = dep.getDepositoMax();
		assertEquals( max/2 , lev,0);
	}


}
