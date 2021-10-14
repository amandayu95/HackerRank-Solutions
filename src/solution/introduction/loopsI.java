package solution.introduction;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class loopsI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine().trim());

        for(int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.println(N + " x " + i + " = " + result);
        }

        br.close();
    }
}
