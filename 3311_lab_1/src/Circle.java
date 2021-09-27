
public class Circle extends Shape {

	public Circle(int x, int y, int width, int red, int green, int blue) {
		
		this.x = x;
		this.y = y;
		this.width 	= width;
		this.height = width;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.ID = 3;
		
	}
	
	public Circle(Circle copy) {
		
		this.x = copy.x;
		this.y = copy.y;
		this.width = copy.width;
		this.height = copy.height;
		this.red = copy.red;
		this.green = copy.green;
		this.blue = copy.blue;
		this.ID = copy.ID;
		
	}
	
	@Override
	public double calculateArea() {
		
		return Math.PI * Math.pow(((0.5)*this.width), 2);
		
	}
	
	@Override
	public double compareTo(Shape s) {
		
		return this.calculateArea() - s.calculateArea();
		
	}
	
}