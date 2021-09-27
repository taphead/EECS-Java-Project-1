
public class Rectangle extends Shape {

	public Rectangle(int x, int y, int width, int height, int red, int green, int blue) {
		
		this.x = x;
		this.y = y;
		this.width 	= width;
		this.height = height;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.ID = 1;
		
	}
	
	public Rectangle(Rectangle copy) {
		
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
		
		return width*height;
		
	}

	@Override
	public double compareTo(Shape s) {
		
		return this.calculateArea() - s.calculateArea();
		
	}
	
}