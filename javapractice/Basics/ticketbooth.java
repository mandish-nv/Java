package Basics;
import java.util.Scanner;

public class ticketbooth {
  int peopleVisited;
  double totalMoney;

  ticketbooth() {
    System.out.println("\nWelcome!\n");
  }

  void increaseTotalMoney(double price) {
    totalMoney += price;
  }

  void increasePeopleVisited() {
    peopleVisited++;
  }

  void display() {
    System.out.println("People visited: " + peopleVisited);
    System.out.println("Total money: " + totalMoney);
  }

  public static void main(String[] args) {
    ticketbooth t = new ticketbooth();

    double price = 2.50;
    char option;
    do {
      System.out.println("Do you want to buy ticket? (Y/N)");
      Scanner buyObj = new Scanner(System.in);
      char buy = buyObj.next().charAt(0);

      if (buy == 'y') {
        t.increasePeopleVisited();
        t.increaseTotalMoney(price);
      } else {
        t.increasePeopleVisited();
      }

      System.out.println("Do you want to add more? (Y/N) ");
      Scanner optionObj = new Scanner(System.in);
      option = optionObj.next().charAt(0);
    } while (option != 'n');

    t.display();
  }
}