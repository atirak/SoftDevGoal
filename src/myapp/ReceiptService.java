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
public class ReceiptService {
    public static void toAllBook(){
         AllBook form = new AllBook();
         Main.setFrame(form); 
     }
    static OrderCart getOrderLastest() {
       return OrderDAO.getOrder();
    }
    
    
}
