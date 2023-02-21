package practice1.lev2;
// 1259번 팰린드롬수
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class No1259 {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String str = br.readLine();

            if (str.equals("0")) break;

            String reverse = new StringBuffer(str).reverse().toString();

            if (str.equals(reverse)) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}
