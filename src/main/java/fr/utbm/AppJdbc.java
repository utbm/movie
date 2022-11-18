package fr.utbm;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AppJdbc {

   public static void main(String[] args) throws ClassNotFoundException {

      Class.forName("org.postgresql.Driver");
      try (Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/postgres", "postgres",
            "postgres");
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACTOR");) {
         while (rs.next()) {
            System.out.print("ID: " + rs.getInt("id_actor"));
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}
