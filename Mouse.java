package Expert;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

class Mouse extends JFrame{
  public Mouse()
  {
    try {
      JTextArea t = new JTextArea();
      String select = "      Welcome to Mouse Troubleshooter: " + "\n" +"\n"+
          "  ***************************************" + "\n" +
          "  Is Mouse connected to USB device?" + "\n" +
          "  If your mouse connected to USB device,"+"\n"
          +"  it attaches to the USB port on your computer."+"\n" +
          "  Else"+"  it attaches to a different port,"+"\n"+
          "  such as the serial or parallel port."+"\n"+
          "                                         "+"\n"+
          "   1- Yes, It connected to USB device "+"\n"+
          "   2- No, It connected to different type of device. "+"\n"
          + "                 ********************";
      t.setForeground(new Color(30, 91, 136));
      t.setFont(new Font("DialogInput", Font.BOLD, 12));
      t.setText(select);
      String choose = JOptionPane.showInputDialog(null, t, "Mouse",
                                                  JOptionPane.QUESTION_MESSAGE);



    if(choose.equals("1"))
     {

         t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select="you might need to change your mouse settings. "+"\n"+
             "  1-Open Mouse Properties in Control Panel.  \n"+
            "  2-Choose the settings you want on the Buttons,\n    Pointers, Pointer Options, Wheel, and Hardware tabs. \n"+
             "                                                 \n"+
             "Does changing your mouse settings solve the problem? \n"+
             "  1- No, I still have a problem with my mouse. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. ";
         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose1=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.QUESTION_MESSAGE);

   if(choose1.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select="Is the software for your mouse installed?\n"+

"  Some mouse devices require special software to run them.\n\n"+

"Does installing the correct version of mouse software solve the problem?\n"+
"  1- No, I am still having a problem. \n"+
"  2- Yes, this solves the problem. \n"+
"  3- I want to skip this step and try something else.";

        t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose2=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

   if(choose2.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
             "  If this,you must remove and reinstall the driver.\n\n"+
            "To remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device, \n     if it has a separate power supply.\n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device\n"+
             "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   ////////////////////choose 1 1 1 1 ///////////////////////////////////
         if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "  Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
//////////////////////choose 1 1 1 1 1 ///////////////////////////
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";


          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

if(choose7.equals("1"))
          {unable();
          }else if(choose7.equals("2"))
          {exit();}
          else if(choose7.equals("3"))
          {unable();}
          }    }
         else if(choose4.equals("2"))
          {exit();}
          else if(choose4.equals("3"))
          { t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+

              "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
                       "  1- No, I still have a problem. \n"+
                       "  2- Yes, this solves the problem. \n"+
                       "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
////////////////choose 1 1 1 1 1 1 1 1 ///////////////////////////
if(choose7.equals("1"))
          {unable();}
                   else if(choose7.equals("2"))
                     {exit();}
                     else if(choose7.equals("3"))
                     {unable();}
          }
}

}
else
if(choose3.equals("2"))
  {exit();}
  else    if(choose3.equals("3"))
     {t=new JTextArea();
            t.setFont(new Font("Monospaced",Font.PLAIN,12));

            select="Does Windows support your hardware?  \n"+
                   "  To find out whether your hardware device\n"+
                   "  is supported by Windows XP, check Hardware \n"+
                   "  Compatibility List at the Microsoft Web site.\n\n"+
                   "Is your hardware on the HCL? \n"+
                   "  1- Yes, my hardware is on the HCL.\n"+
                   "          but I still have a problem. \n"+
                   "  2- No, my hardware is not on the HCL. \n"+
                   "  3- I want to skip this step and try something else ";

            t.setForeground(new Color(30,91,136));
            t.setText(select);
            String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose4.equals("1"))
            {
              t=new JTextArea();
            t.setFont(new Font("Monospaced",Font.PLAIN,12));

            select="Is your device connected to the correct port?  \n"+
               "if not,you must change your port connection :-\n"+
                " 1- plug your device into the correct port.\n"+
                " 2- Make sure that the plug is pushed securely then Restart\n\n"+
                "Does changing your port connection solve the problem? \n"+
   " 1- No, I am still having a problem with my mouse\n"+
   " 2- Yes, this solves the problem.\n"+
   " 3- I want to skip this step and try something else.";

            t.setForeground(new Color(30,91,136));
            t.setText(select);
            String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose5.equals("1"))
            {t=new JTextArea();
            t.setFont(new Font("Monospaced",Font.PLAIN,12));

            select="\nDoes updating your device driver solve the problem? \n"+
                "  1- No, I still have a problem. \n"+
                "  2- Yes, this solves the problem. \n"+
                "  3- I want to skip this step and try something else. \n";

            t.setForeground(new Color(30,91,136));
            t.setText(select);
            String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose6.equals("1"))
            {unable();}
            else
            if(choose6.equals("2"))
            {exit();}
            if(choose6.equals("3"))
            {unable();}
  }
            else
            if(choose5.equals("2"))
            {exit();}
            else
            if(choose5.equals("3"))
            {     t=new JTextArea();
            t.setFont(new Font("Monospaced",Font.PLAIN,12));

            select="Is your device connected to the correct port?  \n"+
             "if not,you must change your port connection :-"+
                " 1- plug your device into the correct port.\n"+
                " 2- Make sure that the plug is pushed securely then Restart\n\n"+
                "Does changing your port connection solve the problem? \n"+
   " 1- No, I am still having a problem with my mouse\n"+
   " 2- Yes, this solves the problem.\n"+
   " 3- I want to skip this step and try something else.";

            t.setForeground(new Color(30,91,136));
            t.setText(select);
            String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose7.equals("1"))
            {unable();}
            }    }
           else if(choose4.equals("2"))
            {}
            else if(choose4.equals("3"))
            {}

  }

}

   else
     if(choose2.equals("2"))
     {  exit();}
     else
       if(choose2.equals("3"))
       {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
             "  If this,you must remove and reinstall the driver.\n\n"+
            "To remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device, \n     if it has a separate power supply.\n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device, if necessary, \n     and then plug the device into the USB port.\n"+
             "     Your computer will detect the device and reinstall the drivers for it.\n\n"+
             "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
          "if not, you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
         "if not, you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {unable();}
          }    }
         else if(choose4.equals("2"))
          {}
          else if(choose4.equals("3"))
          {}

}
else
if(choose3.equals("2"))
  {unable();}
  else
  if(choose3.equals("3"))
  {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Does Windows support your hardware?  \n"+
                "  To find out whether your hardware device\n"+
                "  is supported by Windows XP, check Hardware \n"+
                "  Compatibility List at the Microsoft Web site.\n\n"+
                "  Is your hardware on the HCL? \n"+
                "  1- Yes, my hardware is on the HCL.\n"+
                "          but I still have a problem. \n"+
                "  2- No, my hardware is not on the HCL. \n"+
                "  3- I want to skip this step and try something else ";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
         {
           t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device connected to the correct port?  \n"+
       "if not,you must change your port connection :-"+
             " 1- plug your device into the correct port.\n"+
             " 2- Make sure that the plug is pushed securely then Restart\n\n"+
             "Does changing your port connection solve the problem? \n"+
" 1- No, I am still having a problem with my mouse\n"+
" 2- Yes, this solves the problem.\n"+
" 3- I want to skip this step and try something else.";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
         {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="\nDoes updating your device driver solve the problem? \n"+
             "  1- No, I still have a problem. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. \n";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
         {unable();}
         else
         if(choose6.equals("2"))
         {exit();}
         if(choose6.equals("3"))
         {unable();}
}
         else
         if(choose5.equals("2"))
         {exit();}
         else
         if(choose5.equals("3"))
         {     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device connected to the correct port?  \n"+
              "if not,you must change your port connection :-"+
             " 1- plug your device into the correct port.\n"+
             " 2- Make sure that the plug is pushed securely then Restart\n\n"+
             "Does changing your port connection solve the problem? \n"+
" 1- No, I am still having a problem with my mouse\n"+
" 2- Yes, this solves the problem.\n"+
" 3- I want to skip this step and try something else.";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
         {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="\nDoes updating your device driver solve the problem? \n"+
             "  1- No, I still have a problem. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. \n";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
         }    }
        else if(choose4.equals("2"))
         {}
         else if(choose4.equals("3"))
         {}

}

}

       }
   else
     if(choose1.equals("2"))
     {
       exit();
     }
     else
       if(choose1.equals("3"))
       {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select=" Is the software for your mouse installed?\n"+

"Some mouse devices require special software to run them.\n"+
"  If you do not install this software, the device might not \n"+
"  work at all,or some of its features might not work correctly. \n\n"+
"Does installing the correct version of mouse software solve the problem?\n"+
"  1- No, I am still having a problem. \n"+
"  2- Yes, this solves the problem. \n"+
"  3- I want to skip this step and try something else.";

        t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose2=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

   if(choose2.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
         "  you must remove and reinstall the driver.\n\n"+
            "To remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device.\n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device.\n\n"+
             "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
         "if not you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
          "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
          }    }
         else if(choose4.equals("2"))
          {}
          else if(choose4.equals("3"))
          {}

}
else
if(choose3.equals("2"))
  {unable();}

}
   else
     if(choose2.equals("2"))
     {  exit();}
     else
       if(choose2.equals("3"))
       { t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
             "  If this,you must remove and reinstall the driver.\n\n"+
            "To remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device, \n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device, if necessary \n\n "+

               "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "  Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
          "if not you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
          }    }
         else if(choose4.equals("2"))
          {}
          else if(choose4.equals("3"))
          {}

}
else
if(choose3.equals("2"))
  {unable();}

}
   else
     if(choose.equals("2"))
     {  unable();}
     else
       if(choose.equals("3"))
       {}

       }
   else
     if(choose1.equals("2"))
     {
       exit();
     }
     else
       if(choose1.equals("3"))
       {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select="Is the software for your mouse installed?\n"+

"  Some mouse devices require special software to run them.\n\n"+
"  Does installing the correct version of mouse software solve the problem?\n"+
"  1- No, I am still having a problem. \n"+
"  2- Yes, this solves the problem. \n"+
"  3- I want to skip this step and try something else.";

        t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose2=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

   if(choose2.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
          "if this,you mustremove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device \n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+

              "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "if not, you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
          }    }
         else if(choose4.equals("2"))
          {}
          else if(choose4.equals("3"))
          {}

}
else
if(choose3.equals("2"))
  {exit();}
  else if(choose3.equals("3"))
  {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "  Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
        "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          { unable(); }
    }
         else if(choose4.equals("2"))
          {
            exit();
          }
          else if(choose4.equals("3"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
    "if not you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "if not,you must change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {unable();}
          }
}
}
}else
      if(choose2.equals("2"))
         {exit();}

}else
    if(choose1.equals("2"))
    {exit();}
  }



  else
  if(choose.equals("2"))
  {    t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select="you might need to change your mouse settings. "+"\n"+
             "  1-Open Mouse Properties in Control Panel.  \n"+
            "  2-Choose the settings you want on the Buttons,\n    Pointers, Pointer Options, Wheel, and Hardware tabs. \n"+
             "                                                 \n"+
             "Does changing your mouse settings solve the problem? \n"+
             "  1- No, I still have a problem with my mouse. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. ";
         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose1=JOptionPane.showInputDialog(null,t,"Printer",JOptionPane.QUESTION_MESSAGE);



   if(choose1.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select="Is the software for your mouse installed?\n"+

"Some mouse devices require special software to run them.\n"+
"Does installing the correct version of mouse software solve the problem?\n"+
"  1- No, I am still having a problem. \n"+
"  2- Yes, this solves the problem. \n"+
"  3- I want to skip this step and try something else.";

        t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose2=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);



         if(choose2.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
             " if this you must remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device, \n "
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device, if necessary \n"+
          "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);


         if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);


if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "  1- you might need to connect it to USB port with PS/2 port\n"+
              "  2- It might need to attach to the COM\n"+
              "     port with a serial adapter \n\n"+
              "if not change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
///////////////////choose  2 1 1 1 1 1 /////////////////////////////////

if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

///////////////////choose  2 1 1 1 1 1 1/////////////////////////////////
if(choose6.equals("1"))
          {unable();}
 ///////////////////choose  2 1 1 1 1 1 2/////////////////////////////////
          else
          if(choose6.equals("2"))
          {exit();}
          ///////////////////choose  2 1 1 1 1 1 3/////////////////////////////////
          else
          if(choose6.equals("3"))
          {unable();}
}

        ///////////////////choose  2 1 1 1 1 2 /////////////////////////////////
        else
          if(choose5.equals("2"))
          {exit();}
          ///////////////////choose  2 1 1 1 1 3 /////////////////////////////////
          else
          if(choose5.equals("3"))
          {  select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";
      t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

if(choose7.equals("1"))
          {unable();}else
if(choose7.equals("2"))
                   {exit();}
                  else
                  if(choose7.equals("3"))
                   {unable();}
          }    }
         else if(choose4.equals("2"))
          {exit();}
          else if(choose4.equals("3"))
          {unable();}

}
else
if(choose3.equals("2"))
  {unable();}
}
   else
     if(choose2.equals("2"))
     {  unable();}
     else
       if(choose2.equals("3"))
       {exit();}
       }
   else
     if(choose1.equals("2"))
     {
       unable();
     }
     else
       if(choose1.equals("3"))
       {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         select="Is the software for your mouse installed?\n"+
"  work at all,or some of its features might not work correctly. \n\n"+
"Does installing the correct version of mouse software solve the problem?\n"+
"  1- No, I am still having a problem. \n"+
"  2- Yes, this solves the problem. \n"+
"  3- I want to skip this step and try something else.";

        t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose2=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);

   if(choose2.equals("1"))
   {
     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
             "  If this you must remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device, \n     if it has a separate power supply.\n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device, if necessary, \n\n"+

             "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "  1- you might need to connect it to USB port with PS/2 port\n"+
              "  2- It might need to attach to the COM\n"+
              "     port with a serial adapter \n\n"+
              "To change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "  1- you might need to connect it to USB port with PS/2 port\n"+
              "  2- It might need to attach to the COM\n"+
              "     port with a serial adapter \n\n"+
              "To change your port connection :-"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
          }    }
         else if(choose4.equals("2"))
          {}
          else if(choose4.equals("3"))
          {}

}
else
if(choose3.equals("2"))
  {unable();}}
else
    if(choose2.equals("3"))
    {t=new JTextArea();
      t.setFont(new Font("Monospaced",Font.PLAIN,12));

      select="Is your device driver corrupted? \n"+
          "  If the driver for your device is damaged or corrupted,\n"+
         "  you must remove and reinstall the driver.\n\n"+
         "To remove and reinstall the driver:-  \n"+
         "  1- Disconnect the device from the USB port.\n"+
         "  2- Turn off the power for the device, \n     if it has a separate power supply.\n"
          +" 3- Open Device Manager.\n"+
          "  4- Double-click the appropriate device category.\n"+
          "  5- Right-click your USB device, and then click Uninstall.\n"+
          "  6- Restart your computer.\n"+
          "  7- Turn the power back on for the device, if necessary, \n     and then plug the device into the USB port.\n"+
          "     Your computer will detect the device and reinstall the drivers for it.\n\n"+
          "Does removing and reinstalling the driver for the device solve the problem?  \n"+
          "  1- No, I still have a problem with my device.\n"+
          "  2- Yes, this solves the problem.\n"+
          "  3- I want to skip this step and try something else. \n";



      t.setForeground(new Color(30,91,136));
      t.setText(select);
      String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose3.equals("1"))
{t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));

       select="Does Windows support your hardware?  \n"+
              "  To find out whether your hardware device\n"+
              "  is supported by Windows XP, check Hardware \n"+
              "  Compatibility List at the Microsoft Web site.\n\n"+
              "Is your hardware on the HCL? \n"+
              "  1- Yes, my hardware is on the HCL.\n"+
              "          but I still have a problem. \n"+
              "  2- No, my hardware is not on the HCL. \n"+
              "  3- I want to skip this step and try something else ";

       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
       {
         t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));

       select="Is your device connected to the correct port?  \n"+
           "     you might need to connect it to USB port with PS/2 port\n"+
           "  2- It might need to attach to the COM\n"+
           "     port with a serial adapter \n\n"+
           "To change your port connection :-"+
           " 1- plug your device into the correct port.\n"+
           " 2- Make sure that the plug is pushed securely then Restart\n\n"+
           "Does changing your port connection solve the problem? \n"+
" 1- No, I am still having a problem with my mouse\n"+
" 2- Yes, this solves the problem.\n"+
" 3- I want to skip this step and try something else.";

       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
       {t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));

       select="\nDoes updating your device driver solve the problem? \n"+
           "  1- No, I still have a problem. \n"+
           "  2- Yes, this solves the problem. \n"+
           "  3- I want to skip this step and try something else. \n";

       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
       {unable();}
       else
       if(choose6.equals("2"))
       {exit();}
       if(choose6.equals("3"))
       {unable();}
}
       else
       if(choose5.equals("2"))
       {exit();}
       else
       if(choose5.equals("3"))
       {     t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));

       select="Is your device connected to the correct port?  \n"+
           "  1- you might need to connect it to USB port with PS/2 port\n"+
           "  2- It might need to attach to the COM\n"+
           "     port with a serial adapter \n\n"+
           "To change your port connection :-"+
           " 1- plug your device into the correct port.\n"+
           " 2- Make sure that the plug is pushed securely then Restart\n\n"+
           "Does changing your port connection solve the problem? \n"+
" 1- No, I am still having a problem with my mouse\n"+
" 2- Yes, this solves the problem.\n"+
" 3- I want to skip this step and try something else.";

       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
       {t=new JTextArea();
       t.setFont(new Font("Monospaced",Font.PLAIN,12));

       select="\nDoes updating your device driver solve the problem? \n"+
           "  1- No, I still have a problem. \n"+
           "  2- Yes, this solves the problem. \n"+
           "  3- I want to skip this step and try something else. \n";

       t.setForeground(new Color(30,91,136));
       t.setText(select);
       String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
       }    }
      else if(choose4.equals("2"))
       {}
       else if(choose4.equals("3"))
       {}
}else

   if(choose3.equals("2"))
 {exit();}
          else if(choose3.equals("3"))
          {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Does Windows support your hardware?  \n"+
                "  To find out whether your hardware device\n"+
                "  is supported by Windows XP, check Hardware \n"+
                "  Compatibility List at the Microsoft Web site.\n\n"+
                "Is your hardware on the HCL? \n"+
                "  1- Yes, my hardware is on the HCL.\n"+
                "          but I still have a problem. \n"+
                "  2- No, my hardware is not on the HCL. \n"+
                "  3- I want to skip this step and try something else ";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose4.equals("1"))
         {
           t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device connected to the correct port?  \n"+
             "     you might need to connect it to USB port with PS/2 port\n"+
             "  2- It might need to attach to the COM\n"+
             "     port with a serial adapter \n\n"+
             "To change your port connection :-"+
             " 1- plug your device into the correct port.\n"+
             " 2- Make sure that the plug is pushed securely then Restart\n\n"+
             "Does changing your port connection solve the problem? \n"+
  " 1- No, I am still having a problem with my mouse\n"+
  " 2- Yes, this solves the problem.\n"+
  " 3- I want to skip this step and try something else.";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose5.equals("1"))
         {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="\nDoes updating your device driver solve the problem? \n"+
             "  1- No, I still have a problem. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. \n";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose6.equals("1"))
         {unable();}
         else
         if(choose6.equals("2"))
         {exit();}
         if(choose6.equals("3"))
         {unable();}
  }
         else
         if(choose5.equals("2"))
         {exit();}
         else
         if(choose5.equals("3"))
         {     t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device connected to the correct port?  \n"+
             "  1-you might need to connect it to USB port with PS/2 port\n"+
             "  2- It might need to attach to the COM\n"+
             "     port with a serial adapter \n\n"+
             "To change your port connection :-"+
             " 1- plug your device into the correct port.\n"+
             " 2- Make sure that the plug is pushed securely then Restart\n\n"+
             "Does changing your port connection solve the problem? \n"+
  " 1- No, I am still having a problem with my mouse\n"+
  " 2- Yes, this solves the problem.\n"+
  " 3- I want to skip this step and try something else.";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose7.equals("1"))
         {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="\nDoes updating your device driver solve the problem? \n"+
             "  1- No, I still have a problem. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. \n";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  }
         }    }
        else if(choose4.equals("2"))
         {exit();}
         else if(choose4.equals("3"))
         {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device connected to the correct port?  \n"+
             "  1- you might need to connect it to USB port with PS/2 port\n"+
             "  2- It might need to attach to the COM\n"+
             "     port with a serial adapter \n\n"+
             "To change your port connection :-"+
             " 1- plug your device into the correct port.\n"+
             " 2- Make sure that the plug is pushed securely then Restart\n\n"+
             "Does changing your port connection solve the problem? \n"+
  " 1- No, I am still having a problem with my mouse\n"+
  " 2- Yes, this solves the problem.\n"+
  " 3- I want to skip this step and try something else.";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose5.equals("1"))
         {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="\nDoes updating your device driver solve the problem? \n"+
             "  1- No, I still have a problem. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. \n";

         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose6.equals("1"))
         {unable();}
         else
         if(choose6.equals("2"))
         {exit();}
         if(choose6.equals("3"))
         {unable();}
  }
         else
         if(choose5.equals("2"))
         {exit();}
         else
         if(choose5.equals("3"))
         {     t=new JTextArea();
           select="\nDoes updating your device driver solve the problem? \n"+
             "  1- No, I still have a problem. \n"+
             "  2- Yes, this solves the problem. \n"+
             "  3- I want to skip this step and try something else. \n";

         t.setFont(new Font("Monospaced",Font.PLAIN,12));


         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
  if(choose7.equals("1"))
         {unable();
}
         }}
}}

   else
     if(choose2.equals("2"))
     {  exit();}
     else
       if(choose2.equals("3"))
       {t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));

         select="Is your device driver corrupted? \n"+
             "  If this,you must remove and reinstall the driver:-  \n"+
            "  1- Disconnect the device from the USB port.\n"+
            "  2- Turn off the power for the device \n"
             +" 3- Open Device Manager.\n"+
             "  4- Double-click the appropriate device category.\n"+
             "  5- Right-click your USB device, and then click Uninstall.\n"+
             "  6- Restart your computer.\n"+
             "  7- Turn the power back on for the device, if necessary\n\n"+
             "     Your computer will detect the device and reinstall the drivers for it.\n\n"+
             "Does removing and reinstalling the driver for the device solve the problem?  \n"+
             "  1- No, I still have a problem with my device.\n"+
             "  2- Yes, this solves the problem.\n"+
             "  3- I want to skip this step and try something else. \n";



         t.setForeground(new Color(30,91,136));
         t.setText(select);
         String choose3=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
   if(choose3.equals("1"))
   {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Does Windows support your hardware?  \n"+
                 "  To find out whether your hardware device\n"+
                 "  is supported by Windows XP, check Hardware \n"+
                 "  Compatibility List at the Microsoft Web site.\n\n"+
                 "Is your hardware on the HCL? \n"+
                 "  1- Yes, my hardware is on the HCL.\n"+
                 "          but I still have a problem. \n"+
                 "  2- No, my hardware is not on the HCL. \n"+
                 "  3- I want to skip this step and try something else ";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose4=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose4.equals("1"))
          {
            t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
           "if not,you must change your port connection :-\n"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose5=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose5.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose6.equals("1"))
          {unable();}
          else
          if(choose6.equals("2"))
          {exit();}
          if(choose6.equals("3"))
          {unable();}
}
          else
          if(choose5.equals("2"))
          {exit();}
          else
          if(choose5.equals("3"))
          {     t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="Is your device connected to the correct port?  \n"+
              "if not,you must change your port connection :-\n"+
              " 1- plug your device into the correct port.\n"+
              " 2- Make sure that the plug is pushed securely then Restart\n\n"+
              "Does changing your port connection solve the problem? \n"+
 " 1- No, I am still having a problem with my mouse\n"+
 " 2- Yes, this solves the problem.\n"+
 " 3- I want to skip this step and try something else.";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose7=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
if(choose7.equals("1"))
          {t=new JTextArea();
          t.setFont(new Font("Monospaced",Font.PLAIN,12));

          select="\nDoes updating your device driver solve the problem? \n"+
              "  1- No, I still have a problem. \n"+
              "  2- Yes, this solves the problem. \n"+
              "  3- I want to skip this step and try something else. \n";

          t.setForeground(new Color(30,91,136));
          t.setText(select);
          String choose6=JOptionPane.showInputDialog(null,t,"Mouse",JOptionPane.QUESTION_MESSAGE);
}
          }    }
         else if(choose4.equals("2"))
          {}
          else if(choose4.equals("3"))
          {}

}
else
if(choose3.equals("2"))
  {unable();}
}
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
  JOptionPane.showMessageDialog(null,t,"Mouse",JOptionPane.PLAIN_MESSAGE);

 }

/////////////////////////////////////////////////////////////
 public  void unable()

 {

         JTextArea t=new JTextArea();
         t.setFont(new Font("Monospaced",Font.PLAIN,12));
         t.setForeground(new Color(102,0,102));

    String select="\n   This Program is unable to solve your problem. \n"+
        "             Thanks for using it";
    t.setText(select);
    JOptionPane.showMessageDialog(null,t,"Mouse",JOptionPane.PLAIN_MESSAGE);


 }

 /////////////////////////////////////////////////////////////////////////
 public static void main(String arg[])
 {

   Mouse m=new Mouse();

 }

}


