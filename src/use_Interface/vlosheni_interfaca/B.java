package use_Interface.vlosheni_interfaca;

public class B implements A.NestedIF {
	@Override
	public boolean isNotNegative(int x) {
		return x < 0 ? false : true;
	}
}
