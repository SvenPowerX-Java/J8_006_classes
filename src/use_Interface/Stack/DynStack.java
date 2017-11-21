package use_Interface.Stack;

public class DynStack implements IntStack {
	private int stck[];
	private int tos;
	
	//Выделить память и инициализировать стек
	
	public DynStack(int size) {
		this.stck = new int[size] ;
	}
	
	@Override
	public void push(int item) {
		if (tos == stck.length - 1) {
			int temp[] = new int[stck.length * 2];// удвоить размер стека
			for (int i = 0; i < stck.length; i++) {
				temp[i]=stck[i];
			}
			stck = temp;
			stck[++tos] = item;
		}else
			stck[++tos] = item;
	}
	
	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("Стек пуст");
			return 0;
		}
		else
			return stck[tos--];
	}
}
