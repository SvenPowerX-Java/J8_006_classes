package use_enum.version2;

public class EnumDemo2 {
	public static void main(String[] args) {
		Apple apple;
		
		for (Apple a :
				Apple.values()) {
			System.out.println(a + ": (" + a.getPrice()+")");
		}
	}
}
