
package myapp;

import java.util.ArrayList;
public class BookDetailService {
    static ArrayList<Orders> orderlist = new ArrayList<Orders>();
    
    public static void AddArrayOrder(String name,double price,int amount){
        boolean flag = true;
        int num=0;
        for(Orders order:orderlist){
            num++;
            if(order.bookname.equals(name)){
                amount+=order.bookamount;
                flag=false;
                break;
            }
        }
        if(flag){
            orderlist.add(new Orders(name,price,amount));
        }else{
            orderlist.set(num,new Orders(name,price,amount));
        }
    }
    
     public static void ResetList(){
         orderlist.clear();
     }
     
     public static void SendToOrder(){
         
     }
    
}
