/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health;

/**
 *
 * @author conrad
 */
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public class select extends SimpleTagSupport {
   private String table;
   private String displayformat;
   private String where;

   public String getTable() {
        return table;
    }
   public void setTable(String tbl) {
      this.table = tbl;
   }
   public String getWhere() {
        return where;
    }
   public void setWhere(String whr) {
      this.where = whr;
   }
   public String getDisplayformat() {
        return displayformat;
    }
   public void setDisplayFormat(String dsf) {
      this.displayformat = dsf;
   }
   public void doTag()throws JspException, IOException {
      try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/healthcenters",
                "root", "");
            Statement stmt = con.createStatement();
            String ql = "select from" + table + "where"+ where + ")";
            ResultSet rs = stmt.executeQuery(ql);
            if("list".equals(displayformat)){
                if (rs.next())
                {
                    System.out.println("User-Id : " + rs.getString(1));
                    System.out.println("Full Name :" + rs.getString(3));
                    System.out.println("E-mail :" + rs.getString(4));
                }
                else
                {
                    System.out.println("No such user id is already registered");
                }
                con.close();
            }
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}