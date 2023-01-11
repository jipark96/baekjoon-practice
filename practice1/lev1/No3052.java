//3052번 나머지
package practice1.lev1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No3052 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = 0;
        int arr [] = new int[10];

        for(int i=0; i< arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine()) % 42;
        }
        for (int i=0; i<arr.length; i++) {
            int cnt = 0;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[i] == arr[j]) {
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
