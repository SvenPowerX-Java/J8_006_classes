package multithreading.yes_version;

public class Consumer implements Runnable {
	Q q;
	
	public Consumer(Q q) {
		this.q = q;
		new Thread(this, "Потребитель").start();
	}
	
	@Override
	public void run() {
		while (true) {
			q.get();
		}
	}
}
