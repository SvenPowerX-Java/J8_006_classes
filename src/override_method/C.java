package override_method;


public class C extends A {
	
	public C() {
	}
	
	//переопределить метод callMe()
	void callMe() {
		System.out.println("В методе callMe() из класса C");
	}
}
