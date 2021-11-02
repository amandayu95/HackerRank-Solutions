package solution.strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {
    static boolean isAnagram(String str_1, String str_2){

        /* Insert a couple of strings to character's array */
        char[] str_1_arr = str_1.toCharArray();
        char[] str_2_arr = str_2.toCharArray();

        /* Sort character's array and compare both of them */
        Arrays.sort(str_1_arr);
        Arrays.sort(str_2_arr);

        boolean retVal;
        if (Arrays.equals(str_1_arr, str_2_arr)) {
            retVal = true;
        } else {
            retVal = false;
        }
        return retVal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value of first string:");
        String str_1 = sc.nextLine().toLowerCase();
        System.out.print("Insert value of second string:");
        String str_2 = sc.nextLine().toLowerCase();
        sc.close();
        boolean result = isAnagram(str_1,str_2);
        System.out.println( (result) ? "Anagrams" : "Not Anagrams" );

    }
}
