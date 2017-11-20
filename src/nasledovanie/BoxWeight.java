package nasledovanie;

import first_demo.Box;

public class BoxWeight extends Box {
	double weight; //вес параллелепипеда
	
	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}
	
	public BoxWeight(BoxWeight ob) {
		super(ob);
		this.weight = ob.weight;
	}
	
	public BoxWeight() {
		super();
		weight = -1;
	}
	
	BoxWeight(double len, double weight) {
		super(len);
		this.weight = weight;
	}
}
