
package myapp;

import java.util.ArrayList;
import static myapp.DetailBookService.orderList;
public class AllBookService {
    static ArrayList<Books> bookAll = new ArrayList<Books>();

    public static ArrayList<Books> getAllBook(){
             return BookDAO.getAll();
    }
    public static void toDetailBook(String name){
        DetailBook form = new DetailBook();
        form.showBook(name);
        Main.setFrame(form); 
        
    }
     public static void toDetailOrder(){
         DetailOrder form = new DetailOrder();
         Main.setFrame(form); 
     }
   

  
   
}
