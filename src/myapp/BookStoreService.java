
package myapp;

import java.util.ArrayList;
public class BookStoreService {
    static ArrayList<Orders> orderlist = new ArrayList<Orders>();

    public static void AddOrder(String name,double price,int amount){
        boolean flag = true;
        int num=0;
        for(Orders order:orderlist){            
            if(order.bookname.equals(name)){
                amount+=order.bookamount;
                flag=false;
                break;
            }
            num++;
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
     
     public static int AmountBook(){
         int sum = 0;
          for(Orders order:orderlist){
              sum+=order.bookamount;
          }
          return sum;
     }
    
}
