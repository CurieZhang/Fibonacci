package cn.lut.curiezhang.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FibonacciTest {

	@Test
	public void testFibonacci() {
		assertEquals(0, Fibonacci.fib(0));
	}
}
