//2741번 N 찍기
package practice1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int arr[] = new int[n];

        for(int i=0; i<arr.length; i++) {
            arr[i] = i+1;
            System.out.println(arr[i]);
        }
    }
}
