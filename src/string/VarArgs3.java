package string;

public class VarArgs3 {
	static void vaTest(int ... v) {
		System.out.print("vaTest(int ...): " + "Количество аргументов: " + v.length +
				" Содержимое: ");
		for (int x : v) System.out.print(x + " ");
		System.out.println();
	}
	static  void vaTest(double ... v) {
		System.out.print("vaTest(double ...): " + "Количество аргументов: " + v.length +
				" Содержимое: ");
		for (double x : v) System.out.print(x + " ");
		System.out.println();
	}
	static void vaTest(boolean... v) {
		System.out.print("vaTest(boolean ...): " + "Количество аргументов: " + v.length +
				" Содержимое: ");
		for (boolean x : v) System.out.print(x + " ");
		System.out.println();
	}
	static void vaTest(char... v) {
		System.out.print("vaTest(char ...): " + "Количество аргументов: " + v.length +
				" Содержимое: ");
		for (char x : v) System.out.print(x + " ");
		System.out.println();
	}
	static void vaTes(String msg,int ... v) {
		System.out.print("vaTest(String ...): " + "Количество аргументов: " + v.length +
				" Содержимое: ");
		for (int x : v) System.out.print(x + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		vaTest(1, 2, 3);
		vaTes("Проверка: ", 10, 20);
		vaTest(true, false, false);
		
	}
}
