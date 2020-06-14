package scrum;

import java.util.HashMap;

public class Insecurtiy implements Storypoints {

	HashMap<Integer, Integer> storypointmap = new HashMap<Integer, Integer>();
	
	public Insecurtiy() {
		storypointmap.put(0, 0);
		storypointmap.put(1, 3);
		storypointmap.put(2, 13);
		storypointmap.put(3, 20);
		storypointmap.put(4, 40);
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
