/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.fblumgarcia.model;

import java.util.ArrayList;

    /**
     * <h1>Product</h1>
     * <p> Formato visual para acceder a la búsqueda de los productos
     * @author fblumgarcia
     * https://github.com/fblumgarcia
     * 
     */
public class Product {
    ArrayList productstoBuy;
     public void SetProductsToBuy(ArrayList productsBuy){
        
        productstoBuy=productsBuy;
        System.out.println(productsBuy);
    }
     public ArrayList GetProductsToBuy(){
        return productstoBuy;
    }
     
}
