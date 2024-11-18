package Basics;
public class Interest {
  int principal = 1000;
  int time = 2;
  int rate = 10;
  float simpleInterest;

  public static void main(String[] args) {
    Interest obj = new Interest();
   
    // calculate(obj.principal, obj.time, obj.rate);
    obj.simpleInterest= (obj.principal * obj.time * obj.rate) / 100;
    System.out.println(obj.simpleInterest);
  }

  // void static calculate(int p, int t, int r){
  //    float si= (p * t * r) / 100;
  //    System.out.println(si);
  // }
}
