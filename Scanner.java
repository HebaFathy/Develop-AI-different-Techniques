package Expert;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Scanner extends JFrame
{
	
 public Scanner()
 
 {
  try{	
  JTextArea t=new JTextArea();
  String select="          *Welcome to (USB)Scanner Troubleshooter*    \n\n\n"+
                " Make sure your hardware is turned on and connected correctly \n"+
                " Does your hardware work when it is connected and turned on?\n\n"+
                "  1- No, my hardware does not work.\n"+
                "  2- Yes, my hardware works now.\n";
                 
                  
   t.setForeground(new Color(30,91,136));
   t.setFont(new Font("DialogInput",Font.BOLD,12));
   t.setText(select);
   String choose=JOptionPane.showInputDialog(null,t,"USB Scanner",JOptionPane.QUESTION_MESSAGE);
   
  if(choose.equals("1"))
  {
  	t=new JTextArea();
    t.setFont(new Font("Monospaced",Font.PLAIN,12));
    t.setForeground(new Color(30,91,136));
    
    select="Is your device driver corrupted?\n\n"+
           "To remove and reinstall the driver\n"+
           "   1- Disconnect the device from the USB port.\n"+
           "   2- Turn off the power for the device.\n"+
           "   3- Open Device Manager.\n"+
           "   4- Double-click the appropriate device category.\n"+
           "   5- Right-click your USB device, and then click Uninstall.\n"+
           "   6- Restart your computer \n" +
           "   7- Turn the power back on for the device,and then plug the device into the USB port.\n"+
           "   8- Reinstall your device driver again .\n\n"+
           "Does removing and reinstalling the driver for the device solve the problem?\n\n"+
           "   1- No, I still have a problem with my device. \n"+
           "   2- Yes, this solves the problem.\n"+
           "   3- I want to skip this step ";

           
    t.setText(select);
    String choose1=JOptionPane.showInputDialog(null,t,"USB Scanner",JOptionPane.QUESTION_MESSAGE);
    
    if(choose1.equals("1")||choose1.equals("3"))
    {
    
     t=new JTextArea();
     t.setFont(new Font("Monospaced",Font.PLAIN,12));
     t.setForeground(new Color(30,91,136));
     
     select="Does Windows support your hardware?\n\n"+
     "To find out whether your hardware device is supported by your OS,\n"+
     "check the Windows Hardware Compatibility List (HCL) at the Microsoft Web site.\n\n"+
     "Is your hardware on the HCL?\n"+
     "  1- Yes, my hardware is on the HCL.but I still have a problem\n"+
     "  2- No, my hardware is not on the HCL. I will contact the manufacturer\n"+
     "  3- I want to skip this step"; 
     
     t.setText(select);
     String choose2=JOptionPane.showInputDialog(null,t,"USB Scanner",JOptionPane.QUESTION_MESSAGE);
     
     if(choose2.equals("1")||choose2.equals("3"))
     {
      t=new JTextArea();
      t.setFont(new Font("Monospaced",Font.PLAIN,12));
      t.setForeground(new Color(30,91,136));
      
      select="Is there an updated driver for your device?\n\n" +
             "Check the Windows Update Web site for an updated driver.\n\n" +
             "Does updating your device driver solve the problem?\n\n"+
             "  1- No, I still have a problem.\n"+
             "  2- Yes, this solves the problem\n"+
             "  3- I want to skip this step";
      
      t.setText(select);
      String choose3=JOptionPane.showInputDialog(null,t,"USB Scanner",JOptionPane.QUESTION_MESSAGE); 
      
      if(choose3.equals("1")||choose3.equals("3"))
      {
       t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       t.setForeground(new Color(30,91,136));
       
       select="Try the USB troubleshooter. \n\n"+
              "Does the USB troubleshooter help you solve the problem?\n\n"+
              "   1- No, I still have a problem.\n"+
              "   2- Yes, the USB troubleshooter helped solve the problem.\n"+
              "   3- I want to skip this step";
              
       t.setText(select);
       String choose4=JOptionPane.showInputDialog(null,t,"USB Scanner",JOptionPane.QUESTION_MESSAGE);
       
       if(choose4.equals("1")||choose4.equals("3"))
       {
       	t=new JTextArea();
        t.setFont(new Font("Monospaced",Font.PLAIN,12));
        t.setForeground(new Color(30,91,136));
        
        select="Do you have a faulty scanner?\n\n"+
                "  1- No, the device is not faulty.\n"+
                "  2- Yes, my device appears to be faulty.I will contact the manufacturer\n"+
                "  3- I want to skip this step";
                
        t.setText(select);
        String choose5=JOptionPane.showInputDialog(null,t,"USB Scanner",JOptionPane.QUESTION_MESSAGE);	
        
        if(choose5.equals("1")||choose5.equals("3"))
        {
          
          unable();
         	
        }
        
        else if(choose5.equals("2"))
        {
        
         exit();	
        	
        }
       	
       }
       
       else if(choose4.equals("1"))
       
       {
       	
         exit();
        	
       }         
      	
      }
      
      else if(choose3.equals("2"))
      
      {
       
       exit();
      	
      }
     	
     }
     
     else if(choose1.equals("2"))	
     {
      
      exit();
     	
     }
    	
    }
    
    else if(choose1.equals("2"))
    {
      
      exit();
    	
    }
  	
  }
  
  else if(choose.equals("2")) 
  
  {
  
   exit();	
  	
  }
   	
 
  }//try
  
  catch(Exception ex) 
  {
  	
  }

 } 
 	
/*======================================Functions==========================================*/
 public  void exit()
 {
  	
  JTextArea t=new JTextArea();
  t.setFont(new Font("Monospaced",Font.PLAIN,12));
  t.setForeground(new Color(102,0,102));
  
  String select="\nYou are Welcome.\nThank you for using our Program.\n";                
  t.setText(select);
  JOptionPane.showMessageDialog(null,t,"USB Scanner",JOptionPane.PLAIN_MESSAGE);	
 	
 }
 
////////////////////////////////////////////////////////////////////////////////////////////
 public  void unable()
 
 {
 	
 	JTextArea t=new JTextArea();
 	t.setFont(new Font("Monospaced",Font.PLAIN,12));
 	t.setForeground(new Color(102,0,102));
 	
    String select="\nThis Program is unable to solve your problem. ";      
    t.setText(select);
    JOptionPane.showMessageDialog(null,t,"USB Scanner",JOptionPane.PLAIN_MESSAGE);
 	
 	
 }
 
/*************************************main method********************************************/

 public static void main(String arg[])	
 {
 
  Scanner p=new Scanner();	
 	
 }
 		
	
}







