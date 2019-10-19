package gestioncv;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class mail {
    public mail(){
 
 }
    public boolean check(String mail, JLabel l)
    {
      
      String pattern = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@((\\[[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\])|(([a-zA-Z\\-0-9]+\\.)+[a-zA-Z]{2,}))$";
      boolean valid= false;
      
      if(mail.equals("Insert your e-mail..."))
      { JOptionPane.showMessageDialog(null, "Please enter your E-mail.\n","E-mail field empty",JOptionPane.WARNING_MESSAGE);
        l.setForeground(Color.red);
        valid= false;
      }
      
      else if (!mail.matches(pattern))
      { JOptionPane.showMessageDialog(null,"Please enter a valid E-mail address!","E-mail not valid",JOptionPane.WARNING_MESSAGE);
        l.setForeground(Color.red);
        valid= false;
      }
      else 
      { 
        l.setForeground(Color.DARK_GRAY);
        valid= true;  
      }
   
      System.out.println(valid);
     
     return(valid); 
    }

   
}

