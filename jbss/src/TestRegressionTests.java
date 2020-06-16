import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scrum.RegressionTests;

class TestRegressionTests {

	RegressionTests regressionTests = new RegressionTests();
	
	@Test
	void testTransformScale() {
		assertEquals(2,regressionTests.transformScale(2));
	}
	
	@Test
	void testTransformScaleNegative() {
		assertNotEquals(3,regressionTests.transformScale(2));
	}

}
