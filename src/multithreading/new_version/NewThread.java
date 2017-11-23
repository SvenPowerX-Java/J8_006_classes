package multithreading.new_version;

//Создать второй поток исполнения, расширив класс Tread
public class NewThread extends Thread {
	NewThread() {
		//Создать новый поток исполнения
		super("Демонстрационый поток: ");
		System.out.println("Дочерний поток: " + this);
		start();    //запустить поток на выполнение
	}
	
	//Точка входа во второй поток исполнения
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println("Дочерний поток: " + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван.");
		}
		System.out.println("Дочерний поток завершен.");
	}
}
