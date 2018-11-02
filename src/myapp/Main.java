
package myapp;

import javax.swing.JFrame;

public class Main {
     public static void main(String[] args) {
        JFrame frame = new JFrame();
        BookDB.Connect();
        BookStore form = new BookStore();
        frame.setContentPane(form);        
        frame.pack();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);        
        frame.setVisible(true);
        
    }
}
