package ai;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.DecimalFormat;




public class WindrawHoff extends JFrame implements ActionListener{
 DecimalFormat df = new DecimalFormat("#,###,##0.0");
 public static double[] d=new double[3];
 public static double[] w1=new double[3];
 public static double x[][]=new double[3][3];
 public int choose=0;

 //title
 private JLabel title=new JLabel("Windraw Hoff");
 private Font font=new Font("Marigold",Font.BOLD,20);

 //input labels
 private JLabel ld1=new JLabel("Desired 1:");
 private JLabel ld2=new JLabel("Desired 2:");
 private JLabel ld3=new JLabel("Desired 3:");
 
 private JLabel lw10=new JLabel("w1[0]:");
 private JLabel lw11=new JLabel("w1[1]:");
 private JLabel lw12=new JLabel("w1[2]:");
 
 //inputs TextFields 
 private JTextField td1=new JTextField(5);
 private JTextField td2=new JTextField(5);
 private JTextField td3=new JTextField(5);
 
 private JTextField tw10=new JTextField(5);
 private JTextField tw11=new JTextField(5);
 private JTextField tw12=new JTextField(5);
 
 //Colors
 Color color1=new Color(43,118,154);
 Color color2=new Color(164,185,207);

 //Buttons 
 private JButton ok=new JButton("Ok"); 
 
 //North Panel
 private JPanel north =new JPanel();
 
 //Center Panels
 private JPanel center =new JPanel();
 private JPanel center1 =new JPanel();
 private JPanel center2 =new JPanel();
 
 //South Panel 
 private JPanel south =new JPanel();

//---------------------Constructor ------------------------------------
 public WindrawHoff(double x1[][],int choose){
 	
 	x=x1;
 	
 	for(int i=0;i<x.length;i++)
 	 {
 	  for(int j=0;j<x[0].length;j++)
 	   System.out.print(x[i][j]+"  ");
 	   
 	   System.out.println();
 	  } 
 	choose=choose;
 	Container c=getContentPane();
    c.setLayout(new BorderLayout());
 	
 	title.setFont(font);
    title.setForeground(Color.white);
    north.add(title);
    north.setBackground(color1);
    
    center1.setLayout(new GridLayout(3,4,10,15));
    center1.setBorder(new TitledBorder("Desired"));
    center1.setBackground(color2);
    center1.add(ld1);
    center1.add(td1);
    center1.add(ld2);
    center1.add(td2);
    center1.add(ld3);
    center1.add(td3);
    
    //change label colors
    ld1.setForeground(color1);
    ld2.setForeground(color1);
    ld3.setForeground(color1);
    
    center2.setLayout(new GridLayout(3,4,10,15));
    center2.setBorder(new TitledBorder("Weights"));
    center2.setBackground(color2);
    center2.add(lw10);
    center2.add(tw10);
    center2.add(lw11);
    center2.add(tw11);
    center2.add(lw12);
    center2.add(tw12);
    
    //change label colors
    lw10.setForeground(color1);
    lw11.setForeground(color1);
    lw12.setForeground(color1);
    
    center.setLayout(new GridLayout(1,2));
    center.add(center1);
    center.add(center2);
    
    //add buttons to south panel
 	south.add(ok);
 	south.setBackground(color1);
	
	c.add(north,BorderLayout.NORTH);
 	c.add(center,BorderLayout.CENTER);
 	c.add(south,BorderLayout.SOUTH);

	setSize(300,220);
    setTitle("Windraw Hoff");
 	setVisible(true);
 	setResizable(false);
 	setBackground(color1);
 	
 	//add ActionListeners to components
 	//text fields
 	td1.addActionListener(this);
 	td2.addActionListener(this);
 	td3.addActionListener(this);
 	
 	//button
    ok.addActionListener(this);

 }
 
 //--------------------actionPerformed Function ------------------------
 public void actionPerformed (ActionEvent e)
 {
 	
   if(e.getSource()==ok){
   	
   	d[0]=Double.parseDouble(td1.getText());
   	d[1]=Double.parseDouble(td2.getText());
   	d[2]=Double.parseDouble(td3.getText());
   	
   	w1[0]=Double.parseDouble(tw10.getText());
   	w1[1]=Double.parseDouble(tw11.getText());
   	w1[2]=Double.parseDouble(tw12.getText());
   	
   	JFrame f=new JFrame("Windraw Hoff");
   	JTextArea t=new JTextArea(7,30);
  	t.setText(excute());
  	t.setForeground(Color.white);
  	t.setBackground(color1);
  	t.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,13));
  	
  	JOptionPane.showMessageDialog(null,t);
  	
   	//System.exit(0);
   }
 }
 
 //--------------------excute Function ------------------------
 public String excute(){
 	
 	String output="";
 	double c=.1;
 	double o=0;
 	
 	/*output+="    "+x[0][0]+"\t    "+x[1][0]+"\t    "+x[2][0]+"\n"+
 			"x1="+x[0][1]+"\tx2="+x[1][1]+"\tx3="+x[2][1]+"\n"+
 			"    "+x[0][2]+"\t    "+x[1][2]+"\t    "+x[2][2]+"\n";
 			
 	output+=" d1="+d[0]+"\t d2="+d[1]+"\t d3="+d[2]+"		";
 	output+=" w1="+w1[0]+"\t    "+w1[1]+"\t    "+w1[2]+"\n";*/
 	
 	for(int q=0;q<3;q++){
 		
	 	double net1=w1[0]*x[q][0]+w1[1]*x[q][1]+w1[2]*x[q][2];
	 	output+=" net1 for x"+(q+1)+"="+df.format(net1)+"\t";
	 	
	 	if(choose==1) 	  
	 	 o=segmoid(net1);
	 	else if(choose==2)
	 	 o=bipolar(net1);
	 	else if(choose==3)
	 	 o=linear(net1);
	 	else
	 	 o=sine(net1);
	 	output+=" output for x"+(q+1)+"="+df.format(o)+"\n";
	 	
	 	double w2[]=new double[3];
	 	
	 	for(int i=0;i<3;i++)
	 	  w2[i]=c*(d[1]-o)*net1*x[q][i]+w1[i];
	 	output+=" w2="+df.format(w2[0])+"\t   "+df.format(w2[1])+"\t   "+df.format(w2[2])+"\n";
	 	  
	 	double net2=w2[0]*x[q][0]+w2[1]*x[q][1]+w2[2]*x[q][2];
	 	output+=" net2 for x"+(q+1)+"="+df.format(net2)+"\t";
	 	
	 	if(choose==1) 	  
	 	 o=segmoid(net2);
	 	else if(choose==2)
	 	 o=bipolar(net2);
	 	else if(choose==3)
	 	 o=linear(net2);
	 	else
	 	 o=sine(net2);
	 	output+=" output for x"+(q+1)+"="+df.format(o)+"\n";
	 	
	 	double w3[]=new double[3];
	 	
	 	for(int i=0;i<3;i++)
	 	  w3[i]=c*(d[1]-o)*net2*x[q][i]+w2[i];
	 	output+=" w3="+df.format(w3[0])+"\t   "+df.format(w3[1])+"\t   "+df.format(w3[2])+"\n";
	 	  
	 	double net3=w3[0]*x[q][0]+w3[1]*x[q][1]+w3[2]*x[q][2];
	 	output+=" net3 for x"+(q+1)+"="+df.format(net3)+"\t";
	 	
	 	if(choose==1) 	  
	 	 o=segmoid(net3);
	 	else if(choose==2)
	 	 o=bipolar(net3);
	 	else if(choose==3)
	 	 o=linear(net3);
	 	else
	 	 o=sine(net3);
	 	output+=" output for x"+(q+1)+"="+df.format(o)+"\n";
	 	 
	 	double w4[]=new double[3];
	 	
	 	for(int i=0;i<3;i++)
	 	  w4[i]=c*(d[1]-o)*net3*x[q][i]+w3[i];
	 	output+=" w4="+df.format(w4[0])+"\t   "+df.format(w4[1])+"\t   "+df.format(w4[2])+"\n";
	 	output+="		***\n";
	 }
	 return output;
	  	
 }
 //--------------------segmoid Function -------------------------------
 public static double segmoid(double net){
 	
 	return (2/(1+Math.exp(.7*net))-1);
 	
 }
 
 //--------------------sine Function ----------------------------------
 public static double sine(double net){
 	
 	return Math.sin(net);
 	
 }
 
 //--------------------bipolar Function -------------------------------
 public static double bipolar(double net){
 	
 	return ((net>0)?1:-1);
 	
 }
 
 //--------------------linear Function --------------------------------
 public static double linear(double net){
 	
 	return net;
 	
 } 
 //-------------------main method ---------------------------------------------
 public static void main(String arg[]){

  WindrawHoff frame=new WindrawHoff(x,1);

 }

 
}