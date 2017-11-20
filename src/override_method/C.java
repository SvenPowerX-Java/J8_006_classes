package override_method;


public class C extends A {
	public C(int i, int j) {
		super(i, j);
	}
	
	//переопределить метод callMe()
	void callMe() {
		System.out.println("В методе callMe() из класса B");
	}
}
