package ai;

import java.awt.*;
import javax.swing.*;
import java.text.DecimalFormat;

public class BackPro extends JFrame
{

        DecimalFormat df_name = new DecimalFormat("0.00");

        double [][]w12=new double[3][3];  //input-->hidden
        double [][]w23=new double[3][3]; //hidden-->output
        static double [][]t/*=new double[3][3]*/; //desiered
        
        double hidden1[]=new double[3]; //hidden nodes
	    double output1[]=new double[3]; //output nodes
        double outK=0,error=0,newerror=0;
        int Number_of_iter=3;
        String text="",text2="", newerr="",de1="",de2="",de3="",input_w="",numberIter="";
	   	boolean check=false;     
	    Font font=new Font("Serif",Font.BOLD,12);
        Color color1=new Color(43,118,154);
        Color color2=new Color(164,185,207);   
        JTextArea textarea=new JTextArea();
        JTextArea textarea2=new JTextArea();
        Container c;

        


      /**********************************************
                      CONSTRACTOR
       ********************************************/
        BackPro(double[] vector1,double[] vector2,double[] vector3)
        {        
         try{
         	            
         // initalize weigths
         JOptionPane.showMessageDialog(null,"Please your choose for weigths ","Information",JOptionPane.INFORMATION_MESSAGE);
         String ch=JOptionPane.showInputDialog(null,"Choose:\n1- Random weigths\n2- Enter your weigths","Choose",JOptionPane.QUESTION_MESSAGE);
         int choose=Integer.parseInt(ch);
         if(choose==2)
           enter_w(); 
         else
         {
          for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
            w12[i][j]=rnd();

          for(int i=0;i<3;i++)
           for(int j=0;j<3;j++)
            w23[i][j]=rnd();
         }             

         //desired
         JOptionPane.showMessageDialog(null,"Please Enter your desired","Information",JOptionPane.INFORMATION_MESSAGE);
         de1=JOptionPane.showInputDialog(null,"Desired","Enter Desired",JOptionPane.QUESTION_MESSAGE);
         de2=JOptionPane.showInputDialog(null,"Desired","Enter Desired",JOptionPane.QUESTION_MESSAGE);
         de3=JOptionPane.showInputDialog(null,"Desired","Enter Desired",JOptionPane.QUESTION_MESSAGE);
         t=new double[][]{{Double.parseDouble(de1),Double.parseDouble(de2),Double.parseDouble(de3)},
                    {Double.parseDouble(de1),Double.parseDouble(de2),Double.parseDouble(de3)},
                    {Double.parseDouble(de1),Double.parseDouble(de2),Double.parseDouble(de3)}};


	     //Number of iteration
         JOptionPane.showMessageDialog(null,"Please Enter The Number of Iterations","Information",JOptionPane.INFORMATION_MESSAGE);
         numberIter=JOptionPane.showInputDialog(null,"Number of Iteration","Enter Number of Iterations",JOptionPane.QUESTION_MESSAGE);
         Number_of_iter=Integer.parseInt(numberIter);
         
         //error rate
         JOptionPane.showMessageDialog(null,"Please Enter Error Rate","Information",JOptionPane.INFORMATION_MESSAGE);
         String input=JOptionPane.showInputDialog(null,"Enter error rate","Error Rate",JOptionPane.QUESTION_MESSAGE);
         error=Double.parseDouble(input);
         }
         catch(Exception ex)         
         {
          JOptionPane.showMessageDialog(null,"ERROR","Error Message",JOptionPane.ERROR_MESSAGE);	
          System.exit(0);
         }
                  
   	     c=getContentPane();
   	     JPanel p1=new JPanel();
   	     JPanel p2=new JPanel();
   	     JPanel p3=new JPanel();
          
         //start learning method 
         int solve=0;
         boolean en=true;
         
         for(int i=1;i<Number_of_iter;)
	   	 {
	   	  if(en==true)
	   	  {	
            forward(vector1,i);
            solve=backwords(vector1,error,0,2);
            en=false;
          }  
           if((solve==2)&&(en==false))
           {
           	
           	i++;
           	forward(vector1,i);
            solve=backwords(vector1,error,0,2);
           }
           else 
           {
           	 text+="\nNumber of iteration is finished ";
             i=Number_of_iter;
           }  
         }
 
          if(check==true)
          {
           textarea.setText(text);
           textarea2.setText(text2);
          }
          else
          {  
          	text2+="\n* The error rate is not satisfied\n    in all cases  *\n";
          	textarea=new JTextArea(15,30);
          	textarea.setText(text);
          	textarea2.setText(text2);
          }
                    
          textarea.setBackground(color1);
   	      textarea.setForeground(Color.white);
   	      textarea.setFont(font);
   	      textarea2.setBackground(color1);
   	      textarea2.setForeground(Color.white);
   	      textarea2.setFont(font);

   	      p3.setBackground(color2);
   	      p1.add(textarea);
   	      p2.add(textarea2);
   	      p3.add(p1);
   	      p3.add(p2);
   	      c.add(p3);
   	      setSize(550,570);
   	      setTitle("Back Propagtion Method");
   	      setLocation(80,0);
   	      setVisible(true);
   	      
        }
        
        
      /**********************************************
                       MAIN METHOD
       ********************************************/
        public static void main(String[] arg)
        {
                double[] ter1={2,2,3};
                double[] ter2={1,2,5};
                double[] ter3={1,1,1};
                BackPro backpro=new BackPro(ter1,ter2,ter3);
        }
        
        
      /**********************************************
                       RND Function
       ********************************************/
	    public double rnd()
	    {
	            return -1+(double)((Math.random())*2);
	    }
	
	
	  /**********************************************
                      Sigmoid Function
       ********************************************/
	    public double sigmoid(double x)
	    {
	            return (1/(1+Math.exp(-(x))));
	    }
	    

     /**********************************************
                      FORWARD METHOD
       ********************************************/
	    public void forward(double[] vector1,int num)
	    {	      
	      // Hidden layer
	      for(int i=0;i<vector1.length;i++)
	      for(int j=0;j<vector1.length;j++)
	          hidden1[i]+= vector1[j] * w12[j][i];
         
	      // output layer 
	      for(int i=0;i<output1.length;i++)
	        for(int j=0;j<hidden1.length;j++)
	         output1[i] += w23[j][i]*sigmoid(hidden1[i]); 
       
	      // Calculate OutK
	      for(int j=0;j<output1.length;j++)
	         outK+= sigmoid(output1[j]);
	        
	      // print the output of the layers 
	      text+="\nFORWARD PASS        Iteration# "+num+"\n------------------------         ------------";
	      text+="\n                        Hidden            Output\n"; 
	      for(int i=0;i<3;i++)
	         text+=" * node# "+i+":    "+df_name.format(hidden1[i])+"                    "+ 
	                                    df_name.format(output1[i])+"\n";   
	      text+="The OutK=  "+df_name.format(outK); 
	    }
	    
     /**********************************************
                     BackWords MeTHOD
      ********************************************/
	   public int backwords(double vector[],double error,int desired,int num)
	   {
	   	 int solve=0;
	   	 double IH_weights[][]=new double[3][3]; //new input to hidden
	   	 double HO_weights[][]=new double[3][3]; //new hidden to input
	   	 
	   	 double delta_output1[]=new double[3];
	   	 double delta_hidden1[]=new double[3];
	   	 double Eta=0.7;
	   	 double x[]=new double[3];
	   	 boolean flag1[]={false,false,false};
	   	 boolean flag2[]={false,false,false};
	   	 
	 
	   	  // .........BackPropagation output to hidden layer..........//
	   	 System.out.println("\n---------------\nBackPropagation\n---------------");
         System.out.println("\nDelta Output");
	   	 for(int k=0;k<output1.length;k++)
	   	 {
	   	   delta_output1[k]=(1-output1[k])*output1[k]*(t[desired][k]-outK);
	   	   System.out.println(" * node#"+k+" :   "+delta_output1[k]);
	   	 } 
	   	   
	   	 for(int i=0;i<delta_output1.length;i++)
	   	 {
	   	  if(delta_output1[i]<=error)
	   	    flag1[i]=true; 
	   	  else
	   	    flag1[i]=false;  
	   	 }    
	   	
	   	if(flag1[0]==true&&flag1[1]==true&&flag1[2]==true)
	   	{
	   	 for(int k=0;k<output1.length;k++)  
	   	  for(int j=0;j<output1.length;j++)  
	   	   HO_weights[k][j]=w23[k][j]+(Eta*sigmoid(hidden1[j])*delta_output1[k]);
	    
 
         // .........BackPropagation hidden to input layer..........//
         System.out.println("\n\nDelta Hidden");
         double sum=0;
         for(int j=0;j<hidden1.length;j++)
         {
          for(int k=0;k<vector.length;k++)
           sum+=k*delta_output1[k]*HO_weights[k][j];
           	 
          delta_hidden1[j]+=(1-hidden1[j])*hidden1[j]*sum;
          System.out.println(" * node#"+j+" :    "+delta_hidden1[j]);
          sum=0;
          
         } 
         
         for(int i=0;i<delta_hidden1.length;i++)
	   	 {
	   	  if(delta_hidden1[i]<=error)
	   	    flag2[i]=true; 

	   	  else
	   	    flag2[i]=false;  
	   	 }    
	   	
         if(flag2[0]==true&&flag2[1]==true&&flag2[2]==true)
         {
                 
    	  for(int j=0;j<hidden1.length;j++)  
    	   for(int i=0;i<hidden1.length;i++)  
	   	    IH_weights[j][i]=w12[j][i]+(Eta*vector[i]*delta_hidden1[j]);

	   	  for(int i=0;i<3;i++)
	   	   for(int j=0;j<3;j++)
	   	   {
	   	    w12[i][j]=IH_weights[i][j];
	   	    w23[i][j]=HO_weights[i][j];	
	   	   } 
	   	 
	   	   //print new weights 
	   	   text2+="\n\nBackPropagation\n------------------------";
	       text2+="\nOutput to Hidden Layer:\n";
	   	   for(int i=0;i<3;i++)
	   	   {
	   	   	text2+="\n";
	   	    for(int j=0;j<3;j++)
	   	     if(IH_weights[i][j]<0)
	   	      text2+=" * v"+i+""+j+":   "+df_name.format(IH_weights[i][j])+"      ";
	   	     else
	   	      text2+=" * v"+i+""+j+":   "+df_name.format(IH_weights[i][j])+"       ";
	   	   }  
	   	   text2+="\n\nHidden to Input Layer:\n";  
	   	   for(int i=0;i<3;i++)
	   	   {
	   	   	text2+="\n";
	   	    for(int j=0;j<3;j++) 
	   	    if(HO_weights[i][j]<0) 
             text2+=" * w"+i+""+j+":   "+df_name.format(HO_weights[i][j])+"      ";
            else
             text2+=" * w"+i+""+j+":   "+df_name.format(HO_weights[i][j])+"       "; 
           }
           check=true;
           solve=1;
 
          }
	      else
	      {
	      
	   	       fun();
	   	       solve=2;
	   	 
	      }
       
       
	   }
	   else
	   {
	   	  
	      	   fun();
	      	   solve=2;
	   	     
	   }
	   
	      
	    return solve;
	 
}

      public void fun()
      {
      	       
   	            text+="\n\n* Error Rate is not satisfied ";
	      	    text+=" * Applying BackPropagation \n";	    
	      	    /*newerr=JOptionPane.showInputDialog(null,"Error Rate is not satisfied\n* Enter new error rate","Error Rate",JOptionPane.QUESTION_MESSAGE);
	   	    	error=Double.parseDouble(newerr);*/
     }
     
     
     
        public void enter_w()
        {
         JOptionPane.showMessageDialog(null,"Enter weigths from Input to Hidden");
         for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
          {
          	input_w=JOptionPane.showInputDialog(null,"Enter W"+i+""+j,"Enter weights",JOptionPane.QUESTION_MESSAGE);
          	w12[i][j]=Double.parseDouble(input_w);
          }
          
         JOptionPane.showMessageDialog(null,"Enter weigths from Hidden to Output");
         for(int i=0;i<3;i++)
          for(int j=0;j<3;j++)
          {
          	input_w=JOptionPane.showInputDialog(null,"Enter V"+i+""+j,"Enter weights",JOptionPane.QUESTION_MESSAGE);
          	w23[i][j]=Double.parseDouble(input_w);
          }
          
          
        } 
        
      
}


  