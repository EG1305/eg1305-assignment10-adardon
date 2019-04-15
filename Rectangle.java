public class Rectangle {
	
	private double length;
	private double width;
	
	
	public Rectangle(double length, double width){
		length = this.length;
		width = this.width;
		
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