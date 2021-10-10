package solution;

import java.util.Scanner;

public class ifElse {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Insert value of N:");
        int N = scanner.nextInt();
//        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.close();

        if (N % 2 == 0){
            if (N >= 2 && N < 6){
                System.out.println("Not Weird");
            }else if (N >= 6 && N < 21){
                System.out.println("Weird");
            }else {
                System.out.println("Not Weird");
            }
        }else {
            System.out.println("Weird");
        }
    }
}
