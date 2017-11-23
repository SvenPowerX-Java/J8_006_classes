package multithreading.not_version;
// Бесконечный цикл !!! Внимание!!!
public class PC {
	public static void main(String[] args) {
		Q q = new Q();
		new Producer(q);
		new Consumer(q);
		
		System.out.println("Для остановки нажмите Ctrl+C");
	}
}
