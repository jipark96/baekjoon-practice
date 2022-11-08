// 10951번 A+B-4 (반복문)
package practice1;

import java.io.*;
import java.util.StringTokenizer;
public class Main {
  public static void main(String[] args) throws IOException {
    BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter b = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;
    String s;

    while((s=a.readLine()) != null) {
      st = new StringTokenizer(s," ");
      int num1 = Integer.parseInt(st.nextToken());
      int num2 = Integer.parseInt(st.nextToken());
      int sum = num1+num2;
      
      b.write(sum+"\n");
    }
    // b.flush(); //남아있는 데이터 모두 출력
  } 
}
