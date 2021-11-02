package solution.strings;

import java.util.Scanner;

public class Substring {
    static void result(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value of string:");
        String str = sc.nextLine();
        System.out.print("Insert value of start:");
        int start = sc.nextInt();
        System.out.print("Insert value of end:");
        int end = sc.nextInt();
        sc.close();

        /* Print the Strings in desired format */
        System.out.println(str.substring(start,end));
    }

    public static void main(String[] args) {
        result();
    }
}
