/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author fblum
 */
public class User {
    String password,email,name;
    public User(String email,String password){
        this.email=email;this.password=password;        
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    public String Login(){
        String msg=null;
        Validations val=new Validations();
        System.out.println(val.valEmail(email)+"---"+email.equals("abc@gm.com"));
        if(val.valEmail(email)==true&&email.equals("abc@gm.com")){
            if(password.equals("123")){
                msg="Bienvenido PErsonaje, abrw otra ventana";
            }else{
                msg="Contraseña o Email incorrecto";
            }            
        }else{
            msg="Contraseña o Email incorrecto";
        }
        return msg;
    }
}
