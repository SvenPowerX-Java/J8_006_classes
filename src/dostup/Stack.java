package dostup;

/**
 * В этом классе определяется целочисленный стек,
 * который может содержать 10 значений
 */
public class Stack {
	/* Теперь переменные stck и tos являются закрытыми.
		Это означает, что они не могут быть случайно или
		намеренно изменены таким образом, чтобы нарушить стек.
	*/
	private int stck[];
	private int tos;
	
	//Выделить память под стек и инициализировать вершину стека
	public Stack(int size) {
		stck = new int[size];
		tos = -1;
	}
	
	//разместить элемент в стеке
	 public void push(int item) {
		if (tos == stck.length-1) System.out.println("Стек заполнен");
		else stck[++tos] = item;
	}
	//Извлечь елемент из стека
	public int pop(){
		if (tos < 0) {
			System.out.println("Стек не загружен.");
			return 0;
		}
		else
			return stck[tos--];
	}
}

