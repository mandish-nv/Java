package Basics;
public class ForEachExample {
  public static void main(String[] args) {
    int a[] = new int[10];

    for (int i = 0; i < 10; i++) {
      a[i] = i * 5;
    }

    for (int result : a) {
      System.out.println("Output = " + result);
    }
  }
}
