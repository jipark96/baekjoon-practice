package practice1.lev4;
import java.util.*;
import java.io.*;
public class No2884 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();

        /**
         * 45분 이상일 때 -45
         * 45분 미만일 때 M+15
         */
        if (M>=45) {
            System.out.println(N +" " + (M-45));
        } else {
            if (N==0) {
                System.out.println("23 " + (M+15));
            } else {
                System.out.println((N-1)+ " " + (M+15));
            }
        }
    }
}
