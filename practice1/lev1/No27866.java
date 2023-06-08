package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No27866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] S = br.readLine().split("");
        int i = Integer.parseInt(br.readLine());

        System.out.println(S[i-1]);

    }
}
