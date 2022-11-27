package ai;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

public class Neural extends JFrame implements ActionListener 

{
 public int function=0;
 public int learn=0;
 
 public double []vector1=new double[3];
 public double []vector2=new double[3];
 public double []vector3=new double[3];
 
 //title
 private JLabel title=new JLabel("Artificial Neural Network");
 private JPanel title_Panel =new JPanel();
 private Font font=new Font("Marigold",Font.BOLD,18);

 //input labels
 private JLabel x1=new JLabel("x1");
 private JLabel x2=new JLabel("x2");
 private JLabel x3=new JLabel("x3");
 
 //inputs TextFields
 //vector 1
 private JTextField v1_x1=new JTextField(2);
 private JTextField v1_x2=new JTextField(2);
 private JTextField v1_x3=new JTextField(2);
 
 //vector 2
 private JTextField v2_x1=new JTextField(2);
 private JTextField v2_x2=new JTextField(2);
 private JTextField v2_x3=new JTextField(2);
 
 
 //vector 3
 private JTextField v3_x1=new JTextField(2);
 private JTextField v3_x2=new JTextField(2);
 private JTextField v3_x3=new JTextField(2);
 
 
 //inputs panel and Border
 private JPanel inputs=new JPanel(new FlowLayout());

 //.....................................//

 //Learning Methods
 //Learning Methods Radio Buttons
 private JRadioButton back=new JRadioButton("Back Propogated");
 private JRadioButton win=new JRadioButton("Windraw Hoff");
 private JRadioButton delta=new JRadioButton("Delta");
 private JRadioButton hebb=new JRadioButton("Hebbean");
 private JRadioButton vanilla=new JRadioButton("Vanilla");
 private ButtonGroup radio_Learn=new ButtonGroup();
 //Learning Methods Panel
 private JPanel Learning =new JPanel(); 

 //..............................//
 //Colors
 Color color1=new Color(43,118,154);
 Color color2=new Color(164,185,207);
 
 //.............................//
 //Activation Functions
 private JRadioButton Sigmoid=new JRadioButton("Sigmoid   ");
 private JRadioButton Bipolar=new JRadioButton("Bipolar   ");
 private JRadioButton linear=new JRadioButton("Linear   ");
 private JRadioButton sine=new JRadioButton("Sine   ");
 private ButtonGroup radio_Activation=new ButtonGroup();
 
 //activation function panel
 private JPanel activation =new JPanel();

 //...............................// 
 //Center Panel
 private JPanel center =new JPanel();
 
 //South Panel 
 private JPanel south =new JPanel();
 
 //Buttons 
 private JButton start=new JButton("Start");  
 private JButton exit=new JButton("Exit");
 
 public Neural()
 {

    Container c=getContentPane();
    c.setLayout(new BorderLayout());

 
    title.setFont(font);
    title.setForeground(Color.white);
    title_Panel.add(title);
    title_Panel.setBackground(color1);


    inputs.setLayout(new GridLayout(3,4,10,15));
    inputs.setBorder(new TitledBorder("Inputs"));
    inputs.setBackground(color2);
    inputs.add(x1);
    inputs.add(v1_x1);
    inputs.add(v2_x1);
    inputs.add(v3_x1);
    inputs.add(x2);
    inputs.add(v1_x2);
    inputs.add(v2_x2);
    inputs.add(v3_x2);
    inputs.add(x3);
    inputs.add(v1_x3);
    inputs.add(v2_x3);
    inputs.add(v3_x3);

   //change label colors
    x1.setForeground(color1);
    x2.setForeground(color1);
    x3.setForeground(color1);

 	//add radio to learninig panel
    Learning.setLayout(new GridLayout(4,1,5,5));
    Learning.setBorder(new TitledBorder("Learning Methods"));
    Learning.setBackground(color2);
    Learning.add(back);
    Learning.add(win);
    Learning.add(delta);
    Learning.add(hebb);
    //Learning.add(vanilla);

    //change colors of radio buttons
    back.setBackground(color1);
    back.setForeground(color2);
    win.setBackground(color1);
    win.setForeground(color2);
    delta.setBackground(color1);
    delta.setForeground(color2);
    hebb.setBackground(color1);
    hebb.setForeground(color2);
    vanilla.setBackground(color1);
    vanilla.setForeground(color2);

    //add radio to button group
    radio_Learn.add(back);
    radio_Learn.add(win);
 	radio_Learn.add(delta);
 	radio_Learn.add(hebb);
 	//radio_Learn.add(vanilla);
    
    //add radio to activation panel
    activation.setLayout(new GridLayout(4,1,5,5));
    activation.setBorder(new TitledBorder("Activation Functions"));
    activation.setBackground(color2);
    activation.add(Sigmoid);
    activation.add(Bipolar);
    activation.add(linear);
    activation.add(sine);
    
    //add radio to button group
    radio_Activation.add(Sigmoid);
    radio_Activation.add(Bipolar);
    radio_Activation.add(linear);
    radio_Activation.add(sine);
    
    //change colors of radio buttons
    Sigmoid.setBackground(color1);
    Sigmoid.setForeground(color2);
    Bipolar.setBackground(color1);
    Bipolar.setForeground(color2);
    linear.setBackground(color1);
    linear.setForeground(color2);
    sine.setBackground(color1);
    sine.setForeground(color2);
    
    
    //center.setLayout(new GridLayout(2,2));
    center.add(inputs);
 	center.add(Learning);
 	center.add(activation);
 	center.setBackground(color2);
 	
 	//add bbutons to south panel
 	south.add(start);
 	south.add(exit);
 	south.setBackground(color1);

 	c.add(title_Panel,BorderLayout.NORTH);
 	c.add(center,BorderLayout.CENTER);
 	c.add(south,BorderLayout.SOUTH);
 	//c.add(center,BorderLayout.SOUTH);

    setSize(550,300);
    setTitle("Neural Network");
 	setVisible(true);
 	setResizable(false);
 	setBackground(color1);
 	
 	JTextArea text=new JTextArea();
 	text.setBackground(color1);
 	text.setForeground(Color.white);
 	text.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,13));
 	
 	String s="               Welcome to Artificial Neural Network          \n\n"+
 	          "1- Please Insert Inputs ..(x1,x2,x3) \n"+
 	          "2- Choose The Suitable  Learning Method \n"+
 	          "3- Choose The Suitable  Activition Function\n\n";
 	text.setText(s);          
 	JOptionPane.showMessageDialog(null,text,"Help",JOptionPane.INFORMATION_MESSAGE);
 	
 	//add ActionListeners to components
 	//text fields
 	v1_x1.addActionListener(this);
 	v1_x2.addActionListener(this);
 	v1_x3.addActionListener(this);
 	
 	v2_x1.addActionListener(this);
 	v2_x2.addActionListener(this);
 	v2_x3.addActionListener(this);
 	
 	v3_x1.addActionListener(this);
 	v3_x2.addActionListener(this);
 	v3_x3.addActionListener(this);
 	
 	//radio buttons
 	back.addActionListener(this);
 	win.addActionListener(this);
 	delta.addActionListener(this);
    hebb.addActionListener(this);
    
    Sigmoid.addActionListener(this);
    Bipolar.addActionListener(this);
    linear.addActionListener(this);
    sine.addActionListener(this);
    
    start.addActionListener(this);
    exit.addActionListener(this);
 }
 
 //--------------------actionPerformed Function --------------------------------------//
 public void actionPerformed (ActionEvent e)
 {
 	
   if(e.getSource()==back)
    learn=1;
   else if(e.getSource()==win) 
    learn=2;	
   else if(e.getSource()==delta)	
 	learn=3;
   else if(e.getSource()==hebb)	
 	learn=4;
   
   //------------------------------------------------------------------	
   if(e.getSource()==Sigmoid)
    function=1;
   else if(e.getSource()==Bipolar)  	
 	function=2;
   else if(e.getSource()==linear)
    function=3;
   else if(e.getSource()==sine) 
    function=4;
   
   //-----------------------------------------------------------------
   if(e.getSource()==start)
   {     	
   	
   	//first vector
   	vector1[0]=Double.parseDouble(v1_x1.getText());   
   	vector2[0]=Double.parseDouble(v1_x2.getText());  
   	vector3[0]=Double.parseDouble(v1_x3.getText());   
   	
   	System.out.println();
   	//Second vector
   	vector1[1]=Double.parseDouble(v2_x1.getText());  
   	vector2[1]=Double.parseDouble(v2_x2.getText()); 
   	vector3[1]=Double.parseDouble(v2_x3.getText());  
   	System.out.println();
   	
   	//Third vector
   	vector1[2]=Double.parseDouble(v3_x1.getText());  
   	vector2[2]=Double.parseDouble(v3_x2.getText());  
   	vector3[2]=Double.parseDouble(v3_x3.getText());  
   	
   	
   	switch(learn)
   	{
   		
   	 case 1:   	 
   	  BackPro b=new  BackPro(vector1,vector2,vector3);
   	 break;	
     
     case 2:   	 
   	  {   	 
   	   double x[][]=new double[3][3];
   	   for(int j=0;j<x[0].length;j++)
   	    x[j][0]=vector1[j];
   	    
   	   for(int j=0;j<x[0].length;j++)
   	    x[j][1]=vector2[j]; 
   	    
   	   for(int j=0;j<x[0].length;j++)
   	    x[j][2]=vector3[j];  
   	    
   	    WindrawHoff w=new WindrawHoff(x,function);
   	  } 
   	 break;	
   	 
   	 case 3:   	 
   	  Delta d=new  Delta(vector1,vector2,vector3,function);
   	 break;	
   	 
   	 case 4:
   	  Hebb h=new Hebb(vector1,vector2,vector3,function);
   	 break;	
   	 
   	      	 	
   		
   	}
   	   		
   	
  }  
   //----------------------------------------------------------------
   if(e.getSource()==exit)
    System.exit(0);  	
   	
 	
 }
 
 /****************////***************////** main method **////*********////******************//
 public static void main(String arg[])

 {

  Neural frame=new Neural();
  
 


 }
}