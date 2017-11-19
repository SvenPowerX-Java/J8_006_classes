package first_demo;

public class Box {
	double with;
	double height;
	double depth;
	
	double volume() {
		return with * height * depth;
	}
	
	public Box() {
		System.out.println("Конструирование объекта Box");
		this.with = 10;
		this.height = 10;
		this.depth = 10;
	}
	
	public Box(double with, double height, double depth) {
		this.with = with;
		this.height = height;
		this.depth = depth;
	}
	
	void setDim(double with, double height, double depth) {
		this.with = with;
		this.height = height;
		this.depth = depth;
	}
}
