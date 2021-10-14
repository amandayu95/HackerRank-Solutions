package solution.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class loopsII {
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int s = a;

            for(int x = 0; x < n; x++){
                int hSementara = (int) Math.pow(2,x) * b;
                s += hSementara;
                System.out.printf(s + " ");
            }

            System.out.println("");
        }
        in.close();
    }
}
