
package myapp;

import java.util.ArrayList;
public class BookAllService {
    static ArrayList<Books> bookall = new ArrayList<Books>();

    public static ArrayList<Books> getAllBook(){
             return BookDB.getAll();
    }
    
}
