package override_method;

public class A {
	int i, j;
	
	public A(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	public A() {
	
	}
	
	void show() {
		System.out.println("i and j: " + i+" "+j);
	}
	void callMe() {
		System.out.println("В методе callMe() из класса А");
	}
}
