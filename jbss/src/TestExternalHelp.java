import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import scrum.ExternalHelp;

class TestExternalHelp {

	ExternalHelp externalHelp = new ExternalHelp();
	
	@Test
	void testTransformScale() {
		assertEquals(0, externalHelp.transformScale(0));
	}
	
	@Test
	void testTransformScaleNegative() {
		assertNotEquals(7, externalHelp.transformScale(1));
	}

}