package application;

import java.util.ArrayList;

public class Storypoints {
	public ArrayList<Integer> storypoints = new ArrayList<Integer>();
	
	
	public Storypoints() {
		storypoints.add(0);
		storypoints.add(1);
		storypoints.add(2);
		storypoints.add(3);
		storypoints.add(5);
		storypoints.add(8);
		storypoints.add(13);
		storypoints.add(20);
		storypoints.add(40);
		storypoints.add(100);
	}
	
	/**
	 * 
	 * Give this method an integer and he will return the closed fibionacci story point
	 * 
	 * @param unformattetInteger
	 * @return
	 */
	public int getStorypoints(int unformattetInteger) {
		int result = 0;
		if (unformattetInteger < 0) {
			result = 0; 
		} else {
			for(int sp : storypoints) {
				if(unformattetInteger<= sp) {
					result = sp;
				}
			}
		}
		return result;
		
	}
}
