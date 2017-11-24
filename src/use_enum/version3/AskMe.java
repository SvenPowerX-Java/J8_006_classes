package use_enum.version3;

public class AskMe {
	static void answer(Answers result) {
		switch (result) {
			case NO:
				System.out.println("Нет");
				break;
			case YES:
				System.out.println("Да ");
			case MAYBE:
				System.out.println("Возможно");
				break;
			case LATER:
				System.out.println("Познее");
				break;
			case SOON:
				System.out.println("Вскоре");
				break;
			case NEVER:
				System.out.println("Никогда");
				break;
		}
	}
	
	public static void main(String[] args) {
		Question q = new Question();
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
		answer(q.ask());
	}
}
