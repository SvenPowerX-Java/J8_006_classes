package multithreading.version2;

public class NewThread implements Runnable {
	String name;
	Thread t;
	
	public NewThread(String threadName) {
		this.name = threadName;
		t = new Thread(this, name);
		System.out.println("Новый поток: " + t);
		t.start(); //старт потока
	}
	public void run() {
		try {
			for (int i = 5; i > 0; i--) {
				System.out.println(name + ": " + i);
				Thread.sleep(10000);
			}
		} catch (InterruptedException e) {
			System.out.println(name + " прерван");
		}
		System.out.println(name + " завершён.");
	}
}
