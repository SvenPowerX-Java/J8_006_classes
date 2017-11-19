package method;

public class Test {
	int a, b;
	
	public Test() {
	}
	
	public Test(int i) {
		a = i;
	}
	
	public Test(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public boolean equals(Test o) {
		if (o.a == a && o.b == b) return true;
		else return false;
	}
	
	void meth(int i, int j) {
		i *= 2;
		j /= 2;
	}
	
	void meth(Test o) {
		o.a *= 2;
		o.b /= 2;
	}
	Test incrByTen() {
		Test temp = new Test(a + 10);
		return temp;
	}
}
