package practice1.lev003;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No11328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i<N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str1 = st.nextToken();
            String str2 = st.nextToken();

            if (func1(str1, str2)) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
        }
    }

    public static boolean func1(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] arr1 = new int[26]; // 알파벳 개수
        int[] arr2 = new int[26];

        for (int i = 0; i<a.length(); i++) {
            arr1[a.charAt(i) - 'a']++;
        }

        for (int i = 0; i<b.length(); i++) {
            arr2[b.charAt(i) - 'a']++;
        }

        for (int i = 0; i<26; i++) {
            if (arr1[i] != arr2[i]) return false;
        }

        return true;
    }

}
