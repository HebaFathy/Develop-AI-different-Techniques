package system;

//package expert;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import java.io.*;
public class mobile  extends JFrame
   implements ActionListener{
public static String type,camera,radio,color_screen,touch_screen,voice_memory,language
     ,sms,multimedia_sms,voice_mail,dictionary,note,vibration_alarm,alarm,
     call_list,call_cost,waiting_call,trans_ser,blutooth;

 JRadioButton rb1 = new JRadioButton("nokia");
static JLabel l = new JLabel("what the type of the mobile ??");
JRadioButton rb2 = new JRadioButton("Elkatel");
static JPanel p = new JPanel();
paneli p2=new paneli("no6100.bmp");
paneli p22=new paneli("no2100.bmp");
JPanel p3=new JPanel();
JPanel p4=new JPanel();
public mobile()
//throws SQLException ,ClassNotFoundException
{l.setForeground(new Color(2,3,200));
  l.setBackground(new Color(10,255,255));
  rb1.addActionListener(this);

  rb2.addActionListener(this);

  ButtonGroup bg = new ButtonGroup();
  bg.add(rb1);
  bg.add(rb2);

  //ImageIcon im= new ImageIcon(this.getClass().getResource("no2100.bmp"));
  //l2=new JLabel(im,SwingConstants.CENTER);
//   l2.setSize(110,170);`
//l2.setIcon(new ImageIcon(/*this.getClass().getResource(*/"no2100"));
  p.setLayout(new GridLayout(1, 2));
  //p2.setLayout(new GridLayout(1,2));
  p3.setLayout(new BorderLayout());
  p4.setLayout(new GridLayout(1,2));
  p.add(rb1);
  p.add(rb2);
 p3.setBackground(new Color(255,255,255));
  p3.add(p,BorderLayout.NORTH);
  p4.add(p2);
  p4.add(p22);
  p3.add(p4,BorderLayout.CENTER);
  getContentPane().add(l, BorderLayout.NORTH);
  getContentPane().add(p3, BorderLayout.CENTER);

  this.setSize(350, 400);
 this.setLocation(200,100);
// this.setForeground(new Color(255,255,255));
 this.setVisible(true);


}
 public void actionPerformed(ActionEvent e) {
   if(e.getSource() == rb1||e.getSource() == rb2)
   {if(e.getSource() == rb1)
     type="nokia";
     else
       type="alkatel";

this.dispose();
     fram2 f=new fram2();
f.setLocation(200,100);
f.setVisible(true);


   }



   }















 public static void main(String arg[])
throws SQLException ,ClassNotFoundException
 {

   mobile m=new mobile();



 }

}
class paneli extends JPanel
{
 ImageIcon i1,i2;
 int x, y;
 int r[] = new int[256], g[] = new int[256], b[] = new int[256], x1 = 0, y1;
 String f;
 DataInputStream in = null;
 public paneli(String f) {
  //f = JOptionPane.showInputDialog("Enter The File Name: ");
   try {
     in = new DataInputStream(new FileInputStream(f));
     in.skipBytes(18);
     x = in.read() + in.read() * 256 + in.read() * 65536 +
         in.read() * 16777216;
     y = in.read() + in.read() * 256 + in.read() * 65536 +
         in.read() * 16777216;
//in.close();
     y1 = y;
   }
   catch (IOException e) {}
 }

 public void paintComponent(Graphics G) {
   super.paintComponents(G);
   try {

    // in.skipBytes(54 - 26);
    // for (int i = 0; i < 256; i++) {
     //  b[i] = in.read();
     //  g[i] = in.read();
     //  r[i] = in.read();
       //in.read();


     int r,b,g ;

     for(int i=1;i<=x*y;i++){
       {
        //int count = in.read();
       // for (int w = 0; w < count; w++) {
       b= in.read();
        g= in.read();
         r= in.read();
          G.setColor(new Color(r, g, b));
          G.fillRect(x1, y1, 1, 1);

x1 += 1;
          if (x1 == x) {
            x1 = 0;
            y1 -= 1;
          }



       // z = in.read();

      }
    }
  }
  catch (IOException e) {}
 }


}
class fram2 extends JFrame implements ActionListener
{JLabel l=new JLabel("do you want your mobil with camera ??");
    JButton b1=new JButton("yes");
    JButton b2=new JButton("no");
     JPanel p=new JPanel();
     //paneli p1=new paneli("nor.bmp");
     mobile m;
 public fram2()
 {
b1.setForeground(new Color(2,2,15));
   b2.setForeground(new Color(2,2,15));
    b1.addActionListener(this);

    b2.addActionListener(this);

    p.setLayout(new GridLayout(1,2));
     p.setBackground(new Color(255,255,255));
    p.add(b1);p.add(b2);
    this.setForeground(new Color(2,2,10));
    //getContentPane().add(p1,BorderLayout.NORTH);
    getContentPane().add(l,BorderLayout.CENTER);
    getContentPane().add(p,BorderLayout.SOUTH);
    setSize(400,250);
    //setVisible(true);

}
  public void actionPerformed(ActionEvent e)
  {
    if(e.getActionCommand()=="yes")
  m.camera="yes";
  if(e.getActionCommand()=="no")
    m.camera="no";



  this.dispose();
    fram3 f=new fram3();
    f.setLocation(200,100);

    f.setVisible(true);
  //  this.setVisible(false);


  }
}
class fram3 extends JFrame implements ActionListener
{JLabel l=new JLabel("do you want your mobile with blutooth??");
         JButton b1=new JButton("yes");
          JButton b2=new JButton("no");
          JPanel p=new JPanel();
          mobile m;
  public fram3()
  {

         b1.addActionListener(this);

         b2.addActionListener(this);

        p.setLayout(new GridLayout(1,2));
       p.setBackground(new Color(255,255,255));
        p.add(b1);p.add(b2);
        getContentPane().add(l,BorderLayout.NORTH);
        getContentPane().add(p,BorderLayout.SOUTH);
        setSize(400,200);
        //setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getActionCommand()=="yes")
  m.blutooth="yes";
 if(e.getActionCommand()=="no")
  m.blutooth="no";
    {this.dispose();
    fram4 f=new fram4();
f.setLocation(200,100);
f.setVisible(true);




  }

  }
  }
  class fram4 extends JFrame implements ActionListener
  {JLabel l=new JLabel("you want your mobile with transmission services ??");
         JButton b1=new JButton("yes");
          JButton b2=new JButton("no");
          JPanel p=new JPanel();
          mobile m;
 public fram4()
 {

         b1.addActionListener(this);

         b2.addActionListener(this);

        p.setLayout(new GridLayout(1,2));
       p.setBackground(new Color(255,255,255));
        p.add(b1);p.add(b2);
        getContentPane().add(l,BorderLayout.NORTH);
        getContentPane().add(p,BorderLayout.SOUTH);
        setSize(400,200);
        //setVisible(true);
 }
 public void actionPerformed(ActionEvent e)
  {
    if(e.getActionCommand()=="yes")
   m.trans_ser="yes";
  if(e.getActionCommand()=="no")
   m.trans_ser="no";
    {this.dispose();
          fram5 f=new fram5();
          f.setLocation(200,100);

f.setVisible(true);

        }

}
 }
     class fram5 extends JFrame implements ActionListener
     { JLabel l = new JLabel(" do you want your mobile with radio ??");
      JButton b1 = new JButton("yes");
       JButton b2 = new JButton("no");
        JPanel p = new JPanel();
        mobile m;
    public fram5() {

      b1.addActionListener(this);

      b2.addActionListener(this);

      p.setLayout(new GridLayout(1, 2));
     p.setBackground(new Color(255,255,255));
      p.add(b1);
      p.add(b2);
      getContentPane().add(l, BorderLayout.NORTH);
      getContentPane().add(p, BorderLayout.SOUTH);
      setSize(400,200);
     // setVisible(true);
    }
   public void actionPerformed(ActionEvent e)
  {

  if(e.getActionCommand()=="yes")
      m.radio="yes";
    if(e.getActionCommand()=="no")
       m.radio="no";


this.dispose();
    fram6 f=new fram6();
f.setLocation(200,100);
f.setVisible(true);


  }}
  class fram6 extends JFrame implements ActionListener
{ JLabel l=new JLabel(" do you want your mobile with color screen ??");
  JButton b1=new JButton("yes");
 JButton b2=new JButton("no");
 JPanel p=new JPanel();
 mobile m;
  public fram6()
  {




      b1.addActionListener(this);

      b2.addActionListener(this);

     p.setLayout(new GridLayout(1,2));
     p.setBackground(new Color(255,255,255));
     p.add(b1);p.add(b2);
     getContentPane().add(l,BorderLayout.NORTH);
     //f.getContentPane().add(p,BorderLayout.CENTER);
     getContentPane().add(p,BorderLayout.SOUTH);
     setSize(400,200);
     //setVisible(true);
  }
  public void actionPerformed(ActionEvent e)
  {
    if(e.getActionCommand()=="yes")

     m.color_screen="yes";
     if(e.getActionCommand()=="no")
        m.color_screen="no";
      //System.out.println(m.color_screen);

this.dispose();
   fram7 f=new fram7();
f.setLocation(200,100);
f.setVisible(true);


}
}
class fram7 extends JFrame implements ActionListener
{JLabel l=new JLabel(" do you want your mobile with touch screen ??");
        JButton b1=new JButton("yes");
        JButton b2=new JButton("no");
         JPanel p=new JPanel();
         mobile m;

public fram7()
{

        b1.addActionListener(this);

        b2.addActionListener(this);

       p.setLayout(new GridLayout(1,2));
       p.setBackground(new Color(255,255,255));
       p.add(b1);p.add(b2);
       getContentPane().add(l,BorderLayout.NORTH);
       getContentPane().add(p,BorderLayout.SOUTH);
       setSize(400,200);
      // setVisible(true);
}
     public void actionPerformed(ActionEvent e)
  {
    if(e.getActionCommand()=="yes")

      m.touch_screen="yes";
     if(e.getActionCommand()=="no")
        m.touch_screen="no";
     // System.out.println(m.touch_screen);
this.dispose();

   fram8 f=new fram8();

f.setLocation(200,100);
f.setVisible(true);



}}
   class fram8 extends JFrame implements ActionListener
   {  JLabel l = new JLabel(" do you want your mobile with voice memory ??");
    JButton b1 = new JButton("yes");
     JButton b2 = new JButton("no");
      JPanel p = new JPanel();
      mobile m;
  public fram8() {


    b1.addActionListener(this);

    b2.addActionListener(this);

    p.setLayout(new GridLayout(1, 2));
    p.setBackground(new Color(255,255,255));
    p.add(b1);
    p.add(b2);
    getContentPane().add(l, BorderLayout.NORTH);
    getContentPane().add(p, BorderLayout.SOUTH);
    setSize(400,200);
  //  setVisible(true);

  }

  public void actionPerformed(ActionEvent e) {
    if(e.getActionCommand()=="yes")

              m.voice_memory="yes";
             if(e.getActionCommand()=="no")
                m.voice_memory="no";
                  //System.out.println(m.voice_memory);

      this.dispose();

          fram9 f=new fram9();
      f.setLocation(200,100);
      f.setVisible(true);



        }
      }
      class fram9 extends JFrame implements ActionListener
      { JLabel l = new JLabel(
               " do you want your mobile with language ??");
           JButton b1 = new JButton("yes");
      JButton b2 = new JButton("no");
       JPanel p = new JPanel();
       mobile m;
        public fram9() {

          b1.addActionListener(this);

          b2.addActionListener(this);

          p.setLayout(new GridLayout(1, 2));
         p.setBackground(new Color(255,255,255));
          p.add(b1);
          p.add(b2);
          getContentPane().add(l, BorderLayout.NORTH);
          getContentPane().add(p, BorderLayout.SOUTH);
          setSize(400,200);
          //setVisible(true);
        }
        public void actionPerformed(ActionEvent e)
        {
          if(e.getActionCommand()=="yes")

           m.language="yes";
           if(e.getActionCommand()=="no")
             m.language="no";
            //System.out.println(m.language);
        this.dispose();
            fram10 f=new fram10();
      f.setLocation(200,100);
      f.setVisible(true);



        }

      }
            class fram10 extends JFrame implements ActionListener
            {JLabel l=new JLabel(" do you want your mobile with ??");
                     JCheckBox cb1 = new JCheckBox("SMS");
                     JCheckBox cb2 = new JCheckBox("multimedia sms");
                     JCheckBox cb3 = new JCheckBox("mail voice");
                     JPanel p=new JPanel();
                      JButton b1=new JButton("ok");
                     mobile m;
                     //fram9 f9;
      public fram10()
              {
              cb1.addActionListener(this);

                     cb2.addActionListener(this);

              cb3.addActionListener(this);

                     b1.addActionListener(this);
                   /*  if(cb1.isSelected())
                    m.sms="yes";
                    else
                      m.sms="no";
                    if(cb2.isSelected())
                 m.multimedia_sms="yes";
                 else
                   m.multimedia_sms="no";
                 if(cb3.isSelected())
                m.voice_mail="yes";
                   else
                      m.voice_mail="no";*/





                   p.setBackground(new Color(255,255,255));
                     p.add(cb1);p.add(cb2);p.add(cb3);
                    p.setLayout(new GridLayout(1,2));
                    p.add(b1);
                    getContentPane().add(l,BorderLayout.NORTH);
                    //f.getContentPane().add(p,BorderLayout.SOUTH);
                    getContentPane().add(p,BorderLayout.CENTER);
                    getContentPane().add(p,BorderLayout.SOUTH);
                    setSize(400,200);
                   // setVisible(true);
              }
              public void actionPerformed(ActionEvent e)
        {
          if(e.getActionCommand()=="ok")
           { if(cb1.isSelected())
                          m.sms="yes";
                          else
                            m.sms="no";
                          if(cb2.isSelected())
                       m.multimedia_sms="yes";
                       else
                         m.multimedia_sms="no";
                       if(cb3.isSelected())
                      m.voice_mail="yes";
                         else
                            m.voice_mail="no";

       // System.out.println("sms "+m.sms);
          //System.out.println("multi sms "+m.multimedia_sms);
            //System.out.println("voice mail "+m.voice_mail);
      this.dispose();
          fram11 f=new fram11();
      f.setLocation(200,100);
      f.setVisible(true);
       }

        }
      }

            class fram11 extends JFrame implements ActionListener
            { JLabel l = new JLabel(" do you want your mobile with ??");
                JButton b1 = new JButton("ok");
                JCheckBox cb1 = new JCheckBox("vibration alarm");

               JCheckBox cb2 = new JCheckBox("alarm");




      mobile m;
              public fram11() {

                b1.addActionListener(this);
        /* if (cb1.isSelected())
                  m.vibration_alarm = "yes";
                  else
                   m.vibration_alarm = "no";
                if (cb2.isSelected())
                  m.alarm = "yes";
                  else
                  m.alarm = "no";*/
               // System.out.println(m.vibration_alarm);
                //System.out.println(m.alarm);

                //JButton b2=new JButton("more");
                // b2.addActionListener(this);
                JPanel p = new JPanel();
                p.setLayout(new GridLayout(1, 3));
                p.setBackground(new Color(255,255,255));
                p.add(cb1);
                p.add(cb2);
                p.add(b1);

                getContentPane().add(l, BorderLayout.NORTH);
                getContentPane().add(p, BorderLayout.SOUTH);
                setSize(400,200);
               // setVisible(true);
               //********************************************

           }
              public void actionPerformed(ActionEvent e)
        {
          if (cb1.isSelected())
                     m.vibration_alarm = "yes";
                     else
                      m.vibration_alarm = "no";
                   if (cb2.isSelected())
                     m.alarm = "yes";
                     else
                     m.alarm = "no";

          if(e.getActionCommand()=="ok")

                    this.dispose();
               try{ fram12 f=new fram12();
                  f.setLocation(200,100);

                     }

                catch(ClassNotFoundException r){System.out.println("sql error");}
          catch(SQLException tt){System.out.println(tt.getMessage())  ;}

      //}

  }
/*    frame12 ff=new frame12();
    ff.setVisible(true);
*/}

      class fram12 extends JFrame implements ActionListener
      { JLabel l = new JLabel(" do you want your mobile with ??");
        JButton b1 = new JButton("ok");
        JCheckBox cb1 = new JCheckBox("call list");

        JCheckBox cb2 = new JCheckBox("waiting calls");
        JCheckBox cb3 = new JCheckBox("call cost");
        mobile m;
        String output = "";
        public fram12() throws SQLException, ClassNotFoundException {
          b1.addActionListener(this);

          if (cb1.isSelected())

            if (cb1.isSelected())

              m.call_list = "yes";
            else
              m.call_list = "no";
          if (cb2.isSelected())
            m.waiting_call = "yes";
          else
            m.waiting_call = "no";
          if (cb3.isSelected())
            m.call_cost = "yes";
          else
            m.call_cost = "no";
         // System.out.println(m.call_list);
         // System.out.println(m.call_cost);
          //System.out.println(m.waiting_call);

          //JButton b2=new JButton("more");
          // b2.addActionListener(this);
          JPanel p = new JPanel();
          p.setLayout(new GridLayout(1, 4));
          p.setBackground(new Color(255, 255, 255));
          p.add(cb1);
          p.add(cb2);
          p.add(cb3);
          p.add(b1);
          getContentPane().add(l, BorderLayout.NORTH);
          getContentPane().add(p, BorderLayout.SOUTH);
          setSize(400, 200);
          setLocation(200, 100);
           setVisible(true);
          //////////////////////////////
      ///////////////////////////////////////////////

         // System.out.println(m.type);
          //System.out.println(m.camera);
         // System.out.println(m.radio);
          //System.out.println("the sms::" + m.sms);

          System.out.println("55555555555555555555");


        }

        public void actionPerformed(ActionEvent e) {
          if (e.getActionCommand() == "ok") { //fram13 f=new fram13();}
          try{fram13 f = new fram13();}
          catch(ClassNotFoundException r){System.out.println("sql error");}
          catch(SQLException tt){System.out.println(tt.getMessage())  ;}

          }
        }}

        class fram13
            extends JFrame {
          mobile m;
          String output = "";
          public fram13()
       throws SQLException ,ClassNotFoundException
          {
            System.out.println("type ::"+m.type);
    System.out.println("camera ::"+m.camera);
    System.out.println("blutooth ::"+m.blutooth);
    System.out.println("radio ::"+m.radio);
    System.out.println("transmission ::"+m.trans_ser);
    System.out.println("color ::"+m.color_screen);
    System.out.println("touch ::"+m.touch_screen);
    System.out.println("sms ::"+m.sms);
    System.out.println("multisms::"+m.multimedia_sms);
    System.out.println("voice mail ::"+m.voice_mail);
    System.out.println("vibration ::"+m.vibration_alarm);
    System.out.println("alarm ::"+m.alarm);
    System.out.println("language ::"+m.language);
    System.out.println("note ::"+m.note);
    System.out.println("dictionary ::"+m.dictionary);


  System.out.println("11111111111111111111");
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            System.out.println("Driver loaded");
            Connection connect = DriverManager.getConnection("jdbc:odbc:mobile");
                        System.out.println("good db");
            Statement stat = connect.createStatement();

            // type="nokia";
            System.out.println("2222222222222222222211");
 System.out.println(m.type);
 String Query="select model from ttt2 where company='"+m.type+"'"
     +"and msms='"+m.multimedia_sms+"'"+"and sms='"+m.sms+"'"+
                 "and bluetooth='"+m.blutooth+"'"+
                "and vib_alarm='" + m.vibration_alarm +"'"+
                "and waiting_call='" + m.waiting_call + "'and alarm='" +
                m.alarm+"'and  voice_memory='" + m.voice_memory+"'and  calling_cost='" + m.call_cost
                + "'and voice_mail='" + m.voice_mail +
               "'and  language='" + m.language +
                "'and  color_screen='" + m.color_screen + "'and touch_screen='" +
                m.touch_screen + "'and radio='" + m.radio +
                "'and camera='" + m.camera+"'" ;

  System.out.println(Query);

            ResultSet result = stat.executeQuery(Query);
             System.out.println("444444444444444");
            while (result.next()) {
 System.out.println("444444444444444");
              System.out.println(result.getShort(1));
              //output += result.getShort(1) + "\n";
           System.out.println("777777777");
        }
            connect.close();
            JOptionPane.showMessageDialog(null,output);
  //System.out.println("66666666666666");
          }
        }


