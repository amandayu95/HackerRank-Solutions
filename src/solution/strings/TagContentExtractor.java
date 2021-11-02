package solution.strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagContentExtractor {
    static void firstSolution(){
        Scanner in = new Scanner(System.in);
        System.out.println("Insert value of string line:");
        int testCases = Integer.parseInt(in.nextLine());
        System.out.println("Result:");
        while(testCases>0){
            String line = in.nextLine();
            boolean matchFound = false;
            Pattern r = Pattern.compile("<(.+)>([^<>]+)</\\1>");
            Matcher m = r.matcher(line);
            while (m.find()) {
                System.out.println(m.group(2));
                matchFound = true;
            }
            if (!matchFound) {
                System.out.println("None");
            }

            testCases--;
        }
    }

    static void secondSolution(){
        Scanner in = new Scanner(System.in);
        System.out.print("Insert value of string line:");
        int testCases = Integer.parseInt(in.nextLine());

    }

    public static void main(String[] args) {
        firstSolution();
//        secondSolution();
    }

}
