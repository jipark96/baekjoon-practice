//11654 아스키 코드
package practice1.lev1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        byte num = (byte) br.readLine().charAt(0);
        System.out.println(num);
    }
}
