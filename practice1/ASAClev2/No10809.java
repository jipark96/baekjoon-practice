package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No10809 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int[] arr = new int[26];

        /*
            1. 알파벳 수 만큼 배열을 만들어줌
            2. 배열을 -1로 초기화
            3. S의 자릿수를 하나씩 잘라서 확인하고 확인하는 알파벳이 있을 경우 그 알파벳 배열 순서에 자릿수 넣어줌
            동일 문자가 포함되어있는 경우 처음 나타난 위치로 나타내야한다.
            문자열을 앞에서부터 검사할 때, 앞선 동일문자가 존재하여 arr 에 위치를 변경했을 경우는 arr 의 값을 변경하지 않으면 된다.
         */
        for (int i = 0; i<arr.length; i++) {
            arr[i] = -1;
        }

        for (int i=0; i<S.length(); i++) {
            char ch = S.charAt(i);

            /*
            ch의 문자의 위치를 앞서 만든 arr배열의 값으로 바꿔줘야함
            위치는 0 부터 시작한다고 했으니 ch의 문자의 위치는 i 가 됨
            arr 배열의 인덱스(원소 위치)는 ch가 갖고 있는 문자 인코딩 값(아스키코드 값과 동일)에 'a' 또는 97 을 빼줘야 함
            동일 문자가 포함되어있는 경우 처음 나타난 위치로 나타됨.
            문자열을 앞에서부터 검사할 때, 앞선 동일문자가 존재하여 arr에 위치를 변경했을 경우는 arr의 값을 변경하지 않으면 됨
             결국 -1 인 경우에는 배열의 원소 값을 변경하고 -1 이 아닌 경우 배열의 원소 값을 변경하지 않음
             */
            if (arr[ch - 'a'] == -1) { // arr 원소 값이 -1인 경우에만 초기화
                arr[ch - 'a'] =i;
            }
        }

        for (int i=0; i<arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
