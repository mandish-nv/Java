package Overriding;
public class Rectangle extends Square{
  @Override
  double area(int length, int breadth){
    return length*breadth;
  }

  @Override  
  double perimeter(int length, int breadth){
    return 2*(length+breadth);
  }

  public static void main(String[] args) {
    Rectangle r = new Rectangle();

    System.out.println("Area: " + r.area(2, 3));
    System.out.println("Perimete: " + r.perimeter(1, 2));
  }
}
