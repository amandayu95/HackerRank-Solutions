package solution.introduction;

import java.util.Scanner;

public class endOfFile {
    public static void main(String []argh) {
        Scanner sc = new Scanner(System.in);
        int i = 1;
        String stringLine;

        System.out.println(sc.hasNext());

        while (sc.hasNext()){
            System.out.print("Insert string line:");
            stringLine = sc.nextLine();

            if (stringLine.contains("end-of-file")){
                System.out.println(i + " " + stringLine);
                i++;
                break;
            }else {
                System.out.println(i + " " + stringLine);
                i++;
            }
        }

    }
}
