package nasledovanie;

public class DemoBoxWeight {
	public static void main(String[] args) {
		BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.4);
		BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
		double vol;
		
		System.out.println("Объём myBox1 = " + myBox1.volume());
		System.out.println("Вес myBox1 = " + myBox1.weight);
		System.out.println("Объём myBox2 = " + myBox2.volume());
		System.out.println("Вес myBox2 = " + myBox2.weight);
		
		
	}
}
