package nasledovanie;

public class Shipment extends BoxWeight {
	double cost;
	Shipment(Shipment ob) {
		super(ob);
		cost = ob.cost;
	}
	
	public Shipment(double width, double height, double depth, double weight, double cost) {
		super(width, height, depth, weight);
		this.cost = cost;
	}
	
	public Shipment() {
		super();
		cost = -1;
	}
	
	public Shipment(double len, double weight, double cost) {
		super(len, weight);
		this.cost = cost;
	}
}
