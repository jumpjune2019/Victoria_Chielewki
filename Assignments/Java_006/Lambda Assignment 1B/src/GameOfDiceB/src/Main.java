import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean play = true;
				
					String Dice[][] = new String[6][6];
					Dice[0][0] = "Snake Eyes";
					Dice[0][1] = "Australian yo";
					Dice[0][2] = " Little Joe From Kokomo";
					Dice[0][3] = "No field five";
					Dice[0][4] = "Easy six";
					Dice[0][5] = "Six one you're done";
					Dice[1][0] = "Ace caught a deuce";
					Dice[1][1] = "Ballerina";
					Dice[1][2] = "The fever";
					Dice[1][3] = "Jimmie Hicks";
					Dice[1][4] = "Benny Blue";
					Dice[1][5] = "Easy Eight";
					Dice[2][0] = "Easy Four";
					Dice[2][1] = "OJ!!!";
					Dice[2][2] = "Brooklyn Forest";
					Dice[2][3] = "Big Red";
					Dice[2][4] = " Eight from Decatur";
					Dice[2][5] = "Nina from Pasadena";
					Dice[3][0] = "Little Phoebe";
					Dice[3][1] = "Easy Six";
					Dice[3][2] = "Skinny McKinney";
					Dice[3][3] = "Square pair";
					Dice[3][4] = "Railroad nine";
					Dice[3][5] = "Big one on the end";
					Dice[4][0] = "Sixie from Dixie";
					Dice[4][1] = "Skinny Dragon";
					Dice[4][2] = "Easy Eight";
					Dice[4][3] = "Jesse James";
					Dice[4][4] = "Puppy Paws";
					Dice[4][5] = "YO";
					Dice[5][0] = "The Devil";
					Dice[5][1] = "EaSY Eight";
					Dice[5][2] = "Lou BROWN";
					Dice[5][3] = "Tennessee";
					Dice[5][4] = "Six Five no jive";
					Dice[5][5] = "Midnight";
					do {
					//Computer
						
						 Roll Dice1 = () -> (int)(Math.random() * 6)+1;
					int x = Dice1.Dice1();
					int i = Dice1.Dice1();
					
					int j = Dice1.Dice1();
					int k = Dice1.Dice1();
					
				//determines winner or loser
				if ((x+i) > (j+k)) {
					System.out.println("HA!! YOU LOSE");
					System.out.println("Would you like to play again??? Y/N:");
				}
				else if ((x+i) < (j+k)) {
					System.out.println("YOU WIN!!! Did you cheat???");

				}
				else if ((x+i) == (j+k)) {
					System.out.println("Stalemate! You're tough, let's try for  a tie breaker");
				}
				{
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
					play = false;
				}
				} 
					}while (play = true);
					
			}

	}


