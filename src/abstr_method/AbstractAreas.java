package abstr_method;

import override_method.Figure;
import override_method.Rectangle;
import override_method.Triangle;

public class AbstractAreas {
	public static void main(String[] args) {
//		Figure f = new Figure(10, 10);//теперь
		
		
		Rectangle r = new Rectangle(9, 5);
		Triangle t = new Triangle(10, 8);
		Figure figred;
		
		figred = r;
		System.out.println("figred = " + figred.area());
		
		figred = t;
		System.out.println("figred = " + figred.area());
	}
}
