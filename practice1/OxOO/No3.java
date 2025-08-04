package practice1.OxOO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class No3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num1 = Integer.parseInt(br.readLine());

        int result = func(num1);

        System.out.println(result);
    }

        // 함수
        public static int func(int N) {
            for (int i = 1; i * i <= N; i++) {
                if (i*i == N) return 1;
            }
            return 0;
        }

}
