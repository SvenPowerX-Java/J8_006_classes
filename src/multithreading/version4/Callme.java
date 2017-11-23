package multithreading.version4;
//Синхронизированный блок
public class Callme {
	void call(String msg) {
		System.out.println("[" + msg);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			System.out.println("Прервано");
		}
		System.out.println("]");
	}
}
