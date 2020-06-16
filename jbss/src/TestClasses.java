import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scrum.Classes;

class TestClasses {

	Classes classes = new Classes();
	
	@Test
	void testTransformScale() {
		assertEquals(5,classes.transformScale(2));
	}
	
	@Test
	void testTransformScaleNegative() {
		assertNotEquals(6,classes.transformScale(2));
	}

}
