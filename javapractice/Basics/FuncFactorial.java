package Basics;
import java.util.Scanner;

public class FuncFactorial {
  static int factorial(int n) {
    if (n == 0)
      return 1;
    return (n * factorial(n - 1));
  }

  public static void main(String[] args) {
    int n;

    System.out.print("Enter a number: ");
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();

    System.out.println("Factorial= " + factorial(n));

    obj.close();
  }
}
