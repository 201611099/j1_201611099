package assignment.week14.address;

import java.sql.*;
import java.util.*;
import java.io.*;

public class AddressDAOImpl implements AddressDAO {
  Connection conn = ConnectionFactory.getConnection();
  PreparedStatement pstmt = null;
  ResultSet rs = null;
  public void insert (Address a) {
    try {
      pstmt=conn.prepareStatement("INSERT INTO address(id,name,phon,email) VALUES(NULL,?,?,?)");
      pstmt.setString(1,a.getName());
      pstmt.setString(2,a.getPhone());
      pstmt.setString(3,a.getEmail());
      System.out.println("Inserting..." + a.getName());
      pstmt.executeUpdate();
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
  public List<Address> findAll() {
    Statement stmt = null;
    List<Address> address = new ArrayList<Address>();
    try {
      stmt = conn.createStatement();
      rs = stmt.executeQuery("SELECT * FROM address");
      Address a = null;
      while(rs.next()) {
        a = new Address();
        a.setId(rs.getInt("id"));
        a.setName(rs.getString("name"));
        a.setPhone(rs.getString("phone"));
        a.setEmail(rs.getString("email"));
        address.add(a);
      }
    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        if(stmt != null) stmt.close();
      } catch(Exception e) {};
    return address;
    }
  }
  public Address findById(int id) {
    Address a = null;
    try {
      pstmt = conn.prepareStatement("SELECT * FROM address WHERE id = ?");
      pstmt.setInt(1,id);
      System.out.println("* finding by id..." + id);
      rs = pstmt.executeQuery();
      if(rs.next()) {
        a = new Address();
        a.setId(rs.getInt("id"));
        a.setName(rs.getString("name"));
        a.setPhone(rs.getString("phone"));
        a.setEmail(rs.getString("email"));
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }
    return a;
  }
  public void update (Address a) {
    try {
      pstmt = conn.prepareStatement("UPDATE address SET name = ?, phone = ?, email = ? WHERE id = ?");
      pstmt.setString(1,a.getName());
      pstmt.setString(2,a.getPhone());
      pstmt.setString(3,a.getEmail());
      pstmt.setInt(4,a.getId());
      System.out.println("Updating..." + a.getName());
      pstmt.executeUpdate();
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
  public void delete(int id) {
    try{
      pstmt = conn.prepareStatement("DELETE FROM address WHERE id = ?");
      pstmt.setInt(1,id);
      int rows = pstmt.executeUpdate();
      if(rows==0) {
        System.out.println("Can not delete...");
      } else if (rows>0) {
        System.out.println("Deleting..." + id);
      }
    } catch(SQLException e) {
      e.printStackTrace();
    }
  }
  public void close() {
    System.out.println("Closing all...");
    try {
      if(rs != null) rs.close();
      if(pstmt != null) pstmt.close();
      if(conn != null) conn.close();
    } catch(Exception e) {
      e.printStackTrace();
    }
  }
}

