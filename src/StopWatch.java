import java.util.Scanner;

public class StopWatch {
    public static void main(String[] args) {
        long start = System.nanoTime();
        Scanner sc = new Scanner(System.in);
        System.out.println("Press any number and Enter to start the clock");
        int initiate = sc.nextInt();
        System.out.println("Press any number and Enter to stop the clock");
        long end = System.nanoTime();
        int close = sc.nextInt();
        System.out.println("Took " + ((end - start)/1000000000 + " Secs to finish"));
        sc.close();
    }
}
