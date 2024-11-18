package Database;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class JdbcConncetion {
  public static String URL="jdbc:mysql://localhost:3306/java_nccs";
  public static String USERNAME="root";

  public static String PASSWORD="root";




  public static void main(String[] args) throws Exception{
    Class.forName("com.mysql.cj.jdbc.Driver");
    Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
    // Statement statement = connection.createStatement("Insert into students(id,name,phone) values(1,'Ram','012345'),(2,'Shyam','067891')");
    
    // Statement statement = connection.createStatement();
    // statement.executeQuery("Insert into students(id,name,phone) values(1,'Ram','012345'),(2,'Shyam','067891')");

    Statement statement = connection.prepareStatement("Insert into students(id,name,phone) values(1,'Ram','012345'),(2,'Shyam','067891')");
    statement.executeUpdate("Insert into students(id,name,phone) values(1,'Ram','012345'),(2,'Shyam','067891')");
    // statement.execute("Insert into students(id,name,phone) values(2,'Ram','012345'),(1,'Shyam','067891')");
    //result set
  }
}


// 1. Create Driver class
// 2. Create Connection
// 3. Create Statement 
// 4. Execute Querries
// 5. Close Connection