package com.sd.dao.v2;

import java.sql.*;
import java.util.Properties;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ConnectionFactory{ //singleton classic
  private static Connection conn = null; // lazy
  private ConnectionFactory() {} // 持失切 return照敗 
  public static Connection getConnection() {
    //Statement stmt = null;
    //ResultSet rs = null;
    try {
      String path = System.getProperty("user.dir");
      path+="/src/mysql.properties";
      Properties prop = new Properties();
      prop.load(new FileInputStream(path));
      Class.forName("com.mysql.jdbc.Driver");
      //static Connection getConnection(String url, String user, String password)
      //conn=DriverManager.getConnection("jdbc:mysql://localhost/test", "root", "password");
      conn = DriverManager.getConnection(
        prop.getProperty("URL")/*+"?useSSL=true"*/,
        prop.getProperty("USER"),
        prop.getProperty("PASSWORD")
      ); 
      /*
      //String mySql = "CREATE TABLE persons(id int(64) NOT NULL AUTO_INCREMENT,";
      //mySql+="name varchar(255) NOT NULL, address varchar(255) NOT NULL, UNIQUE (id))";
      //String mySql=("INSERT INTO persons(name,address) VALUES('v0-1','1 Hongji Dong')");
      String mySql="select name from persons where id<4 order by id";
      stmt=conn.createStatement();
      //stmt.execute(mySql);
      rs = stmt.executeQuery(mySql);
      while(rs.next()) {
        System.out.println(rs.getString("name"));
      }
      */
    } catch (Exception e) {
      e.printStackTrace();
    } 
    /*
    finally {
      try{
        if(rs != null) rs.close();
        if(stmt != null) stmt.close();
        if(conn != null) conn.close();
      } catch(Exception e) {};
    }
    */
    return conn;
  }
}