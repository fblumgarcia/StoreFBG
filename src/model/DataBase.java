/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.mysql.cj.jdbc.Blob;
import java.sql.Connection;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fblum
 */
public class DataBase {   
   private final String dir="jdbc:mysql://localhost/storefbgdb";
   private final String usDB="root";
   private final String pwDB="";
   
   //Trabaja la tabla de los usuarios
    public boolean CreateUser(String name,String email,String password){//Se hace la validación de la creación del usuario
        boolean isCreated=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Verifica libreria instalada
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(Connection conn=DriverManager.getConnection(dir,usDB,pwDB)){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO users (name,email,password,usertype) VALUES ('"+name+"','"+email+"','"+password+"','CLIENTE')");
            stmt.executeUpdate();
            conn.close();
            isCreated=true;
        }catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }        
        return isCreated;
    }
    public String[] LoginUser(String email){
        String[] user={null,null,null,null};
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Verifica libreria instalada
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(Connection conn=DriverManager.getConnection(dir,usDB,pwDB)){
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM users WHERE email='"+email+"'");
            rs.next();
            user[0]=rs.getString("name");user[1]=rs.getString("email");
            user[2]=rs.getString("password");user[3]=rs.getString("usertype");
        } catch (SQLException ex) {        
           Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
       }    
        return user;
    }
    
    //Trabaja la tabla de productos
    public boolean CreateProduct(int id,String name,int price,int quantity,Blob image,String description,String category){
        boolean isCreated=false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//Verifica libreria instalada
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        try(Connection conn=DriverManager.getConnection(dir,usDB,pwDB)){
            PreparedStatement stmt = conn.prepareStatement("INSERT INTO products (id,name,price,quantity,image,description,category) VALUES ('"+id+"','"+name+"','"+price+"','"+quantity+"'"+image+"','"+description+"','"+category+"')");
            stmt.executeUpdate();
            conn.close();
            isCreated=true;
        }catch (SQLException ex) {
            Logger.getLogger(DataBase.class.getName()).log(Level.SEVERE, null, ex);
        }
        return isCreated;
    }
}
