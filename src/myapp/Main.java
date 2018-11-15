
package myapp;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    static JFrame frame;
     public static void main(String[] args) {
        frame = new JFrame();
        BookDB.connect();
        BookAll form = new BookAll();
        setFrame(form);
        
    }
      public static void setFrame(JPanel form){
        frame.setContentPane(form);        
        frame.pack();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);        
        frame.setVisible(true);
          
      }
}
