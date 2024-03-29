import java.util.regex.Pattern;
import java.util.Random;

public class HeadOrTailTally {

	public static void main(String[] args) {

        Random r = new Random(); 
        Pattern tail = Pattern.compile("Tail++"); 
        Pattern head = Pattern.compile("Head++"); 
        String flips = ""; 

        for (int i = 0; i < 1000; i++) { 
            flips += r.nextInt(100) % 2 == 0 ? "Head" : "Tail"; 
        } 
        String[] heads = head.split( flips ); 
        String[] tails = tail.split( flips ); 
        
        System.out.println("Times head was flipped:" + heads.length); 
        System.out.println("Times tail was flipped:" + tails.length); 
    }
}