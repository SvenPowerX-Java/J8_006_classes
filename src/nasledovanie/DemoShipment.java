package nasledovanie;

public class DemoShipment {
	public static void main(String[] args) {
		Shipment shipment1 = new Shipment(10, 20, 15, 10, 3.41);
		Shipment shipment2 = new Shipment(2, 3, 4, 0.76, 1.28);
		
		System.out.println("Объём shipment1 = " + shipment1.volume());
		System.out.println("Вес shipment1 = " + shipment1.weight);
		System.out.println("Стоимость shipment1 = " + shipment1.cost);
		System.out.println();
		System.out.println("Объём shipment2 = " + shipment2.volume());
		System.out.println("Вес shipment2 = " + shipment2.weight);
		System.out.println("Стоимость shipment2 = " + shipment2.cost);
	}
}
