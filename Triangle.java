
public class Triangle extends Shape {
	
	//variables
	private int len1;
	private int len2;
	private int len3; 
	
	//Constructor
	public Triangle(String color, int l1, int l2, int l3) {
		super(color);
		len1 = l1;
		len2 = l2;
		len3 = l3;
	}

	//setters&getters
	public void setlen1(int l1) {
		len1 = l1;
	}
	
	public int getlen1() {
		return len1;
	}
	
	public void setlen2(int l2) {
		len2 = l2;
	}
	
	public int getlen2() {
		return len2;
	}
	
	public void setlen3(int l3) {
		len3 = l3;
	}
	
	public int getlen3() {
		return len3;
	}
	
	//Area Calc
	public double getArea() {
		double s = ((len1 + len2 + len3) / 2);
		double area = Math.sqrt(s*(s-len1)*(s-len2)*(s-len3));
		return area;
	}
	
	public String toString() {
		return "Shape: Triangle | " + super.toString() + " | Lengths of side a, b, c, respectively: ["+ len1+","+len2+","+len3+ "]";
	}
}
