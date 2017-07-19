
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


/**
 *
 * @author thoda061
 */
public class QuiltPanel extends JPanel{
	
	ArrayList<QuiltSquare> input;
	int scaleSum = 0;
	
	public QuiltPanel (ArrayList<QuiltSquare> input) {
		setLayout(new FlowLayout());
      setDoubleBuffered(true);
      updateUI();
		this.input = input;
		for(QuiltSquare qs : input) {
			scaleSum += qs.getScale();
		}
	}
	
	@Override
	public void paintComponent(Graphics g) {
		ArrayList<int[]> centrePoints = new ArrayList();
		int[] startPoint = {200,200};
		centrePoints.add(startPoint);
		super.paintComponent(g);
		for(QuiltSquare qs : input) {
			ArrayList<int[]> tempPoints = new ArrayList();
			g.setColor(new Color(qs.getColour()[0],qs.getColour()[1],qs.getColour()[2]));
			int size = 400 * (qs.getScale()/scaleSum);
			for(int[] point : centrePoints) {
				g.fillRect(point[0]-(size/2), point[1]-(size/2), size, size);
				int[] corner = {point[0]-(size/2),point[1]-(size/2)};
				tempPoints.add(corner);
				corner[0] = point[0]+(size/2);
				corner[1] = point[1]-(size/2);
				tempPoints.add(corner);
				corner[0] = point[0]-(size/2);
				corner[1] = point[1]+(size/2);
				tempPoints.add(corner);
				corner[0] = point[0]+(size/2);
				corner[1] = point[1]+(size/2);
				tempPoints.add(corner);
			}
			centrePoints = tempPoints;
		}
	}
}
