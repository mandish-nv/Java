package Basics;
import java.util.Scanner;

public class GreatestNumber {
  public static void main(String[] args) {
    int i;
    int number[] = new int[3];

    System.out.println("Enter any 3 numbers");
    for (i = 0; i < 3; i++) {
      Scanner obj = new Scanner(System.in);
      number[i] = obj.nextInt();
    }

    int largest= number[0]>number[1]?
    (number[0]>number[2]?number[0]:number[2]):
    (number[1]>number[2]?number[1]:number[2]);

    System.out.println("Largest number: " + largest);
  }
}
