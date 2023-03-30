package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10872 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int factorial = 1;

        /*
            N팩토리얼
         */
        if (N == 0) {
            System.out.println("1");
        } else {
            for (int i = 1; i <= N; i++) {
                factorial *= i;
            }
            System.out.println(factorial);
        }
    }
}
