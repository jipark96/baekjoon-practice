package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No11720 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split("");
        int sum = 0;

        /*
            1. 자릿수마다 10으로 나눈 나머지를 더해줌
            2. 자릿수를 하나씩 떼어내서 더해줌
            3. 배열으로 만들어 배열의 값을 더해줌
                => 문자열 배열로 만들고 정수형태로 바꿔줘야됨
         */

        for (int i=0; i<N; i++) {
            sum += Integer.parseInt(arr[i]);
        }
        System.out.println(sum);
    }
}
