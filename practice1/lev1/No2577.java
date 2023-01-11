package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No2577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[10];
        int num = Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String str = Integer.toString(num);
        for(int i=0; i<str.length(); i++) {
            for(int j=0; j<10; j++) {
                if((str.charAt(i)-48) == j) {
                    arr[j]++;
                }
            }
        }
        for (int k=0; k<10; k++) {
            System.out.println(arr[k]);
        }
    }
}
