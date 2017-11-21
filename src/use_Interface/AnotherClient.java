package use_Interface;

public class AnotherClient implements CallBack {
	
	@Override
	public void callBack(int param) {
		System.out.println("Еще один вариант метода caallback");
		System.out.println("param в квадрате = " + param*param);
	}
}
