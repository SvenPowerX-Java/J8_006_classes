package first_demo;

public class TestStack {
	public static void main(String[] args) {
		Stack myStack1 = new Stack();
		Stack myStack2 = new Stack();
		
		//разместить числа встеке
		for (int i = 0; i < 10; i++) myStack1.push(i);
		for (int i = 10; i < 20; i++) myStack2.push(i);
		
		//Извлечь числа из стека
		System.out.println("\nСодержимое стека 1:");
		for (int i = 0; i < 10; i++) System.out.print(myStack1.pop() +" ");
		
		System.out.println("\nСодержимое стека 2:");
		for (int i = 0; i < 10; i++) System.out.print(myStack2.pop()+ " ");
	}
}
