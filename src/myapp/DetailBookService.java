
package myapp;

import java.util.ArrayList;
public class DetailBookService {
    static ArrayList<Orders> orderList = new ArrayList<Orders>();
    static OrderCart orderCart;
    public static void newOrder(){
        orderCart = new OrderCart(0,1,"",orderList,0);
    }
    public static void addOrder(String name,double price,int amount){
        
        boolean flag = true;
        int num=0;
        orderCart.totalPrice=0;
        for(Orders order:orderCart.orders){            
            if(order.bookname.equals(name)){
                amount+=order.bookamount;
                flag=false;
                break;
            }
            num++;
        }
        if(flag){
            orderCart.orders.add(new Orders(name,price,amount));
        }else{
            orderCart.orders.set(num,new Orders(name,price,amount));
        }
    }
    
     public static Books getBook(String bookname){
         return BookDAO.get(bookname);
     }
     public static void toAllBook(){
         AllBook form = new AllBook();
         form.Order=orderCart;
         Main.setFrame(form); 
     }
     public static void toDetailOrder(){
        
         for(Orders order:orderList){
            orderCart.totalPrice += order.bookprice*order.bookamount;
         }
         DetailOrder form = new DetailOrder();
         form. showOrderDetail(orderCart);
         Main.setFrame(form); 
     }
}
