/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author fblum
 */
public class Validations {
    public boolean valEmail(String email){
        boolean ans = false;
        String regx="^[A-Za-z0-9+_.-]+@(.+)$";//Regular expression
        Pattern pattern=Pattern.compile(regx);//Compile regular expression to get the pattern
        Matcher matcher=pattern.matcher(email); //Create instance of matcher
        if(true==matcher.matches()){
            ans=true;
        }
        return ans; 
    }
}
