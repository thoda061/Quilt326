
/**
 *
 * @author thoda061
 */
public class QuiltSquare {
	
	private int scale;
	private int[] colour = new int[3];
	
	public QuiltSquare(String input) {
		int currChar = 0;
		int numCount = 0;
		for(int i = 0; i < input.length(); i++){
			if(input.charAt(i) == ' '){
				if(numCount == 0) {
					scale = Integer.valueOf(input.substring(currChar,i));
					currChar = i+1;
				} else {
					colour[numCount - 1] = Integer.valueOf(input.substring(currChar,i));
				}
			}
			if(input.charAt(i) == '\n'){
				colour[numCount - 1] = Integer.valueOf(input.substring(currChar));
			}
		}
	}

	public int getScale() {
		return scale;
	}

	public int[] getColour() {
		return colour;
	}
	
}
