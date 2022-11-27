package ai;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.text.DecimalFormat;

import java.awt.*;

public class Delta extends JFrame implements ActionListener
{
          
 static DecimalFormat d = new DecimalFormat("#,###,##0.00");
 static String output="";

 static double[]w1=new double[3];
 static double[]w2=new double[3];
 static double[]w3=new double[3];
 static double[]w4=new double[3];
 static double[]x1=new double[3];
 static double[]x2=new double[3];
 static double[]x3=new double[3];
 static int choice;

 static  double fdelta_net=0;
 static double correction=0.1;
 static double []desired=new double[3];
 static double fnet1=0;
 static double fnet2=0;
 static double fnet3=0;
      
      
      //title
 private JLabel title=new JLabel("Delta");
 private Font font=new Font("Marigold",Font.BOLD,20);

 //input labels
 private JLabel ld1=new JLabel("Desired 1:");
 private JLabel ld2=new JLabel("Desired 2:");
 private JLabel ld3=new JLabel("Desired 3:");
 private JLabel wg1=new JLabel("Weights 1:");
 //inputs TextFields
 private JTextField td1=new JTextField(5);
 private JTextField td2=new JTextField(5);
 private JTextField td3=new JTextField(5);
 
 //weights TextFields
 private JTextField wd1=new JTextField(5);
 private JTextField wd2=new JTextField(5);
 private JTextField wd3=new JTextField(5);
 
 //Colors
 Color color1=new Color(43,118,154);
 Color color2=new Color(164,185,207);

 //Buttons 
 private JButton ok=new JButton("Ok"); 
 
 //North Panel
 private JPanel north =new JPanel();
 
 //Center Panel
 private JPanel center =new JPanel();
 
 //South Panel 
 private JPanel south =new JPanel();

      
      
   public Delta(double x11[],double x22[],double x33[],int choose){
 	
 	x1=x11;
 	x2=x22;
 	x3=x33;
 	
 	choice=choose;
 	System.out.println("choice  "+choice);
 	
 	
 	Container c=getContentPane();
    c.setLayout(new BorderLayout());
 	
 	title.setFont(font);
    title.setForeground(Color.white);
    //north.add(title);
    north.setBackground(color1);
    
    center.setLayout(new GridLayout(4,4,10,15));
    center.setBorder(new TitledBorder("Desired"));
    center.setBackground(color2);
    center.add(ld1);
    center.add(td1);
    center.add(ld2);
    center.add(td2);
    center.add(ld3);
    center.add(td3);
    north.setLayout(new FlowLayout());
    north.setBorder(new TitledBorder("Weights"));
    north.setBackground(color2);
    north.add(wg1);
    north.add(wd1);
    north.add(wd2);
    north.add(wd3);
       
    //change label colors
    ld1.setForeground(color1);
    ld2.setForeground(color1);
    ld3.setForeground(color1);
    
     	//add bbutons to south panel
 	south.add(ok);
 	south.setBackground(color1);
	
	c.add(north,BorderLayout.NORTH);
 	c.add(center,BorderLayout.CENTER);
 	c.add(south,BorderLayout.SOUTH);

	setSize(350,290);
    setTitle("Delta");
 	setVisible(true);
 	setResizable(false);
 	setBackground(color1);
 	
 	//add ActionListeners to components
 	//text fields
 	td1.addActionListener(this);
 	td2.addActionListener(this);
 	td3.addActionListener(this);
 	wd1.addActionListener(this);
 	wd2.addActionListener(this);
 	wd3.addActionListener(this);
 	
 	
 	//button
    ok.addActionListener(this);

 }
 
 //--------------------actionPerformed Function ------------------------
 public void actionPerformed (ActionEvent e)
 {
 	
   if(e.getSource()==ok){
   	w1[0]=Double.parseDouble(wd1.getText());
   	w1[1]=Double.parseDouble(wd2.getText());
   	w1[2]=Double.parseDouble(wd3.getText());
   	
   	desired[0]=Double.parseDouble(td1.getText());
   	desired[1]=Double.parseDouble(td2.getText());
   	desired[2]=Double.parseDouble(td3.getText());
   	
   	JFrame f=new JFrame("Delta");
   	JTextArea t=new JTextArea(7,30);
  	//t.setText(excute());
  	title.setForeground(Color.white);
  	south.setBackground(color2);
     String xx=excute()+"\n\n"+"-----------------------------------------------------------------------------------------------------------------";
     t.setBackground(color1);
     t.setForeground(Color.white);
     t.setFont(new Font("Serif",Font.BOLD+Font.ITALIC,13));
     t.setText(xx);
     JOptionPane.showMessageDialog(null,t);
  	
   	//System.exit(0);
   }
 }
      
      
       /* public static void main(String[]args)
        {
               Delta frame=new Delta(x1,x2,x3,1);
        }*/
         
         public static String excute()
         { 
         
         output+="             "+x1[0]+"\t                 "+x2[0]+"\t                    "+x3[0]+"\n"+
 			" x1=    "+x1[1]+"\t       x2=   "+x2[1]+"\t      x3=    "+x3[1]+"\n"+
 			     "             "+x1[2]+"\t                 "+x2[2]+"\t                    "+x3[2]+"\n\n";
 	output+="------------------------------------------------------------------\n";		  
 	output+=" d1=  "+desired[0]+"\t     d2=  "+desired[1]+"\t     d3=  "+desired[2]+"\t\t\t";
 	output+="\n w1=  "+d.format(w1[0])+"\t     "+d.format(w1[1])+"\t     "+d.format(w1[2])+"\n"+"------------------------------------------------------------------";
             double net1=calc_net(w1,x1);
              output+="\n\nthe value of net1 ==>  "+ net1;
               //fnet1=linear_func(net1);
             switch(choice)
            {case 1:
               fnet1=sigmoid_func(net1);
               break;
              case 2:
               JOptionPane.showMessageDialog(null,"sorry, you can't use Bipolar function with Delta approach","ERROR",JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                    break;
                  case 3:
               fnet1=linear_func(net1);
                    break;
                  case 4:
               fnet1=sine_func(net1);
                    break;}

            double fdelta_net=fdelta_net_func(fnet1);

            w2=weight(desired[0],correction,fnet1,fdelta_net,x1,w1);
            output+="\nthe value of weight2  ";
            for(int i=0;i<3;i++)
            output+="     "+ d.format(w2[i]);
            //////////////////////////calculate w3////////////////////
          double net2=calc_net(w2,x2);
                         output+="\n\nthe value of net2 ==>  "+ d.format(net2);
                         //fnet2=linear_func(net2);
                      //int choice=3;
                      switch(choice)
                      {case 1:
                         fnet2=sigmoid_func(net2);
                         break;
                        case 2:
                         JOptionPane.showMessageDialog(null,"sorry, you can't use Bipolar function with Delta approach","ERROR",JOptionPane.ERROR_MESSAGE);
                              System.exit(0);
                              break;
                            case 3:
                         fnet2=linear_func(net2);
                              break;
                            case 4:
                         fnet2=sine_func(net2);
                              break;}

                      double fdelta_net2=fdelta_net_func(fnet2);

                      w3=weight(desired[1],correction,fnet2,fdelta_net2,x2,w2);
                     output+="\nthe value of weight3     ";
                      for(int i=0;i<3;i++)
                      output+="     "+ d.format(w3[i]);
                      
                      //////////////////////////////////

 //////////////////////////calculate w4////////////////////
          double net3=calc_net(w3,x3);
                         output+="\n\nthe value of net3 ==>  "+ d.format(net3);
                        // fnet3=linear_func(net3);
                      //choice=3;
                      switch(choice)
                      {case 1:
                         fnet3=sigmoid_func(net3);
                         break;
                        case 2:
                         { JOptionPane.showMessageDialog(null,"sorry, you can't use Bipolar function with Delta approach","ERROR",JOptionPane.ERROR_MESSAGE);
                              System.exit(0);
                              }
                              break;
                            case 3:
                         fnet3=linear_func(net3);
                              break;
                            case 4:
                         fnet3=sine_func(net3);
                              break;}

                      double fdelta_net3=fdelta_net_func(fnet3);

                      w4=weight(desired[2],correction,fnet3,fdelta_net3,x3,w3);
                      output+="\nthe value of weight4  ";
                      for(int i=0;i<3;i++)
                      output+="     "+ d.format(w4[i]);

return output;

//////////////////////////////////////////////////////////
        }
      
        public static double calc_net(double[]w1,double[]x1)
        {
                double net=0;
                for(int i=0;i<3;i++)
                net+=w1[i]*x1[i];
                return net;
        }
        public static double sigmoid_func(double net)
        {
                double fnet=1;
                fnet/=(1+(Math.exp(-net)));
            output+="\nthe value of activation function ==>  "+ d.format(fnet);
        return fnet;
        }
        public static double linear_func(double net)
        {double fnet=net;
        output+="\nthe value of activation function ==>  "+ d.format(fnet);
                return fnet;
        }
        public static double sine_func(double net)
        {double fnet;
                fnet=Math.sin(net);
            output+="\nthe value of activation function ==>  "+ d.format(fnet);
        return fnet;
        }
        public static double fdelta_net_func(double fnet)
        {

                double fdelta_net=0;
            fdelta_net=1-Math.pow(fnet,2);
            fdelta_net=fdelta_net/2;
            output+="\nthe value of Delta function ==>  "+ d.format(fnet);
            return fdelta_net;
 }
 public static double[] weight(double d,double c,double fnet,double fdelta_net,double[]x,double[]w)
                {
                   
                       
                        double []w_value=new double[3];
                        double start=0;
                        start+=(c*(d-fnet)*fdelta_net);
                       
                        for(int i=0;i<3;i++)
                        w_value[i]=start*x[i]+w[i];
                        return w_value;
                        }

}
