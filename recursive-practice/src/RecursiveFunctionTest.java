import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RecursiveFunctionTest {

	@Test
	void TestFactorial() {
		assertTrue("The method is not working", RecursiveFunctions.factorial(4) == 24);
		assertTrue("The method is not working", RecursiveFunctions.factorial(10) == 3628800);
		assertTrue("The method is not working", RecursiveFunctions.factorial(5) == 120);
	}
	@Test
	void TestFibonacci() {
		assertTrue("The method is not working", RecursiveFunctions.fibonacci(5) == 5);
		assertTrue("The method is not working", RecursiveFunctions.fibonacci(8) == 21);
		assertTrue("The method is not working", RecursiveFunctions.fibonacci(7) == 13);
	}
	@Test
	void TestArraySummonary() {
		int[] array= {4, 5, 6, 7, 3, 9, 12};
		assertTrue("The method is not working", RecursiveFunctions.arraySummatory(array, 3) == 22);
		assertTrue("The method is not working", RecursiveFunctions.arraySummatory(array, 5) == 34);
	}
}
