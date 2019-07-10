package phone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class phone_App {

	public static void main(String[] args) { 
		String Phone[][] = new String[6][3]; 
				//{
		/*	{"Name", "Number","City"},
			{"0","0","0"},
			{"0","0","0"},
			{"0","0","0"},
			{"0","0","0"},
			{"0","0","0"}	*/
	//	}; 
		
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner (System.in);

		for ( int i = 1; i < 6; i++) {
			for (int j= 1; j < 3; j++) {
				{
				Phone[i][j]= scan.nextLine();
			//int x = 0;
				}
		{
			
			try {	
				System.out.println("Names: ");
				 String name  = scan.nextLine();
				 name = emptyCheck(name, "Name");
				
				System.out.println("Number: ");
		       String number = scan.nextLine();
		       number = emptyCheck(number, "Number");
		       // String n = br.readLine();
		        
		        System.out.println("City: ");
		        String city =  scan.nextLine();
		        city = emptyCheck(city, "City");
		        
		        //String message  = accept(name, number, city);
				String message;
				System.out.println( "You Entered: " + name + number + city);
				System.out.println("Would you like to keep it Y/N:" ); 
				message  = scan.nextLine();
		        	if (message.equals("yes")) {
		        	System.out.println("Confirmed");
		        	}
		        	else if (message.equals("no")); 
		        	i--;
		        	
			} 
			
			
		        catch (CustomException e) {
		    	 System.out.println(e.getMessage());
		    	 i--;
		    	
		    	 continue;
		     }
			System.out.print(Phone[j][i] + "");
		}
		System.out.println();
		} 
		}
	} // ends main
	public static String emptyCheck(String userinput, String check) throws CustomException {
		if (userinput.isEmpty()) {
			
			throw new CustomException("You forgot to enter your " + check);
		}
		
		return userinput;
	}
	
	
/*	public static String accept(String username,  String usernumber, String userCity) {
		Scanner scan = new Scanner (System.in);
		String choice;
		System.out.println( "You Entered: " + username + usernumber + userCity);
		System.out.println("Would you like to keep it Y/N:" ); 
		choice  = scan.nextLine();
		
		
		return choice;
		
	 	
	}
	*/
	
        
       /* 
        System.out.println ("Enter a 10 digit number: ");
        String line = scan.nextLine ();
        int digit;
        while (true) {
            if (line.length () == 10) {
                try {
                    digit = Integer.parseInt (line);
                    break;
                }
                catch (NumberFormatException e) {
                    // do nothing.
                }
            }

            System.out.println ("Error!(" + line + ") Please enter a  digit number: ");
            line = scan.nextLine ();
        }

        System.out.println (digit);
               } //end of try 
	
	*/
	
	
	
  
        






	}


