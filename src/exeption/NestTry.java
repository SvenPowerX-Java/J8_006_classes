package exeption;

public class NestTry {
	public static void main(String[] args) {
		try {
			int a = args.length;
					/*
					Если неуказаны аргументы командной строки,
					в следующем операторе будет сгенерировано
					исключение в связи с делением на нуль. */
			int b = 42 / a;
			System.out.println("a = " + a);
			try {
				if (a == 1) a = a / (a - a);
				if (a == 2) {
					int c[] = {1};
					c[42] = 99;
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("Индех за пределами масива: " + e);
			}
		} catch (ArithmeticException e) {
			System.out.println("Деление на нуль: " + e);
		}
	}
}
