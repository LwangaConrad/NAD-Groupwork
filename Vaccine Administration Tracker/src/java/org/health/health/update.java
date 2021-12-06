/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health.health;

/**
 *
 * @author conrad
 */
import jakarta.servlet.jsp.tagext.*;
import jakarta.servlet.jsp.*;
import java.io.*;
import java.sql.*;

public class update extends SimpleTagSupport {
   private String table;
   private String where;
   private String newvalue;
   
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
   public String getNewvalue() {
        return newvalue;
    }
   public void setNewvalue(String nwv) {
      this.newvalue = nwv;
   }
   public void doTag()throws JspException, IOException {
      try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/healthcenters",
                "root", "");
            Statement stmt = con.createStatement();
            String sql = "update" + table + "where"+ where + "values("+ newvalue + ")";
            stmt.executeUpdate(sql);
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}