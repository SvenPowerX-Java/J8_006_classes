package use_Interface;

public class TestInterface {
	public static void main(String[] args) {
		CallBack callBack = new Client();
		callBack.callBack(42);
	}
}
