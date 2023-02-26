package practice1.lev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1929 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()," ");

        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        boolean[] arr = new boolean[n+1];
        arr[0] = arr[1] = true; // false 소수

        for (int i=2; i<= Math.sqrt(arr.length); i++) {
            if(arr[i]==true) continue;
            for (int j = i*i; j<arr.length; j += i) {
                arr[j] = true;
            }
        }
        for (int i =m; i<= n; i++) {
            if(arr[i] == false) {
                System.out.println(i);
            }
        }
    }
}
