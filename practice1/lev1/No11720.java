//11720번 숫자의 합
package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int sum = 0;

        for(int i = 0; i<n; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
