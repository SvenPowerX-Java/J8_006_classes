package abstr_method;

abstract class A {
	final void meth() {
		System.out.println("Это завершённый метод");
	}
	
	abstract void callMe();
	void callMeToo() {
		System.out.println("Это реылизованый метод в А классе");
	}
}
