package multithreading.version4;

public class Caller implements Runnable {
	String tmsg;
	Callme target;
	Thread t;
	
	public Caller( Callme target, String tmsg) {
		this.tmsg = tmsg;
		this.target = target;
		t = new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		synchronized (target) {
			target.call(tmsg);
		}
		
	}
}
