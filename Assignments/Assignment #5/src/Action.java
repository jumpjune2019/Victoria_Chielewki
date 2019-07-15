import java.util.Scanner;
	public class Action {

	    public static void main(String[] args){
	        System.out.println( "Press enter when ready to stop");
	        Enter();
	    }
	    synchronized static void Enter(){
	    	Scanner scanner = new Scanner(System.in);
	       Lights next= new Lights("next");
	       String readString = scanner.nextLine();

	        while(readString.equals("")) {
	            if (readString.isEmpty()) {
	                System.out.println("The traffic light has ended!");
	                next.mystop();
	                break;

	            }

	            if (scanner.hasNextLine()) {

	                readString = scanner.nextLine();
	            }
	            }
	        }

	    }

	

	
