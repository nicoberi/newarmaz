package threads;

public class MyRunnable implements Runnable {
	  public void run() {
	
	MyRunnable runnable = new MyRunnable();
	Thread thread = new Thread(runnable);
	thread.start();
	
	  }
}
