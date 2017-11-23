package use_enum;

public class EnumDemo {
	public static void main(String[] args) {
		Apple ap;
		ap = Apple.RedDel;
		System.out.println("Значение ap:" + ap);
		System.out.println();
		ap = Apple.GoldenDel;
		
		if (ap == Apple.GoldenDel) {
			System.out.println("Переменная ap содержит GoldenDel");
		}
		
		switch (ap) {
			case Jonathan:
				System.out.println("Сорт Janathan красный");
				break;
			case GoldenDel:
				System.out.println("Сорт GoldenDel желтый");
				break;
			case RedDel:
				System.out.println("Сорт RedDel красный");
				break;
			case Winesap:
				System.out.println("Сорт Winesap красный");
			case Cortland:
				System.out.println("Сорт Cortland красный");
				break;
				default:
					System.out.println("Таких яблок в асортименте нет");
					break;
		}
	}
}
