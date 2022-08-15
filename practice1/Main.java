package practice1;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int a = sc.nextInt();
    int b = sc.nextInt();
    int sum = 0;
    for(int i=1; i<=b; i++) {
      int money = sc.nextInt();
      int num = sc.nextInt();
      sum += money*num;
    }
    if(a==sum) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}