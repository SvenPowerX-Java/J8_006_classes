package use_Interface.defaul_meth_interface;

public class MyIFImp2 implements MyIF {
	@Override
	public int getNumber() {
		return 1000;
	}
	
	@Override
	public String getString() {
		return "Это другая символьная строка.";
	}
}
