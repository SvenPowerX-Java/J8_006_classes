package use_Interface.defaul_meth_interface;

public interface MyIF {
	int getNumber();
	
	default String getString() {
		return "Объект типа String по умолчанию";
	}
}
