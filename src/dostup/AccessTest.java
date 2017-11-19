package dostup;

public class AccessTest {
	public static void main(String[] args) {
		Test ob = new Test();
		
		ob.a = 10;
		ob.b = 20;
		
//		ob.c = 100; //Ошибка доступа
		
		ob.setC(100);
		System.out.println("a = " + ob.a);
		System.out.println("b = " + ob.b);
		System.out.println("c = " + ob.getC());
	}
}
