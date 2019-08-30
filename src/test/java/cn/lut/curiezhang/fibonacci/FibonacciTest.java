package cn.lut.curiezhang.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

	@Test
	public void testFibonacci() {
		//assertEquals(0, Fibonacci.fib(0));
		//assertEquals(1, Fibonacci.fib(1));
		int cases[][] = {{0, 0}, {1, 1}, {2, 1}, {3, 2}};
			for(int i = 0; i < cases.length; i++) {
				assertEquals(cases[i][1], Fibonacci.fib(cases[i][0]));
		}
	}
}
