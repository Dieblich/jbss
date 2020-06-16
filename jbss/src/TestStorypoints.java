import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.Before;
import org.junit.jupiter.api.Test;

import application.Storypoints;

class TestStorypoints {

	Storypoints storypoints = new Storypoints();
	
	@Before
	public void before() {
		
	}
	
	@Test
	void testGetStorypoints() {
		assertEquals(20, storypoints.getStorypoints(25));
	}
	
	@Test
	void testGetStorypointsNegative() {
		assertNotEquals(40, storypoints.getStorypoints(25));
	}

}
