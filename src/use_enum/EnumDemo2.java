package use_enum;

public class EnumDemo2 {
	public static void main(String[] args) {
		Apple ap;
		System.out.println("Константа перечислимого типа Apple:");
		
		//применить метод values()
		Apple allapples[] = Apple.values();
		for (Apple a :
				allapples) {
			System.out.println(a);
		}
		System.out.println();
		
		ap = Apple.valueOf("Winesap");
		System.out.println("Переменная ap содержит " + ap);
	}
}
