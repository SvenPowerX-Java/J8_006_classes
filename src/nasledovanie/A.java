package nasledovanie;

public class A {
	int i;
	private int j;
	
	public void setI(int i) {
		this.i = i;
	}
	
	public void setJ(int j) {
		this.j = j;
	}
	
	public void setIJ(int i, int j) {
		this.i = i;
		this.j = j;
	}
	
	void showij() {
		System.out.println("i = " + i);
		System.out.println("j = " + j);
	}
	
	public A() {
		System.out.println("В конструкторе A.");
	}
}
