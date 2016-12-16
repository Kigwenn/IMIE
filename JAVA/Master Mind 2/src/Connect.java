import java.sql.Connection;
import java.sql.DriverManager;


//CTRL + SHIFT + O pour générer les imports
public class Connect {

public static void main(String[] args) {
  try {
    Class.forName("org.postgresql.Driver");
       
    String url = "jdbc:postgresql://localhost:5432/master_mind";
    String user = "postgres";
    String passwd = "Idefix72!";
       
    Connection conn = DriverManager.getConnection(url, user, passwd);
       
  } 
    catch (Exception e) {
    e.printStackTrace();
  }      
  }

}