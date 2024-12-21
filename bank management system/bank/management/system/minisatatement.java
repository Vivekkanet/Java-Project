package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;


public class minisatatement extends JFrame
{    
    public minisatatement(String pinnumber)
    {
        setTitle("Mini Statement");
        setLayout(null);
                
        JLabel bank = new JLabel("Bank of Baroda");
        bank.setBounds(140,50,100,20);
        add(bank);
        
        JLabel card = new JLabel();
        card.setBounds(20,100,300,100);
        add(card);
        
        JLabel mini = new JLabel();
        mini.setBounds(20,150,300,100);
        add(mini);
        
        try
        {
             Conn conn = new Conn();
             ResultSet rs = conn.stmt.executeQuery("select * from login");
             
             while(rs.next())
             {
                String fno = rs.getString("formno");
                String cdno = rs.getString("cardnumber");
                card.setText("<html>FormNo :- "+fno+"<br>CardNo :- "+cdno+"</html>");
             }
             rs.close();
             
             ResultSet rs1 = conn.stmt.executeQuery("select * from bank");
             while(rs1.next())
             {
                String dt = rs1.getString("date");
                String typ = rs1.getString("type");
                String amt = rs1.getString("amount");                
                mini.setText("<html>Date :- "+dt+"<br>Type :- "+typ+"<br>Amount :- "+amt+"</html>");
             }
            
             rs1.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        
        
        
       /*try
        {
             Conn conn = new Conn();
             ResultSet rs = conn.stmt.executeQuery("select * from login where pin='"+pinnumber+"'");
             while(rs.next())
             {
                 card.setText("card Number: " +rs.getString("cardnumber").substring(0,4)+"XXXXXXXX"+ rs.getString("cardnumber").substring(12));
                  
             }
             
            
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        
        try
        {
            Conn conn = new Conn();
            ResultSet rs = conn.stmt.executeQuery("select * from bank where pin='"+pinnumber+"'");
            while(rs.next())
            {
                mini.setText(card.getText() + "<html>" + rs.getString("date") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("type") + "&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;" + rs.getString("amount") + "<br></br></html>");
            }
            
            
        }catch(Exception ae)
        {
            ae.printStackTrace();
        }*/
                
        setSize(400,600);
        setLocation(20,20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }
    
    public static void main(String args[])
    {
       new minisatatement(" ");
    }
}
