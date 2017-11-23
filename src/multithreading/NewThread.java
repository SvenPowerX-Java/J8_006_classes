package multithreading;

public class NewThread implements Runnable {
	Thread t;
	
	public NewThread() {
		//Создать новый, второй поток исполнения
		t = new Thread(this, "Демонстрационный поток");
		System.out.println("Дочерний поток создан: " + t);
		t.start();  //Запустить поток исполнения
	}
	
	//Точка входа во второй поток исполнения
	@Override
	public void run() {
		try {
			for (int i = 5; i > 0; i++) {
				System.out.println("Дочерний поток: " + i);
				Thread.sleep(5000);
			}
		} catch (InterruptedException e) {
			System.out.println("Дочерний поток прерван.");
		}
		System.out.println("Дочерний поток завершён");
	}
}
