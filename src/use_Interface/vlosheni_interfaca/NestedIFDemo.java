package use_Interface.vlosheni_interfaca;

public class NestedIFDemo {
	public static void main(String[] args) {
		A.NestedIF nif = new B();
		
		if (nif.isNotNegative(10))
			System.out.println("Число неотрицательное");
		if (nif.isNotNegative(-12))
			System.out.println("Это небудет выведено");
	}
}
