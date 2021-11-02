package solution.strings;

import java.util.Scanner;

public class SubstringComparisons {
    static String getSmallestAndLargest(String str, int K){
        /* Create smallest and largest strings and initialize them */
        String min = "";
        String max = "";

        for (int i = 0; i <= str.length() - K ; i++) {
            String currVal = str.substring(i,i+K);
            if (currVal.compareTo(min) < 0 || min.isEmpty()){
                min = currVal;
            }
            if (currVal.compareTo(max) > 0 || max.isEmpty()){
                max = currVal;
            }
        }
        return min + "\n" + max;
    }

    static void result(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert value of string:");
        String str = sc.nextLine();
        System.out.print("Insert value of integer:");
        int K = sc.nextInt();
        sc.close();

        System.out.println(getSmallestAndLargest(str, K));
    }

    public static void main(String[] args) {
        result();
    }
}
