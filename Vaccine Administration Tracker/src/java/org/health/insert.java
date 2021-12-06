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

public class insert extends SimpleTagSupport {
   private String table;
   private String values;

   public String getTable() {
        return table;
    }
   public void setTable(String tbl) {
      this.table = tbl;
   }
   public String getValues() {
        return values;
    }
   public void setValues(String vls) {
      this.values = vls;
   }
   public void doTag()throws JspException, IOException {
      try {
            Class.forName("com.mysql.jdbc.Driver");
 
            // 2(b) Registering drivers using DriverManager
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/healthcenters",
                "root", "");
            String sql = "insert into" + table + "values("+ values + ")";
            PreparedStatement ps = con.prepareStatement(sql);
        }catch (SQLException | ClassNotFoundException e) {
            System.out.println(e);
        }
    }
}