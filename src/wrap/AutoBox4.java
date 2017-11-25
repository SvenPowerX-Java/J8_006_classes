package wrap;

public class AutoBox4 {
	public static void main(String[] args) {
		
		Integer iOb = 100;
		Double dOb = 98.6;
		
		dOb = dOb + iOb;
		System.out.println("dOb = " + dOb);
		
		iOb = 2;
		switch (iOb) {
			case 1:
				System.out.println("один");
				break;
			case 2:
				System.out.println("два");
				break;
			case 3:
				System.out.println("три");
				break;
				default:
					System.out.println("ошибка");
					
		}
	}
}
