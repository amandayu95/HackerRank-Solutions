package solution.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUsernameValidator {
    static void firstSolution(){
        Scanner in = new Scanner(System.in);
        System.out.print("Insert value of string line:");
        int testCases = Integer.parseInt(in.nextLine());
        while (testCases > 0) {
            System.out.print("Insert value of string line:");
            String username = in.nextLine();
            String pattern = "^[a-zA-Z]\\w{7,29}$";

            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(username);

            if (m.find()) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
            testCases--;
        }
    }

    static void secondSolution(){
        Scanner in = new Scanner(System.in);
        System.out.print("Insert value of string line:");
        int testCases = Integer.parseInt(in.nextLine());

        while (testCases-- != 0) {
            String userName = in.nextLine();

            if (userName.matches(UsernameValidator.regularExpression))
                System.out.println("Valid");
            else
                System.out.println("Invalid");
        }
    }

    class UsernameValidator {
        public static final String regularExpression = "^[a-zA-Z][\\w]{7,29}$";
    }

    public static void main(String[] args) {
//        firstSolution();
        secondSolution();
    }

}
