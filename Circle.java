
public class Circle extends Shape {

	//variables
	private int XCoor;
	private int YCoor;
	private int Radius;

	//constructor
	public Circle(String color, int xCoor, int yCoor, int radius) {
		super(color);
		XCoor = xCoor;
		YCoor = yCoor;
		Radius= radius;
	}

	//setters&getters
	public void setXCoor(int xCoor) {
		XCoor = xCoor;
	}

	public int getXCoor() {
		return XCoor;
	}

	public void setYCoor(int yCoor) {
		YCoor = yCoor;
	}

	public int getYCoor() {
		return YCoor;
	}

	public void setRadius(int radius) {
		Radius = radius;
	}

	public int getRadius() {
		return Radius;
	}


	//Area
	public double getArea() {
		return Math.PI*(Radius*Radius);
	}


	public boolean equals(Circle obj) { 
		if(XCoor==obj.getXCoor()&&YCoor==obj.getYCoor()&&Radius==obj.getRadius())
			return true;
		else
			return false;
	}

	public String toString() {
		return "Shape: Circle | "+ super.toString() + " | x, y Coordinates: ["+ XCoor + "," + YCoor + "] " + "| Radius: "+ Radius;
	}
}
