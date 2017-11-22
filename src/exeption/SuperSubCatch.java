package exeption;

/**
 * Эта программа содержит ошибку.
 * <p>
 * В последовательности операторов catch подкласс исключений
 * должен быть указан перед его суперклассом, иначе это приведёт
 * к недостижимому коду и ошибке во время компиляции.
 */
public class SuperSubCatch {
	public static void main(String[] args) {
		try {
			int a = 0;
			int b = 42 / a;
		} catch (Exception e) {
			System.out.println(
					"Перехват исключение общего класса Exception.");
		}
		/*
		подкласс ArithmeticException
		catch (ArithmeticException e) {//ОШИБКА: НЕДОСТЕЖИМЫЙ КОД!
			System.out.println("Этот код недостежим");
			
		}*/
	}
}
