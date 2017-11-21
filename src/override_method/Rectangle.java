package override_method;



public class Rectangle extends Figure {
	
	public Rectangle(double dim1, double dim2) {
		super(dim1, dim2);
	}
	
	public double area() {
		System.out.println("В области четырехугольника");
		return dim1 * dim2;
	}
}
