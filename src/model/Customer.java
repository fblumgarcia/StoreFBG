/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.regex.*;

/**
 *
 * @author fblum
 */
public class Customer extends User{
    Validations val=new Validations();
    
    public Customer (String email,String password){
        super(email,password);
    }
    public String Registry(String name,String password2){
        String msg = null;//Inicializa variable mensaje
        if(true==val.valEmail(email)){
            if(password.equals(password2)){//Compara las dos contraseñas
                msg="Bienvenido "+name+" a STOREFBG";
                boolean userCreated=true;
            }else{
                msg="No coinciden las contraseñas";
            }
        }else{
            msg="Correo ingresado es incorrecto";
        }        
        return msg;
    }   

}
