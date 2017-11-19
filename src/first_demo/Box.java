package first_demo;

public class Box {
	double with;
	double height;
	double depth;
	
	public double volume() {
		return with * height * depth;
	}
	
	public Box() {
		System.out.println("Конструирование объекта Box");
		this.with = -1;
		this.height = -1;
		this.depth = -1;
	}
	
	public Box(double with, double height, double depth) {
		this.with = with;
		this.height = height;
		this.depth = depth;
	}
	
	//Конструктор для куба
	public Box(double len) {
		with = height = depth = len;
	}
	
	void setDim(double with, double height, double depth) {
		this.with = with;
		this.height = height;
		this.depth = depth;
	}
}
