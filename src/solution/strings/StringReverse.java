package solution.strings;

import java.util.Scanner;

public class StringReverse {
    static void firstSolving(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value of string:");
        String str = sc.nextLine();
        sc.close();

        boolean isPal = true;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                isPal = false;
                break;
            }
        }
        if(isPal) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

    }

    static void secondSolving(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value of string:");
        String str = sc.nextLine();
        sc.close();

        /* Reverse string and compare to original */
        String reverseString = new StringBuilder(str).reverse().toString();
        System.out.println(reverseString.equals(str) ? "Yes" : "No");
    }

    public static void main(String[] args) {
        firstSolving();
        secondSolving();
    }
}
