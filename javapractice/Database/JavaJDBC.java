package Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JavaJDBC{
  public static void main(String[] args) {
    try {
      Class.forName("com.mysql.cj.jdbc.Driver");
      Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbcdemo", "root", "root");
      Statement statement = connection.createStatement();
      ResultSet resultSet = statement.executeQuery("select * from student");

      while (resultSet.next()) {
        System.out.println(resultSet.getInt(1) + " " + resultSet.getString(2) + " " + resultSet.getString(3));
      }
      connection.close();
    } 
    
    catch (Exception e) {
      System.out.println(e);
    }
  }
}


//insert in db ---- statement.executeUpdate("insert into tasks values("+i+",'"+A.task+"');");  

//statement-- sql querry
  //create/prepare --- initialize schema
//db retrieve--- resultset (statement lai run garne)
