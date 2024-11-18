package Abstract;
public class Cats extends Animals{
  void cats(){
    System.out.println("Cats meow");
  }

  void dogs(){}

  public static void main(String[] args) {
    Cats c = new Cats();
    c.cats();
  }
}
