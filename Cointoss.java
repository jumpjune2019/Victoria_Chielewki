import java.util.Random;

public class Cointoss {
	public static void main(String[] args)
	{
	Random rand = new Random();
		for (int i = 1; i < 5; i++)
		{	
			if (rand.nextInt(2) == 1) 
				System.out.println("Tails");
			  
			else
				System.out.println("Heads");
			
			
		}
		
	}
		}