package practice1.ASAClev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class No1316 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        /*
        1. 똑같은 단어가 반복이 아닌 뒤에 또 다시 나타나면 X
        2. 알파벳 26개수만큼 배열 만든다.
        3. 바로 직전 단어와 연속되는 단어인지 확인한다.
        4. 이전에 사용했던 단어인지 확인한다. => 사용했으면 그룹단어 X
         */

        int N = Integer.parseInt(br.readLine());
        int cnt=N; // 그룹 단어 개수 초기에 N으로 하고 감소시켜줌


        for(int i = 0;i<N;i++) {
            String st = br.readLine();
            boolean[] test = new boolean[26];// 알파벳 사용 내역 배열
            for(int j=0;j<st.length()-1;i++) { // i와 i+1을 비교하므로 -1를 해줌
                if(st.charAt(j)!=st.charAt(j+1)) { //현재 알파벳과 다음 알파벳이 다를 경우
                    if(test[st.charAt(j+1)-97]==true) { // 이미 한번 썼던 알파벳 일 경우
                        cnt--;
                        break;
                    }
                }
                test[st.charAt(j)-97]=true; //위의 처리가 다 끝났으면 해당 알파벳을 true처리 해주어 다음번에 반복되는경우 제외되도록 처리
                                            // -97은 아스키코드로 a가 97이니 -97해주어 a를 0으로 나오게함
            }
        }
        System.out.println(cnt);
    }
}
