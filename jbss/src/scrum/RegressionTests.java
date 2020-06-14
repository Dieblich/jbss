package scrum;

import java.util.HashMap;

public class RegressionTests implements Storypoints {

	HashMap<Integer, Integer> storypointmap = new HashMap<Integer, Integer>();
	
	public RegressionTests() {
		storypointmap.put(0, 0);
		storypointmap.put(1, 1);
		storypointmap.put(2, 2);
		storypointmap.put(3, 5);
		storypointmap.put(4, 8);
	}
	
	@Override
	public int transformScale(int scale) {
		int result = 0;
		try {
			result = storypointmap.get(scale);
		} catch (Exception e) {
			result = 0;
		}
		return result;
	}

}
