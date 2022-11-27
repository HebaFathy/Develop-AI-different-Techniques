package Expert;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ExpertSystem extends JFrame implements ActionListener
{
	Container c;
	JButton kbutton,mbutton,pbutton,monitor,scanner;
	JLabel image_label,intro_label,empty_label,label;
	JPanel button_panel,panel,panel1,panel2;
	Color color=new Color(47,114,143);	
	
	public ExpertSystem()
	{
		c=getContentPane();
		button_panel=new JPanel();
		panel=new JPanel();
		panel1=new JPanel();
		panel2=new JPanel();
		kbutton=new JButton("KeyBoard");
		mbutton=new JButton("Mouse");
		pbutton=new JButton("Printer");
		scanner=new JButton("Scanner");
		monitor=new JButton("Monitor");
		
	    ImageIcon image=new ImageIcon("image.JPG");
				
		image_label=new JLabel();
		empty_label=new JLabel();	
		label=new JLabel("                      		                             Created in 20May 2006 Submitted in 5April 2006");
		label.setFont(new Font("Serif",Font.PLAIN+Font.ITALIC,12));
		label.setForeground(color);
		
		intro_label=new JLabel("Computer Expert System",image,SwingConstants.LEFT);
		intro_label.setFont(new Font("Serif",Font.PLAIN+Font.BOLD,20));
		intro_label.setForeground(color);
		
		button_panel.setFont(new Font("Marigold",Font.PLAIN,10));
		
		panel1.add(intro_label);
		panel1.setBackground(Color.white);
		
		ImageIcon computer_image=new ImageIcon("Computer2.JPG");
		
		button_panel.setLayout(new GridLayout(8,1,13,13));
		button_panel.setBackground(Color.white);
		
		button_panel.add(empty_label);
	    button_panel.add(scanner);
	    button_panel.add(kbutton);
		button_panel.add(mbutton);
		button_panel.add(pbutton);
		button_panel.add(monitor);
		
		kbutton.setBackground(Color.white);
		pbutton.setBackground(Color.white);
		scanner.setBackground(Color.white);
   	    mbutton.setBackground(Color.white);
    	monitor.setBackground(Color.white);
    	
    	kbutton.setForeground(color);
    	pbutton.setForeground(color);
    	mbutton.setForeground(color);
    	monitor.setForeground(color);
    	scanner.setForeground(color);
    	
    	kbutton.addActionListener(this);
    	pbutton.addActionListener(this);
    	mbutton.addActionListener(this);
    	monitor.addActionListener(this);
    	scanner.addActionListener(this);
		
		image_label.setIcon(computer_image);
		image_label.setForeground(Color.black);

       panel2.setLayout(new BorderLayout());
       panel2.setBackground(Color.white); 
       panel2.add(label,BorderLayout.SOUTH);
       panel2.add(image_label,BorderLayout.CENTER);
        
        
        panel.setLayout(new BorderLayout());
		panel.add(panel2,BorderLayout.EAST);		
		c.add(panel1,BorderLayout.NORTH);
	    panel.setBackground(Color.white);
		c.add(button_panel,BorderLayout.WEST);
		c.add(panel);
		
		setLocation(140,40);
		setTitle("Expert System");
		setSize(400,360);
		setVisible(true);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==pbutton)
		   new Printer();
		if(e.getSource()==monitor)
		   new Monitor();
		if(e.getSource()==scanner)
		   new Scanner();   
		if(e.getSource()==kbutton)
		   new Keyboard();
		if(e.getSource()==mbutton)
		   new Mouse();   
	}
	
	public static void main(String arg[])
	{
	  ExpertSystem exs=new ExpertSystem();
	  exs.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
	}
}