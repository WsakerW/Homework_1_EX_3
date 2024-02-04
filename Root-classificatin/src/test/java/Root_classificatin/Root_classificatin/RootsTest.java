package Root_classificatin.Root_classificatin;

import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest {
	Roots root;

	@Test
	public void testPartion1_error1() {
		// (0,1,2)
		Roots.calculate_roots(-2, 1, 2);

		String root_expected = Root_Types.ERROR.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion1_error2() {
		
		Roots.calculate_roots(2, -1, 2);

		String root_expected = Root_Types.ERROR.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion1_error3() {
		
		Roots.calculate_roots(2, 1, 101);

		String root_expected = Root_Types.ERROR.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion2_NotQuadratic() {
		
		Roots.calculate_roots(0, 5, 20);

		String root_expected = Root_Types.Not_quadratic.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion3_NoRoots() {
		
		Roots.calculate_roots(99, 6, 7);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion4_TwoRoots() {
		
		Roots.calculate_roots(20, 5, 0);

		String root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}
	
	@Test
	public void testPartion5_EqualRoots() {
		
		Roots.calculate_roots(1, 4, 4);

		String root_expected = Root_Types.Equal_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}


}
