package override_method;

import java.lang.Override;

public class Triangle extends Figure {
	
	public Triangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	//Переопределить метод area()
	
	@Override
	double area() {
		System.out.println("Площадь в области треугольника.");
		return dim1 * dim2 / 2;
	}
}
