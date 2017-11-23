package multithreading.version4;

public class Synch1 {
	public static void main(String[] args) {
		Callme target = new Callme();
		Caller ob1 = new Caller(target, "Добро пожаловать");
		Caller ob2 = new Caller(target, "в синхронизованный");
		Caller ob3 = new Caller(target, "мир!");
		
		try {
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		} catch (InterruptedException e) {
			System.out.println("Прервано");
		}
	}
}
