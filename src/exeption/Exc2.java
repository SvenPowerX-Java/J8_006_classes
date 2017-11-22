package exeption;

public class Exc2 {
	public static void main(String[] args) {
		int d, a;
		
		try {//проконтролировать блок кода
			d = 0;
			System.out.println("Это будет выведено");
			a = 42 / d;
			System.out.println("Это небудет выведено");
		} catch (ArithmeticException e) {
			//перехватит ошибку деления на нуль
			System.out.println("Делить на нуль нельзя.");
		}
		System.out.print("После оператора catch.");
		System.out.println("Программа прдолжает выполнение");
		
	}
}
