package practice1.ASAClev2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class No1439 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        /*
        1. 0와 1 연속되어있는 개수를 찾음
        2. 더 적은 개수가 답이 됨
         */

        StringTokenizer s1 = new StringTokenizer(S,"0");
        StringTokenizer s2 = new StringTokenizer(S, "1");
        System.out.println(Math.min(s1.countTokens(), s2.countTokens()));
    }
}
