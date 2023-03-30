package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No3052 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int count = 0;
        /*
            1. 처음부터 42으로 나눈 나머지를 배열에 넣음
            2. 배열 처음값을 마지막값까지 하나씩 비교하며 같은 값이 없으면 cnt=0
            3. cnt=0이면 count+1
         */

        for (int i=0; i<10; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        for (int i =0; i <10; i++) {
            int cnt = 0;
            for (int j = i+1; j<10; j++) {
                if (arr[i] == arr[j]) {
                    cnt++;
                }
            }
            if(cnt==0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
