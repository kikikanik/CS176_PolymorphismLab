
public class Cuboid extends Rectangle{
	
	//variables
	private int ZCoor;
	private int Height;
	
	//constructor
	public Cuboid(String color, int xCoor, int yCoor, int length, int width, int zCoor, int height) {
		super(color, xCoor, yCoor, length, width);
		ZCoor= zCoor;
		Height = height;
	}
	
	//setters&getters
	public void setZCoor(int zCoor) {
		ZCoor = zCoor;
	}
	
	public int getZCoor() {
		return ZCoor;
	}
	
	public void setHeight(int height) {
		Height = height;
	}
	public int getHeight() {
		return Height;
	}
	
	//methods Surface Area Calc & Volume Calc
	public double getVolume() {
		return Height*getLength()*getWidth();
	}
	
	public double getArea() {
		double a = getLength()*getWidth();
		double b = getLength()*Height;
		double c = getWidth()*Height;
		return 2*a*b*c;
	} 
	
	public String toString() {
		return "Cuboid Extends " +super.toString() + " | z Coordinate: [" + ZCoor + "] | Height: " + Height;
	}

}
