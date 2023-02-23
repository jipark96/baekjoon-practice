package practice1.lev2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class No1874 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        boolean check = false;
        int temp = 1;

        for(int i=0; i<n; i++) {
            int num = Integer.parseInt(br.readLine());

            for( ; temp<=num; temp++) {
                stack.push(temp);
                sb.append("+").append("\n");
            }

            if(stack.peek()==num) {
                stack.pop();
                sb.append("-").append("\n");
            } else {
                check = true;
            }
        }
        if(check) {
            System.out.println("NO");
        }
        else {
            System.out.println(sb);
        }
    }
}
