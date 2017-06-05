package com.sd.dao.v2;

import java.sql.*;
import java.util.*;
import java.io.*;

public class PersonDaoImpl implements PersonDao {
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt = null;
  ResultSet rs = null; // ResultSet은 n개이므로 while while문 (여러개 담김) / if (한개)
  public void insert (PersonV0 p) {
    try {
      //Connection conn = ConnectionFactory.getConnection();
      pstmt=conn.prepareStatement("INSERT INTO persons(id,name,address) VALUES(NULL,?,?)");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress()); // VALUE(NULL,?,?)
      System.out.println("inserting..." + p.getName());
      pstmt.executeUpdate();
    }catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public List<PersonV0> findAll() {
    Statement stmt = null;
    List<PersonV0> persons = new ArrayList<PersonV0>();
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM persons");
      PersonV0 p = null;
      while(rs.next()) { //rs가 여러개
        p = new PersonV0();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
        persons.add(p);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try{
        if(stmt != null) stmt.close();
      }catch(Exception e) {};
    return persons;
    }
  }
  public PersonV0 findById(int id) {
    PersonV0 p = null;
    try{
      pstmt=conn.prepareStatement("SELECT * FROM persons WHERE id = ?");
      pstmt.setInt(1,id);
      System.out.println("* finding by id..." + id);
      rs = pstmt.executeQuery();
      if(rs.next()) { //1개일것 (while x / if o)
        p = new PersonV0();
        p.setId(rs.getInt("id"));
        p.setName(rs.getString("name"));
        p.setAddress(rs.getString("address"));
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }
    return p;
  }
  public void update(PersonV0 p) {
    try {
      pstmt=conn.prepareStatement("UPDATE persons SET name = ?, address = ? WHERE id = ?");
      pstmt.setString(1,p.getName());
      pstmt.setString(2,p.getAddress());
      pstmt.setInt(3,p.getId());
      System.out.println("updating..." + p.getName());
      pstmt.executeUpdate();
    }catch(SQLException e) {
      e.printStackTrace();
    }
  }
  public void delete(int id) { 
    try{
      pstmt = conn.prepareStatement("DELETE FROM persons WHERE id = ?");
      pstmt.setInt(1,id);
      int rows = pstmt.executeUpdate();
      if(rows==0) {
        System.out.println("can not delete...");
      } else if (rows>0) {
        System.out.println("deleting..." + id);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public void close() {
    System.out.println("closing all...");  
    try {
      if(rs != null) rs.close();
      if(pstmt != null) pstmt.close();
      if(conn != null) conn.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}
