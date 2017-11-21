package use_Interface;

public class Client implements CallBack {
	@Override
	public void callBack(int param) {
		System.out.println("Метод callback() вызываемый с  param = " + param);
	}
	void nonIfaceMeth() {
		System.out.println("Могут определятся и другие члены.");
	}
}
