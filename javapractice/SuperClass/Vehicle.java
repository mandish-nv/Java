package SuperClass;
import SuperClass.LightMotorVehicle;

import java.util.Scanner;

import SuperClass.HeavyMotorVehicle;

public abstract class Vehicle {
  String company = new String();
  int price;

  public static void main(String[] args) {
    LightMotorVehicle l = new LightMotorVehicle();
    HeavyMotorVehicle h = new HeavyMotorVehicle();

    String type = new String();
    char option;
    do{
      System.out.println("Enter type of vehicle (Heavy/Light)");
      Scanner typeobj = new Scanner(System.in);
      type = typeobj.nextLine();

      if(type=="Heavy"){
        System.out.println("Enter comapny name: ");
        Scanner compobj = new Scanner(System.in);

      System.out.println("Enter price: ");
      }
      else if (type=="Light"){

      }
      else{


      }
      

      

      System.out.println("Do you want to add more? (Y/N) ");
      Scanner optionObj = new Scanner(System.in);
      option = optionObj.next().charAt(0);
    } while (option != 'n');
  }
}
