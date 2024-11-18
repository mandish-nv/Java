package Basics;
import java.util.Scanner;

public class PosNeg {
  public static void main(String[] args) {
    int number;
    Scanner obj = new Scanner(System.in);
    obj.close();
    number = obj.nextInt();
    if (number > 0)
      System.out.println("Positive");
    else if (number < 0)
      System.out.println("Negative");
    else
      System.out.println("Zero");
  }
}
