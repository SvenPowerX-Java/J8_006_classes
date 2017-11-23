package multithreading.next_1;

public class SuspendResume {
	public static void main(String args[]) {
		NewThread ob1 = new NewThread("Один");
		NewThread ob2 = new NewThread("Два");
		
		try {
			Thread.sleep(1000);
			ob1.mysuspend();
			System.out.println("Присостановка потока Один");
			Thread.sleep(1000);
			ob1.myresume();
			System.out.println("Возобнавление потока Один");
			ob2.mysuspend();
			System.out.println("Приостановка потока Два");
			Thread.sleep(1000);
			ob2.myresume();
			System.out.println("Возобнавление потока Два");
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		try {
			System.out.println("Ожидание завершения потоков.");
			ob1.t.join();
			ob2.t.join();
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван");
		}
		System.out.println("Главный поток завершен");
	}
}
