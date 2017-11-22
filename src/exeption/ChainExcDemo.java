package exeption;

public class ChainExcDemo {
	static void  demoproc() {
		//создать исключение
		NullPointerException e = new NullPointerException("верхний уровень");
		
		//Добавить причину исключения
		e.initCause(new ArithmeticException("причина"));
		throw e;
	}
	
	public static void main(String[] args) {
		try {
			demoproc();
		} catch (NullPointerException e) {
			//Вывести исключение верхнего уровня
			System.out.println("Перехвачено исключение: " + e);
			//вывести исключение, послужившее причиной
			// для исключения верхнего уровня
			System.out.println("Первопричина: " + e.getCause());
		}
	}
}
