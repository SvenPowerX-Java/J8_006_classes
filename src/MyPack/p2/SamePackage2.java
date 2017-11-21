package MyPack.p2;

public class SamePackage2 {
	SamePackage2() {
		Protection2 p = new Protection2();
		System.out.println("Конструктор этого же пакета");
//		System.out.println("n = " + p.n);
//		System.out.println("n_pri = " + p.n_pri);
//		System.out.println("n_pro = " + p.n_pro);
		System.out.println("n_pub = " + p.n_pub);
	}
}
