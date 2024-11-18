package Overloading;
public class MethodOverloading {
  int add(int a, int b) {
    return a + b;
  }

  int add(int a, int b, int c) {
    return a + b + c;
  }

  double add(double a, double b) {
    return a + b;
  }

  int add(char a, char b) {
    return a + b;
  }

  public static void main(String[] args) {
    MethodOverloading a1 = new MethodOverloading();
    MethodOverloading a2 = new MethodOverloading();
    MethodOverloading a3 = new MethodOverloading();
    MethodOverloading a4 = new MethodOverloading();

    System.out.println("Result: " + a1.add(1, 2));
    System.out.println("Result: " + a2.add(1, 2, 3));
    System.out.println("Result: " + a3.add(1.1, 2.2));
    System.out.println("Result: " + a4.add('a', 'b'));
  }
}