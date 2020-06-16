import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scrum.Insecurtiy;

class TestInsecurity {

	Insecurtiy insecurity = new Insecurtiy();
	
	@Test
	void testTransformScale() {
		assertEquals(13, insecurity.transformScale(2));
	}
	
	@Test
	void testTransformScaleNegative() {
		assertNotEquals(13, insecurity.transformScale(1));
	}

}
