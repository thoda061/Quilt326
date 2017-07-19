
import java.awt.Container;
import java.util.ArrayList;
import javax.swing.JFrame;


/**
 *
 * @author thoda061
 */
public class QuiltFrame extends JFrame{
	
	private ArrayList<QuiltSquare> input;
	
	public QuiltFrame (ArrayList<QuiltSquare> input)  {
		this.input = input;
		initComponents();
	}
	
	private void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,400,400,400);
		add(new QuiltPanel(input));
		setVisible(true);	
	}
}
