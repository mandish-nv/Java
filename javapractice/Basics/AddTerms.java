package Basics;
public class AddTerms {
  static float factorial(int n) {
    if (n == 0)
      return 1;
    return (n * factorial(n - 1));
  }

  public static void main(String[] args) {
    int i;
    float sum = 0;

    for (i = 1; i <= 7; i++) {
      sum += i / factorial(i);
    }
    System.out.println("Sum= " + sum);
  }
}
