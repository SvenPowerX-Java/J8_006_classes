package use_Interface.Stack;

public interface IntStack {
	void push(int item);//сохранить элемент в стеке
	
	int pop();          //извлечь элемент из стека
	
	default void clear() throws UnsupportedOperationException{
		try {
			throw new UnsupportedOperationException("Invalid operation for sorted list.");
			
		} catch (java.lang.UnsupportedOperationException e) {
			System.out.println("Invalid operation for sorted list.");
		}
		
		
	}
}
