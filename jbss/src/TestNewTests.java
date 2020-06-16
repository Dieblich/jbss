import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scrum.NewTests;

class TestNewTests {

	NewTests newTests = new NewTests();
	
	@Test
	void testTransformScale() {
		assertEquals(13,newTests.transformScale(4));
	}
	
	@Test
	void testTransformScaleNegative() {
		assertNotEquals(10,newTests.transformScale(1));
	}

}
