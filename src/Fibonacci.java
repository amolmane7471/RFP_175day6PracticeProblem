
import java.util.Scanner;
/*
 * program for generate fibonacci series
 */
class Fibonacci {
	  public static void main(String[] args) {

	    int n , firstTerm = 0, secondTerm = 1;
	    Scanner sc= new Scanner(System.in);
	    System.out.println("Enter value for n");
         n=sc.nextInt();	    
	    System.out.println("Fibonacci Series till " + n + " terms:");
	    sc.close();
	    for (int i = 1; i <= n; i++) {
	      System.out.print(firstTerm + ", ");
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
	}