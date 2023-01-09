//2475번 검증수
package practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No2475 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int [] arr = new int[5];
        int sum =0;


        for(int i=0; i<arr.length; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            int num = arr[i]*arr[i];
            sum += num;
        }
        System.out.println(sum%10);

    }
}
