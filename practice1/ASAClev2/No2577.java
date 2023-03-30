package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());
        int num = A * B * C;
        int[] arr = new int[10];

        /*
            10개의 값을 넣을 수 있는 배열 필요
            곱한값의 자릿수마다 10으로 나눈 나머지는 arr[] 배열에 들어가면서
            나머지 숫자 배열로 들어가게 하면 arr[num%10]가 그 숫자의 개수가 됨
         */

        while (num > 0) {
            arr[num % 10]++;
            num /= 10;
        }
        for (int i=0; i<10; i++) {
            System.out.println(arr[i]);
        }
    }

}
