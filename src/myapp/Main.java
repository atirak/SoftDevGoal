
package myapp;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    static JFrame frame;
     public static void main(String[] args) {
        frame = new JFrame();
        BookDAO.connect();
        AllBook form = new AllBook();
        setFrame(form);
        
    }
      public static void setFrame(JPanel form){
        frame.setContentPane(form);        
        frame.pack();
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);        
        frame.setVisible(true);
          
      }
}
