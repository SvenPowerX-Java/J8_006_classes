package nasledovanie;

public class Access {
	public static void main(String[] args) {
		B subOb = new B();
		subOb.setI(2);
		subOb.setJ(3);
		subOb.showij();
		subOb.setIJ(4, 8);
		subOb.showij();
//		subOb.sum();//Ошибка
	}
}
