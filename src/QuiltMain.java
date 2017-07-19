
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JFrame;


/**
 *
 * @author thoda061
 */
public class QuiltMain {
	
	public static void main(String[]args) {
		ArrayList<QuiltSquare> input = new ArrayList();
		Scanner sc = new Scanner(System.in);
		while(sc.hasNextLine()) {
			input.add(new QuiltSquare(sc.nextLine()));
		}
		JFrame frame = new QuiltFrame(input);
		frame.setVisible(true);
	}
}
