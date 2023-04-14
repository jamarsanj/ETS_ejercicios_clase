package ETS_Edad;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Test;

public class ETS_Edad_Test {
	@Test(expected=AssertionError.class)
	public void test1() {
		ETS_Edad p = new ETS_Edad(-1);
		p.isMayorDeEdad();
	}

	@Test(expected=AssertionError.class)
	public void test2() {
		ETS_Edad p = new ETS_Edad(-100);
		p.isMayorDeEdad();
	}

	@Test
	public void test3() {
		ETS_Edad p = new ETS_Edad(0);
		assertFalse(p.isMayorDeEdad());
	}

	@Test
	public void test4() {
		ETS_Edad p = new ETS_Edad(17);
		assertFalse(p.isMayorDeEdad());
	}

	@Test
	public void test5() {
		ETS_Edad p = new ETS_Edad(18);
		assertTrue(p.isMayorDeEdad());
	}

	@Test
	public void test6() {
		ETS_Edad p = new ETS_Edad(100);
		assertTrue(p.isMayorDeEdad());
	}
}