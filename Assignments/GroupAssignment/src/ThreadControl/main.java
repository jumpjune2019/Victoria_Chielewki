package ThreadControl;
//import java.awt.*;
//import java.util.*;
//import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*; 
import javax.swing.*;


public class main {
	
	static JFrame frame = new JFrame("Thread Control Project");
	static JPanel panel = new JPanel();
	static final JTextField writeArea = new JTextField(20);
	static final JTextArea displayArea = new JTextArea();
	static BoxLayout bl = new BoxLayout(panel, BoxLayout.Y_AXIS); 		
	static MyThread currentThread;
	
	public static void main(String[] args) { 
		frame.add(panel);
		panel.add(writeArea);
		//frame.setPreferredSize(new Dimension(500, 500));
		displayArea.setPreferredSize(new Dimension(8000, 8000));
		panel.setLayout(bl);
		frame.setVisible(true);
	    displayArea.setEditable(false); // set textArea non-editable
	    JScrollPane scroll = new JScrollPane(displayArea);
	    scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
	    panel.add(scroll);
		
		//create window and contents
		MyThread try1 = new MyThread("This is thread One") ; // thread 1
		MyThread try2 = new MyThread("This is thread Two") ; //thread 2
		MyThread try3 = new MyThread("This is thread Three") ; // thread 3
		MyThread try4 = new MyThread("This is thread Four") ; // thread 4
		MyThread try5 = new MyThread("This is thread Five") ; // thread 5
		//System.out.println("Choose a number 1-5: ");
	
		

		//start the thread
	 try {
		 	CheckInput(try1, KeyEvent.VK_1, try2, try3, try4, try5);
			CheckInput(try2, KeyEvent.VK_2, try1, try3, try4, try5);
			CheckInput(try3, KeyEvent.VK_3, try1, try2, try4, try4);
			CheckInput(try4, KeyEvent.VK_4, try1, try2, try3, try5);
			CheckInput(try5, KeyEvent.VK_5, try1, try2, try3, try4);
		 
}
	catch (Exception e) {
		System.out.println("Main thread Interrupted");
	
	}

	}
	public static void displayInfo(String msg) {
		displayArea.append("\n" + msg);
	
	}
	public static void checkInput(MyThread obj, int k, MyThread o1, MyThread o2, MyThread o3, MyThread o4) {
		writeArea.addKeyListener(new KeyListener(){
			@Override
			 public void keyTyped(KeyEvent e) {}

			 @Override
			 public void keyReleased(KeyEvent e) {}

			 @Override
			 public void keyPressed(KeyEvent e) {
			if(e.getKeyCode() == k) {
				if(obj.suspended == true);
				obj.myresume();		
			}
			else if (obj.suspended == false) 
			{//getting input to change the priority
				String msg1 = ("Priority Contorl");
				displayInfo(msg1);
				obj.mysuspend();
				String msg2= " Press 'S' to stop thread completely"
						+"\n Press 'T' to give this thread Top Priority"
						+"\n Press 'N' to give this thread Normal Priority"
						+"\n Press 'L' to give this thread Low Priority";
				displayInfo(msg2);
				
			}    
			 else if (e.getKeyCode()== KeyEvent.VK_S && obj.thrd.getName().equals(currentThread.thrd.getName()))
			 {
				 if(!obj.stopped) {
       				displayInfo(o1.thrd.getName() + ": " + o1.thrd.getState());
       			}
       			if(!o2.stopped) {
       				displayInfo(o2.thrd.getName() + ": " + o2.thrd.getState());
       			}
       			if(!o3.stopped) {
       				displayInfo(o3.thrd.getName() + ": " + o3.thrd.getState());
       			}
       			if(!o4.stopped) {
       				displayInfo(o4.thrd.getName() + ": " + o4.thrd.getState());
       			}

       			if(o1.stopped && o2.stopped && o3.stopped && o4.stopped && currentThread.stopped) {
      				try {
      					displayInfo("This app is now exiting, all threads have been stopped");
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
      				System.exit(0);
      			}
				 }				

				 
			 
			//setting the priorities
			else if (e.getKeyCode()==KeyEvent.VK_T && obj.thrd.getName().equals(currentThread.thrd.getName())) {
				obj.thrd.setPriority(Thread.MAX_PRIORITY); 
				displayInfo(obj.thrd.getName() + ":" + obj.thrd.getState());
			}
			
			else if (e.getKeyCode()==KeyEvent.VK_N && obj.thrd.getName().equals(currentThread.thrd.getName())){
				obj.thrd.setPriority(Thread.NORM_PRIORITY);
				displayInfo(obj.thrd.getName() + ":" + obj.thrd.getState());
			}
			else if (e.getKeyCode()==KeyEvent.VK_L && obj.thrd.getName().equals(currentThread.thrd.getName())) {
				obj.thrd.setPriority(Thread.MIN_PRIORITY);
				displayInfo(obj.thrd.getName() + ":" + obj.thrd.getState());
				if(o1.stopped && o2.stopped && o3.stopped && o4.stopped && currentThread.stopped) {
      				try {
      					displayInfo("This app is now exiting, all threads have been stopped");
						Thread.sleep(2000);
					} catch (InterruptedException e1) {
						e1.printStackTrace();
					}
      				System.exit(0);
      			}
			}
			 	}
		});
		
	}
}

