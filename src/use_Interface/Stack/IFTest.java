package use_Interface.Stack;

public class IFTest {
	public static void main(String[] args) {
		FixedStack myStack1 = new FixedStack(5);
		FixedStack myStack2 = new FixedStack(8);
		
		//разместить числа в стеке
		for (int i = 0; i < 5; i++){
			
			myStack1.push((int)(Math.random()*10));
		}
		
		for (int i = 0; i < 8; i++){
			myStack2.push(i);
		}
		
		System.out.println("\nСтек в myStack1");
		for (int i = 0; i < 5; i++) {
			System.out.print(myStack1.pop() + " ");
		}
		
		System.out.println("\nСтек в myStack2");
		for (int i = 0; i < 8; i++) {
			System.out.print(myStack2.pop() + " ");
		}
	}
}
