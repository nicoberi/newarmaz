package threads;

public class Example {
	  public static void main(String[] args) {
	    // create and start a thread using the Runnable interface
	    Runnable runnable = new Runnable() {
	      public void run() {
	        System.out.println("Thread 1");
	      }
	    };
	    Thread thread1 = new Thread(runnable);
	    thread1.start();

	    // create and start a thread using the Thread class
	    Thread thread2 = new Thread() {
	      public void run() {
	        System.out.println("Thread 2");
	      }
	    };
	    thread2.start();
	  }
	}