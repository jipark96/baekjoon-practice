package practice1;

import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String a = scan.next();
    
    if(a.equals("joonas")) {
      System.out.println(a+"??!");
    } else {
      System.out.println(a);
    }
  }
}
