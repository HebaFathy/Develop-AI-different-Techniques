package Expert;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

public class Keyboard extends JFrame{ 
 	
	public  Keyboard(){
		
		try{
			
			JTextArea t=new JTextArea();
		    String select="Welcome to Keyboard Troubleshooter: "+"\n"+"***************************************"+"\n"+
		                  "Are my keyboard keys starting to stick: "+"\n"+
		                  "  1.Yes\n  2.No"+"\n"+
		                  "        Enter your Chooser \n"+
		                  "        ********************";
		    t.setForeground(new Color(30,91,136));
		    t.setFont(new Font("DialogInput",Font.BOLD,12));
		    t.setText(select);
		    t.setEditable(false);
		    String choose=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.QUESTION_MESSAGE);	
		      
		  /////////////////////////////////
		  
   if(choose.equals("1")){//1
   	
       t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       select="All you have to do is take off the keys one by one\n"+
       		  "and remove the dust beneath them.\n\n"+
       		  "Do this solve the problem? \n"+
              "   1- Yes\n"+
              "   2- No ";
       t.setForeground(new Color(30,91,136));
       t.setText(select);
       t.setEditable(false);
       String choose11=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.QUESTION_MESSAGE);  
     if(choose11.equals("1")){
     	
       exit();
  	 }
   	 /*--------------------------------------------------------------------------------*/
     else if(choose11.equals("2")){//11
     
   	   t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       t.setForeground(new Color(30,91,136));
       select="Are you having trouble logging back on to your computer after activating FilterKeys?\n\n"+
                  "you'll need to edit your registry from another computer,or from a second copy of\n"+
                  "Windows 2000 on your hard disk,in order to access your Windows 2000 installation\n"+
                  "so you can deactivate FilterKeys.\n\n"+
                  "Can you log on to your computer after you deactivate FilterKeys?\n"+
                  "   1- Yes\n"+
                  "   2- No\n"+
                  "   3- Skip this step";                                                              
        t.setText(select);
        t.setEditable(false);
        String choose12=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE);

       /*-------------------------------------------------------------------------------------------------*/
        if(choose12.equals("1")){
        	
   	      exit();
        }
        else if((choose12.equals("2"))||(choose12.equals("3"))){//12
        	
   	       t=new JTextArea();
	       t.setFont(new Font("Monospaced",Font.PLAIN,12));
	       t.setForeground(new Color(30,91,136));
	       select="Are you typing your password incorrectly because numerical lock is on?\n\n"+
	                  "Press NUM LOCK to toggle the numerical lock setting, and then try to log on again.\n"+
	                  "Can you type your password correctly when numerical lock is off?\n"+
	                  "  1- Yes,this solve the problem.\n"+
	                  "  2- No,I still have a problem typing my password.\n"+
	                  "  3- Skip this step";                                                              
	        t.setText(select);
	        t.setEditable(false);
	        String choose13=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE);
	        
       /*-------------------------------------------------------------------------------------------------*/
        if(choose13.equals("1")) {
        	
   	      exit();
        }
        else if((choose13.equals("2"))||(choose13.equals("3"))){//13
   	     
   	       t=new JTextArea();
	       t.setFont(new Font("Monospaced",Font.PLAIN,12));
	       t.setForeground(new Color(30,91,136));
	       select="Do sounds repeat continually after you press a key?\n\n"+
	                  "there may be an interrupt conflict on your computer.\n"+
	                  "To change your sound card interrupt setting:\n"+
	                  "  1.Open Device Manager, and then double-click Sound, video and game controllers.\n"+
	                  "  2.Right-click your sound card, click Properties, and then click the Resources tab.\n"+
	                  "  3.Click Interrupt Request.\n"+
	                  "  4.Clear the Use Automatic Settings check box.\n\n"+ 

	                  "After changing, do sounds continue to repeat after you press a key? \n"+
	                  "  1- No, sounds no longer repeat after I press a key.\n"+
	                  "  2- Yes, sounds continue to repeat after I press a key.\n"+
	                  "  3- Skip this step";                                                              
	        t.setText(select);
	        t.setEditable(false);
	        String choose14=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE); 
	        
	        if(choose14.equals("1")){
	        	
	        	exit();
			}
			else if((choose14.equals("2"))||(choose14.equals("3"))){//14
				
				t=new JTextArea();
			    t.setFont(new Font("Monospaced",Font.PLAIN,12));
			    t.setForeground(new Color(30,91,136));
			      
			    select="Are you using an APEX switch box? \n\n"+
			      "make sure your BIOS is version 1.9.0 or later. If you're using an earlier\n"+
			      "version contact the manufacturer for an updated BIOS.\n\n"+
			      "Do your keyboard function normally when you use APEX BIOS version 1.9.0 or later?\n"+
			      "  1- Yes,my keyboard work fine. \n"+
			      "  2- No,I still have a problem with my keyboard.Or,I'm not using an APEX switch box.\n"+
			      "  3- Skip this step";
			      
			    t.setText(select);
			    t.setEditable(false);
			   	String choose24=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE);
			   	  
			   	  if(choose24.equals("1")){
			   	  	
			   	  	exit(); 
			      }
			      else if((choose24.equals("2"))||(choose24.equals("3"))){
			   	   
			   	     unable();	
			   	 }
     		}//14
     	}//13
     }//12
  }//11
}//1

/*-----------------------------------------------------------------------------*/
else if(choose.equals("2")){//2
     
   	   t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));
       t.setForeground(new Color(30,91,136));
       select="Are you having trouble logging back on to your computer after activating FilterKeys?\n\n"+
                  "you'll need to edit your registry from another computer,or from a second copy of\n"+
                  "Windows 2000 on your hard disk,in order to access your Windows 2000 installation\n"+
                  "so you can deactivate FilterKeys.\n\n"+
                  "Can you log on to your computer after you deactivate FilterKeys?\n"+
                  "  1- Yes\n"+
                  "  2- No\n"+
                  "  3- Skip this step";                                                              
        t.setText(select);
        t.setEditable(false);
        String choose21=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE);

       /*-------------------------------------------------------------------------------------------------*/
        if(choose21.equals("1")){
        	
   	      exit();
        }
        else if((choose21.equals("2"))||(choose21.equals("3"))){//21
        	
   	       t=new JTextArea();
	       t.setFont(new Font("Monospaced",Font.PLAIN,12));
	       t.setForeground(new Color(30,91,136));
	       select="Are you typing your password incorrectly because numerical lock is on?\n\n"+
	                  "Press NUM LOCK to toggle the numerical lock setting, and then try to log on again.\n"+
	                  "Can you type your password correctly when numerical lock is off?\n"+
	                  "  1- Yes,this solve the problem.\n"+
	                  "  2- No,I still have a problem typing my password.\n"+
	                  "  3- Skip this step";                                                              
	        t.setText(select);
	        t.setEditable(false);
	        String choose22=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE);
	        
       /*-------------------------------------------------------------------------------------------------*/
        if(choose22.equals("1")) {
        	
   	      exit();
        }
        else if((choose22.equals("2"))||(choose22.equals("3"))){//22
   	     
   	       t=new JTextArea();
	       t.setFont(new Font("Monospaced",Font.PLAIN,12));
	       t.setForeground(new Color(30,91,136));
	       select="Do sounds repeat continually after you press a key?\n\n"+
	                  "there may be an interrupt conflict on your computer.\n"+
	                  "To change your sound card interrupt setting:\n"+
	                  "  1.Open Device Manager, and then double-click Sound, video and game controllers.\n"+
	                  "  2.Right-click your sound card, click Properties, and then click the Resources tab.\n"+
	                  "  3.Click Interrupt Request.\n"+
	                  "  4.Clear the Use Automatic Settings check box.\n\n"+ 

	                  "After changing, do sounds continue to repeat after you press a key? \n"+
	                  "  1- No, sounds no longer repeat after I press a key.\n"+
	                  "  2- Yes, sounds continue to repeat after I press a key.\n"+
	                  "  3- Skip this step";                                                              
	        t.setText(select);
	        t.setEditable(false);
	        String choose23=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE); 
	        
	        if(choose23.equals("1")){
	        	
	        	exit();
			}
			else if((choose23.equals("2"))||(choose23.equals("3"))){//23
				
				t=new JTextArea();
			    t.setFont(new Font("Monospaced",Font.PLAIN,12));
			    t.setForeground(new Color(30,91,136));
			      
			    select="Are you using an APEX switch box? \n\n"+
			      "make sure your BIOS is version 1.9.0 or later. If you're using an earlier\n"+
			      "version contact the manufacturer for an updated BIOS.\n\n"+
			      "Do your keyboard function normally when you use APEX BIOS version 1.9.0 or later?\n"+
			      "  1- Yes,my keyboard work fine. \n"+
			      "  2- No,I still have a problem with my keyboard.Or,I'm not using an APEX switch box.\n"+
			      "  3- Skip this step";
			      
			    t.setText(select);
			    t.setEditable(false);
			   	String choose24=JOptionPane.showInputDialog(null,t,"Keyboard",JOptionPane.INFORMATION_MESSAGE);
			   	  
			   	  if(choose24.equals("1")){
			   	  	
			   	  	exit(); 
			      }
			      else if((choose24.equals("2"))||(choose24.equals("3"))){
			   	   
			   	     unable();	
			   	 }
     		}//23
     	}//22
     }//21
    }//2
	}//try
	catch(Exception e){

	//	JOptionPane.showMessageDialog(null,"Error .","Keyboard",JOptionPane.PLAIN_MESSAGE);	
	}
}
/*======================================Functions==========================================*/ 
 public void exit(){
  	
  JTextArea t=new JTextArea();
  t.setFont(new Font("Monospaced",Font.PLAIN,12));
  t.setForeground(new Color(30,91,136));
  
  String select="\nYou are Welcome.\nThank you for using our Program.\n";                
  t.setText(select);
  t.setEditable(false);
  JOptionPane.showMessageDialog(null,t,"Keyboard",JOptionPane.PLAIN_MESSAGE);	
 	
 }
 
/////////////////////////////////////////////////////////////
 public  void unable(){
 	
 	JTextArea t=new JTextArea();
 	t.setFont(new Font("Monospaced",Font.PLAIN,12));
 	t.setForeground(new Color(30,91,136));
 	
    String select="\nThis Program is unable to solve your problem. ";      
    t.setText(select);
    JOptionPane.showMessageDialog(null,t,"Keyboard",JOptionPane.PLAIN_MESSAGE);
 	
 	
 }
 
 /////////////////////////////////////////////////////////////////////////	
 public static void main(String arg[]){
 
  Keyboard p=new Keyboard();
  p.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
 	
 }
	
}