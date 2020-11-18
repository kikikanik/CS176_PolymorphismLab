
public class ShapeTest {
	public static void main(String[] args ) {

		Shape[] s= new Shape[6]; //creates array
		s[0] = new Circle("Pink", 0, 1, 2);
		s[1] = new Circle("Pink", 1, 2, 2);
		s[2] = new Rectangle("Pink", 5, 10, 20, 10); 
		s[3] = new Triangle("Pink", 3, 4, 5); 
		s[4] = new Sphere("Pink", 1, 1, 1, 4); 
		s[5] = new Cuboid("Pink", 0, 5, 10, 10, 5, 4);

		System.out.println("Are the two circles equal? " + s[0].equals(s[1]));

		for(int i=0;i<s.length;i++){
			System.out.println(s[i]);
			System.out.println("Area: " + s[i].getArea());
		}
		
		Sphere sph = (Sphere)s[4];
		System.out.println("Sphere's Volume: " + sph.getVolume());
		Cuboid cub= (Cuboid)s[5];
		System.out.println("Cuboid's Volume: " + cub.getVolume());

		Circle cir = (Circle)s[0];
		Circle cir2= (Circle)s[1];
		cir.setXCoor(1);
		cir.setYCoor(2);
		System.out.println("Are the two circles equal? " + cir.equals(cir2));

		Rectangle rec = (Rectangle)s[2];
		rec.setWidth(15);
		System.out.print("New Rectangle Area: " +rec.getArea());

	}
}

