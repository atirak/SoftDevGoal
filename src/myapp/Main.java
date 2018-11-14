
package myapp;

import javax.swing.JFrame;

public class Main {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        BookDB.connect();
        Bookstore form = new Bookstore();
        frame.setContentPane(form);        
        frame.pack();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);        
        frame.setVisible(true);
        
    }
}
