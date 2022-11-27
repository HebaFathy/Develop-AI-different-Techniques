package Expert;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Printer extends JFrame
{
 
 	
 public  Printer()
 {
  try
  {	
   JTextArea t=new JTextArea();
   String select="Welcome to Printer Troubleshooter: "+"\n"+"***************************************"+"\n"+
                  " 1- I can't install a local printer. "+"\n"+
                  " 2- Printing is unusually slow. "+"\n"+
                  " 3- Some of the features that came with my printer don't work. \n"+
                  "                 Enter your Chooser \n"+
                  "                 ********************";
   t.setForeground(new Color(30,91,136));
   t.setFont(new Font("DialogInput",Font.BOLD,12));
   t.setText(select);
   String choose=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.QUESTION_MESSAGE);
   
 //////////////////////////////I can't install a local printer///////////////////////////////////////////////
  
   if(choose.equals("1"))
   {
       t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       select="To install a local printer: "+"\n"+
                  "  1- You want to install a new one.\n"+
                  "  2- You want to replace the old Printer.\n";
       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose1=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.QUESTION_MESSAGE);  
     if(choose1.equals("1"))
     {
       t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       t.setForeground(new Color(30,91,136));
       select="To replace old printer: \n\n"+
                  " 1- In the Printers and Faxes folder, double-click Add Printer \n"+
                  " 2- If your printer is Plug and Play\n"+
                     "      select the Automatically detect and install my Plug and Play printer check box.\n"+
                  " 3- If your printer is not Plug and Play\n"+
                     "      select your manufacturer and printer from the lists in the wizard. \n\n"+
                  
                  "Does using the correct driver solve the problem? \n\n"+
                  "  1- yes \n"+
                  "  2- No \n"+
                  "  3- I want to skip this setp";                                                   
                  
        
        t.setText(select);
        String choose12=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
      
       /*-------------------------------------------------------------------------------------------------*/
        if(choose12.equals("1"))   
        {
   	      exit();
        }
        else if(choose12.equals("2")||choose12.equals("3"))   
        {
   	      unable();
	
   	 }
  }
   	 /*--------------------------------------------------------------------------------*/
     else if(choose1.equals("2"))   
     {
   	   t=new JTextArea();
   	   t.setForeground(new Color(30,91,136));
   	   t.setFont(new Font("Monospaced",Font.PLAIN,12));
   	   
       select="To replace old printer: \n"+
                  "  1- Click Start \n"+
                  "  2- Click Control Panel \n"+
                  "  3- Click Printers and Other Hardware, and then click Printers and Faxes. \n"+
                  "  4- Right-click the icon of Printers and Faxes , click Delete, and then click Yes\n"+
                  "  5- On the File menu, click Server Properties, and then click the Drivers tab \n"+
                  "  6- Under Installed printer drivers, If you see a driver for your printer, click it, click Remove, and then click Yes.\n"+
                  "  7- If more than one driver is installed for your printer, repeat step 6 for each driver. \n\n"+
                  "Does using the correct driver solve the problem? \n\n"+
                  "  1- yes\n"+
                  "  2- No\n"+
                  "  3- I want to skip this step";                                                   
                  
        
        t.setText(select);
        String choose12=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
      
       /*-------------------------------------------------------------------------------------------------*/
        if(choose12.equals("1"))   
        {
   	      exit();
        }
        else if(choose12.equals("2")||choose12.equals("3"))   
        {
   	     
   	     unable(); 
        }
     }
 	
  }
  
 /////////////////////////////////Printing is unusually slow///////////////////////////////////////////////////
  else if(choose.equals("2"))
  {
  	t=new JTextArea();
    t.setForeground(new Color(30,91,136));
   	t.setFont(new Font("Monospaced",Font.PLAIN,12));
   	
    select="Are you printing to a network printer or a local printer? \n"+
           "  1- Local printer \n"+
           "  2- Network printer \n\n " ;   
    t.setText(select);
    String choose21=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
   
   /*------------------Local printer-----------------------------------*/
   if(choose21.equals("1"))
   {
   	t=new JTextArea();
    t.setFont(new Font("Monospaced",Font.PLAIN,12));
    t.setForeground(new Color(30,91,136));
    
   	select="Free Some space on your hard disk?\n\n"+
   	       "Does freeing disk space solve the problem? \n\n"+
   	       "  1- No,I have enough disk space, but I still have a problem \n"+
   	       "  2- Yes, this solves the problem.\n"+
   	       "  3- I want to skip this step";
 	
     t.setText(select);
   	 String choose22=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
   	
   	 if(choose22.equals("1")||choose22.equals("3"))
   	 {
   	  t=new JTextArea();
      t.setFont(new Font("Monospaced",Font.PLAIN,12));
      t.setForeground(new Color(30,91,136));
      
      select="Change your spooler settings \n\n"+
      "Does changing your spooler settings solve the problem? \n\n"+
      "  1- No, this does not solve the problem. Or, I do not have print spooling turned on.\n"+
      "  2- Yes, this solves the problem.\n"+
      "  3- I want to skip this step";
      
      t.setText(select);
   	  String choose23=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
   	  
   	  if(choose23.equals("1")||choose23.equals("3"))
   	  {
   	   t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       t.setForeground(new Color(30,91,136));
       
       select="Is your hard disk excessively fragmented? \n\n"+
              "To clean up a hard disk : \n" +
              "  1- Click Start, point to All Programs, point to Accessories, point to System Tools,click Disk Defragmenter. \n"+
              "  2- Click your hard disk in the list, and then click Analyze to have Windows examine your hard disk.\n"+
              "  3- If you receive a message that recommends that you defragment your disk, click Defragment. \n\n"+
              "Does defragmenting your hard disk solve the problem?\n\n"+
              "  1- No, printing is still slow. \n"+
              "  2- Yes, printing is faster.\n"+
              "  3- I want to skip this step";
              
              

       t.setText(select);
   	   String choose24=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
   	   
   	   if(choose24.equals("1")||choose24.equals("3"))
   	   {
   	     unable();	
   	   	
   	   }
   	   
   	   else if(choose24.equals("2"))
   	   
   	   { 	     
   	     exit();  	   	
   	   }
 
      	
   	  }
   	  
   	  else if(choose23.equals("2"))
   	  {
   	    
   	    exit();	
   	  	
   	  }
   	  	
   }
   	
   	else if(choose22.equals("2"))
   	{
   	 exit();	
   	}
  }
  
  
 /*------------------Network Printer--------------------------------------*/
   else if(choose21.equals("2"))
   { 
     t=new JTextArea();
     t.setFont(new Font("Monospaced",Font.PLAIN,12));
     t.setForeground(new Color(30,91,136));
     
     select="Have you checked the print queue? \n\n"+
            "Can you print without problems when the print queue is cleared?\n\n"+
            "  1- No, I am still having a problem.\n"+
            "  2- Yes, this solves the problem.\n"+
            "  3- I want to skip this step";
     
     t.setText(select);
   	 String choose25=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
    
    if(choose25.equals("1")||choose25.equals("3"))
    {
    
     t=new JTextArea();
     t.setFont(new Font("Monospaced",Font.PLAIN,12));
     t.setForeground(new Color(30,91,136));
     
     select="Does the file or graphic that you are trying to print require too much memory? \n\n"+
            "  1- Save the document and paste a section of the document into a new file \n"+
            "  2- If you are unable to print graphics : \n"+
            "      a.paste one of the graphics into the new file. \n"+
            "      b.Close all files except the new file and try to print \n\n"+
            "  3-If you can print, your original document might require more memory than your computer has \n"+
            "      a.Quit any other programs that you are running.\n"+
            "      b.Close all documents except the one that you are trying to print\n"+
            "      c.Quit all open programs and then restart your computer.\n"+
            "      d.Make sure you have sufficient free disk space on your hard drive\n\n"+
            "Does freeing memory on your computer solve the problem?\n\n"+
            "  1- No, I still have a problem. Or, I cannot print my text or graphics\n"+
            "  2- Yes, this solves the problem.\n"+
            "  3- I want to skip this step";


     t.setText(select);
   	 String choose26=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
   	 
   	 if(choose26.equals("1")||choose26.equals("3"))
   	 
   	 {
   	 	unable();   	   	
   	 }
   	 
   	 else if(choose26.equals("2"))
   	 {
   	  
   	  exit();	
   	 }	
    }
    
    else if(choose25.equals("2"))
    {
    
     exit();	
    	
    }
    
   }
   
     
}
 //////////////////////////// some of the features that came with my printer don't work/////////
 else if(choose.equals("3"))
 {
 	
 	t=new JTextArea();
    t.setFont(new Font("Monospaced",Font.PLAIN,12));
    t.setForeground(new Color(30,91,136));
    
    select="Are you using a printer driver that was provided by the printer manufacturer?\n\n"+
           "Contact the printer manufacturer to obtain an updated printer driver that is\n"+
           "compatible with your OS.\n"+
           "Then use the Add Printer Driver Wizard to install it.\n\n"+
           "Does installing the printer manufacturer's driver solve the problem?\n\n"+
           "   1- No, some of my printer features are still missing\n"+
           "   2- Yes, this solves the problem.\n"+
           "   3- I want to skip this step";
           
           
    t.setText(select);
   	String choose31=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.INFORMATION_MESSAGE);
   	
   	if(choose31.equals("1")||choose31.equals("3"))
   	{
   	
   	 unable();	
   	}
   	
   	else if(choose31.equals("2"))
   	{
   	 
   	 exit();	
   	}
   	        
 	
  }
  }
  catch(Exception ex)
  {}
 
 
 /*======================================Functions==========================================*/
 }
 
 public  void exit()
 {
  	
  JTextArea t=new JTextArea();
  t.setFont(new Font("Monospaced",Font.PLAIN,12));
  t.setForeground(new Color(102,0,102));
  
  String select="\nYou are Welcome.\nThank you for using our Program.\n";                
  t.setText(select);
  JOptionPane.showMessageDialog(null,t,"Printer",JOptionPane.PLAIN_MESSAGE);	
 	
 }
 
/////////////////////////////////////////////////////////////
 public  void unable()
 
 {
 	
 	JTextArea t=new JTextArea();
 	t.setFont(new Font("Monospaced",Font.PLAIN,12));
 	t.setForeground(new Color(102,0,102));
 	
    String select="\nThis Program is unable to solve your problem. ";      
    t.setText(select);
    JOptionPane.showMessageDialog(null,t,"Printer",JOptionPane.PLAIN_MESSAGE);
 	
 	
 }
 
 /////////////////////////////////////////////////////////////////////////	
 public static void main(String arg[])	
 {
 
   Printer p=new Printer();	
  	
 }
	
}