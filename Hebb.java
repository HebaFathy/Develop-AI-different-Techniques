package ai;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.DecimalFormat;


public class Hebb extends JFrame implements ActionListener { 	
 
 DecimalFormat d = new DecimalFormat("#,###,##0.0");
 
 //inputs 	
 double x1[];
 double x2[];
 double x3[];
 int choose;
 //wieghts
 double w1[];
 double w2[];
 double w3[];
 double w4[];
 
 //nets
 double net1=0;
 double net2=0;
 double net3=0;
 
 //output
 double o1=0;
 double o2=0;
 double o3=0;
 
 //desired
 double desired1;
 double desired2;
 double desired3;
 
 boolean supervised;
 
 //error rate
 double er;
 
 //Buttons
 private JButton sup=new JButton("Supervised");
 private JButton unsup=new JButton("Unsupervised");
 private JButton ok=new JButton("OK");
 private JButton ok_sup=new JButton("OK");
 private JButton exit=new JButton("Exit");
 
  
 //JTextField
 JTextField t1;
 JTextField t2;
 JTextField t3;
 
 JTextField d1;
 JTextField d2;
 JTextField d3;
 
 JTextField error;
 
 //..............................//
 //Colors ,containers & fonts 
 private Font font=new Font("Serif",Font.PLAIN+Font.BOLD,13);
 Color color1=new Color(43,118,154);
 Color color2=new Color(164,185,207);
 
 Container c; 
 JFrame frame;
 ///----------------------------------///--------------------------------///----------------------------------
    
 public Hebb(double vector1[],double vector2[],double vector3[],int function )
 {
    //inputs
   x1= vector1;
   x2= vector2;
   x3= vector3;   
   choose=function;
   //interface
   c=getContentPane();
   
   JLabel title =new JLabel("Hebbean");
   
   title.setForeground(Color.white);
   title.setFont( font);
   
   JPanel title_Panel=new JPanel();   
   title_Panel.setBackground(color1);   
   title_Panel.add(title);
   
   JPanel buttons =new JPanel();
  // buttons.setLayout(new GridLayout(2,1));   
   buttons.setBackground(color2);   
   buttons.add(sup);
   buttons.add(unsup);
   
   //c.add(title_Panel,BorderLayout.EAST);
   c.add(buttons,BorderLayout.CENTER);
   
   
   setSize(400,130);
   setTitle("Neural Network");
   setVisible(true);
   setResizable(false);
   setBackground(color1);
      
   //action Listeners
   unsup.addActionListener(this);
   sup.addActionListener(this);	
   ok.addActionListener(this);	
   ok_sup.addActionListener(this);
   exit.addActionListener(this);		
 }
 
 /////////////////////////////////////ActionPerformed /////////////////////////////////////////////
 public void actionPerformed(ActionEvent e)
 {
   if(e.getSource()==unsup)
   {
   	
    t1=new JTextField(3);
    t2=new JTextField(3);
    t3=new JTextField(3);
    //ok=new JButton("OK");
    
    frame=new JFrame();   
   	Container c=frame.getContentPane();
   	c.setBackground(color1);
   	
   	//wieght
   	JLabel prompt =new JLabel("Please Insert First wieght vector");
   	prompt.setFont(new Font("Serif",Font.PLAIN,14));
   	prompt.setForeground(color1);   	
   	
   	JPanel north=new JPanel();
   	north.add(prompt);
   	
   	
   	JPanel w=new JPanel();
   	w.setBackground(color1);
   	w.add(t1);
   	w.add(t2);
   	w.add(t3);
   	
   	JPanel ok_Panel=new JPanel();
   	ok_Panel.setBackground(color1);
   	ok_Panel.add(ok);
   	ok_Panel.add(exit);
   	
   	c.add(north,BorderLayout.NORTH);
   	c.add(w,BorderLayout.CENTER);
   	c.add(ok_Panel,BorderLayout.SOUTH);
   	
    this.setVisible(false);   	
   	frame.setTitle("Unsupervised Learning");
   	frame.setSize(400,130);    
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setBackground(color1);
      
   	
   }
   
   if(e.getSource()==ok)
   {
   	 
   	 w1=new double[3];
   	 w2=new double[3];
   	 w3=new double[3];
   	 w4=new double[3];
   	 
   	 w1[0]=Double.parseDouble(t1.getText());
   	 w1[1]=Double.parseDouble(t2.getText());
   	 w1[2]=Double.parseDouble(t3.getText());
   	
   	 
   	 for(int i=0;i<w1.length;i++)
   	  net1+=w1[i]*x1[i];   
   	 
   	 
   	 if(choose==1) 
   	  o1=sig(net1);
   	 else if(choose==2)
   	  o1=bipolar(net1);
   	 else if(choose==3)
   	  o1=linear(net1);
   	 else if(choose==4)  
   	  o1=sine(net1);   	 
   	 
   	 
   	 
   	 for(int i=0;i<x1.length;i++)   	  
   	  	x1[i]=x1[i]*o1;
   	 	 
   	 
   	 for(int i=0;i<x1.length;i++)
   	  w2[i]=w1[i]+x1[i];
   	  
   	 //------------------------------------------------------//
   	 for(int i=0;i<w1.length;i++)
   	  net2+=w2[i]*x2[i];
   	 
   	 
   	 if(choose==1) 
   	  o2=sig(net2);
   	 else if(choose==2)
   	  o2=bipolar(net2);
   	 else if(choose==3)
   	  o2=linear(net2);
   	 else if(choose==4)  
   	  o2=sine(net2);
   	    	   
   	 for(int i=0;i<x2.length;i++)
   	   x2[i]=x2[i]*o2;    	    
   	   
   	 
   	 for(int i=0;i<x2.length;i++)
   	   w3[i]=w2[i]+x2[i];
   	  
   	 //----------------------------------------------------//
   	 
   	 for(int i=0;i<w1.length;i++)
   	  net3+=w3[i]*x3[i];
   	 
   	 
   	 if(choose==1) 
   	  o3=sig(net3);
   	 else if(choose==2)
   	  o3=bipolar(net3);
   	 else if(choose==3)
   	  o3=linear(net3);
   	 else if(choose==4)  
   	  o3=sine(net3);
   	 
   	  
   	 for(int i=0;i<x2.length;i++)
   	  x3[i]=x3[i]*o3; 
   	 
   	 for(int i=0;i<x2.length;i++)
   	  w4[i]=w3[i]+x3[i];
   	    
   	 JTextArea text=new JTextArea();   	 
   	 text.setBackground(color1);
   	 text.setForeground(Color.white);
   	 text.setFont(font);
   	 
   	 String output="               *Results*   "+"\n"
   	               +" net1= "+d.format(net1)+"     *output1= "+o1+"\n"+" net2= "+d.format(net2)+"    *output2= "+o2+"\n"+" net3= "+d.format(net3)+"    *otuput3= "+o3+" \n\n"
   	               +" * w1= [ "+d.format(w1[0])+"  "+d.format(w1[1])+"  "+d.format(w1[2])+" ]"+"\n"
   	               +" * w2= [ "+d.format(w2[0])+"  "+d.format(w2[1])+"  "+d.format(w2[2])+" ]"+"\n"
   	               +" * w3= [ "+d.format(w3[0])+"  "+d.format(w3[1])+"  "+d.format(w3[2])+" ]"+"\n"
   	               +" * w4= [ "+d.format(w4[0])+"  "+d.format(w4[1])+"  "+d.format(w4[2])+" ]"+"\n";
   	 
   	 text.setText(output);
   	 text.setEditable(false);
	 JOptionPane.showMessageDialog(null,text,"Results",JOptionPane.INFORMATION_MESSAGE);	
   	 
   }
   
   //........................................................................................//
   if(e.getSource()==sup)
   {
   	
   	frame=new JFrame();   
   	Container c=frame.getContentPane();
   	c.setBackground(color1);   	
   	
   	JLabel l1=new JLabel("Wieghts :");
   	JLabel l2=new JLabel("Desired :");
   	JLabel l3=new JLabel("Error :");
   	
   	l1.setForeground(Color.white);
   	l2.setForeground(Color.white);
   	l3.setForeground(Color.white);
   	
   	l1.setFont(font);
   	l2.setFont(font);
   	l3.setFont(font);
   	
   	t1=new  JTextField(3); 
   	t2=new  JTextField(3); 
   	t3=new  JTextField(3);
   	
   	d1=new  JTextField(3); 
   	d2=new  JTextField(3); 
   	d3=new  JTextField(3);
   	
   	error=new  JTextField(3);  	   	 
    
    JPanel w=new JPanel();
   	JPanel des=new JPanel();
   	JPanel err=new JPanel(); 
    
    w.setBackground(color1);
    w.add(l1);
    w.add(t1);
    w.add(t2);
    w.add(t3);
    
    des.setBackground(color1);
    des.add(l2);
    des.add(d1);
    des.add(d2);
    des.add(d3);
    
    
    err.setBackground(color1);
    err.add(l3);
    err.add(error);
    err.add(ok_sup);
    err.add(exit);
    
    c.add(w,BorderLayout.NORTH);
    c.add(des,BorderLayout.CENTER);
    c.add(err,BorderLayout.SOUTH);
       		
   	this.setVisible(false);   	
   	frame.setTitle("Supervised Learning");
   	frame.setSize(300,150);    
    frame.setVisible(true);
    frame.setResizable(false);
    frame.setBackground(color1);
   	
   }
   
   if(e.getSource()==ok_sup)
   {
   	
   	w1=new double[3];
    w2=new double[3];
    w3=new double[3];
   	w4=new double[3];
   	
   	w1[0]=Double.parseDouble(t1.getText());
   	w1[1]=Double.parseDouble(t2.getText());
   	w1[2]=Double.parseDouble(t3.getText());
   	
   	
   	desired1=Double.parseDouble(d1.getText());   	
   	desired2=Double.parseDouble(d2.getText());   	
   	desired3=Double.parseDouble(d3.getText());   	
   	er =Double.parseDouble(error.getText());
   	
   	
   	for(int i=0;i<w1.length;i++)
   	  net1+=w1[i]*x1[i];
   	System.out.println(net1); 
   	
   	if(choose==1) 
   	  o1=sig(net1);
   	 else if(choose==2)
   	  o1=bipolar(net1);
   	 else if(choose==3)
   	  o1=linear(net1);
   	 else if(choose==4)  
   	  o1=sine(net1);  
   	
   	
   	for(int i=0;i<x1.length;i++)   	
   	 x1[i]=x1[i]*(er*(desired1-o1)); 
   	    
   	 
   	for(int i=0;i<x1.length;i++)
   	 w2[i]=w1[i]+x1[i]; 
   	 
   	//-------------------------------------------------------------//
   	
   	 for(int i=0;i<w2.length;i++)
   	  net2+=w2[i]*x2[i];
   	  
   	 if(choose==1) 
   	  o2=sig(net2);
   	 else if(choose==2)
   	  o2=bipolar(net2);
   	 else if(choose==3)
   	  o2=linear(net2);
   	 else if(choose==4)  
   	  o2=sine(net2);  
   	
   	for(int i=0;i<x2.length;i++)
   	
   	{ 
   	  x2[i]=x2[i]*(er*(desired2-o2));  
   	  
    }	
   	 
   	for(int i=0;i<x2.length;i++)
   	 w3[i]=w2[i]+x2[i];
   	 
   	//------------------------------------------------------------//
   	
   	for(int i=0;i<w3.length;i++)
   	  net3+=w3[i]*x3[i];
   	  
   	 if(choose==1) 
   	  o3=sig(net3);
   	 else if(choose==2)
   	  o3=bipolar(net3);
   	 else if(choose==3)
   	  o3=linear(net3);
   	 else if(choose==4)  
   	  o3=sine(net3);  
   	
   	for(int i=0;i<x3.length;i++)
   	 x3[i]=x3[i]*(er*(desired3-o3));  
   	 
   	for(int i=0;i<x3.length;i++)
   	 w4[i]=w3[i]+x3[i];
   	
   	
   	 JTextArea text=new JTextArea();   	 
   	 text.setBackground(color1);
   	 text.setForeground(Color.white);
   	 text.setFont(font);
   	 
   	 String output="               *Results*   "+"\n"
   	               +" net1= "+d.format(net1)+"     *output1= "+d.format(o1)+"\n"+" net2= "+d.format(net2)+"    *output2= "+d.format(o2)+"\n"+" net3= "+d.format(net3)+"    *otuput3= "+d.format(o3)+" \n\n"
   	               +" * w1= [ "+d.format(w1[0])+"  "+d.format(w1[1])+"  "+d.format(w1[2])+" ]"+"\n"
   	               +" * w2= [ "+d.format(w2[0])+"  "+d.format(w2[1])+"  "+d.format(w2[2])+" ]"+"\n"
   	               +" * w3= [ "+d.format(w3[0])+"  "+d.format(w3[1])+"  "+d.format(w3[2])+" ]"+"\n"
   	               +" * w4= [ "+d.format(w4[0])+"  "+d.format(w4[1])+"  "+d.format(w4[2])+" ]"+"\n";
   	 
   	 text.setText(output);
   	 text.setEditable(false);
	 JOptionPane.showMessageDialog(null,text,"Results",JOptionPane.INFORMATION_MESSAGE);	   
   }
   
   if(e.getSource()==exit)
   {
   	
     frame.setVisible(false);	
   	
   }
   	
 	
 }
 
 ///////////////////////////////////////sigmoid Function/////////////////////////////////////////////
 
 public double sig(double net)
 {
   
   return 1/(1+Math.exp(-net));	
  	
 }
 

 /////////////////////////////////////// Bipolar Function/////////////////////////////////////////////
 public double bipolar(double net)
 {
 	
  if(net>0)
   return 1;
  else 
   return -1;
    	
 	
 }
 
 /////////////////////////////////////////Linear Function/////////////////////////////////////////////
 public double linear(double net)
 {
 
   return net;
  
 }
 
 /////////////////////////////////////////Sine Function/////////////////////////////////////////////
 public double sine(double net)
 {
 
   return Math.sin(net);
  
 }
 
 
 ///////////////////////////////////////////////////////////////////////////////////////////////
 public static void main(String arg[])
 {
  
  double v1 []={1,-2,0};
  double v2 []={0,1.5,-.5};
  double v3 []={-1,1,0.5};
  
  Hebb h=new Hebb(v1,v2,v3,2);	
 	
 }
	
	
}