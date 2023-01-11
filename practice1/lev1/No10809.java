//10809번 알파벳 찾기
package practice1.lev1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No10809 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int [] arr = new int[26];

        for (int i =0; i<arr.length; i++) {
            arr[i] = -1;
        }

        String s = br.readLine();

        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);

            if(arr[ch-'a'] == -1) {
                arr[ch - 'a'] = i;
            }
        }
        for (int var : arr){
            System.out.print(var+" ");
        }
    }
}
