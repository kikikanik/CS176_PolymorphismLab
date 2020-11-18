
public class Rectangle extends Shape{
	
	//variables
	private int XCoor; 
	private int YCoor;
	private int Length;
	private int Width;
	
	
	//constructors
	public Rectangle(String color, int xCoor, int yCoor, int length, int width) {
		super(color);
		XCoor = xCoor;
		YCoor = yCoor;
		Length = length;
		Width = width;
	}
	
	//setters&getters
	public void setXCoor(int xCoor) {
		XCoor = xCoor;
	}
	
	public int getXCoor() {
		return XCoor;
	}
	
	public void setYoor(int yCoor) {
		YCoor = yCoor;
	}
	
	public int getYCoor() {
		return YCoor;
	}
	
	public void setLength(int length) {
		Length = length;
	}
	
	public int getLength() {
		return Length;
	}
	
	public void setWidth(int width) {
		Width = width;
	}
	
	public int getWidth() {
		return Width;
	}
	
	//Area Calc
	public double getArea() {
		return Length*Width;
	}
	
	public String toString() {
		return "Shape: Rectangle | "+ super.toString() + " | x, y Coordinates: ["+ XCoor + "," + YCoor + "]" + " | Length: "+ Length + " | Width: "+ Width;
	}

}
