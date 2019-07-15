
class Lights implements Runnable {

    Thread thrd;
    boolean suspended;
    boolean stopped;

    Lights(String name) {

        thrd = new Thread(this, name);
        suspended = false;
        stopped = false;
        thrd.start();

    }
    public void run() {
        try {

           while(stopped ) {

        	    System.out.println("Light is Red!!! Stop!");
               Thread.sleep(Colors.RED.getseconds()*1000);
                  
                System.out.println("Slow Down Yellow !!! Beware!");
               Thread.sleep(Colors.YELLOW.getseconds()*1000);
                  
               System.out.println("Light is Green!!! Go!");
               Thread.sleep(Colors.GREEN.getseconds()*1000);
           }
        }

        catch (InterruptedException e) {

            System.out.println(thrd.getName() + " interrupted.");
        }
    }
    synchronized void mystop() {

        stopped = true;
        suspended = false;

        notifyAll();

    }
    synchronized void mysuspend() {

        suspended = true;

    }
    synchronized void myresume() {
        suspended = false;
        notify();

    }

}

