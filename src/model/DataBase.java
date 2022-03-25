/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
/**
 *
 * @author fblum
 */
public class DataBase {
    private boolean isCreated;
    public boolean CreateUser(String name,String email,String Password){//Se hace la validación de la creación del usuario
        System.out.println("Procedimiento crea user");
        isCreated=true;
        return isCreated;
    }
    public String[] LoginUser(String email,String Password){
        System.out.println("Procedimiento login User");
        //String[] user={"Juan","jp@as.co","123","CLIENTE"};
        String[] user={"Juan","jp@as.co","123","ADMINISTRADOR"};
        //String[] user={null}; Cuando no existe el user
        return user;
    }
    public boolean isIsCreated() {
        System.out.println(isCreated);
        return isCreated;
    }

    public void setIsCreated(boolean isCreated) {
        this.isCreated = isCreated;
    }
    
}
