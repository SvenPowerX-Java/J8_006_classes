package override_method;

public class B extends A {
	int k;
	
	public B(int i, int j, int k) {
		super(i, j);
		this.k = k;
	}
	void show() {
		System.out.println("k = " + k);
	}
}

