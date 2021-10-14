package solution.introduction;

import java.util.Scanner;

public class staticInitializerBlock {
    static Scanner scan = new Scanner(System.in);
    static int B = scan.nextInt();
    static int H = scan.nextInt();
    static boolean flag = H <= 0 || B <= 0;
    public static void main(String[] args) {
        if (flag){
            int area=B*H;
            System.out.print(area);
        }else {
            System.out.print("java.lang.Exception: Breadth and height must be positive");
        }
    }
}
