
public class Shape {
	
	//variable
	private String Color;
	
	//Constructor
	public Shape(String color) {
		Color = color;
	}

	//setters&getters
	public void setColor(String color) {
		Color = color;
	}
	
	public String getColor() {
		return Color;
	}
	
	//Area
	public double getArea() {
		return 0;
	}
	
	public String toString() {
		return "Color: " + Color;
	}
	
}
