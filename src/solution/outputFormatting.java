package solution;

import java.util.Scanner;

public class outputFormatting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("================================");
        for(int i=0;i<3;i++){
            System.out.print("Insert string value:");
            String s=sc.next();
            System.out.print("Insert integer value:");
            int n=sc.nextInt();

            System.out.printf("%-15s%03d%n", s, n);
//            System.out.printf("%-14s %03d %n", s, n);
        }
        System.out.println("================================");
    }
}
