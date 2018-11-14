/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import java.awt.Dimension;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pc
 * @create by boat
 */
public class BookDB {
    static MongoClientURI uri ;
    static MongoClient mongo ;
    static DB db;
    static DBCollection user;
    static DBCollection book;
    static DBCollection order;
    static DBObject dockBook;
       
    
    
    public static void connect(){
        try {
            uri = new MongoClientURI("mongodb://dbboat:boat1234@ds249623.mlab.com:49623/dbbookshop");
            mongo = new MongoClient(uri);
            db = mongo.getDB(uri.getDatabase());
            user = db.getCollection("User");
            book = db.getCollection("Books");
            order = db.getCollection("Orders");
            System.out.print("success");
        }catch (IOException ex) {

        }
    }
    //BOOK DB
    public static void insert(String bookname , String author , String booktype,
            Double bookprice,String publisher , Double year , String language ,
            Double countpage){
        BasicDBObject add = new BasicDBObject();
        add.put("bookname", bookname);
        add.put("author", author);
        add.put("booktype", booktype);
        add.put("bookprice", bookprice);
        add.put("publisher", publisher);
        add.put("year", year);
        add.put("language", language);
        add.put("countpage", countpage);
        book.insert(add);     
    }
    
    public static void update(String bookname , String author , String booktype,
            Double bookprice,String publisher , Double year , String language ,
            Double countpage){
        
        BasicDBObject  searchBook = new BasicDBObject();
        searchBook.put("bookname",bookname);
        
        BasicDBObject setUpdate = new BasicDBObject();
        BasicDBObject updateBook = new BasicDBObject();
        
        updateBook.put("bookname",bookname);
        updateBook.put("author",author);
        updateBook.put("booktype",booktype);
        updateBook.put("bookprice",bookprice);
        updateBook.put("publisher",publisher);
        updateBook.put("year",year);
        updateBook.put("language",language);
        updateBook.put("countpage",countpage);
        
        setUpdate.put("$set",updateBook);
        
        book.update(searchBook, setUpdate); 
        
    }

    public static Books get(String bookname){
        BasicDBObject searchQuery  = new BasicDBObject();
        searchQuery.put("bookname",bookname);
        dockBook = user.findOne(searchQuery);
        if(dockBook!=null){
            Books book = new Books((String)dockBook.get("bookname"),(String)dockBook.get("author")
                      ,(String)dockBook.get("booktype"),(Double)dockBook.get("bookprice")
                      ,(String)dockBook.get("publisher"),(Double)dockBook.get("year")
                      ,(String)dockBook.get("language"),(Double)dockBook.get("countpage"));
            return book;
        }
        return null;
    }
    public static ArrayList<Books> getAll(){
        DBCursor cursor = user.find();
        ArrayList<Books> bookList = new ArrayList<Books>();
        while(cursor.hasNext()) {
            DBObject dockBook = cursor.next();
            bookList.add(new Books((String)dockBook.get("bookname"),(String)dockBook.get("author")
                      ,(String)dockBook.get("booktype"),(Double)dockBook.get("bookprice")
                      ,(String)dockBook.get("publisher"),(Double)dockBook.get("year")
                      ,(String)dockBook.get("language"),(Double)dockBook.get("countpage")));
            }
        return bookList;      
    }
    
}
