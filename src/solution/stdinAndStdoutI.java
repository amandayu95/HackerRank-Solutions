package solution;

import java.util.Scanner;

public class stdinAndStdoutI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert first number:");
        int firstNum = scan.nextInt();
        System.out.print("Insert second number:");
        int secondNum = scan.nextInt();
        System.out.print("Insert third number:");
        int thirdNum = scan.nextInt();

        System.out.println(firstNum);
        System.out.println(secondNum);
        System.out.println(thirdNum);

        scan.close();
    }
}
