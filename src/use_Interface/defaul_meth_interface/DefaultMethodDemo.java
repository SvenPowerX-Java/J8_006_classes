package use_Interface.defaul_meth_interface;

public class DefaultMethodDemo {
	public static void main(String[] args) {
		MyIFImp ob = new MyIFImp();
		MyIFImp2 ob2 = new MyIFImp2();
		System.out.println(ob.getNumber());
		System.out.println(ob.getString());
		
		System.out.println(ob2.getNumber());
		System.out.println(ob2.getString());
	}
}
