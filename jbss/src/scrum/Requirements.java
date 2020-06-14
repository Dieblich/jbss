package scrum;

import java.util.HashMap;

public class Requirements implements Storypoints {

	HashMap<Integer, Integer> storypointmap = new HashMap<Integer, Integer>();
	
	public Requirements() {
		storypointmap.put(0, 0);
		storypointmap.put(1, 3);
		storypointmap.put(2, 8);
		storypointmap.put(3, 13);
		storypointmap.put(4, 20);
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
