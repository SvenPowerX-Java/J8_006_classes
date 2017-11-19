package first_demo;

public class Box {
	double width;
	double height;
	double depth;
	
	public double volume() {
		return width * height * depth;
	}
	
	public Box() {
		System.out.println("Конструирование объекта Box");
		this.width = -1;
		this.height = -1;
		this.depth = -1;
	}
	
	public Box(Box ob) {
		width = ob.width;
		height = ob.height;
		depth = ob.depth;
	}
	
	public Box(double width, double height, double depth) {
		this.width = width;
		this.height = height;
		this.depth = depth;
	}
	
	//Конструктор для куба
	public Box(double len) {
		width = height = depth = len;
	}
	
	void setDim(double with, double height, double depth) {
		this.width = with;
		this.height = height;
		this.depth = depth;
	}
}
