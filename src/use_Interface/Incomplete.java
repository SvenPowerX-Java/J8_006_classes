package use_Interface;

abstract public class Incomplete implements CallBack {
	int a, b;
	
	
	void show() {
		System.out.println("a = " + a);
		System.out.println("b = " + b);
	}
}
