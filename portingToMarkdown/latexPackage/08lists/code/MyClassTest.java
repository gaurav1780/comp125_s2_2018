import static org.junit.Assert.*;
import org.junit.Test;

public class MyClassTest {

	@Test
	public void testMultiply() {
		MyClass tester = new MyClass();
		assertEquals("Result", 50, tester.multiply(10, 5));
	}

	@Test
	public void testSum() {
		MyClass tester = new MyClass();
		assertEquals("Result", 30, tester.sum(10, 20));
	}
}
