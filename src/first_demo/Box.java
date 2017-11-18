package first_demo;

public class Box {
	double with;
	double height;
	double depth;
	
	double volume() {
		return with * height * depth;
	}
	
	void setDim(double with, double height, double depth) {
		this.with = with;
		this.height = height;
		this.depth = depth;
	}
}
