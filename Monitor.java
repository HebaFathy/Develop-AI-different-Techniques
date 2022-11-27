package Expert;
import javax.swing.*;
import java.awt.*;

public class Monitor
{
	public Monitor()
	{
	 try{
	 	 	
	  JTextArea t=new JTextArea();
      String select="Welcome to Modem Troubleshooter: "+"\n"+"***************************************"+"\n"+
                  "1- My display flickers or is garbled. "+"\n"+
                  "2- I cannot install my monitor."+"\n"+
                  "          Enter your Chooser \n"+
                  "          ********************";
      t.setForeground(new Color(30,91,136));
      t.setFont(new Font("DialogInput",Font.BOLD,12));
      t.setText(select);
      String choose=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);	
      
  /////////////////////////////////My display flickers or is garbled./////////////////////////////////////////    
      if(choose.equals("1"))
      {
      	t=new JTextArea();
        t.setFont(new Font("Monospaced",Font.PLAIN,12));
        select="Do you have a redraw problem? \n\n"+
                  "1- Yes ."+"\n"+
                  "2- No."+"\n"+
                  "3- I don't know\n";
                                     
       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose11=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);  
       
       if(choose11.equals("1")||choose11.equals("3"))
       {
        t=new JTextArea();
        t.setForeground(new Color(30,91,136));
        t.setFont(new Font("Monospaced",Font.PLAIN,12));
        select="Are your display settings appropriate for your hardware? "+"\n"+
               " Change your display setting:\n\n"+
               " 1- Open Display Properties in Control Panel."+"\n"+
               " 2- Click the Settings tab.\n"+
               " 3- If you are not in safe mode:\n"+
               "   # In Color quality, click a lower setting\n"+
               "   # Reduce the size of your desktop\n"+
               "   # Click Advanced, and check the Adapter and Monitor tabs for a Refresh Frequency setting\n\n"+
               "  Does changing your display settings solve the problem?\n"+
                 "      1- yes             \n"+
                 "      2- No \n"+
                 "      3- I want to skip this step\n";
                                     
        
        t.setText(select);
        String choose12=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);  
        
        if(choose12.equals("1"))
        {
        	exit();
        }
        else if(choose12.equals("2")||choose12.equals("3"))
        {
        	unable();
        }
       	
       }
   ///////////////////////////////////////NO//////////////////////////////////////////////////////    
      
       else if(choose11.equals("2"))
       {
       	t=new JTextArea();
       	t.setForeground(new Color(30,91,136));
        t.setFont(new Font("Monospaced",Font.PLAIN,12));
        select="Does Windows support your display adapter?\n\n"+
               " 1- Yes, Windows supports my display adapter."+"\n"+
               " 2- No, Windows doesn't support my display adapter.\n"+
               " 3- I want to skip this step.\n";
                                     
        
        t.setText(select);
        String choose13=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);
        
        if(choose13.equals("1")||choose13.equals("3"))
        {
         t=new JTextArea();
       	 t.setForeground(new Color(30,91,136));
         t.setFont(new Font("Monospaced",Font.PLAIN,12));	
         select="Reinstall the display adapter driver\n\n"+
         "Does reinstalling your display adapter driver solve the problem?\n\n"+
         "1- No, I still have a problem.\n"+
         "2- Yes, this solves the problem. \n"+
         "3- I want to skip this step.\n";
         t.setText(select);
         String choose14=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);
         
         if(choose14.equals("1")||choose14.equals("3"))
         {
          t=new JTextArea();
       	  t.setForeground(new Color(30,91,136));
          t.setFont(new Font("Monospaced",Font.PLAIN,12));
          
           select="Is the adapter hardware working?\n\n"+
                  "Your display adapter might be faulty.\n"+
                  "Contact the manufacturer of your display adapter for further testing procedures\n\n"+
                  "Is the manufacturer able to help you solve the problem?\n"+
                  "1- No, I still have a problem.\n"+
                  "2- Yes, the manufacturer helped me solve the problem.\n"+
                  "3- I want to skip this step.\n";
                  
                  
	      t.setText(select);
          String choose15=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);
         
          if(choose15.equals("1")||choose15.equals("3"))
          { 
           unable();	
          }
          else if(choose15.equals("2"))
          {
           exit();	
          }
         	
         }
         else if(choose14.equals("2"))	
         {
         	
          exit();	
         }
       
        }
        
        else /*if(choose13.equals("2"));*/
        {
        	
         unable();	
        	
        }
      }
       
       
    }
      
      
  ///////////////////////////////////////I cannot install my monitor///////////////////////////////////////     
      else if(choose.equals("2"))
      {
      	t=new JTextArea();
        t.setForeground(new Color(30,91,136));
        t.setFont(new Font("Monospaced",Font.PLAIN,12));
          
        select="Make sure that you use the right driver for your display adapter?\n\n"+
               "1- Open Display Properties in Control Panel.\n"+
               "2- Click the Settings tab, click Advanced, and then click the Adapter tab.\n"+
               "3- Click Properties, click the Driver tab, and then click Update Driver.\n"+
               "1- Click Install the software automatically and follow the wizard.\n\n"+
               "  Does this solve the problem\n"+    
               "   1- yes.\n"+
               "   2- NO.\n"+
               "   3- I want to skip this step.\n";
                  
                  
	    t.setText(select);
        String choose21=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);
      	
      	
      	//////////////////////////////////// NO ///////////////////////////////////////
      	if(choose21.equals("2")||choose21.equals("3"))
      	{
      		t=new JTextArea();
       	    t.setForeground(new Color(30,91,136));
           t.setFont(new Font("Monospaced",Font.PLAIN,12));
            select="Does Windows support your display adapter?\n\n"+
               " 1- Yes, Windows supports my display adapter."+"\n"+
               " 2- No, Windows doesn't support my display adapter.\n"+
               " 3- I want to skip this step.\n" ;
                                     
        
           t.setText(select);
           String choose22=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);
           
           if(choose22.equals("1")||choose22.equals("3"))
           {
           	 t=new JTextArea();
       	     t.setForeground(new Color(30,91,136));
             t.setFont(new Font("Monospaced",Font.PLAIN,12));
             
             select="Contact the manufacturer of your motherboard to find\n"+ 
             "out whether an updated BIOS is available.\n\n"+
             "Does obtaining an updated BIOS solve the problem?\n"+
               "   1- Yes"+"\n"+
               "   2- No\n"+
               "   3- I want to skip this step\n";
            t.setText(select);
            String choose23=JOptionPane.showInputDialog(null,t,"Monitor",JOptionPane.QUESTION_MESSAGE);
            
            if(choose23.equals("1"))
            {
            	exit();
            }
            else if(choose23.equals("2")||choose23.equals("3"))
            {
            	unable();
            }
           	
           }
           
           
           
           else if(choose22.equals("2"))
           {
           	exit();
           }
        
      	}
      	
      //////////////////////////////////// Yes ///////////////////////////////////////
      	else if(choose21.equals("1"))
      	{
      		exit();
      	}
      	
      }
     }
     catch(Exception ex)
     {}
	}
	
	
	
 ///////////////////////////////////////main function/////////////////////////////////////////////////	
	public static void main(String arg[])
	{
	  Monitor exs=new Monitor();	
	}
	
	
 /*======================================Functions====================================================*/
	
	public static void exit()
    {
  	
     JTextArea t=new JTextArea();
     t.setFont(new Font("Monospaced",Font.PLAIN,12));
 	 String select="\nYou are Welcome.\nThank you for using our Program.\n";                                                   
  	 t.setForeground(new Color(102,0,102));
  	 t.setText(select);
  	 JOptionPane.showMessageDialog(null,t,"Monitor",JOptionPane.PLAIN_MESSAGE);	
 	
   }
 
/////////////////////////////////////////////////////////////
   public static void unable()
 
   {
 	
 	JTextArea t=new JTextArea();
 	t.setFont(new Font("Monospaced",Font.PLAIN,12));
    String select="\nThis Program is unable to solve your problem. ";             
    t.setForeground(new Color(102,0,102));
    t.setText(select);
    JOptionPane.showMessageDialog(null,t,"Monitor",JOptionPane.PLAIN_MESSAGE);
 	
 	
   }
}