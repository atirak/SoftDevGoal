/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

/**
 *
 * @author Pc
 */
public class Books {
    String bookname ;
    String author;
    String booktype;
    int bookprice;
    String publisher;
    int year;
    String language;
    int countpage;
    
    Books(String bookname , String author , String booktype,int bookprice,
            String publisher , int year , String language ,int countpage){
        this.bookname = bookname;
        this.author = author;
        this.booktype = booktype;
        this.bookprice = bookprice;
        this.publisher = publisher;
        this.year = year;
        this.language = language;
        this.countpage = countpage;
    }
}
