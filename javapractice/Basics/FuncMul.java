package Basics;
import java.util.Scanner;

public class FuncMul {
  static void mul(int n) {
    for (int i = 1; i <= 10; i++) {
      System.out.println(n + " X " + i + " = " + (n * i));
    }
  }

  public static void main(String[] args) {
    int n;

    System.out.print("Enter a number: ");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();

    mul(n);
    obj.close();

  }
}
