package nasledovanie;

import first_demo.Box;

public class BoxWeight extends Box {
	double weight; //вес параллелепипеда
	
	public BoxWeight(double width, double height, double depth, double weight) {
		super(width, height, depth);
		this.weight = weight;
	}
}
