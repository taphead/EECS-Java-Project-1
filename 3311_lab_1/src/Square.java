//test
public class Square extends Shape {
	
	public Square (int x, int y, int width, int red, int green, int blue) {
		
		this.x = x;
		this.y = y;
		this.width 	= width;
		this.height = width;
		this.red = red;
		this.green = green;
		this.blue = blue;
		this.ID = 2;
		
	}
	
	public Square(Square copy) {
		
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