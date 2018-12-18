/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import com.mongodb.BasicDBList;
import com.mongodb.BasicDBObject;
import com.mongodb.CommandResult;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.util.JSON;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import javax.swing.table.DefaultTableModel;
import static myapp.BookDAO.uri;



/**
 *
 * @author USER
 */
public class OrderDAO {
    static MongoClientURI uri ;
    static MongoClient mongo ;
    static DB db;
    static DBCollection user;
    static DBCollection book;
    static DBCollection order;
    static DBObject dockOrder;
    public static void connect(){
        try {
            uri = new MongoClientURI("mongodb://dbboat:boat1234@ds249623.mlab.com:49623/dbbookshop");
            mongo = new MongoClient(uri);
            db = mongo.getDB(uri.getDatabase());
            order = db.getCollection("Order");
            System.out.println("success");
        }catch (IOException ex) {
            System.out.print("connect wrong!");
        }
    }
    //OrderDB
    public static void insert(OrderCart orders){
        
        
        BasicDBObject add = new BasicDBObject();
         add.put("orderID",(int)order.count()+1);
        add.put("userID",orders.userID);
        add.put("creditNumber", orders.creditNumber);
        List<DBObject> arr = new ArrayList<>();
        for(int i=0;i<orders.orders.size();i++){
            BasicDBObject addOders = new BasicDBObject();
            addOders.put("bookName", orders.orders.get(i).bookname);
            addOders.put("bookAmount", orders.orders.get(i).bookamount);
            addOders.put("bookPrice",orders.orders.get(i).bookprice);
            arr.add(addOders);
        }
       
        add.put("orders", arr);
        add.put("totalPrice", orders.totalPrice);
        order.insert(add); ;

        
    }
    
    public static OrderCart getOrder(){

        BasicDBObject searchQuery  = new BasicDBObject();
        searchQuery.put("orderID",order.count());
        dockOrder = order.findOne(searchQuery);
        if(dockOrder!=null){
            int orderID = (Integer)dockOrder.get("orderID");
            int userID = (Integer)dockOrder.get("userID");
            double totalPrice = (Double)dockOrder.get("totalPrice");
            String creditNumber = (String)dockOrder.get("creditNumber");
            ArrayList<Orders> orders = new ArrayList<>();
            DBObject orderList = (DBObject) dockOrder.get("orders");
           
                for (String key : orderList.keySet()) {
                     DBObject listForGetValue = (DBObject) orderList.get(key);
                      orders.add(new Orders((String) listForGetValue.get("bookName"),(Double) listForGetValue.get("bookPrice"),(Integer) listForGetValue.get("bookAmount")));
                }
               
            OrderCart oc = new OrderCart(orderID, userID, creditNumber, orders, totalPrice);
            return oc;
        }
        return null;
    }
   
    }

