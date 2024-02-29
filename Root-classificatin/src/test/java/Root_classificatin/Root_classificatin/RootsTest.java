package Root_classificatin.Root_classificatin;

import static org.junit.Assert.*;

import org.junit.Test;

public class RootsTest {
	Roots root;

	@Test
	public void testPartion1_error1() {
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
	public void AMin() {

		Roots.calculate_roots(0, 5, 20);

		String root_expected = Root_Types.Not_quadratic.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void AMin_plus1() {

		Roots.calculate_roots(1, 4, 4);

		String root_expected = Root_Types.Equal_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void AMax_minus1() {

		Roots.calculate_roots(99, 6, 7);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void AMax() {

		Roots.calculate_roots(100, 90, 90);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void BMin() {

		Roots.calculate_roots(2, 0, 4);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void BMin_plus1() {

		Roots.calculate_roots(2, 1, 5);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void BMax_minus1() {

		Roots.calculate_roots(6, 99, 7);

		String root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void BMax() {

		Roots.calculate_roots(90, 100, 90);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void CMin() {

		Roots.calculate_roots(20, 5, 0);

		String root_expected = Root_Types.Two_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void CMin_plus1() {

		Roots.calculate_roots(10, 2, 1);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void CMax_minus1() {

		Roots.calculate_roots(90, 90, 99);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void CMax() {

		Roots.calculate_roots(6, 7, 100);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

	@Test
	public void Nominal() {

		Roots.calculate_roots(4, 4, 4);

		String root_expected = Root_Types.No_roots.toString();

		assertEquals(root_expected, Roots.root_types().toString());
	}

}
