package first_demo;

public class BoxDemo4 {
	public static void main(String[] args) {
		Box mybox1 = new Box();
		Box mybox2 = new Box();
		
		mybox1.with = 10;
		mybox1.height = 20;
		mybox1.depth = 15;
		
		mybox2.with = 3;
		mybox2.height = 6;
		mybox2.depth = 9;
		
		System.out.println(" Обьём равен " + mybox1.volume());
		
		System.out.println(" Обьём равен " + mybox2.volume());
	}
}
