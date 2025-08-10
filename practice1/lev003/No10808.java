package practice1.lev003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10808 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine(); // 문자열 입력
        int[] count = new int[26]; // 알파벳 개수 저장 배열

        // 알파벳 개수 구하기
        for (int i=0; i<S.length(); i++) {
            char c = S.charAt(i);
            count[c - 'a']++;
        }

        // 결과 출력
        for (int i=0; i<26; i++) {
            System.out.print(count[i] + " ");
        }
    }
}
