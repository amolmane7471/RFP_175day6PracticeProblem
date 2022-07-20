
import java.util.Scanner;
/*
 * program for reverse the given number
 */
public class ReverseNumber {
	  public static void main(String[] args) {

		    int num , reverse = 0;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a Number");
		    num=sc.nextInt();
		    System.out.println("Original Number: " + num);
		    sc.close();
		    /*
		     *  run loop until num becomes 0
		     */
		  while(num != 0) {
		    /*
		     *  get last digit from num
		     */
		      int digit = num % 10;
		      reverse = reverse * 10 + digit;

		      /*
		       *  remove the last digit from num
		       */
		      num /= 10;
		    }

		    System.out.println("Reversed Number: " + reverse);
		  }
		}