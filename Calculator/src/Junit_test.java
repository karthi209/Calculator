import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Junit_test {

	@Test
	void test() {
		CalcJava junit = new CalcJava();
		int result = junit.add(100, 200);
		assertEquals(300, result);
	}

}
