package use_Interface.Stack;

public class IFTest3 {
	public static void main(String[] args) {
		IntStack myStack;
		DynStack ds = new DynStack(5);
		FixedStack fs = new FixedStack(8);
		
		myStack = ds;
		for (int i = 0; i < 12; i++) {
			myStack.push(i);
		}
		myStack = fs;
		for (int i = 0; i < 8; i++) {
			myStack.push(i);
		}
		myStack = ds;
		for (int i = 0; i < 12; i++) {
			System.out.println("DynamicStack = " + myStack.pop());
		}
		myStack = fs;
		for (int i = 0; i < 8; i++) {
			System.out.println("FixedStack = " + myStack.pop());
		}
	}
}
