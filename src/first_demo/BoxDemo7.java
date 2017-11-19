package first_demo;

public class BoxDemo7 {
	public static void main(String[] args) {
		Box mybox1 = new Box(10, 20, 15);
		Box mybox2 = new Box(3, 6, 9);
		
		System.out.println("Объём box1 равен " + mybox1.volume());
		System.out.println("Объём box2 равен " + mybox2.volume());
		
	}
}
