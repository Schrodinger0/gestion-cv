package gestioncv;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class password {

    /**
     *
     */
    public password(){
 
 }
    public boolean check(char[] passwd, JLabel l)
    {
      String pwd = String.valueOf(passwd);
      String pattern = "(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=!?])(?=\\S+$).{6,}";
      boolean valid= false;
      
      if(pwd.equals(""))
      { JOptionPane.showMessageDialog(null, "Please enter your password.\n","Password field empty",JOptionPane.WARNING_MESSAGE);
        l.setForeground(Color.red);
        valid= false;
      }
      else{
      if(pwd.length()>0 && pwd.length()<6)
      { JOptionPane.showMessageDialog(null, "Your password must have at least 8 characters\n","Password too short",JOptionPane.WARNING_MESSAGE);
        l.setForeground(Color.red);
        valid= false;
      }
      else if (!pwd.matches(pattern))
      { JOptionPane.showMessageDialog(null,"Your password must contain at least one upper case letter, "
                   + "\n one lower case letter, "
                   + "\n one special character and one digit",
                   "Password doesn't match the pattern",JOptionPane.WARNING_MESSAGE);
        l.setForeground(Color.red);
        valid= false;
      }
      else 
      { 
        l.setForeground(Color.DARK_GRAY);
        valid= true;
          
      }
   
      //System.out.println(valid);
     }
     return(valid); 
    }

   /*
   public static void main(String args[]) {
    JLabel l= new JLabel("text");
    String str= "Hiba@1995";
    char[] input;
    input = str.toCharArray();
    boolean right;
    password pwd= new password();
    pwd.check(input, l);
    }
   */
}

