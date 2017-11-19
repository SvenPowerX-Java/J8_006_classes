package first_demo;

/**
 * В этом классе определяется целочисленный стек, вкотором
 * можно хранить до 10 целочисленных значений
 */
public class Stack {
	int stck[] = new int[10];
	int tos;
	
	// Инициализировать вершину стека
	Stack(){
		tos = -1;
	}
	
	//Разместить элементы в стеке
	void push(int item) {
		if (tos == 9) System.out.println("Стек заполнен");
		else stck[++tos] = item;
	}
	
	//Извлечь элемент из стека
	int pop() {
		if (tos < 0) {
			System.out.println("Стек пустой");
			return 0;
		} else return stck[tos--];
	}
}
