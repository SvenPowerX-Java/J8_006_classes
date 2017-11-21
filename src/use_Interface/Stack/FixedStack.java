package use_Interface.Stack;

public class FixedStack implements IntStack {
	private  int stck[];
	private int tos;
	
	//выделить память и инициализировать стек
	
	public FixedStack(int size) {
		this.stck = new int[size];
		tos = -1;
	}
	
	@Override
	public void push(int item) {
		if (tos ==stck.length-1)
			System.out.println("Стек заполнен");
		else
			stck[++tos] = item;
	}
	
	@Override
	public int pop() {
		if (tos < 0) {
			System.out.println("Стек Пуст.");
			return 0;
		}
		else
		return stck[tos--];
	}
}
