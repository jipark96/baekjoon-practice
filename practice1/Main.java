package practice1;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in); 
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    if(b>=45) {
      System.out.println(a+" "+(b-45));
    } else{
    if(a==0) {
      System.out.println("23 "+(b+15));
    } 
    else 
      System.out.println((a-1)+" "+(b+15));
    }
  }
}
