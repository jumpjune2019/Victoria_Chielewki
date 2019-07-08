import java.util.Scanner; // import the Scanner
public class Assignment03_SimpleDie {

	public static void main(String[] args) {
	
		char menu;
		boolean play = true;
		
	   	System.out.println("Would you like to roll the dice?");
			Scanner reader = new Scanner(System.in);
			menu = reader.next().charAt(0);
			System.out.println("Please Type Y or N: " + menu);
	do {
	
       switch (menu) {
        case'y':
        case 'Y':
        	
        //will roll numbers between 1 and 6
        	int roll = (int)(Math.random() * 6)+1;
        	
        	System.out.println( "You rolled a " + roll );
        	System.out.println("\n");        	
        	break;
        	
        // does not want to roll a dice
        case 'n':
        case 'N':
        	System.out.println("Thanks for playing!");
        	
        	break;
        }
	     //Play again
			Scanner scan = new Scanner(System.in);
			String answer;
			
		System.out.println("Would you like to play again? ");
		answer = scan.nextLine();
		
		if (answer.equals("Y")|| answer.equals("y"))
		{
			play = true;
		}
		else
		{
			System.out.println("THANKS FOR PLAYING!!!");
			play = false;
		}
		
		        } while (play = false);
		} 
	
	}
