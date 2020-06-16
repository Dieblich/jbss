import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scrum.Design;

class TestDesign {

	Design design = new Design();
	
	@Test
	void testTransformScale() {
		assertEquals(100,design.transformScale(4));
	}
	
	@Test
	void testTransformScaleNegative() {
		assertNotEquals(40,design.transformScale(4));
	}


}
