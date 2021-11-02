package solution.strings;

import java.util.Scanner;

public class StringIntroduction {
    static String capFirstString(String word){
        String newString = word.substring(0,1).toUpperCase() +word.substring(1);
        return newString;
    }

    static void result(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value of A:");
        String A = sc.next();
        System.out.print("Insert value of B:");
        String B = sc.next();
        sc.close();

        /*Sum of two lengths*/
        System.out.println(A.length()+B.length());

        /* Compare lexicographical ordering */
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");

        /* Print the Strings in desired format */
        System.out.println(capFirstString(A) + " " + capFirstString(B));
    }

    public static void main(String[] args) {
        result();
    }
}
