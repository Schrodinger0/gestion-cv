package gestioncv;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class text {
    public text(){
        
    }
     public boolean check(String text, JLabel l)
    {
      boolean valid= false;
      if(text.equals("Insert your last name...")||text.equals("Insert your first name..."))
      { JOptionPane.showMessageDialog(null, "This field is required.\n","Required field",JOptionPane.WARNING_MESSAGE);
        l.setForeground(Color.red);
        valid= false;
      }
      else{
       l.setForeground(Color.darkGray);
       valid= true;
      }
      
   
      System.out.println(valid);
    
     return(valid); 
    }
}
