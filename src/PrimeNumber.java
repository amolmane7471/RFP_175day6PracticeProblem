
import java.util.Scanner;
/*
 * program for check number is prime or not
 */
public class PrimeNumber {
	 public static void main(String[] args) {
		     int num ;
		    boolean flag = false;
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Enter a Number:");
		    num=sc.nextInt();
		    sc.close();
		    for (int i = 2; i < num ; i++) {
		      /*
		       *  condition for non prime number
		       */
		      if (num % i == 0) {
		        flag = true;
		      }
		    }

		    if (!flag)
		      System.out.println(num + " is a prime number.");
		    else
		      System.out.println(num + " is not a prime number.");
		  }
		}