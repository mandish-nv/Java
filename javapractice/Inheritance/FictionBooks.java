package Inheritance;
public class FictionBooks extends Book {
  String name = new String();

  void display(FictionBooks obj) {
    System.out.println("Book-id: " + obj.book_id);
    System.out.println("Pages: " + obj.pages);
    System.out.println("Name: " + obj.name + "\n");
  }

  public static void main(String[] args) {
    FictionBooks obj1 = new FictionBooks();
    obj1.book_id = 1;
    obj1.pages = 100;
    obj1.name = "Book1";
    FictionBooks obj2 = new FictionBooks();
    obj2.book_id = 2;
    obj2.pages = 200;
    obj2.name = "Book2";
    FictionBooks obj3 = new FictionBooks();
    obj3.book_id = 3;
    obj3.pages = 300;
    obj3.name = "Book3";

    obj1.display(obj1);
    obj2.display(obj2);
    obj3.display(obj3);
  }
}
