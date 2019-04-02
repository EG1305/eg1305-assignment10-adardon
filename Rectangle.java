public class Rectangle {
	
	private double length;
	private double width;
	
	
	public Rectangle(double l, double w){
		length = l;
		width = w;
		
	}
	
	public double getLength(){
		return length;
	}
	public double getArea() {
		return length * width;
	}
	public double getPerimeter() {
		return 2 * (length + width);
	}
}