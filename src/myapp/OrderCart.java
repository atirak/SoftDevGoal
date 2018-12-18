/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;
    
import java.util.ArrayList;

    
/**
 *
 * @author USER
 */
public class OrderCart {
   public static int orderID;
   public  static int userID;
   public  static String creditNumber;
   public  static ArrayList<Orders> orders = new ArrayList<>();
   public  static double totalPrice;
   
   OrderCart(){
       
   }
    OrderCart(int orderID,int userID,String creditNumber,ArrayList<Orders> orders,double totalPrice){
        this.orderID=orderID;
        this.userID=userID;
        this.creditNumber=creditNumber;
        this.orders=orders;
        this.totalPrice=totalPrice;
    }
    public static int getOrderId(){
        return orderID;
    }
}
