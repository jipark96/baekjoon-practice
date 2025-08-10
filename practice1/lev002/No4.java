package practice1.lev002;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No4 {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int result = func4(num1);
        System.out.println(result);
    }

    public static int func4(int N) {
        int val = 1;
        while (2*val <= N) val *= 2;
        return val;
    }
}
