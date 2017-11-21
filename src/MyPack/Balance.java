package MyPack;

class Balance {
	String name;
	double bal;
	
	public Balance(String name, double bal) {
		this.name = name;
		this.bal = bal;
	}
	void show() {
		if (bal < 0) {
			System.out.print("--> ");
			System.out.println(this.name + ": $" + this.bal);
		}
	}
	
}
