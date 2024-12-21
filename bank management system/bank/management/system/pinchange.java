package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class pinchange  extends JFrame implements ActionListener
{
    
    JPasswordField pin,repin;
    JButton change,back;
    String pinnumber;
    
    pinchange(String pinnumber)
    {
        this.pinnumber = pinnumber;
        setTitle("ATM Simulation System");
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/atm.jpg"));
        Image i2 = i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0,0,900,800);
        add(image);
        
        JLabel text =  new JLabel("CHANGE YOUR PIN");
        text.setForeground(Color.WHITE);
        text.setFont(new Font("System",Font.BOLD,16));
        text.setBounds(250,230,500,35);
        image.add(text);
        
        JLabel pintext =  new JLabel("New PIN");
        pintext.setForeground(Color.WHITE);
        pintext.setFont(new Font("System",Font.BOLD,16));
        pintext.setBounds(165,270,180,25);
        image.add(pintext);
        
                
        pin = new JPasswordField();
        pin.setFont(new Font("Realway",Font.BOLD,25));
        pin.setBounds(330,270,180,25);
        image.add(pin);
        
        JLabel newpintext =  new JLabel("Re-Enter New PIN");
        newpintext.setForeground(Color.WHITE);
        newpintext.setFont(new Font("System",Font.BOLD,16));
        newpintext.setBounds(165,310,180,25);
        image.add(newpintext);
        
        repin = new JPasswordField();
        repin.setFont(new Font("Realway",Font.BOLD,25));
        repin.setBounds(330,310,180,25);
        image.add(repin);
        
        change = new JButton("CHANGE");
        change.setBounds(365,435,150,30);
        change.addActionListener(this);
        image.add(change);
        
        back = new JButton("BACK");
        back.setBounds(365,470,150,30);
        back.addActionListener(this);
        image.add(back);
        
        setSize(900,900);
        setLocation(300,0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()== change)
        {
           try
            {
               String npin = pin.getText();
               String rpin =repin.getText();
               
               if(!npin.equals(rpin))
               {
                   JOptionPane.showMessageDialog(null,"Entered Pin does not match");
                   return;
               }
               if(npin.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Plese Enter New PIn");
                   return;
               }
               if(rpin.equals(""))
               {
                   JOptionPane.showMessageDialog(null,"Plese Re-Enter New PIn");
                   return;
               }
               
               Conn conn = new Conn();
               String query1 = "update bank set pin ='"+rpin+"' where pin='"+pinnumber+"'";
               String query2 = "update login set pin ='"+rpin+"' where pin='"+pinnumber+"'";
               String query3 = "update signupthree set pin ='"+rpin+"' where pin='"+pinnumber+"'";
               
               conn.stmt.executeUpdate(query1);
               conn.stmt.executeUpdate(query2);
               conn.stmt.executeUpdate(query3);
               
               JOptionPane.showMessageDialog(null,"PIN change sucessfully");
               setVisible(false);
               new Transaction(rpin).setVisible(true);
               
            }
            catch(Exception e)
            {
                e.printStackTrace();
            }
        }else
        {
            setVisible(false);
            new Transaction(pinnumber).setVisible(true);
        }
    }

    public static void main(String args[]) 
    {
       new pinchange("").setVisible(true);
    }
}
