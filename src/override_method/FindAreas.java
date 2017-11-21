package override_method;

public class FindAreas {
	public static void main(String[] args) {
		Figure f = new Figure(10, 10);
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figred;
		
		figred = r;
		System.out.println("Площадь figred.area() = " + figred.area());
		figred = t;
		System.out.println("Площадь figred.area() = " + figred.area());
		figred = f;
		System.out.println("Площадь figred.area() = " + figred.area());
		
	}
}
