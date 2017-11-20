package nasledovanie;

public class DemoSuper {
	public static void main(String[] args) {
		BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
		BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
		BoxWeight myBox3 = new BoxWeight();
		BoxWeight myCube = new BoxWeight(3, 2);
		BoxWeight myCloneBox = new BoxWeight(myBox1);
		
		
		System.out.println("Объём myBox1 = " + myBox1.volume());
		System.out.println("Вес myBox1 = " + myBox1.weight);
		System.out.println();
		
		System.out.println("Объём myBox2 = " + myBox2.volume());
		System.out.println("Вес myBox2 = " + myBox2.weight);
		System.out.println();
		
		System.out.println("Объём myBox3 = " + myBox3.volume());
		System.out.println("Вес myBox3 = " + myBox3.weight);
		System.out.println();
		
		System.out.println("Объём myCloneBox = " + myCloneBox.volume());
		System.out.println("Вес myCloneBox = " + myCloneBox.weight);
		System.out.println();
		
		System.out.println("Объём myCube = " + myCube.volume());
		System.out.println("Вес myCube = " + myCube.weight);
		System.out.println();
	}
}
