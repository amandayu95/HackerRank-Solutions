package solution.strings;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternSyntaxChecker {
    static void result(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Insert value of N:");
        int N = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < N; i++) {
            System.out.print("Insert value of regex:");
            String regex = scan.nextLine();
            try {
                Pattern.compile(regex);
                System.out.println("Valid");
            }
            catch (PatternSyntaxException e) {
                System.out.println("Invalid");
            }
        }
    }

    public static void main(String[] args) {
        result();
    }
}
