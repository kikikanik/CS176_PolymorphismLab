
public class Sphere extends Circle{
	
	//variable
	private int ZCoor;
	
	//constructor
	public Sphere(String color, int xCoor, int yCoor, int radius, int zCoor) {
		super(color, xCoor, yCoor, radius);
		ZCoor = zCoor;
	}
	
	//setters&getters
	public void setZCoor(int zCoor) {
		ZCoor = zCoor;
	}
	
	public int getZCoor() {
		return ZCoor;
	}
	
	
	//methods Area & Volume
	public double getVolume() {
		return 4/3*getRadius()*getRadius()*getRadius()*Math.PI;
	}
	
	public double getArea() {
		return 4*Math.PI*getRadius()*getRadius();
	}
	
	public String toString() {
		return "Sphere Extends " + super.toString() + " | z Coordinate: [" + ZCoor + "]";
	}

}
