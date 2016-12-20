//Java reverse a string
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
		    String s = "";
		  
	      Scanner input = new Scanner(System.in);
		  
	      System.out.println("Please enter a string to be reverse: ");
	      s = input.next();
		  
	      String reverse = new StringBuffer(s).reverse().toString();
	      System.out.println(reverse);
	    }
}
