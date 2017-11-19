package dostup;

public class TestStack {
	public static void main(String[] args) {
		Stack myStack1 = new Stack(5);
		Stack myStack2 = new Stack(8);
		
		//Разместить числа в стеке
		for (int i = 0; i < 10; i++) myStack1.push(i);
		for (int i = 0; i < 10; i++) myStack2.push(i);
		
		System.out.println("myStack1:");
		
		for (int i = 0; i < 10; i++) System.out.print(myStack1.pop());
	System.out.println("myStack2:");
		
		for (int i = 0; i < 10; i++) System.out.print(myStack2.pop());
	}
}
