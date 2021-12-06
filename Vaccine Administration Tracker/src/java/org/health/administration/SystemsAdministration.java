/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.health.administration;

/**
 *
 * @author BIGLINKS
 */
public class SystemsAdministration {
   
    public String name;
    public String email;
    public String role;
    public String password;
    public String confirmPassword;
    public int id;
    

    
//    public SystemAdminstrationModule(String name , String email , String role , String password , String confirmPassword){
//        this.name = name;
//        this.email =  email;
//        this.role = role;
//        this.password = password;
//        this.confirmPassword =  confirmPassword;
//    }
    
    public String createTable(){
        return "CREATE TABLE `administrator` (\n" +
"  `id` int(11) NOT NULL,\n" +
"  `email` varchar(255) NOT NULL,\n" +
"  `name` varchar(255) NOT NULL,\n" +
"  `password` varchar(255) NOT NULL,\n" +
"  `role` varchar(255) NOT NULL,\n" +
"  `confirmPassword` varchar(255) NOT NULL\n" +
") ";
        
    } 
    
    public String insertIntoTable(String email , String name , String role ,String password , String confirmPassword){
        return "INSERT INTO `administrator` (`id`, `email`, `name`, `password`, `role`, `confirmPassword`) "
                + "VALUES (NULL, '"+email+"', '"+name+"', '"+password+"', '"+role+"', '"+confirmPassword+"');";
    }
    
    
    public String SelectUser(String email , String password){
        return "SELECT * FROM `administrator` WHERE email='"+email+"' AND password='"+password+"';";
    }
    
    
    
    
    
}
