package practice1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class No1157 {
    public static void main (String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] cnt = new int[26];
        String s = br.readLine().toUpperCase();
        int max =0;
        char result='?';

        for (int i=0; i<s.length(); i++) {
            cnt[s.charAt(i)-'A']++;
            if (max<cnt[s.charAt(i)-'A']) {
                max= cnt[s.charAt(i)-'A'];
                result = s.charAt(i);
            } else if(max == cnt[s.charAt(i)-'A']) {
                result ='?';
            }
        }
        System.out.println(result);
    }
}
