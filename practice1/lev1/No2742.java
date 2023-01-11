//2742번 기찍N

package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class No2742 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for(int i=n; i>0; i--) {
            System.out.println(i);
        }
    }
}
