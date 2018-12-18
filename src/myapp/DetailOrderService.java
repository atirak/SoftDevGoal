/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author ASUS
 */
public class DetailOrderService {
    String credit;
    public static void toAllBook(){
         AllBook form = new AllBook();
         Main.setFrame(form); 
     }
   public static void saveToDataBase(String credit,OrderCart orderCart) {
       OrderDAO.connect();
       orderCart.creditNumber=credit;
       OrderDAO.insert(orderCart);
       
    }
    
   public static void toRecipt(){
       Receipt form = new Receipt();
       Main.setFrame(form);
   } 

    
}


