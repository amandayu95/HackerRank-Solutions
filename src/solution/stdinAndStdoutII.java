package solution;

import java.util.Scanner;

public class stdinAndStdoutII {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Insert first line:");
        int firstLine = scan.nextInt();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.print("Insert second line:");
        double secondLine = scan.nextDouble();
        scan.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        System.out.print("Insert third line:");
        String thirdLine = scan.nextLine();

        System.out.println("String: "  + thirdLine);
        System.out.println("Double: " + secondLine);
        System.out.println("Int: " + firstLine);

        scan.close();
    }
}
