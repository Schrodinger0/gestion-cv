package gestioncv;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class passValid {
    public passValid()
    {
        
    }
    public boolean check(char[] passwd, JLabel l)
    {
      String pass = String.valueOf(passwd);
      boolean valid= false;
      
    if(pass.equals(""))
               {JOptionPane.showMessageDialog(null, "Please enter your password!", "Forgot password", JOptionPane.WARNING_MESSAGE); 
                l.setForeground(Color.red);
                valid=false;
               }
    else
               {
                l.setForeground(Color.darkGray);
                valid=true;
               }
    
    return(valid);
     }
}