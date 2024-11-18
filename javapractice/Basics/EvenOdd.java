package Basics;
public class EvenOdd {
  static int number=10;
  public static void main(String[] args) {
    if(checker()){
      System.out.println("Even");
    }
    else{
      System.out.println("Odd");
    }

  }
  static boolean checker(){
    if (number%2==0){
      return true;
    }
    else{
      return false;
    }
  }
}

