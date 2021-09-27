import javax.swing.JFrame;
//test
public class Run {

	public static void main(String[] args) {
		
		JFrame 	frame = new JFrame("Display Shapes");
		MyPanel panel = new MyPanel();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.add(panel);
		frame.setSize(800, 600);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

	}
	
}