package abstr_method;

abstract class A {
	abstract void callMe();
	void callMeToo() {
		System.out.println("Это реылизованый метод");
	}
}
