package scrum;

import java.util.HashMap;

public interface Storypoints {

	static HashMap<Integer, Integer> storypointmap = new HashMap<Integer, Integer>();
	
	/**
	 * Give this method a value from a linear scale. You'll get the SCRUM Storypoints for this value in return.
	 * @param scale
	 * @return
	 */
	public int transformScale(int scale);
}
