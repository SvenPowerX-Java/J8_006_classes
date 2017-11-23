package multithreading.new_version;

public class ExtendTread {
	public static void main(String[] args) {
		new NewThread();
		
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Главный поток " + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println("Главный поток прерван.");
			
		}
		System.out.println("Главный поток завершён.");
	}
}
