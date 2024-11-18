package Basics;
import java.util.Scanner;

public class SmalllestNumber {
  public static void main(String[] args) {
    int i;
    int number[] = new int[4];


    System.out.println("Enter any 4 numbers");
    for(i=0;i<4;i++){
      Scanner obj = new Scanner(System.in);
      number[i] = obj.nextInt();
    }
    
    int smallest=number[0];
    for(i=1;i<4;i++){
      if(number[i]<smallest){
        smallest=number[i];
      }
    }
    System.out.println("Smallest number: "+ smallest);

  }
}
