package Basics;
public class FindSum {
  public static void main(String[] args) {
    int i = 100;
    int sum = 0;

    while (i < 200) {
      if (i % 7 == 0 && i % 5 != 0) {
        sum += i;
      }
      i++;
    }
    System.out.println("Sum= " + sum);
  }
}
