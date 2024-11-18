package Abstract;
public class Dogs extends Animals{
  void dogs(){
    System.out.println("Dogs bark");
  }

  void cats(){}

  public static void main(String[] args) {
    Dogs d = new Dogs();
    d.dogs();
  }
}
