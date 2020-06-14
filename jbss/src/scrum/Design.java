package scrum;

import java.util.HashMap;

public class Design implements Storypoints {
	
	HashMap<Integer, Integer> storypointmap = new HashMap<Integer, Integer>();

	public Design() {
		storypointmap.put(0, 0);
		storypointmap.put(1, 0);
		storypointmap.put(2, 20);
		storypointmap.put(3, 40);
		storypointmap.put(3, 100);
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