package override_method;

import java.lang.Override;

public class B extends A {
	int k;
	
	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	void show() {
		super.show();
		System.out.println("k = " + k);
	}
	
	void show(String msg) {
		System.out.println("msg = " + msg +" " +k+ " ");
		super.show();
		System.out.println("k = " + k);
	}
	
	//переопределить метод callMe()
	@Override
	void callMe() {
		System.out.println("В методе callMe() из класса B");
	}
}

