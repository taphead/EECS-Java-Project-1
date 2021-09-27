import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import java.util.concurrent.ThreadLocalRandom;

public class MyPanel extends JPanel implements ActionListener {
	
	public	JButton loadShapes;
	public	JButton sortShapes;
	public	Shape	shape1, shape2, shape3, shape4, shape5, shape6;
	public  Shape	shapeA, shapeB, shapeC, shapeD, shapeE, shapeF;
	public	boolean sorted = false;
	
	public MyPanel() {
		
		//Create Load Shapes and Sort Shapes buttons
		loadShapes = new JButton("Load Shapes");
		sortShapes = new JButton("Sort Shapes");
		loadShapes.addActionListener(this);
		sortShapes.addActionListener(this);
		
		this.add(loadShapes);
		this.add(sortShapes);
	}
	

	//Add actions to each button
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource()==loadShapes) {
			
			sorted = false;
			repaint();
			
		}
		
		else if (e.getSource()==sortShapes) {
			
			this.sortShapes();
			repaint();
			
		}	
		
	}

	//Display 6 shapes
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		
		if (!sorted) {
			
			//Display random shapes of random size and color
			
			for (int i = 1; i <= 6; i++) {

				//picks random integer from 1 to 3 inclusive
				int randNum = ThreadLocalRandom.current().nextInt(1, 4);

				
				//if 1 then Rectangle
				if (randNum == 1) {

					//Creates Rectangle with random size and color
					Rectangle r = new Rectangle(50+(i-1)*75, 50+(i-1)*75, ThreadLocalRandom.current().nextInt(10, 51), ThreadLocalRandom.current().nextInt(10, 51), ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256));
					g2d.setColor(new Color(r.red, r.green, r.blue));
					g2d.fillRect(r.x, r.y, r.width, r.height);
					
					switch(i) {
					
					case 1:
						this.shape1 = new Rectangle(r);
						break;
					case 2:
						this.shape2 = new Rectangle(r);
						break;
					case 3:
						this.shape3 = new Rectangle(r);
						break;
					case 4:
						this.shape4 = new Rectangle(r);
						break;
					case 5:
						this.shape5 = new Rectangle(r);
						break;
					case 6:
						this.shape6 = new Rectangle(r);
						break;
						
					}

				}
				
				//If 2 then Square
				else if (randNum == 2) {
					
					
					//Creates Square with random size and color
					Square s = new Square(50+(i-1)*75, 50+(i-1)*75, ThreadLocalRandom.current().nextInt(10, 51), ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256));			
					g2d.setColor(new Color(s.red, s.green, s.blue));
					g2d.fillRect(s.x, s.y, s.width, s.height);
					
					switch(i) {
					
					case 1:
						this.shape1 = new Square(s);
						break;
					case 2:
						this.shape2 = new Square(s);
						break;
					case 3:
						this.shape3 = new Square(s);
						break;
					case 4:
						this.shape4 = new Square(s);
						break;
					case 5:
						this.shape5 = new Square(s);
						break;
					case 6:
						this.shape6 = new Square(s);
						break;
						
					}
					
				}
				
				//Else Circle
				else {
					
					//Creates circle with random size and color
					Circle c = new Circle(50+(i-1)*75, 50+(i-1)*75, ThreadLocalRandom.current().nextInt(10, 51), ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256), ThreadLocalRandom.current().nextInt(0, 256));	
					g2d.setColor(new Color(c.red, c.green, c.blue));
					g2d.fillOval(c.x, c.y, c.width, c.height);
					
					switch(i) {
					
					case 1:
						this.shape1 = new Circle(c);
						break;
					case 2:
						this.shape2 = new Circle(c);
						break;
					case 3:
						this.shape3 = new Circle(c);
						break;
					case 4:
						this.shape4 = new Circle(c);
						break;
					case 5:
						this.shape5 = new Circle(c);
						break;
					case 6:
						this.shape6 = new Circle(c);
						break;
						
					}
					
				}
				
			}
		}
		
		else {
			//Display shapes sorted by order of surface area
			
			switch(shapeA.ID) {
			
			case 1:
				Rectangle rect = new Rectangle(50, 50, shapeA.width, shapeA.height, shapeA.red, shapeA.green, shapeA.blue);
				g2d.setColor(new Color(rect.red, rect.green, rect.blue));
				g2d.fillRect(rect.x, rect.y, rect.width, rect.height);
				break;
			case 2:
				Square	squa = new Square(50, 50, shapeA.width, shapeA.red, shapeA.green, shapeA.blue);
				g2d.setColor(new Color(squa.red, squa.green, squa.blue));
				g2d.fillRect(squa.x, squa.y, squa.width, squa.height);
				break;
			case 3:
				Circle circ = new Circle(50, 50, shapeA.width, shapeA.red, shapeA.green, shapeA.blue);
				g2d.setColor(new Color(circ.red, circ.green, circ.blue));
				g2d.fillOval(circ.x, circ.y, circ.width, circ.height);
				
			}

			switch(shapeB.ID) {
			
			case 1:
				Rectangle rect = new Rectangle(125, 125, shapeB.width, shapeB.height, shapeB.red, shapeB.green, shapeB.blue);
				g2d.setColor(new Color(rect.red, rect.green, rect.blue));
				g2d.fillRect(rect.x, rect.y, rect.width, rect.height);
				break;
			case 2:
				Square	squa = new Square(125, 125, shapeB.width, shapeB.red, shapeB.green, shapeB.blue);
				g2d.setColor(new Color(squa.red, squa.green, squa.blue));
				g2d.fillRect(squa.x, squa.y, squa.width, squa.height);
				break;
			case 3:
				Circle circ = new Circle(125, 125, shapeB.width, shapeB.red, shapeB.green, shapeB.blue);
				g2d.setColor(new Color(circ.red, circ.green, circ.blue));
				g2d.fillOval(circ.x, circ.y, circ.width, circ.height);
				
			}
			
			switch(shapeC.ID) {
			
			case 1:
				Rectangle rect = new Rectangle(200, 200, shapeC.width, shapeC.height, shapeC.red, shapeC.green, shapeC.blue);
				g2d.setColor(new Color(rect.red, rect.green, rect.blue));
				g2d.fillRect(rect.x, rect.y, rect.width, rect.height);
				break;
			case 2:
				Square	squa = new Square(200, 200, shapeC.width, shapeC.red, shapeC.green, shapeC.blue);
				g2d.setColor(new Color(squa.red, squa.green, squa.blue));
				g2d.fillRect(squa.x, squa.y, squa.width, squa.height);
				break;
			case 3:
				Circle circ = new Circle(200, 200, shapeC.width, shapeC.red, shapeC.green, shapeC.blue);
				g2d.setColor(new Color(circ.red, circ.green, circ.blue));
				g2d.fillOval(circ.x, circ.y, circ.width, circ.height);
				
			}
			
			switch(shapeD.ID) {
			
			case 1:
				Rectangle rect = new Rectangle(275, 275, shapeD.width, shapeD.height, shapeD.red, shapeD.green, shapeD.blue);
				g2d.setColor(new Color(rect.red, rect.green, rect.blue));
				g2d.fillRect(rect.x, rect.y, rect.width, rect.height);
				break;
			case 2:
				Square	squa = new Square(275, 275, shapeD.width, shapeD.red, shapeD.green, shapeD.blue);
				g2d.setColor(new Color(squa.red, squa.green, squa.blue));
				g2d.fillRect(squa.x, squa.y, squa.width, squa.height);
				break;
			case 3:
				Circle circ = new Circle(275, 275, shapeD.width, shapeD.red, shapeD.green, shapeD.blue);
				g2d.setColor(new Color(circ.red, circ.green, circ.blue));
				g2d.fillOval(circ.x, circ.y, circ.width, circ.height);
				
			}
			
			switch(shapeE.ID) {
			
			case 1:
				Rectangle rect = new Rectangle(350, 350, shapeE.width, shapeE.height, shapeE.red, shapeE.green, shapeE.blue);
				g2d.setColor(new Color(rect.red, rect.green, rect.blue));
				g2d.fillRect(rect.x, rect.y, rect.width, rect.height);
				break;
			case 2:
				Square	squa = new Square(350, 350, shapeE.width, shapeE.red, shapeE.green, shapeE.blue);
				g2d.setColor(new Color(squa.red, squa.green, squa.blue));
				g2d.fillRect(squa.x, squa.y, squa.width, squa.height);
				break;
			case 3:
				Circle circ = new Circle(350, 350, shapeE.width, shapeE.red, shapeE.green, shapeE.blue);
				g2d.setColor(new Color(circ.red, circ.green, circ.blue));
				g2d.fillOval(circ.x, circ.y, circ.width, circ.height);
				
			}
			
			switch(shapeF.ID) {
			
			case 1:
				Rectangle rect = new Rectangle(425, 425, shapeF.width, shapeF.height, shapeF.red, shapeF.green, shapeF.blue);
				g2d.setColor(new Color(rect.red, rect.green, rect.blue));
				g2d.fillRect(rect.x, rect.y, rect.width, rect.height);
				break;
			case 2:
				Square	squa = new Square(425, 425, shapeF.width, shapeF.red, shapeF.green, shapeF.blue);
				g2d.setColor(new Color(squa.red, squa.green, squa.blue));
				g2d.fillRect(squa.x, squa.y, squa.width, squa.height);
				break;
			case 3:
				Circle circ = new Circle(425, 425, shapeF.width, shapeF.red, shapeF.green, shapeF.blue);
				g2d.setColor(new Color(circ.red, circ.green, circ.blue));
				g2d.fillOval(circ.x, circ.y, circ.width, circ.height);
				
			}
				
		}

	}
	
	public void sortShapes() {
		Shape[] arrayShapes = {shape1, shape2, shape3, shape4, shape5, shape6};
		
		//Sorted by insertion sort
		int i, j;
		Shape key;
		for (i = 1; i < 6; i++) {
			
			key = arrayShapes[i];
			j = i -1;
			
			while (j >= 0 && arrayShapes[j].compareTo(key) > 0) {
				arrayShapes[j+1] = arrayShapes[j];
				j = j - 1;
			}
			arrayShapes[j+1] = key;
			
		}
		
		shapeA = arrayShapes[0];
		shapeB = arrayShapes[1];
		shapeC = arrayShapes[2];
		shapeD = arrayShapes[3];
		shapeE = arrayShapes[4];
		shapeF = arrayShapes[5];

		sorted = true;
		
		return;
	}
	

}
