package my.packageY

import static org.hamcrest.CoreMatchers.*
import static org.junit.Assert.*

import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.JUnit4

import my.packageX.Greeter

@RunWith(JUnit4.class)
class GreeterTest {

	@Test
	void test_greet() {
		def expected = "HELLO, George"
		def actual = new Greeter().greet("George")
	}
}
