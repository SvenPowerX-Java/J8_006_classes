package use_Interface.defaul_meth_interface;

public interface MyIF {
	int getNumber();
	
	default String getString() {
		return "Объект типа String по умолчанию";
	}
	static  int getDefaultNumber() {
		return 0;
	}
	default int reset() {
		return MyIF.getDefaultNumber();
	}
}
