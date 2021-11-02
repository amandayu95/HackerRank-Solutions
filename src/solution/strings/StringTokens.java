package solution.strings;

import java.util.Scanner;

public class StringTokens {
    static void result(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert value of string:");
        String strItem = scan.nextLine();
        scan.close();

        /* Trim and split on all non-alphabetic characters */
        String[] strArr = strItem.trim().split("[ !,?\\._'@]+");

        /* Check special cases an print output */
        if (strArr.length == 0 || strArr.length==1 && strArr[0].equals("")){
            System.out.println(0);
        } else {
            System.out.println(strArr.length);
            for (String str:strArr){
                System.out.println(str);
            }
        }
    }

    public static void main(String[] args) {
        result();
    }
}
