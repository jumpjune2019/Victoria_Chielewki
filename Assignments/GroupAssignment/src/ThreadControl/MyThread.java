package ThreadControl;
import java.util.*;

 class MyThread implements Runnable {
	Thread thrd;
	static boolean stopped;
	static boolean running;
	static boolean suspended;
	static String currentName;
	
	MyThread (String name) {
		thrd = new Thread(this, name);
		suspended = false;
		stopped = false;
		thrd.start();
	}
	//the entry
	public void run() {
		main.displayInfo("Executing " + thrd.getName());
		try {
			//THREAD
			for (int i = 1; i <1000; i++) {
				System.out.print(" ");
				thrd.sleep(1000);
		/*	for(int d = 1; d < 500; d++) {
				//System.out.print(".");
				Thread.sleep(200);
				} */
				
			System.out.println("\nExecuting" + thrd.getName());
			
			
				synchronized(this) {
					while(suspended) {
						System.out.println("Pausing" + thrd.getName());
						wait();	
					}
						if(stopped) {
							break;
						}
						}
					}
				}
			
				catch (InterruptedException exc) {
					System.out.println(thrd.getName() + "interrupted");
				}
				System.out.println(thrd.getName() + "exiting");
		}
	
			synchronized void mystop() {
				stopped = true;
				suspended = false;
				notify();
			}
			synchronized void mysuspend() {
				suspended = false;
				main.displayInfo(thrd.getName()  + "Resumed");
				
			}
			// Resume the thread.
			synchronized void myresume() {
				suspended = false;
				stopped = true;
				main.displayInfo("Permanent Stopping the execution of " + thrd.getName());
				notify();
		
			
		
		
		
	}
	
	

 }
