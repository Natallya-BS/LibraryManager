import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Base {
  public static void main(String[] args) {
    Connection connection = null;
    try {
      // Cria a conexão com o banco de dados
      connection = DriverManager.getConnection("jdbc:sqlite:base.db");
      Statement statement = connection.createStatement();
      statement.setQueryTimeout(30);  // Espera só por 30 segundos para conectar

 

  }
}