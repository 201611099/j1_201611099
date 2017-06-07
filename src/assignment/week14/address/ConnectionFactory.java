package assignment.week14.address;

import java.sql.*;
import java.util.*;
import java.io.*;

public class ConnectionFactory {
  private static Connection conn = null;
  private ConnectionFactory() {}
  public static Connection getConnection() {
    try {
      String path = System.getProperty("user.dir");
      path += "/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      conn = DriverManager.getConnection (
        prop.getProperty("URL"),
        prop.getProperty("USER"),
        prop.getProperty("PASSWORD")
      );
    } catch (Exception e) {
      e.printStackTrace();
    }
    return conn;
  }
}