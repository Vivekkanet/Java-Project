            
package bank.management.system;
import javax.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;


public class signupthre extends JFrame implements ActionListener
{
    
    JRadioButton r1,r2,r3,r4;
    JCheckBox c1,c2,c3,c4,c5,c6,c7;
    JButton submit,cancle;
    String formno;
    
    signupthre(String formno)
    {
        
        this.formno = formno;
        setTitle("NEW ACCOUNT APPLICATION FORM -PAGE 3");
        setLayout(null);
        
        JLabel l1=new JLabel("Page 3:Account Details");
        l1.setFont(new Font("raleway",Font.BOLD,22));
        l1.setBounds(280,40,400,40);
        add(l1);
        
        JLabel type=new JLabel("Account Type:");
        type.setFont(new Font("raleway",Font.BOLD,22));
        type.setBounds(100,140,200,30);
        add(type);
        
        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("raleway",Font.BOLD,22));
        r1.setBounds(100,180,250,20);
        r1.setBackground(Color.WHITE);
        add(r1);
        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("raleway",Font.BOLD,22));
        r2.setBounds(350,180,350,20);
        r2.setBackground(Color.WHITE);
        add(r2);
        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("raleway",Font.BOLD,22));
        r3.setBounds(100,220,250,20);
        r3.setBackground(Color.WHITE);
        add(r3);
        r4 = new JRadioButton("Recurring Deposit Account");
        r4.setFont(new Font("raleway",Font.BOLD,22));
        r4.setBounds(350,220,350,20);
        r4.setBackground(Color.WHITE);
        add(r4);
      
        ButtonGroup accounttype = new ButtonGroup();
        accounttype.add(r1);
        accounttype.add(r2);
        accounttype.add(r3);
        accounttype.add(r4);
        
        JLabel card=new JLabel("Card Number:");
        card.setFont(new Font("raleway",Font.BOLD,22));
        card.setBounds(100,300,200,30);
        add(card);
        
        JLabel number=new JLabel("XXXX-XXXX-XXXX-1234");
        number.setFont(new Font("raleway",Font.BOLD,22));
        number.setBounds(330,300,300,30);
        add(number);
        
        JLabel a1=new JLabel("Your 16 Digit Card Number");
        a1.setFont(new Font("raleway",Font.BOLD,12));
        a1.setBounds(100,330,300,30);
        add(a1);
        
        JLabel pin =new JLabel("PIN:");
        pin.setFont(new Font("raleway",Font.BOLD,22));
        pin.setBounds(100,370,200,30);
        add(pin);
        
        JLabel pnumber=new JLabel("XXXX");
        pnumber.setFont(new Font("raleway",Font.BOLD,22));
        pnumber.setBounds(330,370,300,30);
        add(pnumber);
        
        JLabel a2=new JLabel("Your 4 Digit Password");
        a2.setFont(new Font("raleway",Font.BOLD,12));
        a2.setBounds(100,400,300,30);
        add(a2);
        
        JLabel servic =new JLabel("Services Reqired:");
        servic.setFont(new Font("raleway",Font.BOLD,18));
        servic.setBounds(100,450,200,30);
        add(servic);
        
        c1 =new JCheckBox("ATM Card");
        c1.setFont(new Font("raleway",Font.BOLD,18));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100, 500, 200,30);
        add(c1);
        
        c2 =new JCheckBox("Internet Banking");
        c2.setFont(new Font("raleway",Font.BOLD,18));
        c2.setBackground(Color.WHITE);
        c2.setBounds(350, 500, 200,30);
        add(c2);
        
        c3 =new JCheckBox("Mobile Banking");
        c3.setFont(new Font("raleway",Font.BOLD,18));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100, 550, 200,30);
        add(c3);
        
        c4 =new JCheckBox("EMAIL & SMS Alerts");
        c4.setFont(new Font("raleway",Font.BOLD,18));
        c4.setBackground(Color.WHITE);
        c4.setBounds(350, 550, 250,30);
        add(c4);
        
        c5 =new JCheckBox("Cheque Book");
        c5.setFont(new Font("raleway",Font.BOLD,18));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100, 600, 200,30);
        add(c5);
        
        c6 =new JCheckBox("E Statement");
        c6.setFont(new Font("raleway",Font.BOLD,18));
        c6.setBackground(Color.WHITE);
        c6.setBounds(350, 600, 200,30);
        add(c6);
        
        c7 =new JCheckBox("I hereby that the about entered details are correct to the best of my knowledge");
        c7.setFont(new Font("raleway",Font.BOLD,12));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100, 680, 600,30);
        add(c7);
        
        submit = new JButton("SUBMIT");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        cancle = new JButton("CANCLE");
        cancle.setBackground(Color.BLACK);
        cancle.setForeground(Color.WHITE);
        cancle.setFont(new Font("raleway",Font.BOLD,14));
        cancle.setBounds(420,720,100,30);
        cancle.addActionListener(this);
        add(cancle);
        
        getContentPane().setBackground(Color.WHITE);
             
        
        
        setSize(850,820);
        setLocation(350,0);
        setVisible(true);
    }

    signupthre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public void actionPerformed(ActionEvent ae)
    { 
          if(ae.getSource()==submit)
          {
           String type = null;
           if(r1.isSelected())
           {
               type = "Saving Account";
           }
           else if(r2.isSelected())
           {
                type ="Fixed Deposit Account"; 
           }
           else if(r3.isSelected())
           {
                type ="Mobile Banking"; 
           }
           else if(r4.isSelected())
           {
                type ="Recurring Deposit Account"; 
           }
           Random random=new Random();
           String card = "" +Math.abs((random.nextLong() % 90000000L) +5040936000000000L);
           
           String pinnumber = "" +Math.abs((random.nextLong() % 9000L) + 1000L); 
           
           String facility ="";
           if(c1.isSelected())
           {
               facility = facility+"ATM Card";
           }else if(c2.isSelected())
           {
               facility = facility+"Internet Banking ";
           }else if(c3.isSelected())
           {
               facility = facility+"Mobile Banking";
           }else if(c4.isSelected())
           {
              facility = facility+"EMAIL & SMS Alerts"; 
           }else if(c5.isSelected())
           {
               facility = facility+"Cheque Book";
           }else if(c6.isSelected())
           {
               facility = facility+"E Statement";
           }
           
           try
           {
              if(type.equals(""))
              {
                  JOptionPane.showMessageDialog(null,"Account Type is Required");
              }
              else
            {
                Conn c= new Conn();
                String query1 ="insert into signupthree values('"+formno+"','"+type+"','"+card+"','"+pinnumber+"','"+facility+"')";
                String query2 ="insert into login values('"+formno+"','"+card+"','"+pinnumber+"')";
                c.stmt.executeUpdate(query1);
                c.stmt.executeUpdate(query2);
                
                JOptionPane.showMessageDialog(null,"Card Number:"+ card +"\n pin:" +pinnumber);
                
                setVisible(false);
                new Transaction(formno).setVisible(true);
            } 
           }catch(Exception e)
           {
               e.printStackTrace();
           }
           
          }else if(ae.getSource()==cancle)
          {
              setVisible(false);
          }
    }

    
    public static void main(String args[]) 
    {
         new signupthre("");
    }
}